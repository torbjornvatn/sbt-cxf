useGpg := true

sbtPlugin := true

name := "sbt-cxf"

organization := "no.arktekk.sbt"

version := "0.4-SNAPSHOT"


crossBuildingSettings

CrossBuilding.crossSbtVersions := Seq("0.11.0", "0.12.4", "0.13.0")

credentials += Credentials(Path.userHome / ".sbt" / "arktekk-credentials")

publishTo <<= (version) { version: String =>
    if (version.trim.endsWith("SNAPSHOT"))
      Some("Sonatype Nexus Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots")
    else
      Some("Sonatype Nexus Staging" at "https://oss.sonatype.org/service/local/staging/deploy/maven2")
}

homepage := Some(new URL("http://github.com/arktekk/sbt-cxf"))

startYear := Some(2011)

licenses := Seq(("Apache 2", new URL("http://www.apache.org/licenses/LICENSE-2.0.txt")))

pomExtra <<= (pomExtra, name, description) {(pom, name, desc) => pom ++ xml.Group(
  <scm>
    <url>http://github.com/arktekk/sbt-cxf</url>
    <connection>scm:git:git://github.com/arktekk/sbt-cxf.git</connection>
    <developerConnection>scm:git:git@github.com:arktekk/sbt-cxf.git</developerConnection>
  </scm>
  <developers>
    <developer>
      <id>trygvis</id>
      <name>Trygve Laugstøl</name>
      <url>http://twitter.com/trygvis</url>
    </developer>
    <developer>
      <id>jteigen</id>
      <name>Jon Anders Teigen</name>
      <url>http://twitter.com/jteigen</url>
    </developer>
    <developer>
      <id>thoraage</id>
      <name>Thor Åge Eldby</name>
      <url>https://twitter.com/thoraageeldby</url>
    </developer>
  </developers>
)}
