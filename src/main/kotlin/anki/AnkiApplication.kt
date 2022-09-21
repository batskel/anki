package anki

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AnkiApplication

fun main(args: Array<String>) {
    runApplication<AnkiApplication>(*args)
}
