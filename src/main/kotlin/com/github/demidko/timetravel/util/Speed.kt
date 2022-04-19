package com.github.demidko.timetravel.util

import kotlin.time.Duration
import kotlin.time.DurationUnit
import kotlin.time.toTimeUnit


data class Speed(private val unit: DistanceUnit, private val per: DurationUnit) {

  fun calculateDistance(duration: Duration): Distance {
    val count = duration.toInt(per)
    return Distance(unit, count)
  }

  fun calculateDuration(distance: Distance): Duration {
    val count = distance.countOf(unit)
    TODO()
  }
}