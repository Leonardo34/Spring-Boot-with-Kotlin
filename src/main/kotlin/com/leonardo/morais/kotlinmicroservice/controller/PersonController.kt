package com.leonardo.morais.kotlinmicroservice.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/persons")
class PersonController {

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Int): String? = "Hello"
}