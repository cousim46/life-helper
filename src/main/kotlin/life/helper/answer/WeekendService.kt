package life.helper.answer

import org.springframework.ai.chat.model.ChatModel
import org.springframework.ai.chat.prompt.Prompt
import org.springframework.stereotype.Service
import replaceSpecialWordToBlank

@Service(value = "weekend")
data class WeekendService (
  private val chatModel: ChatModel,

) : AnswerService {

  override fun answer() : String {
    val response = chatModel.call(
      Prompt(
        DayType.WEEKEND.question.trimMargin()
      )
    )
    val text = response.results[0]
      .output.text
    return text.replaceSpecialWordToBlank("*#")
  }
}