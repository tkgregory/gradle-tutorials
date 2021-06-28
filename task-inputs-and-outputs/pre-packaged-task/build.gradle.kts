plugins {
    base
}

tasks.register<Copy>("copyFile") {
    from(layout.projectDirectory.file("message.txt"))
    into(layout.buildDirectory)
}