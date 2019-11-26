package com.example.demo

import com.example.demo.config.DynamicBean
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest
class Test1 {

  @Autowired
  private lateinit var timeService: TimeService

  @Autowired
  private lateinit var dynamicBean: DynamicBean

  @Test
  fun `one simple test`() {
    Assertions.assertTrue(timeService.getTime().startsWith("It is "))
    Assertions.assertTrue(dynamicBean.sayHello().contains("Senko"))
  }
}
