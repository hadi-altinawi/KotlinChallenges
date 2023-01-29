package _int

import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import org.junit.jupiter.api.Test

class IntAdditivePersistenceTest {

    @Test
    fun `test additive persistence negative number`() {
        val testInt = -1
        assertFailsWith<IllegalArgumentException> { testInt.additivePersistence() }
    }

    @Test
    fun `test additive persistence number less than 10`() {
        val testInt = 9
        val expectedResult = Result(loopCount = 0, stopValue = 9)
        assertEquals(expected = expectedResult, actual = testInt.additivePersistence())
    }

    @Test
    fun `test additive persistence number greater than 10`() {
        val testInt = 2718
        val expectedResult = Result(loopCount = 2, stopValue = 9)
        assertEquals(expected = expectedResult, actual = testInt.additivePersistence())
    }
}