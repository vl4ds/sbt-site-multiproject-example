name := "sbt-site-multiproject-example"

lazy val root = project.in( file(".") )
  .aggregate(util,core)

lazy val util = project.in( file("util") )

lazy val core = project.in( file("core") )
