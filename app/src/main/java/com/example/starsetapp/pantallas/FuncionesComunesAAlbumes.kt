package com.example.starsetapp.pantallas

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.starsetapp.carrusel.Carrusel
import com.example.starsetapp.carrusel.Tipo
import com.example.starsetapp.cuadrotexto.CuadroTexto
import com.example.starsetapp.framealbum.Album
import com.example.starsetapp.framealbum.FrameAlbum
import com.example.starsetapp.pantallabasica.PantallaBasica
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope

class mapaTextos{
    companion object{
        val TextosDescripcion = mapOf(Album.Horizons to "Fecha de lanzamiento\n" +
                "22 de octubre de 2021\n" +
                "\n" +
                "Numero de canciones\n" +
                "16",
            Album.Vessels to "Fecha de lanzamiento\n" +
                    "20 de enero de 2017\n" +
                    "\n" +
                    "Numero de canciones\n" +
                    "15",
            Album.Divisions to "Fecha de lanzamiento\n" +
                    "13 de septiembre de 2019 \n" +
                    "\n" +
                    "Numero de canciones\n" +
                    "13",
            Album.Transmissions to "Fecha de lanzamiento\n" +
                    "8 de julio 2014\n" +
                    "\n" +
                    "Numero de canciones\n" +
                    "13")

        val textoCompra = "Cómpralo"

        val textoSpotify = "Escuchar en Sporify"

        val textoCancionEstrella = mapOf(Album.Horizons to "Canción estrella\n" +
                "Infected",
            Album.Vessels to "Canción estrella\n" +
                    "Monster",
            Album.Divisions to "Canción estrella\n" +
                    "Trials",
            Album.Transmissions to "Canción estrella\n" +
                    "My Demons")
    }
}

@Composable
fun ContenedorCarruselCancionesBasico(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 71,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = true,
        radius = 9.0,
        content = content,
        modifier = modifier
            .padding(paddingValues = PaddingValues(vertical = 12.dp, horizontal = 24.dp))
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}


@Composable
fun PantallaBasicaInstance(modifier: Modifier = Modifier,navController: NavController) {
    PantallaBasica(modifier = modifier
        .fillMaxWidth(1.0f)
        .fillMaxHeight(1.0f), navController = navController)
}


@Composable
fun CarruselInstance(modifier: Modifier = Modifier, tipo: Tipo) {
    Carrusel(
        tipo = tipo,
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 24.0.dp,
                    end = 24.0.dp,
                    bottom = 24.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}


@Composable
fun FrameAlbumInstance(modifier: Modifier = Modifier, album : Album) {
    FrameAlbum(
        album = album,
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 88.0.dp,
                    top = 12.dp,
                    end = 104.0.dp,
                    bottom = 24.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(0.125f)
    )
}



@Composable
fun InfoAlbum(modifier: Modifier = Modifier, album:Album) {
    CuadroTexto(
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    horizontal = 24.dp, vertical = 12.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(0.3f),
        contenido = mapaTextos.TextosDescripcion.get(album)!!
    )
}

@Composable
fun CancionEstrella(modifier: Modifier = Modifier,album : Album) {
    CuadroTexto(
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    vertical = 12.dp, horizontal = 24.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(0.15f),
        contenido = mapaTextos.textoCancionEstrella.get(album)!!
    )
}

@Composable
fun SpotifyAlbum(modifier: Modifier = Modifier) {
    CuadroTexto(
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    end = 12.dp
                )
            )
            .fillMaxHeight(1.0f).fillMaxWidth(0.475f),
        mapaTextos.textoSpotify
    )
}

@Composable
fun Compra(modifier: Modifier = Modifier) {
    CuadroTexto(
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 12.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f),
        mapaTextos.textoCompra
    )
}


@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        content = content,
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}