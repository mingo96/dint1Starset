package com.example.starsetapp.horizons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.starsetapp.carrusel.Tipo
import com.example.starsetapp.framealbum.Album
import com.example.starsetapp.pantallas.CancionEstrella
import com.example.starsetapp.pantallas.CarruselInstance
import com.example.starsetapp.pantallas.Compra
import com.example.starsetapp.pantallas.ContenedorCarruselCancionesBasico
import com.example.starsetapp.pantallas.FrameAlbumInstance
import com.example.starsetapp.pantallas.InfoAlbum
import com.example.starsetapp.pantallas.PantallaBasicaInstance
import com.example.starsetapp.pantallas.SpotifyAlbum
import com.example.starsetapp.pantallas.TopLevel

/**
 * pantalla de horizons
 *
 * This composable was generated from the UI Package 'horizons'.
 * Generated code; do not edit directly
 */
@Composable
fun Horizons(modifier: Modifier = Modifier, navController: NavController) {
    TopLevel(modifier = modifier) {
        PantallaBasicaInstance(modifier = Modifier
            .rowWeight(1.0f)
            .columnWeight(1.0f),navController)
        Column(Modifier.fillMaxSize()){
            FrameAlbumInstance(modifier = Modifier, album = Album.Horizons)

            InfoAlbum(modifier = Modifier, Album.Horizons)
            CancionEstrella(modifier = Modifier, Album.Horizons)
            Row (Modifier.fillMaxWidth().fillMaxHeight(0.25f).padding(horizontal = 24.dp, vertical = 12.dp)){
                SpotifyAlbum(modifier = Modifier)
                Compra(modifier = Modifier)
            }
            ContenedorCarruselCancionesBasico() {
                CarruselInstance(tipo = Tipo.CancionesHorizons)
            }

        }
    }
}