plugins {
    base
}

abstract class AllTypes : DefaultTask() {
    //inputs
    @get:Input
    val inputString = project.objects.property(String::class.java).convention("default value")
    @get:InputFile
    val inputFile = project.objects.fileProperty().convention(project.layout.projectDirectory.file("default-file.txt"))
    @get:InputDirectory
    val inputDirectory = project.objects.directoryProperty().convention(project.layout.projectDirectory.dir("default-dir"))
    @get:InputFiles
    val inputFileCollection = project.objects.fileCollection().from(project.layout.projectDirectory.file("default-file-1.txt"), project.layout.projectDirectory.file("default-file-2.txt"))
    @get:Classpath
    val inputClasspath = project.objects.fileCollection().from(project.layout.projectDirectory.file("MyClass.class"))

    // outputs
    @get:OutputFile
    val outputFile = project.objects.fileProperty().convention(project.layout.buildDirectory.file("default-file.txt"))
    @get:OutputDirectory
    val outputDirectory = project.objects.directoryProperty().convention(project.layout.projectDirectory.dir("default-dir"))
    @get:OutputFiles
    val outputFiles = project.objects.fileCollection().from(project.layout.buildDirectory.file("default-file-1.txt"), project.layout.buildDirectory.file("default-file-2.txt"))
    @get:OutputDirectories
    val outputDirectories = project.objects.fileCollection().from(project.layout.projectDirectory.dir("default-dir-1"), project.layout.projectDirectory.dir("default-dir-2"))
}

tasks.register<AllTypes>("allTypes")