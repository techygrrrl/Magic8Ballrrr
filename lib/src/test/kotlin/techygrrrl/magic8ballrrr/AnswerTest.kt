package techygrrrl.magic8ballrrr

import junit.framework.TestCase.assertEquals
import kotlin.test.Test

class AnswerTest {
    @Test
    fun canBeFormattedWithDefaultEmoji() {
        assertEquals("🟢 Yes ma'am", Answer.Positive("Yes ma'am").format())
        assertEquals("🟡 No freakin' clue, bro", Answer.Neutral("No freakin' clue, bro").format())
        assertEquals("🔴 Big nope", Answer.Negative("Big nope").format())
    }

    @Test
    fun canBeFormattedWithCustomEmoji() {
        assertEquals("😃 Yes ma'am", Answer.Positive("Yes ma'am", "😃").format())
        assertEquals("🤷🏻‍♀️ No freakin' clue, bro", Answer.Neutral("No freakin' clue, bro", "🤷🏻‍♀️").format())
        assertEquals("⛔️ Big nope", Answer.Negative("Big nope", "⛔️").format())
    }
}