plugins {
    base
}

val quote by configurations.creating

dependencies {
    quote(
        project(
            mapOf(
                "path" to ":produce-quote",
                "configuration" to "quote"
            )
        )
    )
}

abstract class AddQuoteSource : DefaultTask() {
    @get:Input
    val source = project.objects.property(String::class.java)

    @get:InputFiles
    val inputFiles = project.objects.fileCollection()

    @get:OutputFile
    val outputFile = project.objects.fileProperty().convention(project.layout.buildDirectory.file("quote-with-source.txt"))

    @TaskAction
    fun join() {
        outputFile.get().asFile.writeText("${inputFiles.singleFile.readText()}\n\n${source.get()}")
    }
}

tasks.register<AddQuoteSource>("addQuoteSource") {
    source.set("Scarface (1983)")
    inputFiles.from(quote)
}