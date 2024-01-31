package com.example.starsetapp.divisions

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.starsetapp.carrusel.Carrusel
import com.example.starsetapp.carrusel.Tipo
import com.example.starsetapp.cuadrotexto.CuadroTexto
import com.example.starsetapp.framealbum.Album
import com.example.starsetapp.framealbum.FrameAlbum
import com.example.starsetapp.pantallabasica.PantallaBasica
import com.example.starsetapp.pantallainicial.ContenedorContenedorCarrusel
import com.example.starsetapp.pantallainicial.ContenedorTextoTitulo
import com.example.starsetapp.pantallainicial.TextoTituloCarrusel
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope

/**
 * pantalla de divisions
 *
 *
 * This composable was generated from the UI Package 'divisions'.
 * Generated code; do not edit directly
 */
@Composable
fun Divisions(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        PantallaBasicaInstance(modifier = Modifier
            .rowWeight(1.0f)
            .columnWeight(1.0f))
        Column(Modifier.fillMaxSize()){
            FrameAlbumInstance(modifier = Modifier)

            InfoAlbum(modifier = Modifier)
            CancionEstrella(modifier = Modifier)
            Row (Modifier.fillMaxWidth().fillMaxHeight(0.4f).padding(24.dp)){
                SpotifyAlbum(modifier = Modifier)
                Compra(modifier = Modifier)
            }
            ContenedorContenedorCarrusel() {
                CarruselInstance()
            }

        }
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
private fun DivisionsPreview() {
    MaterialTheme {
        RelayContainer {
            Divisions(modifier = Modifier
                .rowWeight(1.0f)
                .columnWeight(1.0f))
        }
    }
}

@Composable
fun PantallaBasicaInstance(modifier: Modifier = Modifier) {
    PantallaBasica(modifier = modifier
        .fillMaxWidth(1.0f)
        .fillMaxHeight(1.0f))
}

@Composable
fun FrameAlbumInstance(modifier: Modifier = Modifier) {
    FrameAlbum(
        album = Album.Divisions,
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
fun CarruselInstance(modifier: Modifier = Modifier) {
    Carrusel(
        tipo = Tipo.CancionesDivisions,
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 24.0.dp,
                    top = 416.0.dp,
                    end = 24.0.dp,
                    bottom = 24.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(0.4f)
    )
}

@Composable
fun InfoAlbum(modifier: Modifier = Modifier) {
    CuadroTexto(
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    horizontal = 24.dp, vertical = 12.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(0.3f)
    )
}

@Composable
fun CancionEstrella(modifier: Modifier = Modifier) {
    CuadroTexto(
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    vertical = 12.dp, horizontal = 24.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(0.2f)
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
            .fillMaxHeight(1.0f).fillMaxWidth(0.475f)
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
            .fillMaxHeight(1.0f)
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
