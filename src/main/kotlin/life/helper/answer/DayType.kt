package life.helper.answer

import java.time.LocalDate

enum class DayType(
  val description: String,
  val question: String,) {
  WEEKDAY("평일", "${LocalDate.now()} 기준으로  서울, 경기도, 인천 각각  날씨를 지역, 날씨,최저 및 최고온도, 비 올 가능성 항목으로 알려줘"),
  WEEKEND("주말", "오늘은 ${LocalDate.now()}입니다. 서울, 경기도, 인천 각각  날씨를 지역, 날씨,최저 및 최고온도, 비 올 가능성 항목으로 알려주고, 최근 10회 로또 번호들을 분석해서 이번에 당첨될거 같은 로또 번호 추천해줘, 불필요한 말은 생략하고 요청한값들만 답변해줘"),

}