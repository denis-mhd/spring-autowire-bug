package com.example.demo

import org.springframework.stereotype.Component
import java.time.LocalTime

@Component
class TimeProvider {

  fun getNow() : LocalTime {
    return LocalTime.now()
  }
}
