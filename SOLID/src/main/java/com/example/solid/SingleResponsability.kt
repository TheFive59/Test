package com.example.solid

// Se viola el principio de responsabilidad porque se realizan acciones de storage
// ademas de las propias

class BadUser {
    fun login() {}
    fun storeAuthToken() {
        // Logic for storing auth token
    }
    fun clearAuthToken() {
        // Logic for clearing auth token
    }
}

// Ya no se realizan funciones de almacenamiento en la clase usuario
interface AuthTokenStorage {
    fun store(token: String)
    fun clear()
}

class User(private val authStorage: AuthTokenStorage) {
    fun login() {}
    fun storeAuthToken(token: String) {
        authStorage.store(token)
    }
    fun clearAuthToken() {
        authStorage.clear()
    }
}