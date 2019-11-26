package com.example.demo.config

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory
import org.springframework.beans.factory.support.BeanDefinitionBuilder
import org.springframework.beans.factory.support.BeanDefinitionRegistry
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor
import org.springframework.context.annotation.Configuration

@Configuration
class DynamicBeanDefinitionProcessor : BeanDefinitionRegistryPostProcessor {

  override fun postProcessBeanFactory(beanFactory: ConfigurableListableBeanFactory) {
  }

  override fun postProcessBeanDefinitionRegistry(registry: BeanDefinitionRegistry) {

      val beanDefinition =
          BeanDefinitionBuilder.genericBeanDefinition(DynamicBeanFactory::class.java)
              .addConstructorArgValue("Senko")
              .beanDefinition

      registry.registerBeanDefinition("senko-bean", beanDefinition)

  }
}
