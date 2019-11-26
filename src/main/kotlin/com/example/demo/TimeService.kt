package com.example.demo

import org.springframework.stereotype.Service

@Service
class TimeService(val timeProvider: TimeProvider) {

  fun getTime() : String {
    return "It is ${timeProvider.getNow()}"
  }
}
