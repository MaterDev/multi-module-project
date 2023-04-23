ThisBuild / scalaVersion := "2.13.8"
ThisBuild / version := "1.0"
ThisBuild / name := "multi-module"
ThisBuild / organization := "com.materdev"

lazy val core = (project in file("core")).settings(
  libraryDependencies += Constants.rootPackage %% "config" % "1.4.2"
)
lazy val server = (project in file ("server")).dependsOn(core)

lazy val root = (project in file(".")).aggregate(core, server)
