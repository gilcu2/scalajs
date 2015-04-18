name := "scalajs"

version := "0.1"

scalaVersion := "2.11.6"

enablePlugins(ScalaJSPlugin)

scalaJSStage in Global := FastOptStage

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.8.0"





