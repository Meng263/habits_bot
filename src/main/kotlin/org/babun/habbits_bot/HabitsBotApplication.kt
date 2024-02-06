package org.babun.habbits_bot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HabitsBotApplication

fun main(args: Array<String>) {
    runApplication<HabitsBotApplication>(*args)
}
