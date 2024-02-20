package techygrrrl.magic8ballrrr

/**
 * [Answer] cannot be instantiated directly.
 * Choose one of the available answers below.
 */
public sealed class Answer {
    /**
     * The answer text
     */
    public abstract val text: String

    /**
     * Default formatting with emoji. You don't have to use the emoji, you can use
     * a when statement on the answer and use custom logic.
     */
    public fun format(): String = "$emoji $text"

    /**
     * An emoji for the answer, for easier formatting.
     */
    public abstract val emoji: String

    /**
     * Essentially "Yes" in many words.
     */
    public data class Positive(override val text: String, override val emoji: String = "🟢") : Answer()

    /**
     * Essentially "Maybe" or "I don't know" in many words.
     */
    public data class Neutral(override val text: String, override val emoji: String = "🟡") : Answer()

    /**
     * Essentially "No" in many words.
     */
    public data class Negative(override val text: String, override val emoji: String = "🔴") : Answer()
}