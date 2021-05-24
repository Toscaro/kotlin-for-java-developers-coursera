package tests.week3

/**
 * Mastermind in a functional style
 *
 * Complete the following implementation of 'evaluateGuess()' function.
 * Then compare your solution with the solution written in a functional style.
 */

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {

    val rightPositions = secret.zip(guess).count { (secret, guess) -> secret == guess }

    val commonLetters = "ABCDEF".sumBy { ch ->

        Math.min(secret.count { ch == it }, guess.count { ch == it })
    }
    return Evaluation(rightPositions, commonLetters - rightPositions)
}

fun main(args: Array<String>) {
    val result = Evaluation(rightPosition = 1, wrongPosition = 1)
    evaluateGuess("BCDF", "ACEB") eq result
    evaluateGuess("AAAF", "ABCA") eq result
    evaluateGuess("ABCA", "AAAF") eq result
}