package com.example.ejerciciosrecuperacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var estanteriaIntent = intent.getSerializableExtra("estanteria") as Estanteria
        var libro = estanteriaIntent.libros.last()
        var nombreAutor :EditText = findViewById(R.id.nombreautor)
        var añoPublicacion :EditText = findViewById(R.id.year)
        var siguienteButton : Button = findViewById(R.id.button2)
        var estanteria :Estanteria = Estanteria()

        siguienteButton.setOnClickListener {

            libro.autor = nombreAutor.text.toString()
            libro.year = añoPublicacion.text.toString().toInt()



            estanteria.libros.add(libro)

            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("estanteria", estanteria)
            startActivity(intent)



        }

    }
}