package com.example.solid



data class Book(val name: String)

class BookRepository(val apiKey: String) {
    fun getBooks(): List<Book> {
        val books = ArrayList<Book>()
        books.add(Book("Harry Potter"))
        return books
    }
}
////No se deberia crear la dependencia dentro de Library
class BadLibrary {
    fun list() = BookRepository(BOOK_API_KEY).getBooks()
    companion object {
        const val BOOK_API_KEY = "abc123"
    }
}

// Al hacer cambios en el repositorio ya no se ve afectada Library

class Library(private val repository: BookRepository) {
    fun list() = repository.getBooks()
}
