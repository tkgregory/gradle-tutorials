**Shows inputs and outputs working for an ad-hoc task. The inputs and outputs are defined in the *build.gradle*.**

The `emphasiseQuote` task defined in *build.gradle* takes as input a quote file and an emphasis string. 
The produced output file contains the quote joined with the emphasis string.

### Demonstrating UP-TO-DATE checks

1. Run `./gradlew emphasiseQuote` and see that the task is executed (i.e. not *UP-TO-DATE*)
1. Verify that *build/emphasised-quote.txt* has been created
1. Run `./gradlew emphasiseQuote` and see that the task is not executed since it's *UP-TO-DATE*

#### Changing an input
1. Change *quote.txt*
1. Run `./gradlew emphasiseQuote` and see that the task is executed (i.e. not *UP-TO-DATE*)

#### Changing an output
1. Run `./gradlew clean` to delete *build/emphasised-quote.txt*
1. Run `./gradlew emphasiseQuote` and see that the task is executed (i.e. not *UP-TO-DATE*)