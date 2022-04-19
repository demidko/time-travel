package com.github.demidko.timetravel.util

sealed interface DistanceUnit {
  object Meter : DistanceUnit
  object Kilometer : DistanceUnit
}