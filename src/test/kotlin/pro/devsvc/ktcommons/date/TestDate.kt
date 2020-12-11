package pro.devsvc.ktcommons.date

import org.junit.Test
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.temporal.WeekFields

class TestDate {

    @Test
    fun testDate() {
        val f = WeekFields.of(DayOfWeek.MONDAY, 1)
        val d = LocalDate.now().with(f.dayOfWeek(), 1)
        println(d)
        println(getFirstDayOfWeek(LocalDate.now()))
    }

}