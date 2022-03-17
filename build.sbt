import Dependencies._

ThisBuild / scalaVersion := "2.13.5"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "dev.profunktor"
ThisBuild / organizationName := "ProfunKtor"

ThisBuild / scalafixDependencies += Libraries.organizeImports

resolvers += Resolver.sonatypeRepo("snapshots")

Compile / run / fork := true

lazy val root = (project in file("."))
  .settings(
    name := "minimal",
    scalacOptions ++= List("-Ymacro-annotations", "-Yrangepos", "-Wconf:cat=unused:info"),
    scalafmtOnCompile := true,
    libraryDependencies ++= Seq(
      CompilerPlugins.betterMonadicFor,
      CompilerPlugins.kindProjector,
      CompilerPlugins.semanticDB,
      Libraries.cats,
      Libraries.catsEffect,
      Libraries.catsMtl,
      Libraries.derevoCats,
      Libraries.derevoCirceMagnolia,
      Libraries.derevoTagless,
      Libraries.fs2,
      Libraries.monocleCore,
      Libraries.monocleMacro,
      Libraries.newtype,
      Libraries.refinedCore,
      Libraries.refinedCats,
      Libraries.tofu,
      Libraries.scalaTest
    )
  )

addCommandAlias("runLinter", ";scalafixAll --rules OrganizeImports")



// ThisBuild / scalaVersion := "2.12.14"

// ThisBuild / organization := "com.example"

// lazy val hello = (project in file("."))
//   .settings(
//     name := "Hello",  
//     libraryDependencies += "com.typesafe.play" %% "play-json" % "2.9.2",
//     libraryDependencies += "com.eed3si9n" %% "gigahorse-okhttp" % "0.5.0",
//     libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7" % Test,    
//   )