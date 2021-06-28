plugins {
    base
}

abstract class AddQuotationMarks : DefaultTask() {
    @get:InputFile
    val inputFile = project.objects.fileProperty().convention(project.layout.projectDirectory.file("quote.txt"))
    @get:OutputFile
    val outputFile = project.objects.fileProperty().convention(project.layout.buildDirectory.file("quote-with-quotation-marks.txt"))

    @TaskAction
    fun join() {
        outputFile.get().asFile.writeText("\"${inputFile.get().asFile.readText()}\"")
    }
}

val addQuotationMarks = tasks.register<AddQuotationMarks>("addQuotationMarks")

abstract class AddQuoteSource : DefaultTask() {
    @get:Input
    abstract val source : Property<String>
    @get:InputFile
    abstract val inputFile : RegularFileProperty
    @get:OutputFile
    val outputFile = project.objects.fileProperty().convention(project.layout.buildDirectory.file("quote-with-source.txt"))

    @TaskAction
    fun join() {
        outputFile.get().asFile.writeText( "${inputFile.get().asFile.readText()}\n\n${source.get()}")
    }
}

tasks.register<AddQuoteSource>("addQuoteSource") {
    source.set("Dr. No (1963)")
    inputFile.set(addQuotationMarks.get().outputFile)
}