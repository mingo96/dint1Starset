package com.example.starsetapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.starsetapp.divisions.Divisions
import com.example.starsetapp.horizons.Horizons
import com.example.starsetapp.navegacion.Navegacion
import com.example.starsetapp.pantallainicial.PantallaInicial
import com.example.starsetapp.registro.Registro
import com.example.starsetapp.transmissions.Transmissions
import com.example.starsetapp.ui.theme.StarsetAppTheme
import com.example.starsetapp.vessels.Vessels

class MainActivity : ComponentActivity() {

    lateinit var navController:NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            navController = rememberNavController()
            StarsetAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavHost(navController = navController as NavHostController, startDestination = "PantallaInicial"){
                        composable("PantallaInicial"){
                            PantallaInicial(modifier = Modifier,navController)
                        }
                        composable("Vessels"){
                            Vessels(modifier = Modifier,navController)
                        }
                        composable("Horizons"){
                            Horizons(modifier = Modifier,navController)
                        }
                        composable("Divisions"){
                            Divisions(modifier = Modifier,navController)
                        }
                        composable("Transmissions"){
                            Transmissions(modifier = Modifier,navController)
                        }
                        composable("Registro"){
                            Registro(modifier = Modifier,navController)
                        }

                        composable("Navegacion"){
                            Navegacion(modifier = Modifier,navController)
                        }

                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StarsetAppTheme {
        Greeting("Android")
    }
}