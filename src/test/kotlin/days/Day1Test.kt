package days

import org.junit.Test
import utils.res
import org.junit.Assert.*

class Day1Test {
    private val day = Day1()

    @Test
    fun countFloor() {
        assertEquals("0", day.partOne("(())"))
        assertEquals("0", day.partOne(""))
        assertEquals("1", day.partOne("(())("))
        assertEquals("-1", day.partOne("(()))"))
        assertEquals("-3", day.partOne(")))"))
    }

    @Test
    fun basementPersonIndex() {
        assertEquals("1", day.partTwo(")"))
        assertEquals("7", day.partTwo("((())))"))
    }

    @Test(expected = IllegalStateException::class)
    fun `No answer for basementPersonIndex`() {
        assertEquals("0", day.partTwo("("))
    }

    @Test
    fun `gildor - answer part one`() {
        assertEquals(
                "74",
                day.partOne("gildor/input1".res())
        )
    }

    @Test
    fun `gildor - answer part two`() {
        assertEquals(
                "1795",
                day.partTwo("gildor/input1".res())
        )
    }
}