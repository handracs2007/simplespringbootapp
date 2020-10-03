package org.handra.demo.simplespringbootapp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
class DemoResource {

    private val restTemplate = RestTemplate()

    @GetMapping("/call")
    fun callMe(): String {
        // Just simply call the web service and get the response
        val response = this.restTemplate.getForObject("https://covid19-api.org/api/status", String::class.java)
        return response!!
    }
}