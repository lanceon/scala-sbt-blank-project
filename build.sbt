organization := "org.yourorganization"

name := "scala sbt project"

version := "0.1"

scalaVersion := "2.11.7"

// See: https://github.com/sbt/sbt-assembly
assemblyJarName in assembly := "project.jar"

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-feature",
  "-language:postfixOps",
  "-language:implicitConversions",
  "-language:existentials",
  "-language:reflectiveCalls",
  "-language:higherKinds",
  "-Ydelambdafy:method"
)


libraryDependencies ++= {
  Seq(
    "ch.qos.logback" % "logback-classic" % "1.1.2"
  )
}

addCommandAlias("c", "compile") ++
addCommandAlias("s", "container:start") ++
addCommandAlias("q", "container:stop") ++
addCommandAlias("qs", "; container:stop ;container:start") ++
addCommandAlias("deps", "dependency-tree")

