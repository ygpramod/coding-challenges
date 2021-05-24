package challenge

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LongestUniformSubstringKtTest{
    @Test
    fun `empty string`() {
        assertEquals(LongestUniformSubstring(-1, 0), longestUniformSubstring(""))
    }

    @Test
    fun `string = ab`() {
        assertEquals(LongestUniformSubstring(0, 1), longestUniformSubstring("ab"))
    }

    @Test
    fun `string = aa`() {
        assertEquals(LongestUniformSubstring(0, 2), longestUniformSubstring("aa"))
    }

    @Test
    fun `string = 10000111`() {
        assertEquals(LongestUniformSubstring(1, 4), longestUniformSubstring("10000111"))
    }

    @Test
    fun `string = aabbbbbCdAA`() {
        assertEquals(LongestUniformSubstring(2, 5), longestUniformSubstring("aabbbbbCdAA"))
    }

    @Test
    fun `string = aabbbbbCbdAA`() {
        assertEquals(LongestUniformSubstring(2, 5), longestUniformSubstring("aabbbbbCbdAA"))
    }
}