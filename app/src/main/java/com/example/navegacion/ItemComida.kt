package com.example.navegacion

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.navegacion.model.Routes
import com.example.navegacion.model.comida
import java.time.format.TextStyle


@Composable
fun ItemComida(
    comida: comida,
    navigationController: NavHostController
) {
    Card(
        border = BorderStroke(5.dp, Color.Black),
        modifier = Modifier
            .fillMaxWidth()
            //.clickable { onItemSelected(comida) }
            .padding(10.dp)) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier
                    //.fillMaxWidth()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = comida.photo),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Fit,
                )
                Row {
                    Text(
                        text = comida.name,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier
                            .padding(10.dp),

                    )

                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "Detalles", modifier = Modifier
                    .clickable { navigationController.navigate(Routes.PantallaDetalles.createRoute(comida.detalles)) }
            )
            Text(
                text = "Ingredientes", modifier = Modifier
                    .clickable { navigationController.navigate(Routes.PantallaIngredientes.createRoute(comida.ingredientes)) }
            )
            Text(
                text = "Proveedor", modifier = Modifier
                    .clickable { navigationController.navigate(Routes.PantallaProveedor.createRoute(comida.proveedor)) }
            )

        }
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(10.dp),
//            horizontalArrangement = Arrangement.SpaceAround
//        ) {
//            Text(
//                text = "Referencia", modifier = Modifier
//                    .clickable { navigationController.navigate(Routes.PantallaRef.createRoute(comida.referencia)) }
//            )
//            Text(
//                text = "Proveedor", modifier = Modifier
//                    .clickable { navigationController.navigate(Routes.PantallaProveedor.createRoute(comida.proveedor)) }
//            )
//        }
    }
}


