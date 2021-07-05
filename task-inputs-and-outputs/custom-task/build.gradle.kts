plugins {
    base
}

abstract class JoinQuote : DefaultTask() {
    @get:InputFile
    val firstInputFile = project.objects.fileProperty().convention(project.layout.projectDirectory.file("quote-part-1.txt"))

    @get:InputFile
    val secondInputFile = project.objects.fileProperty().convention(project.layout.projectDirectory.file("quote-part-2.txt"))

    @get:OutputFile
    val outputFile = project.objects.fileProperty().convention(project.layout.buildDirectory.file("full-quote.txt"))

    @TaskAction
    fun join() {
        outputFile.get().asFile.writeText(firstInputFile.get().asFile.readText() + secondInputFile.get().asFile.readText())
    }
}

tasks.register<JoinQuote>("joinQuote")