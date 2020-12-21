package pro.devsvc.ktcommons.date

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.WeekFields

//-----------------------------------------------------------------------
var LOCAL_DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd' 'HH:mm:ss")

fun strToDate(str: String): LocalDateTime {
    var dateStr = str
    // 2020-12-02
    if (str.length == 10) {
        dateStr += " 00:00:00"
    }
    return LocalDateTime.parse(dateStr, LOCAL_DATE_TIME_FORMATTER)
}

fun String.toLocalDateTime(): LocalDateTime {
    return strToDate(this)
}

fun getFirstDayOfWeek(date: LocalDate): LocalDate {
    val f = WeekFields.of(DayOfWeek.MONDAY, 1)
    return date.with(f.dayOfWeek(), 1)
}

fun todayDataStr(): String {
    return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
}