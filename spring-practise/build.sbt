name := "spring practise"

libraryDependencies ++= Seq(
 // "org.springframework" % "spring-core" % "4.2.2.RELEASE",
  "org.springframework" % "spring-context" % "4.2.2.RELEASE"
)

/*
mainClass in (Compile, run) := Some("main.java.MainApp")

mainClass in (Compile, packageBin) := Some("main.java.MainApp")
*/


mainClass in (Compile, run) := Some("main.java.Application")

mainClass in (Compile, packageBin) := Some("main.java.Application")