package com.example.demo.config

import com.example.demo.TimeProvider
import org.springframework.beans.factory.FactoryBean

class DynamicBeanFactory(
    private val name: String,
    private val timeProvider: TimeProvider
) : FactoryBean<DynamicBean> {

  override fun getObject(): DynamicBean? {

    return DynamicBean(name, timeProvider)
  }

  override fun getObjectType(): Class<*>? {
    return DynamicBean::class.java
  }
}
