package org.handra.demo.simplespringbootapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimplespringbootappApplication

fun main(args: Array<String>) {
    runApplication<SimplespringbootappApplication>(*args)
}
