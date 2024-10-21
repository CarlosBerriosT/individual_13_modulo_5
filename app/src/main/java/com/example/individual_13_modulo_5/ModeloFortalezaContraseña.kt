package com.example.individual_13_modulo_5


class ModeloFortalezaContraseña {

    fun evaluarFortaleza(contraseña: String): String {
        return when {
            contraseña.length < 5 -> "Débil"
            contraseña.length >= 5 && !contraseña.any { it.isUpperCase() } -> "Media"
            contraseña.length >= 5 && contraseña.any { it.isUpperCase() } -> "Fuerte"
            else -> "Inválida"
        }
    }
}
