plugins {
    base
}

val quote by configurations.creating

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

artifacts {
    add("quote", addQuotationMarks)
}