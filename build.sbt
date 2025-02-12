ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.16"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.19" % Test,
  "org.scalactic" %% "scalactic" % "3.2.19",
)

lazy val root = (project in file("."))
  .settings(
    name := "Mercator_Cohort2Lessons"
  )
