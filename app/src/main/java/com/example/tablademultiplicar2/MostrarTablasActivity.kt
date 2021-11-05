package com.example.tablademultiplicar2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablademultiplicar2.databinding.ActivityMostrarTablasBinding

class MostrarTablasActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMostrarTablasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMostrarTablasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numero = Integer.parseInt(intent.getStringExtra("cuenta"))

        binding.linea0.setText("" + numero + " X 0 = " + multiplicacion(numero, 0).toString())
        binding.linea1.setText("" + numero + " X 1 = " + multiplicacion(numero, 1).toString())
        binding.linea2.setText("" + numero + " X 2 = " + multiplicacion(numero, 2).toString())
        binding.linea3.setText("" + numero + " X 3 = " + multiplicacion(numero, 3).toString())
        binding.linea4.setText("" + numero + " X 4 = " + multiplicacion(numero, 4).toString())
        binding.linea5.setText("" + numero + " X 5 = " + multiplicacion(numero, 5).toString())
        binding.linea6.setText("" + numero + " X 6 = " + multiplicacion(numero, 6).toString())
        binding.linea7.setText("" + numero + " X 7 = " + multiplicacion(numero, 7).toString())
        binding.linea8.setText("" + numero + " X 8 = " + multiplicacion(numero, 8).toString())
        binding.linea9.setText("" + numero + " X 9 = " + multiplicacion(numero, 9).toString())
        binding.linea10.setText("" + numero + " X 10 = " + multiplicacion(numero, 10).toString())

    }

    fun multiplicacion(numero:Int, numeroAMultiplicar:Int): Int {
        var resultado = numero * numeroAMultiplicar
        return resultado
    }
}