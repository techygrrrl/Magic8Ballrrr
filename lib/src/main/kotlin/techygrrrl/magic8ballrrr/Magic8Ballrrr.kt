package techygrrrl.magic8ballrrr

/**
 * This class tells people their future.
 * You can customize the answers or use the defaults.
 */
public class Magic8Ballrrr(
    private val answers: List<Answer> = defaultAnswers()
) {
    /**
     * Ask a question and find out what your future holds!
     * @return [Answer]
     */
    public fun ask(question: String): Answer {
        val answerIndex = answers.indices.secureRandom(question)

        // Shuffle as many times as there are answers
        var shuffledAnswers = answers
        repeat(answers.size) {
            shuffledAnswers = shuffledAnswers.shuffled()
        }

        return shuffledAnswers[answerIndex]
    }

    companion object {
        /**
         * @return [List][Answer]
         */
        @JvmStatic
        fun defaultAnswers(): List<Answer> = listOf(
            // Good
            Answer.Positive("It is certain"),
            Answer.Positive("It is decidedly so"),
            Answer.Positive("Without a doubt"),
            Answer.Positive("Yes definitely"),
            Answer.Positive("You may rely on it"),
            Answer.Positive("As I see it, yes"),
            Answer.Positive("Most likely"),
            Answer.Positive("Outlook good"),
            Answer.Positive("Yes"),
            Answer.Positive("Signs point to yes"),

            // Neutral
            Answer.Neutral("Reply hazy, try again"),
            Answer.Neutral("Ask again later"),
            Answer.Neutral("Better not tell you now"),
            Answer.Neutral("Cannot predict now"),
            Answer.Neutral("Concentrate and ask again"),

            // Bad
            Answer.Negative("Don't count on it"),
            Answer.Negative("My reply is no"),
            Answer.Negative("My sources say no"),
            Answer.Negative("Outlook not so good"),
            Answer.Negative("Very doubtful"),
        )
    }
}