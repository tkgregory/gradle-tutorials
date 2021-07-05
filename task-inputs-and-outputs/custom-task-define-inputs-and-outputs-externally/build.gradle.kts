plugins {
    base
}

abstract class JoinQuote : DefaultTask() {
    @get:InputFile
    val firstInputFile = project.objects.fileProperty()

    @get:InputFile
    val secondInputFile = project.objects.fileProperty()

    @get:OutputFile
    val outputFile = project.objects.fileProperty()

    @TaskAction
    fun join() {
        outputFile.get().asFile.writeText(firstInputFile.get().asFile.readText() + secondInputFile.get().asFile.readText())
    }
}

tasks.register<JoinQuote>("joinQuote") {
    firstInputFile.set(layout.projectDirectory.file("quote-part-1.txt"))
    secondInputFile.set(layout.projectDirectory.file("quote-part-2.txt"))
    outputFile.set(layout.buildDirectory.file("full-quote.txt"))
}