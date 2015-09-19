scala-sbt-blank-project
=======================

scala 2.11.7

sbt 0.13.9

logging (logback)



Running from sbt:

    > run
    [info] Running Main
    13:32:11.851 [run-main-0] INFO  Main$ - First log message - info level
    13:32:11.853 [run-main-0] DEBUG Main$ - First log message - debug level
    Started at Sat Sep 19 13:32:11 EEST 2015
    [success] Total time: 0 s, completed 19.09.2015 13:32:11


Packaging (via sbt-assembly plugin) from sbt:

    > assembly


Running:

    java -jar "project.jar"