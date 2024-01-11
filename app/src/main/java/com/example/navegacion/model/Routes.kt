package com.example.navegacion.model

sealed class Routes(val route: String) {  //sealed agrupa clases u objetos
    object Pantalla01 : Routes("pantalla1")

    object PantallaDetalles : Routes("pantalla2/{parametro}") {
        fun createRoute(parametro: String) = "pantalla2/$parametro"
    }

    object PantallaIngredientes : Routes("pantalla3/{parametro}") {
        fun createRoute(parametro: String) = "pantalla3/$parametro"
    }

    object PantallaProveedor : Routes("pantalla4/{parametro}") {
        fun createRoute(parametro: String) = "pantalla4/$parametro"
    }

    object PantallaRef : Routes("pantalla5/{parametro}") {
        fun createRoute(parametro: String) = "pantalla5/$parametro"
    }

    object PantallaContacto : Routes("pantalla08")


    //--------------------------------------------------------------------------------------

//    object Pantalla03 : Routes("pantalla3")
//    object Pantalla05 : Routes("pantalla5")
//    object Pantalla06 : Routes("pantalla6")
//
//
//    object Pantalla055 : Routes("pantalla5?parametroOpcional={parametroOpcional}") {
//        fun createRoute(parametroOpcional: Int) = "pantalla5?parametroOpcional=$parametroOpcional"
//    }

}