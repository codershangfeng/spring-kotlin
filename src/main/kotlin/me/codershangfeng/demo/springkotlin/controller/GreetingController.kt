package me.codershangfeng.demo.springkotlin.controller

import me.codershangfeng.demo.springkotlin.model.Greeting
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    companion object {
        private val log = LoggerFactory.getLogger(Greeting::class.java)
    }

    @GetMapping("/greeting")
    fun greeting(@RequestParam id: String?): Greeting {
        log.info("Received greeting request from id={$id}")
        return Greeting(id ?: "1", "Hello, world")
    }
}