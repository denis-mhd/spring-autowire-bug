package com.example.demo.config

import com.example.demo.TimeProvider

class DynamicBean(
    val name: String,
    val timeProvider: TimeProvider) {

  fun sayHello() : String {
    return "I am ${name}. The time is ${timeProvider.getNow()}."
  }
}
