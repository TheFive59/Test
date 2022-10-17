package com.example.test

import Message
import io.mockk.every
import io.mockk.just
import io.mockk.mockk
import io.mockk.runs
import io.mockk.slot
import io.mockk.spyk
import io.mockk.verify
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import presentation.Calculator
import presentation.Logger
import presentation.Tracker

class CalculatorTest {

    private val tracker: Tracker = spyk()
    private val logger: Logger = mockk(relaxed = true)
    private val calculator = Calculator(
        tracker,
        logger
    )

    @Before
    fun setup() {
        every { tracker.sendMessage(any()) } just runs
    }

    @Test
    //Se llama si o si
    fun `Square calculates the proper result`() {
        val result = calculator.square(2)

        assertTrue(4 == result)
    }

    @Test
    fun `WHEN square is called THEN logger is called`() {
        calculator.square(513)
        //Check called to logger
        verify(exactly = 1) { logger.log(any()) }
    }

    @Test
    fun `WHEN square is called THEN tracker sends as message`() {
        calculator.square(123)
        verify(exactly = 1) { tracker.sendMessage(any()) }
    }

    @Test
    fun `When square is called THEN tracker sends the right message`() {
        //realmente se manda lo que queremos
        val number = 13
        calculator.square(number)
        val slot = slot<Message>()
        //catch mensaje
        verify(atLeast = 1, atMost = 1) { tracker.sendMessage(capture(slot)) }
        val captured: Message = slot.captured
        assertTrue(captured.text == "Calculando el cuadrado de $number...")
        assertTrue(captured.code == Code.CODE1)
    }

}