scala-sbt-blank-project
=======================

Starter project for experiments with Scala and SBT.
scala 2.12.1, sbt 0.13.12, logging (logback)



To setup from github via console git:

    > git clone https://github.com/lanceon/scala-sbt-blank-project.git


Install latest sbt tool from http://www.scala-sbt.org/ (0.13.13 at the moment).

    > cd scala-sbt-blank-project
    > sbt


To compile from sbt:

    > compile


To run from sbt:

    > run
    [info] Running com.devscala.Main 
    16:21:55.184 [run-main-0] INFO  com.devscala.Main$ - First log message - info level
    16:21:55.190 [run-main-0] DEBUG com.devscala.Main$ - First log message - debug level
    Started at Sat Dec 10 16:21:55 UTC 2016
    16:21:55.235 [run-main-0] INFO  com.devscala.Main$ - Time taken by 'Creating 1 000 000 java.util.Date objects' is 38 millis
    [success] Total time: 1 s, completed Dec 10, 2016 4:21:55 PM

To create JAR package (via sbt-assembly plugin) from sbt:

    > assembly


To view project dependencies (via sbt-dependency-graph plugin) from sbt:

    > deps

    
To run the JAR:  

    > java -jar project.jar
    
