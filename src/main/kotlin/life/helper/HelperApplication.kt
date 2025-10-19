package life.helper

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class HelperApplication

fun main(args: Array<String>) {
  runApplication<HelperApplication>(*args)
}
