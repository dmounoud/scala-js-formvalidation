lazy val scalaJsFormValidation = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "scala-js-formvalidation"

description := "Scala.js FormValivation Facade"

version := "1.0"

organization := "ch.diadys"

organizationName := "Diadys Sarl"

organizationHomepage := Some(url("http://diadys.sarl"))

startYear := Some(2016)

licenses += "GPLv3" -> url("http://www.gnu.org/licenses/gpl-3.0.html")

homepage := Some(url("https://github.com/diadys/scala-js-formvalidation"))

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "be.doeraene" %%% "scalajs-jquery" % "0.8.1",
  "org.webjars" % "jquery" % "2.1.4"
)

jsDependencies ++= Seq(
    ProvidedJS / "fv/bootstrap.min.js",
    ProvidedJS / "fv/formValidation.min.js",
    ProvidedJS / "fv/fr.js",
    ProvidedJS / "fv/mandatoryIcon.min.js",
    "org.webjars" % "jquery" % "2.1.4" / "jquery.js"
)

pomExtra :=
  <scm>
    <url>git@github.com:diadys/scala-js-formvalidation.git</url>
    <connection>scm:git:git@github.com:diadys/scala-js-formvalidation.git</connection>
  </scm>
  <developers>
    <developer>
      <id>diadys</id>
      <name>Didier Mounoud</name>
      <url>http://github.com/diadys/</url>
    </developer>
  </developers>
