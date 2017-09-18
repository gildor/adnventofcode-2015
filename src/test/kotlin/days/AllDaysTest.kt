package days

import org.junit.Ignore
import org.junit.Test
import utils.DayRunner

class AllDaysTest {
    // Do not run this test until we have all the solutions
    @Ignore
    @Test
    fun `gildor - all days`() {
        val runner = DayRunner("gildor")
        for (day in 1..25) {
            runner.printResults(day)
        }
    }
}