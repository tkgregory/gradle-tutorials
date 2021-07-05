**Shows how to link the output of one task to the input of another, across projects.**

There are two tasks involved in this project:

1. in the *produce-quote* subproject an *addQuotationMarks* task of type `AddQuotationMarks` takes as input a quote file. It produces an output file
containing the quote surrounded by quotation marks.
1. in the *consume-quote* subproject an *addQuoteSource* task of type `AddQuoteSource` takes as input a quote file and a quote source string. 
It produces an output file containing the quote and the quote source.

### Demonstrating UP-TO-DATE checks

1. Run `./gradlew addQuoteSource` and see that both tasks are executed (i.e. not *UP-TO-DATE*)
1. Verify that *consume-quote/build/quote-with-source.txt* has been created
1. Run `./gradlew addQuoteSource` and see that neither tasks is executed since they're *UP-TO-DATE*

Note that *addQuotationMarks* is also executed since *addQuoteSource* has a dependency on the *quote* configuration.

#### Changing an input
1. Change *produce-quote/quote.txt*
1. Run `./gradlew addQuoteSource` and see that both tasks are executed (i.e. not *UP-TO-DATE*)

#### Changing an output
1. Run `./gradlew clean` to delete all task outputs
1. Run `./gradlew addQuoteSource` and see that both tasks are executed (i.e. not *UP-TO-DATE*)