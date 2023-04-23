/**
 * This build file configures a multi-module SBT project with two sub-modules: `core` and `server`.
 * The project is intended to be built with Scala 2.13.8, and it uses the Cats Effect library in the `core` module.
 * The `server` module depends on the `core` module.
 */
ThisBuild / scalaVersion := "2.13.8"         // Sets the Scala version for the entire project to 2.13.8
ThisBuild / version := "1.0"                 // Sets the version of the entire project to 1.0
ThisBuild / name := "multi-module"           // Sets the project name to "multi-module"
ThisBuild / organization := "com.materdev"   // Sets the organization to "com.materdev"

// Defines the `core` module with its specific settings and dependencies
lazy val core = (project in file("core")).settings(
  assembly / mainClass := Some("com.materdev.CoreApp"), // Sets the main class of the `core` module to "com.materdev.CoreApp"
  libraryDependencies += Constants.rootPackage %% "cats-effect" % "3.3.0" // Adds the Cats Effect library (version 3.3.0) to the `core` module dependencies
)

// Defines the `server` module and specifies that it depends on the `core` module
lazy val server = (project in file("server")).dependsOn(core)

// Defines the `root` project, which aggregates the `core` and `server` modules
lazy val root = (project in file(".")).aggregate(core, server)
