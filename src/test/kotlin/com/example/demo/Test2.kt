package com.example.demo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest
class Test2 {

  @Autowired
  private lateinit var timeService: TimeService

  @MockBean
  private lateinit var timeProvider: TimeProvider

  @Test
  fun `one simple test`() {
    Assertions.assertTrue(timeService.getTime().startsWith("It is "))
  }
}
