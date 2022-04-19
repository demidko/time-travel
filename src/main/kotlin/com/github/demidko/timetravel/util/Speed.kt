package com.github.demidko.timetravel.util

import kotlin.time.Duration
import kotlin.time.DurationUnit
import kotlin.time.toDuration


data class Speed(private val distance: Distance, private val per: DurationUnit) {

  fun calculateDistance(duration: Duration): Distance {
    val count = duration.toDouble(per)
    TODO()
  }

  fun calculateDuration(distance: Distance): Duration {
    TODO()
  }
}