package _int

/**
 * Have the function Int.additivePersistence() receives an int which will always be a positive integer
 * and returns its additive persistence which is the number of times you must add the digits in num until you
 * reach a single digit and the final stop value.
 *
 * For example: if num is 2718 then your program should return 2 because 2 + 7 + 1 + 8 = 18
 * and 1 + 8 = 9, and you stop at 9 and loop count is 2.
 */


data class Result(val loopCount: Int, val stopValue: Int)

fun Int.additivePersistence(): Result {

    if (this < 0) throw IllegalArgumentException("Number can't be negative")
    return additivePersistenceRecursion(loopCount = 0)
}

private fun Int.additivePersistenceRecursion(loopCount: Int): Result {
    if (this < 10) return Result(loopCount = loopCount, stopValue = this)

    var sum = 0
    this.toString().forEach {
        sum += it.digitToInt()
    }
    return sum.additivePersistenceRecursion(loopCount = loopCount + 1)
}