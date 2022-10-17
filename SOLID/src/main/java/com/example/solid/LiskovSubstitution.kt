package com.example.solid

// Se devuelve VehiclesList pudiendo ser Carro o Camper
// Serán accesibles de la interfaz

fun main() {
    val vehicles: List<Vehicle> = VehicleRepository().getAll()
    for (vehicle in vehicles) {
        println(vehicle.registration)
    }
}

open class Vehicle(val registration: String)

data class Car(val reg: String) : Vehicle(reg)

data class Campervan(val reg: String, val numberOfBeds: Int) : Vehicle(reg)

class VehicleRepository {
    fun getAll(): List<Vehicle> {
        val vehicles: MutableList<Vehicle> = ArrayList()
        vehicles.add(Car(reg = "JM135 56"))
        vehicles.add(Campervan(reg = "CA66 MPR", numberOfBeds = 2))
        return vehicles
    }
}