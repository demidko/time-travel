package com.github.demidko.timetravel.util

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isLessThan
import assertk.assertions.isLessThanOrEqualTo
import com.github.demidko.timetravel.util.DistanceUnit.*
import org.junit.jupiter.api.Test

internal class DistanceUnitTest {

  @Test
  fun distanceUnitTest() {
    assertThat(Millimeter.countOf(Kilometer)).isLessThanOrEqualTo(0.00001)
    assertThat(Millimeter.countOf(Centimeter)).isEqualTo(0.1)
    assertThat(Millimeter.countOf(Meter)).isEqualTo(0.001)
    assertThat(Millimeter.countOf(Kilometer)).isEqualTo(0.000001)
    assertThat(Centimeter.countOf(Kilometer)).isLessThanOrEqualTo(0.0001)
    assertThat(Meter.countOf(Kilometer)).isEqualTo(0.001)
    assertThat(Centimeter.countOf(Millimeter)).isEqualTo(10.0)
    assertThat(Meter.countOf(Millimeter)).isEqualTo(1000.0)
  }
}