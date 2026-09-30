package com.example.proyectoovalle

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnJuego1 = findViewById<Button>(R.id.btnJuego1)
        val btnJuego2 = findViewById<Button>(R.id.btnJuego2)
        val btnJuego3 = findViewById<Button>(R.id.btnJuego3)

        btnJuego1.setOnClickListener {
            Toast.makeText(this, "Seleccionaste Películas de Acción", Toast.LENGTH_SHORT).show()
        }

        btnJuego2.setOnClickListener {
            Toast.makeText(this, "Seleccionaste Películas de Terror", Toast.LENGTH_SHORT).show()
        }

        btnJuego3.setOnClickListener {
            Toast.makeText(this, "Seleccionaste Películas de Comedia", Toast.LENGTH_SHORT).show()
        }
    }
}
