package com.altinawi

/**
 * Code challenge
 * Write a function that checks whether a string contains unique characters or not.
 * Return the string revered only if the string characters are unique, otherwise return null.
 */

/**
 * Challenge solution
 */
fun String.isUnique(): String? = if (this.toSet().size == this.length) this.reversed() else null