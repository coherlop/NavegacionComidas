package com.example.navegacion

import com.example.navegacion.model.comida

fun getComidas(): List<comida> {
    return listOf(
        comida("Refresco", "Bebida", "AGUA CARBONATADA, AZUCARES, " +
                "CONCENTRADO FANTA NARANJA, SABORIZANTE NATURAL A NARANJA, " +
                "BENZOATO DE SODIO AMARILLO 6, MEZCLA DE SUCRALOSA Y ACESULFAME POTASICO, " +
                "AMARILLO 5, ROJ0 40",
            "Fabricado por Fanta. Formato Botella o lata. Máximo 400 unidades.",
            "Referencia F03490/00384570", "Refresca2, Calle Navarra 9 (Málaga). Telf 9001223456",
            R.drawable.refrescos),


        comida("Zumo", "Bebida","Agua, jugo y pulpa de mango concentrado (25%), " +
                "azúcares y concentrado del Valle sabor mango",
            "Fabricado por Zumisol. Disponible en otros sabores. Máximo 400 unidades.",
            "Referencia Z4985/94570", "Zumos Andalucía, Calle Norte 60 (Granada). Telf 956464456",
            R.drawable.zumo),

        comida("Hamburguesa", "Primeros platos",
            "Carne 100% vacuno, queso cheddar, cebolla y tomate.",
            "Fabricado a mano en nuestra cocina por cocineros expertos.",
            "Referencia H77252910/00", "Catering La Habana, Calle Sur 70 (Granada). Telf 954757476",
            R.drawable.hamburguesa),

        comida("Bocadillo", "Primeros platos",
            "Lomo de cerdo, lechuga, queso y pan cristal.",
            "Fabricado por Industrias Cárnicas Pepín con carne nacional.",
            "Referencia B0009/826150089", "Bocatitas S.L., Calle Fosfis 50 (Granada). Telf 9564564556",
            R.drawable.bocadillo),

        comida("Pizza","Primeros platos",
            "Base de trigo, tomate, mozarella, jamón york.",
            "Fabricado por Casa Tarradellas. Disponible en tamaño microondas y formato congelado",
            "Referencia P44879/75570", "Tarradellas S.L., Calle Ganivet 55 (Tarragona). Telf 9564564556",
            R.drawable.pizza),

        comida("Helado", "Postres",
            "Leche, azúcar, fresas (40%), canela.",
            "Fabricado por Heladines S.L.. Disponible en sabor fresa, chocolate y nata.",
            "Referencia HE0349/0003/84570", "Heladines S.L., Calle Guay 45 (Granada). Telf 9567574556",
            R.drawable.helado),

        comida("Galletas", "Postres",
            "Trigo, azúcar, leche, chocolate 80%",
            "Fabricadas por Dulcesol. Disponibles en cajas, paquetes o individuales (formato cafetería).",
            "Referencia G5500/384570", "Dulcesol, Calle Sevilla 95 (Sevilla). Telf 956400486",
            R.drawable.galletas)

    )
}