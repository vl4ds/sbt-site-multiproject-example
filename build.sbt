name := "sbt-site-multiproject-example"

lazy val root = project.in( file(".") )
  .aggregate(util,core)
  .settings( aggregate.in(update) := false)

lazy val util = project.in( file("util") )

lazy val core = project.in( file("core") )
