import SonatypeKeys._

import sbt.Keys._

lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin).settings(
  credentials += Credentials(Path.userHome / ".ivy2" / ".credentials"),
  resolvers += "NextWave Repo" at "http://maxdevmaster.cloudapp.net:4343/artifactory/nxtwv-maven/",
  publishTo := Some("NextWave Repo" at "http://maxdevmaster.cloudapp.net:4343/artifactory/nxtwv-maven/")
)

lazy val demo = (project in file("demo"))
  .settings(demoSettings:_*)
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(root)


lazy val demoSettings = Seq(
  name := s"chart-demo",
  scalaVersion := "2.11.8",
  libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "0.9.0"
  )
)

name := "Type-safe and Scala-friendly library over Chart.js"

normalizedName := "scalajs-chart"

version := "0.0.2-SNAPSHOT"

organization := "io.surfkit"

scalaVersion := "2.11.8"

crossScalaVersions := Seq("2.10.4", "2.11.8")

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.0"
)

jsDependencies in Test += RuntimeDOM

homepage := Some(url("http://www.surfkit.io/"))

licenses += ("MIT License", url("http://www.opensource.org/licenses/mit-license.php"))

scmInfo := Some(ScmInfo(
    url("https://github.com/coreyauger/scalajs-chart"),
    "scm:git:git@github.com/coreyauger/scalajs-chart.git",
    Some("scm:git:git@github.com:coreyauger/scalajs-chart.git")))

publishMavenStyle := true


pomExtra := (
  <developers>
    <developer>
      <id>coreyauger</id>
      <name>Corey Auger</name>
      <url>https://github.com/coreyauger/</url>
    </developer>
  </developers>
)

pomIncludeRepository := { _ => false }
