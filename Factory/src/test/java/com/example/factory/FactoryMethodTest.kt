package com.example.factory

import org.junit.Assert
import org.junit.Test

class FactoryMethodTest {
    @Test
    fun currencyTest() {
        val hollandCurrency: String = CurrencyFactory.currencyForCountry(Holanda("")).code
        println("Divisa Holanda:$hollandCurrency")
        val usaCurrency=CurrencyFactory.currencyForCountry(USA("")).code
        println("Divisa USA:$usaCurrency")
        Assert.assertEquals(hollandCurrency, "EUR")
        Assert.assertEquals(usaCurrency, "USD")
    }
}