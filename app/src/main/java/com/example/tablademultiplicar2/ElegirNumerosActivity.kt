package com.example.tablademultiplicar2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablademultiplicar2.databinding.ActivityElegirNumerosBinding

class ElegirNumerosActivity : AppCompatActivity() {
    private lateinit var binding : ActivityElegirNumerosBinding
    var boton0activado = false
    var boton1activado = false
    var boton2activado = false
    var boton3activado = false
    var boton4activado = false
    var boton5activado = false
    var boton6activado = false
    var boton7activado = false
    var boton8activado = false
    var boton9activado = false
    var boton10activado = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityElegirNumerosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton0.setOnClickListener{
            if (boton0activado){
                boton0activado = false
            } else {
                boton0activado = true
            }
            if (boton0activado) {
                binding.boton0.setBackgroundColor(Color.GREEN)
            } else {
                binding.boton0.setBackgroundColor(Color.RED)
            }
        }

        binding.boton1.setOnClickListener{
            if (boton1activado){
                boton1activado = false
            } else {
                boton1activado = true
            }
            if (boton1activado) {
                binding.boton1.setBackgroundColor(Color.GREEN)
            } else {
                binding.boton1.setBackgroundColor(Color.RED)
            }
        }

        binding.boton2.setOnClickListener{
            if (boton2activado){
                boton2activado = false
            } else {
                boton2activado = true
            }
            if (boton2activado) {
                binding.boton2.setBackgroundColor(Color.GREEN)
            } else {
                binding.boton2.setBackgroundColor(Color.RED)
            }
        }

        binding.boton3.setOnClickListener{
            if (boton3activado){
                boton3activado = false
            } else {
                boton3activado = true
            }
            if (boton3activado) {
                binding.boton3.setBackgroundColor(Color.GREEN)
            } else {
                binding.boton3.setBackgroundColor(Color.RED)
            }
        }

        binding.boton4.setOnClickListener{
            if (boton4activado){
                boton4activado = false
            } else {
                boton4activado = true
            }
            if (boton4activado) {
                binding.boton4.setBackgroundColor(Color.GREEN)
            } else {
                binding.boton4.setBackgroundColor(Color.RED)
            }
        }

        binding.boton5.setOnClickListener{
            if (boton5activado){
                boton5activado = false
            } else {
                boton5activado = true
            }
            if (boton5activado) {
                binding.boton5.setBackgroundColor(Color.GREEN)
            } else {
                binding.boton5.setBackgroundColor(Color.RED)
            }
        }

        binding.boton6.setOnClickListener{
            if (boton6activado){
                boton6activado = false
            } else {
                boton6activado = true
            }
            if (boton6activado) {
                binding.boton6.setBackgroundColor(Color.GREEN)
            } else {
                binding.boton6.setBackgroundColor(Color.RED)
            }
        }

        binding.boton7.setOnClickListener{
            if (boton7activado){
                boton7activado = false
            } else {
                boton7activado = true
            }
            if (boton7activado) {
                binding.boton7.setBackgroundColor(Color.GREEN)
            } else {
                binding.boton7.setBackgroundColor(Color.RED)
            }
        }

        binding.boton8.setOnClickListener{
            if (boton8activado){
                boton8activado = false
            } else {
                boton8activado = true
            }
            if (boton8activado) {
                binding.boton8.setBackgroundColor(Color.GREEN)
            } else {
                binding.boton8.setBackgroundColor(Color.RED)
            }
        }

        binding.boton9.setOnClickListener{
            if (boton9activado){
                boton9activado = false
            } else {
                boton9activado = true
            }
            if (boton9activado) {
                binding.boton9.setBackgroundColor(Color.GREEN)
            } else {
                binding.boton9.setBackgroundColor(Color.RED)
            }
        }

        binding.boton10.setOnClickListener{
            if (boton10activado){
                boton10activado = false
            } else {
                boton10activado = true
            }
            if (boton10activado) {
                binding.boton10.setBackgroundColor(Color.GREEN)
            } else {
                binding.boton10.setBackgroundColor(Color.RED)
            }
        }


    }
}