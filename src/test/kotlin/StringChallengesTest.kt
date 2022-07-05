package com.altinawi

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class StringChallengesTest {

    @Test
    fun `test string characters are unique`() {
        val testString = "abcCBA"
        val expectedResult = testString.reversed()
        val actualResult = testString.isUnique()
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `test string characters are not unique`() {
        val testString = "abcCBAa"
        assertNull(testString.isUnique())
    }
}