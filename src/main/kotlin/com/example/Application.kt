package com.example

import com.google.common.collect.Lists
import io.ktor.server.application.Application

fun main(args: Array<String>) {
    println("Hello world!")
    println(Lists.newArrayList("Hello", "world!").joinToString(" "))
}