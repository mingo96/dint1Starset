package com.example.starsetapp.navegacion

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.starsetapp.R
import com.example.starsetapp.botonregistro.BotonRegistro
import com.example.starsetapp.framealbum.Album
import com.example.starsetapp.framealbum.FrameAlbum
import com.example.starsetapp.inicio.Inicio
import com.example.starsetapp.salir.Salir
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText

/**
 * display de navegacion
 *
 * This composable was generated from the UI Package 'navegacion'.
 * Generated code; do not edit directly
 */
@Composable
fun Navegacion(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Fondo()
        FrameAlbumTransmissions(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 8.0.dp,
                    y = 128.0.dp
                )
            )
        )
        FrameAlbumVessels(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 8.0.dp,
                    y = 192.0.dp
                )
            )
        )
        FrameAlbumDivisions(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 8.0.dp,
                    y = 256.0.dp
                )
            )
        )
        FrameAlbumHorizons(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 8.0.dp,
                    y = 320.0.dp
                )
            )
        )
        InicioInstance(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 8.0.dp,
                    y = 384.0.dp
                )
            )
        )
        BotonRegistroInstance(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 8.0.dp,
                    y = 448.0.dp
                )
            )
        )
        CuadroNavegacion(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 8.0.dp,
                    y = 16.0.dp
                )
            )
        ) {
            TNavegaciN(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 8.0.dp,
                        y = 8.0.dp
                    )
                )
            )
        }
        SalirInstance(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 8.0.dp,
                    y = 512.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 328, heightDp = 568)
@Composable
private fun NavegacionPreview() {
    MaterialTheme {
        RelayContainer {
            Navegacion(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Fondo(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.navegacion_fondo),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(360.0.dp).requiredHeight(792.0.dp)
    )
}

@Composable
fun FrameAlbumTransmissions(modifier: Modifier = Modifier) {
    FrameAlbum(modifier = modifier.requiredWidth(304.0.dp).requiredHeight(48.0.dp))
}

@Composable
fun FrameAlbumVessels(modifier: Modifier = Modifier) {
    FrameAlbum(
        album = Album.Vessels,
        modifier = modifier.requiredWidth(304.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun FrameAlbumDivisions(modifier: Modifier = Modifier) {
    FrameAlbum(
        album = Album.Divisions,
        modifier = modifier.requiredWidth(304.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun FrameAlbumHorizons(modifier: Modifier = Modifier) {
    FrameAlbum(
        album = Album.Horizons,
        modifier = modifier.requiredWidth(304.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun InicioInstance(modifier: Modifier = Modifier) {
    Inicio(modifier = modifier.requiredWidth(304.0.dp).requiredHeight(48.0.dp))
}

@Composable
fun BotonRegistroInstance(modifier: Modifier = Modifier) {
    BotonRegistro(modifier = modifier.requiredWidth(304.0.dp).requiredHeight(48.0.dp))
}

@Composable
fun TNavegaciN(modifier: Modifier = Modifier) {
    RelayText(
        content = "Navegación",
        fontSize = 40.0.sp,
        fontFamily = iBMPlexMono,
        color = Color(
            alpha = 255,
            red = 72,
            green = 145,
            blue = 255
        ),
        height = 1.1761647796630859.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(288.0.dp).requiredHeight(80.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun CuadroNavegacion(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 76,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        radius = 9.0,
        strokeWidth = 8.0,
        strokeColor = Color(
            alpha = 127,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(304.0.dp).requiredHeight(96.0.dp)
    )
}

@Composable
fun SalirInstance(modifier: Modifier = Modifier) {
    Salir(modifier = modifier.requiredWidth(304.0.dp).requiredHeight(32.0.dp))
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        strokeWidth = 8.0,
        strokeColor = Color(
            alpha = 140,
            red = 255,
            green = 255,
            blue = 255
        ),
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
