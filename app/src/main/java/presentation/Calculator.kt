package presentation

import Message

class Calculator(
    private val tracker: Tracker,
    private val logger: Logger
) {
    //debe llamarse si o si
    fun square(number: Int): Int {
        tracker.sendMessage(
            Message(
                text = "Calculando el cuadrado de $number...",
                code = Code.CODE1
            )
        )
        val result = number * number
        //Posteriormente llama a logger
        logger.log("The square of $number is $result")
        return result
    }
}