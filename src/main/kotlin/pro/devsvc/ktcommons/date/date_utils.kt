package pro.devsvc.ktcommons.date

import java.time.LocalDateTime
import java.time.chrono.IsoChronology
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatterBuilder
import java.time.format.ResolverStyle

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