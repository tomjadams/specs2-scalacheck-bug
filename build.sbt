lazy val root = (project in file(".")).
    settings(
      inThisBuild(List(
        organization := "com.example",
        scalaVersion := "2.12.1",
        version := "0.1.0-SNAPSHOT"
      )),
      name := "Hello",
      libraryDependencies ++= Seq(
        "org.specs2" %% "specs2-core" % "3.9.1" % "test",
        "org.specs2" %% "specs2-scalacheck" % "3.9.1" % "test",
        "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"
      ),
      scalacOptions in Test ++= Seq("-Yrangepos")
    )
