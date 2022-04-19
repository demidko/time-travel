package com.github.demidko.timetravel

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TimeTravelApplication {

}

fun main(args: Array<String>) {

	runApplication<TimeTravelApplication>(*args)
}
