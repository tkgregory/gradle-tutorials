plugins {
    application
}

application {
    mainClass.set("com.tomgregory.App2EndAllApps")
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "com.tomgregory.App2EndAllApps"
    }
}

tasks.register<JavaExec>("runJar") {
    classpath(tasks.jar.map { it.outputs })
    group = "application"
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
}

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
}