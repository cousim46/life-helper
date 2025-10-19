package life.helper.answer

import org.springframework.ai.chat.model.ChatModel
import org.springframework.ai.chat.model.ChatResponse
import org.springframework.ai.chat.prompt.Prompt
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service(value = "weekdays")
class WeekdaysService (
  private val chatModel: ChatModel,
) : AnswerService {

  override fun answer() : String {
    val response = chatModel.call(
      Prompt(
        """
        ${DayType.WEEKDAY.question}
      """.trimMargin()
      )
    )
    val text = response.results[0]
      .output.text
    return text
  }
}