name := "Scala-training"

version := "1.0"

scalaVersion := "2.11.8"

resolvers ++= Seq(
  "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.0" % "test"



