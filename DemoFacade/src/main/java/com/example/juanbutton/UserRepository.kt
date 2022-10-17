package com.example.juanbutton

//FACADE
class UserRepository {
    private val systemPreferences = TestSystemStore("/data/default.prefs")
    fun save(user: User) {
        systemPreferences.store("USER_KEY", user.login)
        systemPreferences.commit()
    }

    fun findFirst(): User = User(systemPreferences.read("USER_KEY"))
}