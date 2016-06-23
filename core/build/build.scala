import cbt._
import java.net.URL
import java.io.File
import scala.collection.immutable.Seq

class Build(val context: Context) extends BaseBuild{
  override def dependencies = super.dependencies ++ // don't forget super.dependencies here
    Resolver(mavenCentral).bind( 
      // "org.cvogt" %% "scala-extensions" % "0.4.1"
      "org.ow2.asm" % "asm-tree" % "5.0.4",
      "io.norberg" % "auto-matter" % "0.11.0",
      "com.google.guava" % "guava" % "18.0"
    )
  override def sources = Seq( projectDirectory ++ "/src/main" )
}
