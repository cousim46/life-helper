package life.helper.sms

import com.solapi.sdk.SolapiClient
import com.solapi.sdk.message.model.Message
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class CoolSmsService(
  @Value("\${sms.key}")
  private val smsKey: String,
  @Value("\${sms.secret_key}")
  private val smsSecretKey: String,
  @Value("\${sms.sender}")
  private val sender: String,
  @Value("\${sms.receiver}")
  private val receiver: String,
) : SmsService {

  override fun send(message: String?) {
    val solapiClient = SolapiClient.createInstance(smsKey, smsSecretKey)
    val receiverPhoneNumbers = receiver.split(",")
    receiverPhoneNumbers.forEach { phoneNumber ->
      val message = Message(from = sender, to = phoneNumber, text = message)
      solapiClient.send(message)
    }

  }
}