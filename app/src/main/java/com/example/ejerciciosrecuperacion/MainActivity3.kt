package com.example.ejerciciosrecuperacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var estanteria = intent.getSerializableExtra("estanteria") as Estanteria
        var otro : Button = findViewById(R.id.otro)

        var libros :TextView = findViewById(R.id.libros)
        var estanteriaTexto : String = ""
        for( i in 0..estanteria.libros.size-1){
            estanteriaTexto= estanteriaTexto.plus(" Libro "+i+": "+estanteria.libros[i].nombre)
            estanteriaTexto= estanteriaTexto.plus(" "+estanteria.libros[i].paginas)
            estanteriaTexto= estanteriaTexto.plus(" "+estanteria.libros[i].autor)
            estanteriaTexto= estanteriaTexto.plus(" "+estanteria.libros[i].year )
        }
        libros.text = estanteriaTexto


        otro.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            /* Explicacion de porque está comentada
                intent.putExtra("estanteria", estanteria)
            */

            startActivity(intent)

        }
    }
}