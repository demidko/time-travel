package com.github.demidko.timetravel.util

import java.util.DoubleSummaryStatistics

enum class DistanceUnit {

  Millimeter {
    override fun countOf(other: DistanceUnit): Double {
      return when (other) {
        Millimeter -> 1.0
        Centimeter -> 0.1
        Meter -> 0.001
        Kilometer -> 0.000001
      }
    }
  },

  Centimeter {
    override fun countOf(other: DistanceUnit): Double {
      return Millimeter.countOf(other) * 10
    }
  },

  Meter {
    override fun countOf(other: DistanceUnit): Double {
      return Centimeter.countOf(other) * 100
    }
  },

  Kilometer {
    override fun countOf(other: DistanceUnit): Double {
      return Meter.countOf(other) * 1000
    }
  };

  abstract fun countOf(other: DistanceUnit): Double
}