package com.example.navegacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navegacion.model.Routes
import com.example.navegacion.ui.theme.NavegacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavegacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navigationController = rememberNavController()
                    NavHost(
                        navController = navigationController,
                        startDestination = Routes.Pantalla01.route
                    ) {
                        composable(Routes.Pantalla01.route) { Screen01RV(navigationController) }
                        composable(Routes.PantallaContacto.route) { ScreenContacto(navigationController) }
//                        composable(Routes.Pantalla05.route) { Screen05(navigationController) }
//                        composable(Routes.Pantalla06.route) { Screen06(navigationController) }

                        //---------------------DETALLES BUENA :D---------------------
                        composable(Routes.PantallaDetalles.route,
                            arguments = listOf(navArgument("parametro") {
                                defaultValue = "Default"
                            })
                        )
                        { backStackEntry ->
                            ScreenDetalles(
                                navigationController = navigationController,
                                parametro  = backStackEntry.arguments?.getString("parametro")
                            )

                        }
                        //------------------------INGREDIENTES---------------------
                        composable(Routes.PantallaIngredientes.route,
                            arguments = listOf(navArgument("parametro") {
                                defaultValue = "Default"
                            })
                        )
                        { backStackEntry ->
                            ScreenIngredientes(
                                navigationController = navigationController,
                                parametro  = backStackEntry.arguments?.getString("parametro")
                            )

                        }
                        //--------------------------PROVEEDOR------------------------------
                        composable(Routes.PantallaProveedor.route,
                            arguments = listOf(navArgument("parametro") {
                                defaultValue = "Default"
                            })
                        )
                        { backStackEntry ->
                            ScreenProveedor(
                                navigationController = navigationController,
                                parametro  = backStackEntry.arguments?.getString("parametro")
                            )

                        }

                        //--------------------------REFERENCIA (no funciona)------------------------------
                        composable(Routes.PantallaRef.route,
                            arguments = listOf(navArgument("parametro") {
                                defaultValue = "Default"
                            })
                        )
                        { backStackEntry ->
                            ScreenRef(
                                navigationController = navigationController,
                                parametro  = backStackEntry.arguments?.getString("parametro")
                            )

                        }

                    }
                }
            }
        }
    }
}

