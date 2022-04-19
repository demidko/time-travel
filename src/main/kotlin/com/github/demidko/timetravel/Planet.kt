package com.github.demidko.timetravel

import com.github.demidko.timetravel.util.Distance
import com.github.demidko.timetravel.util.Speed
import kotlin.time.Duration
import kotlin.time.DurationUnit

class Planet(private val rotation: Speed) {

  fun rotate(duration: Duration): Distance {
    return rotation.calculateDistance(duration)
  }
}