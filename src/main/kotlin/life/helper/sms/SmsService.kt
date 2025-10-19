package life.helper.sms

interface SmsService {
  fun send(message: String?)
}