organization := "org.yourorganization"

name := "scala sbt project"

version := "0.2"

scalaVersion := "2.12.1"


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
    "ch.qos.logback" % "logback-classic" % "1.1.7"
  )
}

mainClass in Compile := Some("com.devscala.Main")

addCommandAlias("c", "compile") ++
addCommandAlias("r", "run") ++
addCommandAlias("deps", "dependency-tree")
