Demonstrates several possible use cases involving inputs and outputs.

See the accompanying article [Gradle task inputs and outputs](https://tomgregory.com/gradle-task-inputs-and-outputs)
for a full description.

* [custom-task](/task-inputs-and-outputs/custom-task): creates a task class declaring inputs and outputs with annotations
* [custom-task-define-inputs-and-outputs-externally](/task-inputs-and-outputs/custom-task-define-inputs-and-outputs-externally): similar to custom-task, but this time we don’t rely on defaults and define the values of inputs and outputs outside the task class
* [pre-packaged-task](/task-inputs-and-outputs/pre-packaged-task): uses an existing Gradle task class (in this case `Copy`) and demonstrates the up-to-date checks working
* [ad-hoc-task](/task-inputs-and-outputs/ad-hoc-task): doesn’t use a task class, but instead defines an ad-hoc task, dynamically creating inputs and outputs
* [linking-tasks](/task-inputs-and-outputs/linking-tasks): demonstrates how to link inputs & outputs between tasks in the same project
* [sharing-outputs-between-projects](/task-inputs-and-outputs/sharing-outputs-between-projects): a similar outcome to linking-tasks, but this time we need to share task outputs between subprojects which requires the use of dependency configurations
* [all-types-custom-task](/task-inputs-and-outputs/all-types-custom-task): defines a dummy task to illustrate how to use all the different input and output types

Checkout [this branch](https://github.com/tkgregory/gradle-tutorials/tree/kotlin) for Kotlin implementations.

## Need Gradle support?
Contact me if you need help with Gradle at [tom@tomgregory.com](mailto:tom@tomgregory.com).
