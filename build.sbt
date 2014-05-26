name := "hello"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "com.google.code.gson" % "gson" % "2.2"
)     

play.Project.playScalaSettings
