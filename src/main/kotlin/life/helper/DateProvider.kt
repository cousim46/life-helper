package life.helper

import java.time.DayOfWeek
import java.time.LocalDate

fun LocalDate.dayType(): String =
  if (this.dayOfWeek == DayOfWeek.SATURDAY || this.dayOfWeek == DayOfWeek.SUNDAY) {
    "weekend"
  } else {
    "weekdays"
  }
