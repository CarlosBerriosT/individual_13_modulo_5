package com.example.individual_13_modulo_5

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelFortalezaContraseña : ViewModel() {

    private val fortalezaContraseña = MutableLiveData<String>()

    fun obtenerFortaleza(): LiveData<String> = fortalezaContraseña

    fun evaluarContraseña(contraseña: String) {
        val modelo = ModeloFortalezaContraseña()
        fortalezaContraseña.value = modelo.evaluarFortaleza(contraseña)
    }
}
