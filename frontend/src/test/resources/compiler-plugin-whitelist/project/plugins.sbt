addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.6.0")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "0.6.0")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.26")
addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.3.7")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.1")
addSbtPlugin("com.softwaremill.clippy" % "plugin-sbt" % "0.5.3")

addSbtPlugin("ch.epfl.scala" % "sbt-bloop-build-shaded" % "1.0.0-SNAPSHOT")
updateOptions := updateOptions.value.withLatestSnapshots(false)
