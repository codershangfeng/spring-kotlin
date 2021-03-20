package me.codershangfeng.demo.springkotlin.controller

import me.codershangfeng.demo.springkotlin.model.Greeting
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    @GetMapping("/greeting")
    fun greeting(): Greeting = Greeting("1", "Hello, world")
}