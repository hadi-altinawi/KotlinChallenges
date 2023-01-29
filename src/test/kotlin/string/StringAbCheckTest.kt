package string

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class StringAbCheckTest {

    @Test
    fun `test ab check invalid input`() {
        val testString = "abc"
        assertFalse(actual = testString.abCheck())
    }

    @Test
    fun `test ab check not found`() {
        val testString = "a12b3"
        assertFalse(actual = testString.abCheck())
    }

    @Test
    fun `test ab check found`() {
        val testString = "acb123a  "
        assertTrue(actual = testString.abCheck())
    }
}