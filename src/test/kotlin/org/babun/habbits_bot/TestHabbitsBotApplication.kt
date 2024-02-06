package org.babun.habbits_bot

import org.springframework.boot.fromApplication
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.with

@TestConfiguration(proxyBeanMethods = false)
class TestHabbitsBotApplication

fun main(args: Array<String>) {
    fromApplication<HabitsBotApplication>().with(TestHabbitsBotApplication::class).run(*args)
}
