package net.edwardsonthe.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableScheduling
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

@RestController
class Controller {

	@Autowired
	ScheduledTask scheduler;

	@RequestMapping(value = "/pi", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public PiEstimate pi() { return scheduler.getEstimate(); }

}

@Component
@Slf4j
class PiEstimator {
	
	static final String host;
	static final Random rand = new Random();

	static {
		String value;
		try {
			value = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			value = "unkwon";
		}
		host = value;
		log.info("host={}", host);
	}

	public PiEstimate eval() {
		
		int cnt = 0, max = 10_000_000;

		for (int i = 0; i < max; i++) {
			double a = 2 * rand.nextDouble() - 1;
			double b = 2 * rand.nextDouble() - 1;
			double c = Math.sqrt(a * a + b * b);
			if (c <= 1) cnt++;
		}

		double value = (4.0d * cnt) / max, delta = value - Math.PI;
		return new PiEstimate(host, value, delta);
		
	}
	
}

@Component
@Slf4j
class ScheduledTask {

	@Autowired
	PiEstimator estimator;
	
	PiEstimate estimate = new PiEstimate("not-set", 0, 0);

	@Scheduled(fixedRate = 500)
	void tic() {
		PiEstimate estimate = estimator.eval();
		log.info("{}", estimate);
		setEstimate(estimate);
	}

	synchronized PiEstimate getEstimate() { return this.estimate; }

	synchronized void setEstimate(PiEstimate estimate) { this.estimate = estimate; }

}

@Data
class PiEstimate {
	final String host;
	final double value;
	final double delta;
}
