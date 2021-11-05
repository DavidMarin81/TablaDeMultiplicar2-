package com.example.tablademultiplicar2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablademultiplicar2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    var contador = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton0Main.setOnClickListener{
            startActivity((Intent(this, MostrarTablasActivity :: class.java).putExtra("cuenta", contador.toString())))
        }

        binding.boton1Main.setOnClickListener{
            contador = 1
            startActivity((Intent(this, MostrarTablasActivity :: class.java).putExtra("cuenta", contador.toString())))
        }

        binding.boton2Main.setOnClickListener{
            contador = 2
            startActivity((Intent(this, MostrarTablasActivity :: class.java).putExtra("cuenta", contador.toString())))
        }

        binding.boton3Main.setOnClickListener{
            contador = 3
            startActivity((Intent(this, MostrarTablasActivity :: class.java).putExtra("cuenta", contador.toString())))
        }

        binding.boton4Main.setOnClickListener{
            contador = 4
            startActivity((Intent(this, MostrarTablasActivity :: class.java).putExtra("cuenta", contador.toString())))
        }

        binding.boton5Main.setOnClickListener{
            contador = 5
            startActivity((Intent(this, MostrarTablasActivity :: class.java).putExtra("cuenta", contador.toString())))
        }

        binding.boton6Main.setOnClickListener{
            contador = 6
            startActivity((Intent(this, MostrarTablasActivity :: class.java).putExtra("cuenta", contador.toString())))
        }

        binding.boton7Main.setOnClickListener{
            contador = 7
            startActivity((Intent(this, MostrarTablasActivity :: class.java).putExtra("cuenta", contador.toString())))
        }

        binding.boton8Main.setOnClickListener{
            contador = 8
            startActivity((Intent(this, MostrarTablasActivity :: class.java).putExtra("cuenta", contador.toString())))
        }

        binding.boton9Main.setOnClickListener{
            contador = 9
            startActivity((Intent(this, MostrarTablasActivity :: class.java).putExtra("cuenta", contador.toString())))
        }

        binding.boton10Main.setOnClickListener{
            contador = 10
            startActivity((Intent(this, MostrarTablasActivity :: class.java).putExtra("cuenta", contador.toString())))
        }


        binding.botonJuegoMain.setOnClickListener{
            startActivity(Intent(this, ElegirNumerosActivity::class.java))
        }
    }
}