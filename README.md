scala-sbt-blank-project
=======================

Starter project for experiments with Scala and SBT.
scala 2.11.8, sbt 0.13.12, logging (logback)



To setup from github via console git:

    > git clone https://github.com/lanceon/scala-sbt-blank-project.git


Install latest sbt tool from http://www.scala-sbt.org/ (0.13.12 at the moment).

    > cd scala-sbt-blank-project
    > sbt


To compile from sbt:

    > compile


To run from sbt:

    > run
    [info] Running Main
    13:32:11.851 [run-main-0] INFO  Main$ - First log message - info level
    13:32:11.853 [run-main-0] DEBUG Main$ - First log message - debug level
    Started at Sat Sep 19 13:32:11 EEST 2015
    [success] Total time: 0 s, completed 19.09.2015 13:32:11


To create JAR package (via sbt-assembly plugin) from sbt:

    > assembly


To view project dependencies (via sbt-dependency-graph plugin) from sbt:

    > deps

    
To run the JAR:  

    > java -jar project.jar
    
