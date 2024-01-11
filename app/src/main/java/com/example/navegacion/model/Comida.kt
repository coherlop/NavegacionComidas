package com.example.navegacion.model

import androidx.annotation.DrawableRes

data class comida(
    var name: String,
    var menu: String,
    var ingredientes: String,
    var detalles: String,
    var referencia: String,
    var proveedor: String,
    @DrawableRes var photo: Int
)