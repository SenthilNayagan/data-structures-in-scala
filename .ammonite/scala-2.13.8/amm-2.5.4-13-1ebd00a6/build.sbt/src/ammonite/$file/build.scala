
package ammonite
package $file
import _root_.ammonite.interp.api.InterpBridge.{
  value => interp
}
import _root_.ammonite.interp.api.InterpBridge.value.{
  exit,
  scalaVersion
}
import _root_.ammonite.interp.api.IvyConstructor.{
  ArtifactIdExt,
  GroupIdExt
}
import _root_.ammonite.compiler.CompilerExtensions.{
  CompilerInterpAPIExtensions,
  CompilerReplAPIExtensions
}
import _root_.ammonite.runtime.tools.{
  browse,
  grep,
  time,
  tail
}
import _root_.ammonite.compiler.tools.{
  desugar,
  source
}
import _root_.mainargs.{
  arg,
  main
}
import _root_.ammonite.repl.tools.Util.{
  PathRead
}


object build{
/*<script>*//*<amm>*/val res_0 = /*</amm>*/ThisBuild / version := "0.1.0-SNAPSHOT"

/*<amm>*/val res_1 = /*</amm>*/ThisBuild / scalaVersion := "3.1.3"

lazy val root = (project in file("."))
  .settings(
    name := "data-structures"
  )
/*</script>*/ /*<generated>*/
def $main() = { scala.Iterator[String]() }
  override def toString = "build"
  /*</generated>*/
}
