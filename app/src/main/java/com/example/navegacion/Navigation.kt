package com.example.navegacion

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.navegacion.model.Routes

@Composable
fun Screen01RV(navigationController: NavHostController) {
    RecyclerStickyView(navigationController)
}

//-------------------------------------BUENA :D-----------------------------------------------------

@Composable
fun ScreenDetalles(navigationController: NavHostController, parametro: String?) {
    Column (modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Detalles",
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(20.dp)
            )
            Text(text = parametro.toString(), modifier = Modifier  //detalles de objeto comida
                .align(Alignment.CenterHorizontally)
                .padding(20.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Volver a Inicio",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(30.dp)
                .clickable { navigationController.navigate(Routes.Pantalla01.route) })
            Text(text = "Ir a Contacto",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .clickable { navigationController.navigate(Routes.PantallaContacto.route) })
        }
    }
}

//-------------------------------INGREDIENTES------------------------------------------

@Composable
fun ScreenIngredientes(navigationController: NavHostController, parametro: String?) {
    Column (modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Ingredientes",
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(20.dp)
            )
            Text(text = parametro.toString(), modifier = Modifier  //INGREDIENTES de objeto comida
                .align(Alignment.CenterHorizontally)
                .padding(20.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Volver a Inicio",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(30.dp)
                .clickable { navigationController.navigate(Routes.Pantalla01.route) })
            Text(text = "Ir a Contacto",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .clickable { navigationController.navigate(Routes.PantallaContacto.route) })
        }

    }
}

//----------------------PROVEEDOR---------------------------------------------------------
@Composable
fun ScreenProveedor(navigationController: NavHostController, parametro: String?) {
    Column (modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Datos del proveedor:",
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(20.dp)
            )
            Text(text = parametro.toString(), modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(20.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Volver a Inicio",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(30.dp)
                .clickable { navigationController.navigate(Routes.Pantalla01.route) })
            Text(text = "Ir a Contacto",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .clickable { navigationController.navigate(Routes.PantallaContacto.route) })
        }
    }
}

//----------------------REFERENCIA---------------------------------------------------------
@Composable
fun ScreenRef(navigationController: NavHostController, parametro: String?) {
    Column (modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Referencia:",
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(20.dp)
            )
            Text(text = parametro.toString(), modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(20.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Volver a Inicio",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(30.dp)
                .clickable { navigationController.navigate(Routes.Pantalla01.route) })
            Text(text = "Ir a Contacto",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .clickable { navigationController.navigate(Routes.PantallaContacto.route) })
        }
    }
}


//------------------------------------CONTACTO------------------------------------------------
@Composable
fun ScreenContacto(navigationController: NavHostController) {
    Column (modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(id = R.drawable.logo_comida),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth().padding(20.dp),
            contentScale = ContentScale.Fit,
        )
        Text(text = "PRODUCTOS ALIMENTARIOS AYALA S.L.",
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .padding(10.dp)
            .clickable { navigationController.navigate(Routes.Pantalla01.route) })
        Text(text = "Avenida de Francisco Ayala s/n (Granada)", modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .clickable { navigationController.navigate(Routes.Pantalla01.route) })
        Text(text = "Telefono: 958000000", modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .clickable { navigationController.navigate(Routes.Pantalla01.route) })
        Text(text = "Email: productosayala@ayala.com", modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .clickable { navigationController.navigate(Routes.Pantalla01.route) })
        Text(text = "Volver a Inicio",
            fontWeight = FontWeight.Bold,
            modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .padding(30.dp)
            .clickable { navigationController.navigate(Routes.Pantalla01.route) })
    }
}
//
//@Composable
//fun Screen05(navigationController: NavHostController) {
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.Green)
//    ) {
//        Text(text = "Ir a Screen05", modifier = Modifier
//            .align(Alignment.Center)
//            .clickable { navigationController.navigate(Routes.Pantalla01.route) })
//    }
//
//}
//
//@Composable
//fun Screen06(navigationController: NavHostController) {
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.Green)
//    ) {
//        Text(text = "Ir a Screen06", modifier = Modifier
//            .align(Alignment.Center)
//            .clickable { navigationController.navigate(Routes.Pantalla01.route) })
//    }
//
//}


//
//@Composable
//fun Producto(@DrawableRes image: Int, title: String, navigationController: NavHostController, navigationString : String) {
////fun Producto(@DrawableRes image: Int, title: String, navegacion : Unit) {
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(15.dp)
//            .background(Color.White),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Row {
//            Image(
//                painter = painterResource(image),
//                contentDescription = "Producto",
//                modifier = Modifier
//                    .size(50.dp)
//                    .clickable {
//                        navigationController.navigate(navigationString)
//
//                    }
//            )
//        }
//        Text(
//            text = title,
//            fontFamily = FontFamily.Monospace,
//            color = Color.Black,
//        )
//    }
//}