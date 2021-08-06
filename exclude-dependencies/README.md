Shows how to apply a dependency exclude rule.

## Summary

The intention  is to use the *SLF4J* logging framework with the *Log4j2* binding in [LoggingExample.java](src/main/java/com/tomgregory/LoggingExample.java).

*spring-boot-starter-logging* must be excluded to prevent runtime warnings and errors due to two *SLF4J* bindings being present on the classpath. 

See *[How to exclude Gradle dependencies](https://tomgregory.com/how-to-exclude-gradle-dependencies/)* for full details on this example.

## Running

Run via *application* plugin:

`./gradlew run`