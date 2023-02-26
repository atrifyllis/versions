plugins {
    `version-catalog`
    `maven-publish`
}

group = "gr.alx"
version = "1.0"

repositories {
    mavenLocal()
}

catalog {

    // declare the aliases, bundles and versions in this block
    versionCatalog {

        from(files("./gradle/libs.versions.toml"))

    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["versionCatalog"])
        }
    }
}
