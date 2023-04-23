/*
 * This file is used to add the sbt-assembly plugin to an sbt project. The sbt-assembly plugin is a 
 * popular plugin for creating a single JAR file containing all the dependencies of a Scala project.
 * This is useful when deploying applications, as it simplifies distribution and makes it easier
 * to run the application without needing to manage multiple JAR files.
 *
 * The single line of code in this file adds the plugin to the project by specifying its group ID, 
 * artifact ID, and version. The plugin will then be available for use in the project's build.sbt file.
 *
 * Group ID: "com.eed3si9n"
 * Artifact ID: "sbt-assembly"
 * Version: "1.2.0"
 */

// Add the sbt-assembly plugin to the project
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "1.2.0")
