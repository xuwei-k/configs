import sbt.Keys._
import sbt._

object Common extends AutoPlugin {

  override def trigger = allRequirements

  override def requires = Versions

  override lazy val projectSettings: Seq[Setting[_]] = Seq(
    description := "Scala wrapper for Typesafe config",
    organization := "com.github.kxbmap",
    scalacOptions ++= Seq(
      "-target:jvm-1.8",
      "-deprecation",
      "-unchecked",
      "-feature",
      "-Xlint",
      "-Xexperimental",
      "-language:higherKinds",
      "-language:implicitConversions",
      "-language:experimental.macros"
    ),
    updateOptions := updateOptions.value.withCachedResolution(true)
  )

}
