package com.kayevo

import Counter
import kotlinx.coroutines.runBlocking

suspend fun main() = runBlocking {
    println("Hello World!")

    requestAPIs(counter, apisQuantity, requestsQuantity)
}

fun requestAPIs(counter: Counter, apisQuantity: Int, requestsQuantity: Int) {

}
