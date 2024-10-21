package com.example.individual_13_modulo_5

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.individual_13_modulo_5.databinding.ActivityPrincipalBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPrincipalBinding
    private val viewModel: ViewModelFortalezaContraseña by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonEvaluar.setOnClickListener {
            val contraseña = binding.inputClave.text.toString() // Asegúrate de que sea correcto
            viewModel.evaluarContraseña(contraseña)
        }

        viewModel.obtenerFortaleza().observe(this, Observer { fortaleza ->
            binding.textoResultado.text = "Fortaleza: $fortaleza"
        })
    }
}
