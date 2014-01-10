resolvers <++= sbtVersion(sv => sv match {
 case v if (v.startsWith("0.11")) => Seq(Resolver.url("scalasbt", new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns))
 case _ => Nil
})

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-pgp" % "0.8.1")
