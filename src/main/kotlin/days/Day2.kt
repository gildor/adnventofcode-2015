package days

import utils.Day

class Day2 : Day {
    override fun partOne(input: String) = input
            .lineSequence()
            .filterNot { it.isEmpty() }
            .map { it.split('x').map { it.toInt() } }
            .sumBy {
                val (l, w, h) = it
                val a1 = l * w
                val a2 = w * h
                val a3 = h * l
                2 * a1 + 2 * a2 + 2 * a3 + minOf(a1, a2, a3)
            }
            .toString()

    override fun partTwo(input: String) = input
            .lineSequence()
            .filterNot { it.isEmpty() }
            .map { it.split('x').map { it.toInt() } }
            .sumBy {
                val (l, w, h) = it
                val tie = l * w * h
                val ribbon = it.sorted()
                        .subList(0, 2)
                        .map { it * 2 }
                        .sum()
                tie + ribbon
            }
            .toString()

}
