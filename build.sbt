// Disabled by default because this is confusing for beginners
//scalariformSettings

import AssemblyKeys._

assemblySettings

mainClass in assembly := Some("com.example.JettyLauncher")

initialCommands := """
import _root_.controller._, model._
import org.joda.time._
import scalikejdbc._, SQLInterpolation._, config._
DBsWithEnv("development").setupAll()
"""

