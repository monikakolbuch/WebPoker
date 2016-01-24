name := "websocket-logger"

version := "1.0"

javacOptions += "-Xlint:deprecation"     

lazy val root = (project in file(".")).enablePlugins(PlayJava)

libraryDependencies ++= Seq(
  "org.webjars" % "bootstrap" % "3.3.4",
  "org.webjars" % "jquery" % "2.1.4"
)


fork in run := true