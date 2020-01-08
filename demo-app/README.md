1. `alias gw='./gradlew'`

2. `gw tasks --all`

		------------------------------------------------------------
		Tasks runnable from root project
		------------------------------------------------------------
		
		Application tasks
		-----------------
		bootRun - Runs this project as a Spring Boot application.
		
		Build tasks
		-----------
		assemble - Assembles the outputs of this project.
		bootJar - Assembles an executable jar archive containing the main classes and their dependencies.
		build - Assembles and tests this project.
		buildDependents - Assembles and tests this project and all projects that depend on it.
		buildNeeded - Assembles and tests this project and all projects it depends on.
		classes - Assembles main classes.
		clean - Deletes the build directory.
		jar - Assembles a jar archive containing the main classes.
		testClasses - Assembles test classes.
		
		Build Setup tasks
		-----------------
		init - Initializes a new Gradle build.
		wrapper - Generates Gradle wrapper files.
		
		Docker tasks
		------------
		dockerBuildImage - Builds the Docker image for the application.
		dockerCreateDockerfile - Creates the Docker image for the application.
		dockerPushImage - Pushes created Docker image to the repository.
		dockerSyncBuildContext - Copies the distribution resources to a temporary directory for image creation.
		
		Documentation tasks
		-------------------
		javadoc - Generates Javadoc API documentation for the main source code.
		
		Help tasks
		----------
		buildEnvironment - Displays all buildscript dependencies declared in root project 'demo-app'.
		components - Displays the components produced by root project 'demo-app'. [incubating]
		dependencies - Displays all dependencies declared in root project 'demo-app'.
		dependencyInsight - Displays the insight into a specific dependency in root project 'demo-app'.
		dependencyManagement - Displays the dependency management declared in root project 'demo-app'.
		dependentComponents - Displays the dependent components of components in root project 'demo-app'. [incubating]
		help - Displays a help message.
		model - Displays the configuration model of root project 'demo-app'. [incubating]
		projects - Displays the sub-projects of root project 'demo-app'.
		properties - Displays the properties of root project 'demo-app'.
		tasks - Displays the tasks runnable from root project 'demo-app'.
		
		Verification tasks
		------------------
		check - Runs all checks.
		test - Runs the unit tests.
		
		Other tasks
		-----------
		compileJava - Compiles main Java source.
		compileTestJava - Compiles test Java source.
		prepareKotlinBuildScriptModel
		processResources - Processes main resources.
		processTestResources - Processes test resources.
		
		Rules
		-----
		Pattern: clean<TaskName>: Cleans the output files of a task.
		Pattern: build<ConfigurationName>: Assembles the artifacts of a configuration.
		Pattern: upload<ConfigurationName>: Assembles and uploads the artifacts belonging to a configuration.

3. `gw clean`

4. `gw build`

5. `ll build/libs/`

		-rw-rw-r-- 1 jeff jeff 17592933 Jan  7 22:05 demo-app-0.0.1-SNAPSHOT.jar

6. `unzip -l build/libs/demo-app-0.0.1-SNAPSHOT.jar`

		Archive:  build/libs/demo-app-0.0.1-SNAPSHOT.jar
		  Length      Date    Time    Name
		---------  ---------- -----   ----
		        0  01-07-2020 22:05   META-INF/
		      238  01-07-2020 22:05   META-INF/MANIFEST.MF
		        0  12-06-2019 06:18   org/
		        0  12-06-2019 06:18   org/springframework/
		        0  12-06-2019 06:18   org/springframework/boot/
		        0  12-06-2019 06:18   org/springframework/boot/loader/
		        0  12-06-2019 06:18   org/springframework/boot/loader/util/
		        0  12-06-2019 06:18   org/springframework/boot/loader/jar/
		        0  12-06-2019 06:18   org/springframework/boot/loader/archive/
		        0  12-06-2019 06:18   org/springframework/boot/loader/data/
		     1535  12-06-2019 06:18   org/springframework/boot/loader/LaunchedURLClassLoader$UseFastConnectionExceptionsEnumeration.class
		      702  12-06-2019 06:18   org/springframework/boot/loader/jar/JarURLConnection$1.class
		     2004  12-06-2019 06:18   org/springframework/boot/loader/jar/CentralDirectoryEndRecord$Zip64Locator.class
		     3401  12-06-2019 06:18   org/springframework/boot/loader/jar/CentralDirectoryEndRecord$Zip64End.class
		     4976  12-06-2019 06:18   org/springframework/boot/loader/jar/AsciiBytes.class
		     1779  12-06-2019 06:18   org/springframework/boot/loader/archive/JarFileArchive$EntryIterator.class
		      437  12-06-2019 06:18   org/springframework/boot/loader/archive/Archive$EntryFilter.class
		     1585  12-06-2019 06:18   org/springframework/boot/loader/JarLauncher.class
		      485  12-06-2019 06:18   org/springframework/boot/loader/data/RandomAccessData.class
		     4015  12-06-2019 06:18   org/springframework/boot/loader/data/RandomAccessDataFile.class
		     3604  12-06-2019 06:18   org/springframework/boot/loader/ExecutableArchiveLauncher.class
		     5691  12-06-2019 06:18   org/springframework/boot/loader/LaunchedURLClassLoader.class
		     1374  12-06-2019 06:18   org/springframework/boot/loader/jar/JarFile$JarFileType.class
		     4682  12-06-2019 06:18   org/springframework/boot/loader/jar/CentralDirectoryEndRecord.class
		     1102  12-06-2019 06:18   org/springframework/boot/loader/archive/ExplodedArchive$FileEntry.class
		     1487  12-06-2019 06:18   org/springframework/boot/loader/archive/ExplodedArchive$FileEntryIterator$EntryComparator.class
		     1484  12-06-2019 06:18   org/springframework/boot/loader/PropertiesLauncher$ArchiveEntryFilter.class
		     5174  12-06-2019 06:18   org/springframework/boot/loader/util/SystemPropertyUtils.class
		    13994  12-06-2019 06:18   org/springframework/boot/loader/jar/JarFileEntries.class
		     1813  12-06-2019 06:18   org/springframework/boot/loader/jar/ZipInflaterInputStream.class
		     4620  12-06-2019 06:18   org/springframework/boot/loader/jar/CentralDirectoryParser.class
		      273  12-06-2019 06:18   org/springframework/boot/loader/archive/ExplodedArchive$1.class
		     1212  12-06-2019 06:18   org/springframework/boot/loader/archive/Archive.class
		     7417  12-06-2019 06:18   org/springframework/boot/loader/archive/JarFileArchive.class
		     2680  12-06-2019 06:18   org/springframework/boot/loader/data/RandomAccessDataFile$DataInputStream.class
		     1498  12-06-2019 06:18   org/springframework/boot/loader/MainMethodRunner.class
		     1593  12-06-2019 06:18   org/springframework/boot/loader/jar/JarFileEntries$1.class
		      540  12-06-2019 06:18   org/springframework/boot/loader/jar/CentralDirectoryVisitor.class
		     2296  12-06-2019 06:18   org/springframework/boot/loader/jar/JarFile$1.class
		     3259  12-06-2019 06:18   org/springframework/boot/loader/data/RandomAccessDataFile$FileAccess.class
		     1953  12-06-2019 06:18   org/springframework/boot/loader/PropertiesLauncher$PrefixMatchingArchiveFilter.class
		     3650  12-06-2019 06:18   org/springframework/boot/loader/jar/StringSequence.class
		    11523  12-06-2019 06:18   org/springframework/boot/loader/jar/JarURLConnection.class
		     1250  12-06-2019 06:18   org/springframework/boot/loader/jar/JarURLConnection$2.class
		      345  12-06-2019 06:18   org/springframework/boot/loader/jar/FileHeader.class
		     5351  12-06-2019 06:18   org/springframework/boot/loader/jar/CentralDirectoryFileHeader.class
		     1081  12-06-2019 06:18   org/springframework/boot/loader/archive/JarFileArchive$JarFileEntry.class
		    21205  12-06-2019 06:18   org/springframework/boot/loader/PropertiesLauncher.class
		     2046  12-06-2019 06:18   org/springframework/boot/loader/jar/JarFileEntries$EntryIterator.class
		      295  12-06-2019 06:18   org/springframework/boot/loader/jar/CentralDirectoryEndRecord$1.class
		    15394  12-06-2019 06:18   org/springframework/boot/loader/jar/JarFile.class
		      282  12-06-2019 06:18   org/springframework/boot/loader/data/RandomAccessDataFile$1.class
		      410  12-06-2019 06:18   org/springframework/boot/loader/jar/JarURLConnection$CloseAction.class
		     3697  12-06-2019 06:18   org/springframework/boot/loader/jar/JarEntry.class
		     1233  12-06-2019 06:18   org/springframework/boot/loader/jar/JarFile$2.class
		      299  12-06-2019 06:18   org/springframework/boot/loader/jar/JarEntryFilter.class
		      616  12-06-2019 06:18   org/springframework/boot/loader/jar/Bytes.class
		      266  12-06-2019 06:18   org/springframework/boot/loader/PropertiesLauncher$1.class
		     5235  12-06-2019 06:18   org/springframework/boot/loader/archive/ExplodedArchive.class
		     4684  12-06-2019 06:18   org/springframework/boot/loader/Launcher.class
		    11492  12-06-2019 06:18   org/springframework/boot/loader/jar/Handler.class
		     4302  12-06-2019 06:18   org/springframework/boot/loader/jar/JarURLConnection$JarEntryName.class
		      302  12-06-2019 06:18   org/springframework/boot/loader/archive/Archive$Entry.class
		     3807  12-06-2019 06:18   org/springframework/boot/loader/archive/ExplodedArchive$FileEntryIterator.class
		     1713  12-06-2019 06:18   org/springframework/boot/loader/WarLauncher.class
		        0  01-07-2020 22:05   BOOT-INF/
		        0  01-07-2020 22:05   BOOT-INF/classes/
		        0  01-07-2020 22:05   BOOT-INF/classes/net/
		        0  01-07-2020 22:05   BOOT-INF/classes/net/edwardsonthe/
		        0  01-07-2020 22:05   BOOT-INF/classes/net/edwardsonthe/demo/
		      798  01-07-2020 22:05   BOOT-INF/classes/net/edwardsonthe/demo/Application.class
		      936  01-07-2020 22:05   BOOT-INF/classes/net/edwardsonthe/demo/Controller.class
		     2204  01-07-2020 22:05   BOOT-INF/classes/net/edwardsonthe/demo/ScheduledTasks.class
		     1965  01-07-2020 22:05   BOOT-INF/classes/net/edwardsonthe/demo/Status.class
		       66  01-07-2020 22:05   BOOT-INF/classes/application.yml
		        0  01-07-2020 22:05   BOOT-INF/lib/
		      402  01-07-2020 15:41   BOOT-INF/lib/spring-boot-starter-web-2.2.2.RELEASE.jar
		      402  01-07-2020 15:41   BOOT-INF/lib/spring-boot-starter-json-2.2.2.RELEASE.jar
		      405  01-07-2020 15:41   BOOT-INF/lib/spring-boot-starter-validation-2.2.2.RELEASE.jar
		      396  01-07-2020 15:41   BOOT-INF/lib/spring-boot-starter-2.2.2.RELEASE.jar
		  1388499  01-07-2020 15:41   BOOT-INF/lib/spring-boot-autoconfigure-2.2.2.RELEASE.jar
		  1042862  01-07-2020 15:41   BOOT-INF/lib/spring-boot-2.2.2.RELEASE.jar
		      403  01-07-2020 15:41   BOOT-INF/lib/spring-boot-starter-tomcat-2.2.2.RELEASE.jar
		   945943  01-07-2020 15:41   BOOT-INF/lib/spring-webmvc-5.2.2.RELEASE.jar
		  1422295  01-07-2020 15:41   BOOT-INF/lib/spring-web-5.2.2.RELEASE.jar
		  1217810  01-07-2020 15:41   BOOT-INF/lib/spring-context-5.2.2.RELEASE.jar
		   372550  01-07-2020 15:41   BOOT-INF/lib/spring-aop-5.2.2.RELEASE.jar
		   684673  01-07-2020 15:41   BOOT-INF/lib/spring-beans-5.2.2.RELEASE.jar
		   281807  01-07-2020 15:41   BOOT-INF/lib/spring-expression-5.2.2.RELEASE.jar
		  1431881  01-07-2020 15:41   BOOT-INF/lib/spring-core-5.2.2.RELEASE.jar
		      404  01-07-2020 15:41   BOOT-INF/lib/spring-boot-starter-logging-2.2.2.RELEASE.jar
		    25058  01-07-2020 15:41   BOOT-INF/lib/jakarta.annotation-api-1.3.5.jar
		   303487  01-07-2020 15:41   BOOT-INF/lib/snakeyaml-1.25.jar
		    34399  01-07-2020 15:41   BOOT-INF/lib/jackson-datatype-jdk8-2.10.1.jar
		   105899  01-07-2020 15:41   BOOT-INF/lib/jackson-datatype-jsr310-2.10.1.jar
		     9331  01-07-2020 15:41   BOOT-INF/lib/jackson-module-parameter-names-2.10.1.jar
		  1403051  01-07-2020 15:41   BOOT-INF/lib/jackson-databind-2.10.1.jar
		   265748  01-07-2020 15:41   BOOT-INF/lib/tomcat-embed-websocket-9.0.29.jar
		  3372093  01-07-2020 15:41   BOOT-INF/lib/tomcat-embed-core-9.0.29.jar
		   254456  01-07-2020 15:41   BOOT-INF/lib/tomcat-embed-el-9.0.29.jar
		    93157  01-07-2020 15:41   BOOT-INF/lib/jakarta.validation-api-2.0.1.jar
		  1155630  01-07-2020 15:41   BOOT-INF/lib/hibernate-validator-6.0.18.Final.jar
		    23770  01-07-2020 15:41   BOOT-INF/lib/spring-jcl-5.2.2.RELEASE.jar
		   290339  01-07-2020 15:41   BOOT-INF/lib/logback-classic-1.2.3.jar
		    17459  01-07-2020 15:41   BOOT-INF/lib/log4j-to-slf4j-2.12.1.jar
		     4592  01-07-2020 15:41   BOOT-INF/lib/jul-to-slf4j-1.7.29.jar
		    68081  01-07-2020 15:41   BOOT-INF/lib/jackson-annotations-2.10.1.jar
		   348625  01-07-2020 15:41   BOOT-INF/lib/jackson-core-2.10.1.jar
		    60790  01-07-2020 15:41   BOOT-INF/lib/jboss-logging-3.4.1.Final.jar
		    67815  01-07-2020 15:41   BOOT-INF/lib/classmate-1.5.1.jar
		   471901  01-07-2020 15:41   BOOT-INF/lib/logback-core-1.2.3.jar
		    41424  01-07-2020 15:41   BOOT-INF/lib/slf4j-api-1.7.29.jar
		   276771  01-07-2020 15:41   BOOT-INF/lib/log4j-api-2.12.1.jar
		---------                     -------
		 17679958                     113 files

 7. `gw bootRun`
 
		   .   ____          _            __ _ _
		 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
		( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
		 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
		  '  |____| .__|_| |_|_| |_\__, | / / / /
		 =========|_|==============|___/=/_/_/_/
		 :: Spring Boot ::        (v2.2.2.RELEASE)
		
		2020-01-07 22:12:18.083  INFO 9490 --- [  restartedMain] net.edwardsonthe.demo.Application        : Starting Application on sandbox with PID 9490 (/home/jeff/workspace/demo/demo-app/build/classes/java/main started by jeff in /home/jeff/workspace/demo/demo-app)
		2020-01-07 22:12:18.088  INFO 9490 --- [  restartedMain] net.edwardsonthe.demo.Application        : No active profile set, falling back to default profiles: default
		2020-01-07 22:12:18.145  INFO 9490 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
		2020-01-07 22:12:18.145  INFO 9490 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
		2020-01-07 22:12:20.204  INFO 9490 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
		2020-01-07 22:12:20.215  INFO 9490 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
		2020-01-07 22:12:20.216  INFO 9490 --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.29]
		2020-01-07 22:12:20.266  INFO 9490 --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
		2020-01-07 22:12:20.266  INFO 9490 --- [  restartedMain] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 2121 ms
		2020-01-07 22:12:20.511  INFO 9490 --- [  restartedMain] net.edwardsonthe.demo.ScheduledTasks     : host=192.168.1.4
		2020-01-07 22:12:20.914  INFO 9490 --- [  restartedMain] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
		2020-01-07 22:12:21.158  INFO 9490 --- [  restartedMain] o.s.s.c.ThreadPoolTaskScheduler          : Initializing ExecutorService 'taskScheduler'
		2020-01-07 22:12:21.239  INFO 9490 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
		2020-01-07 22:12:21.384  INFO 9490 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
		2020-01-07 22:12:21.439  INFO 9490 --- [  restartedMain] net.edwardsonthe.demo.Application        : Started Application in 4.545 seconds (JVM running for 5.735)
		2020-01-07 22:12:22.371  INFO 9490 --- [   scheduling-1] net.edwardsonthe.demo.ScheduledTasks     : Status(host=192.168.1.4, estimate=3.1435932, delta=0.0020005464102070825)
		2020-01-07 22:12:23.398  INFO 9490 --- [   scheduling-1] net.edwardsonthe.demo.ScheduledTasks     : Status(host=192.168.1.4, estimate=3.1406964, delta=-8.962535897931723E-4)
		2020-01-07 22:12:24.451  INFO 9490 --- [   scheduling-1] net.edwardsonthe.demo.ScheduledTasks     : Status(host=192.168.1.4, estimate=3.1415568, delta=-3.5853589793077845E-5)
		2020-01-07 22:12:25.391  INFO 9490 --- [   scheduling-1] net.edwardsonthe.demo.ScheduledTasks     : Status(host=192.168.1.4, estimate=3.1425428, delta=9.501464102070756E-4)
		.
		.
		.

8. `curl localhost:8080/status | python -m json.tool`

		{
		    "delta": 3.094641020684463e-05,
		    "estimate": 3.1416236,
		    "host": "192.168.1.4"
		}

9. `gw dockerBuildImage`

10. `docker images`

		REPOSITORY                                      TAG                 IMAGE ID            CREATED             SIZE
		net.edwardsonthe/demo-app                       0.0.1-snapshot      c04a06b661cb        46 seconds ago      123MB

11. `docker run --rm -d -p 80:8080 --name demo-app net.edwardsonthe/demo-app:0.0.1-snapshot`

12. `docker ps`

		CONTAINER ID        IMAGE                                      COMMAND                  CREATED             STATUS              PORTS                  NAMES
		bc03873e8b9c        net.edwardsonthe/demo-app:0.0.1-snapshot   "java -Dspring.profi…"   11 seconds ago      Up 10 seconds       0.0.0.0:80->8080/tcp   demo-app

13. `docker logs -f bc03873e8b9c`

14. `curl localhost:8080/status | python -m json.tool`


