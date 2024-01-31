package com.example.starsetapp.divisions

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
        PantallaBasicaInstance(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        FrameAlbumInstance(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        CarruselInstance(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        InfoAlbum(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        CancionEstrella(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        SpotifyAlbum(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Compra(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
private fun DivisionsPreview() {
    MaterialTheme {
        RelayContainer {
            Divisions(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun PantallaBasicaInstance(modifier: Modifier = Modifier) {
    PantallaBasica(modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f))
}

@Composable
fun FrameAlbumInstance(modifier: Modifier = Modifier) {
    FrameAlbum(
        album = Album.Divisions,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 88.0.dp,
                top = 12.9293212890625.dp,
                end = 104.0.dp,
                bottom = 575.3535079956055.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CarruselInstance(modifier: Modifier = Modifier) {
    Carrusel(
        tipo = Tipo.CancionesDivisions,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 24.0.dp,
                top = 416.0.dp,
                end = 24.0.dp,
                bottom = 24.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun InfoAlbum(modifier: Modifier = Modifier) {
    CuadroTexto(
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 24.0.dp,
                top = 97.0.dp,
                end = 24.0.dp,
                bottom = 407.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CancionEstrella(modifier: Modifier = Modifier) {
    CuadroTexto(
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 24.0.dp,
                top = 248.0.dp,
                end = 24.0.dp,
                bottom = 323.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun SpotifyAlbum(modifier: Modifier = Modifier) {
    CuadroTexto(
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 24.0.dp,
                top = 336.16162109375.dp,
                end = 184.0.dp,
                bottom = 245.65655899047852.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Compra(modifier: Modifier = Modifier) {
    CuadroTexto(
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 192.0.dp,
                top = 336.16162109375.dp,
                end = 24.0.dp,
                bottom = 245.65655899047852.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
