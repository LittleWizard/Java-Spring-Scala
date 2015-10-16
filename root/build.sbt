name := "wizard-world"

libraryDependencies ++= Seq(
  "org.hibernate" % "hibernate-entitymanager" % "5.0.2.Final",
  "org.springframework.data" % "spring-data-jpa" % "1.9.0.RELEASE" ,
  "javax.inject" % "javax.inject" % "1",
  "org.apache.commons" % "commons-lang3" % "3.4",
  "junit" % "junit" % "4.11" % "test",
  "org.springframework" % "spring-context" % "4.2.1.RELEASE",
  "org.springframework" % "spring-expression" % "4.2.1.RELEASE",
  "org.springframework" % "spring-test" % "4.2.1.RELEASE" % "test",
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "org.hsqldb" % "hsqldb" % "2.3.3"
)