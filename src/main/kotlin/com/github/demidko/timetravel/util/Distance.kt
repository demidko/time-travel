package com.github.demidko.timetravel.util

data class Distance(private val unit: DistanceUnit, private val count: Int) {

  fun countOf(unit: DistanceUnit): Double {
    return unit.countOf(this.unit) * count
  }
}