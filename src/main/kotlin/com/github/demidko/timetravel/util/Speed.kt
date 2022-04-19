package com.github.demidko.timetravel.util

import kotlin.time.DurationUnit

data class Speed(private val unit: DistanceUnit, private val per: DurationUnit) {

  fun calculateDistance(time: DurationUnit): DistanceUnit {
    TODO()
  }
}