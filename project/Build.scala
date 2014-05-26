import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {
  
  val appName         = "hello"
  val appVersion      = "0.0.3"

  val appDependencies = Seq(
    "org.reactivemongo" %% "play2-reactivemongo" % "0.10.2",
    "ws.securesocial" %% "securesocial" % "2.1.3"
  )
  
  val main = play.Project(appName, appVersion, appDependencies).settings(
    (Seq(
      resolvers += "Sonatype Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
      resolvers += Resolver.url("TPTeam Repository", url("http://tpteam.github.io/releases/"))(Resolver.ivyStylePatterns),
      resolvers += Opts.resolver.sonatypeReleases,
      resolvers += Resolver.sonatypeRepo("snapshots"))): _*)

}