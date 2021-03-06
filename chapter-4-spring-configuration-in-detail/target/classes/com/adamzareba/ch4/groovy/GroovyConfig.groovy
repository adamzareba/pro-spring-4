package com.adamzareba.ch4.groovy

import org.springframework.context.support.GenericApplicationContext
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader

def ctx = new GenericApplicationContext()
def reader = new GroovyBeanDefinitionReader(ctx)

reader.beans { contact(Contact, firstName: 'Chris', lastName: 'Schaefer', age: 32) }

ctx.refresh()

println ctx.getBean("contact")
