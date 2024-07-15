ThisBuild / organization := "com.eed3si9n"
ThisBuild / scalaVersion := "2.12.18"

lazy val root = (project in file("."))
  .settings(
    name := "report",
    libraryDependencies ++= Seq(
      "com.deepoove" % "poi-tl" % "1.12.1",
      "com.github.scopt" %% "scopt" % "4.1.0"
    )
  )


// Assembly 
assembly / mainClass := Some("com.shyan.Application")
assembly / assemblyJarName := "shyan_app.jar"

assemblyMergeStrategy in assembly := {
 case PathList("META-INF", _*) => MergeStrategy.discard
 case _                        => MergeStrategy.first
}