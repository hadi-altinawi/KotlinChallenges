package com.altinawi

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue

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

    @Test
    fun `test ab check invalid input`() {
        val testString = "abc"
        assertFalse(testString.abCheck())
    }

    @Test
    fun `test ab check not found`() {
        val testString = "a12b3"
        assertFalse(testString.abCheck())
    }

    @Test
    fun `test ab check found`() {
        val testString = "acb123a  "
        assertTrue(testString.abCheck())
    }
}