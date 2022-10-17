package com.example.juanbutton

import org.junit.Assert
import org.junit.Test

class TestSystemStore(private val filePath:String) {
    private val cache: HashMap<String,String>

    init {
        println("Leyendo datos del archivo $filePath")
        cache= HashMap()
        //Leer propiedades del archivo y almacenar en chache
    }
    fun store(key:String, value:String){
        cache[key]=value
    }
    fun read(key: String)=cache[key]?: ""
    fun commit()=println("Guardando información en cache $filePath")
}
