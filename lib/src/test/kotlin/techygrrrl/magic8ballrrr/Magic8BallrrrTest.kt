package techygrrrl.magic8ballrrr

import kotlin.test.Test
import kotlin.test.assertContains

class Magic8BallrrrTest {
    @Test
    fun answersQuestionUsingDefaultAnswers() {
        val subject = Magic8Ballrrr()

        val result = subject.ask("Does this work?")

        assertContains(Magic8Ballrrr.defaultAnswers(), result)
    }

    @Test
    fun answersQuestionUsingCustomAnswers() {
        val subject = Magic8Ballrrr(
            answers = listOf(
                Answer.Positive("Yep"),
                Answer.Neutral("Maybe"),
                Answer.Negative("Absolutely the F not"),
            )
        )

        val result = subject.ask("am I cool?")

        assertContains(listOf(
            Answer.Positive("Yep"),
            Answer.Neutral("Maybe"),
            Answer.Negative("Absolutely the F not"),
        ), result)
    }

    @Test
    fun exampleImplementationWithDefaultAnswers() {
        // Ask a question and get the answer
        val question = "should I have some wine and cheese?"
        val answer = Magic8Ballrrr().ask(question)

        // Common properties and methods for all answers
        println("Answer text: ${answer.text}")
        println("Answer emoji: ${answer.emoji}")
        println("Formatted answer: ${answer.format()}")

        // Do something conditional based on the answer type
        when (answer) {
            is Answer.Negative -> println("☹️ The result is a negative answer")
            is Answer.Neutral -> println("🤔 The result is neutral")
            is Answer.Positive -> println("✅ The result is a positive answer")
            else -> {}
        }
    }

    @Test
    fun exampleImplementationWithCustomAnswers() {
        // Ask a question and get the answer
        val question = "should I have some wine and cheese?"
        val customAnswers = listOf(
            Answer.Positive(text = "ye", emoji = "👍"),
            Answer.Neutral(text = "dunno", emoji = "🤔"),
            Answer.Negative(text = "nah", emoji = "👎"),
        )
        val answer = Magic8Ballrrr(customAnswers).ask(question)

        // Common properties and methods for all answers
        println("Answer text: ${answer.text}")
        println("Answer emoji: ${answer.emoji}")
        println("Formatted answer: ${answer.format()}")

        // Do something conditional based on the answer type
        when (answer) {
            is Answer.Negative -> println("☹️ The result is a negative answer")
            is Answer.Neutral -> println("🤔 The result is neutral")
            is Answer.Positive -> println("✅ The result is a positive answer")
            else -> {}
        }
    }
}