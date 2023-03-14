package com.example.ejerciciosrecuperacion

class Estanteria:java.io.Serializable{
    var libro :Libro = Libro()
    var libros = mutableListOf<Libro>(Libro())
}