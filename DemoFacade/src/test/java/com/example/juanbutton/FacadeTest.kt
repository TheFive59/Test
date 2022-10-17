package com.example.juanbutton

import org.junit.Assert
import org.junit.Test

class FacadeTest {
    @Test
    fun testFacade() {
        val userRepository = UserRepository()
        val user = User("Juan")
        userRepository.save(user)
        val retrieveUser: User = userRepository.findFirst()
        Assert.assertEquals(retrieveUser.login, "Juan")
    }
}