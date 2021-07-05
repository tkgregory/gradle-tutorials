plugins {
    base
}

tasks.register("emphasiseQuote") {
    inputs.file("quote.txt")
    inputs.property("emphasisCharacter", "!")
    outputs.file(layout.buildDirectory.file("emphasised-quote.txt"))
    doLast {
        outputs.files.singleFile.writeText(inputs.files.singleFile.readText() + inputs.properties.get("emphasisCharacter"))
    }
}