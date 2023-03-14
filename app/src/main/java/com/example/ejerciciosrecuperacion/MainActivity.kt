package com.example.ejerciciosrecuperacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var libro:Libro=Libro()
        var agregarLibro : EditText = findViewById(R.id.tituloNuevo)
        var numeroPaginas : EditText = findViewById(R.id.numeroPaginas)
        var siguienteButton : Button = findViewById(R.id.button)
        var estanteria:Estanteria = Estanteria()

       


        siguienteButton.setOnClickListener {

                    libro.nombre = agregarLibro.text.toString()
                    libro.paginas = numeroPaginas.text.toString().toInt()
                    estanteria.libros.add(libro)

                    val intent = Intent(this, MainActivity2::class.java)



                    intent.putExtra("estanteria", estanteria)
                    startActivity(intent)

        }

    }
}