package life.helper.weather

import life.helper.answer.AnswerService
import life.helper.dayType
import life.helper.sms.SmsService
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
data class EveryScheduler(
  private val answerService: Map<String, AnswerService>,
  private val smsService: SmsService
) {

  @Scheduled(cron = "0 0 18 * * *")
  fun everyWeather() {
    val get = answerService.get(LocalDate.now().dayType())
    print(get?.answer())
    smsService.send(get?.answer())
  }
}