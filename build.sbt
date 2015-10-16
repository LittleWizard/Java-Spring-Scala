name := "wizard-world"

libraryDependencies ++= Seq(
  "org.springframework.data" % "spring-data-jpa" % "1.9.0.RELEASE",
  "org.hibernate" % "hibernate-entitymanager"  % "5.0.2.Final",
  "org.hsqldb" % "hsqldb" % "2.3.3",
  "javax.inject" % "javax.inject" % "1",
  "junit" % "junit" % "4.12" % "test"
)


lazy val root = project