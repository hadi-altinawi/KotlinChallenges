package com.altinawi

import java.util.regex.Matcher
import java.util.regex.Pattern

/**
 * Code challenge
 * Write a function that checks whether a string contains unique characters or not.
 * Return the string revered only if the string characters are unique, otherwise return null.
 */

/**
 * Challenge solution
 */
fun String.isUnique(): String? = if (this.toSet().size == this.length) this.reversed() else null

/**
 * Code challenge
 * Have the function String.ABCheck() receive String and return the string true if the characters a and b are
 * separated by exactly 3 places anywhere in the string at least once
 * (i.e. "lane borrowed" would result in true because there is exactly three characters between a and b).
 * Otherwise, return the string false.
 */

/**
 * Challenge solution
 */
 fun String.abCheck() : Boolean {
    if(this.length < 5) return false
    val pattern : Pattern = Pattern.compile("(a...b)|(b...a)")
    val matcher: Matcher = pattern.matcher(this.lowercase())
    return matcher.find()
}