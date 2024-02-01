package com.example.starsetapp.navegacion

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
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
fun Navegacion(modifier: Modifier = Modifier, navController: NavController) {
    TopLevel(modifier = modifier) {
        Fondo()

        Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {
            CuadroNavegacion(
            ) {
                TNavegaciN()
            }
        FrameAlbumTransmissions(navController = navController
        )
        FrameAlbumVessels(navController = navController
        )
        FrameAlbumDivisions(navController = navController
        )
        FrameAlbumHorizons(navController = navController
        )
        InicioInstance(navController = navController
        )
        BotonRegistroInstance(navController = navController
        )
        SalirInstance(navController = navController
        )
        }
    }
}


@Composable
fun Fondo(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.navegacion_fondo),
        contentScale = ContentScale.Crop,
        modifier = modifier
            .requiredWidth(360.0.dp)
            .requiredHeight(792.0.dp)
    )
}

@Composable
fun FrameAlbumTransmissions(modifier: Modifier = Modifier,navController: NavController) {
    FrameAlbum(modifier = modifier
        .fillMaxWidth()
        .padding(16.dp)
        .requiredHeight(48.0.dp)
        .clickable(true) { navController.navigate("Transmissions") })
}

@Composable
fun FrameAlbumVessels(modifier: Modifier = Modifier,navController: NavController) {
    FrameAlbum(
        album = Album.Vessels,
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .requiredHeight(48.0.dp)
            .clickable(true) { navController.navigate("Vessels") }
    )
}

@Composable
fun FrameAlbumDivisions(modifier: Modifier = Modifier,navController: NavController) {
    FrameAlbum(
        album = Album.Divisions,
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .requiredHeight(48.0.dp)
            .clickable(true) { navController.navigate("Divisions") }
    )
}

@Composable
fun FrameAlbumHorizons(modifier: Modifier = Modifier,navController: NavController) {
    FrameAlbum(
        album = Album.Horizons,
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .requiredHeight(48.0.dp)
            .clickable(true) { navController.navigate("Horizons") }
    )
}

@Composable
fun InicioInstance(modifier: Modifier = Modifier,navController: NavController) {
    Inicio(modifier = modifier
        .fillMaxWidth()
        .padding(16.dp)
        .requiredHeight(48.0.dp)
        .clickable(true) { navController.navigate("PantallaInicial") })
}

@Composable
fun BotonRegistroInstance(modifier: Modifier = Modifier,navController: NavController) {
    BotonRegistro(modifier = modifier
        .fillMaxWidth()
        .padding(16.dp)
        .requiredHeight(48.0.dp)){ navController.navigate("Registro") }
}

@Composable
fun TNavegaciN(modifier: Modifier = Modifier) {
    RelayText(
        content = "Navegación",
        fontSize = 45.0.sp,
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
        modifier = modifier
            .requiredWidth(288.0.dp)
            .requiredHeight(80.0.dp)
            .wrapContentHeight(
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
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(96.0.dp).padding(16.dp).wrapContentHeight(Alignment.CenterVertically)
    )
}

@Composable
fun SalirInstance(modifier: Modifier = Modifier, navController: NavController) {
    Salir(modifier = modifier
        .fillMaxWidth()
        .padding(16.dp)
        .requiredHeight(48.0.dp)
    ){
        navController.navigateUp()
    }
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
        modifier = modifier
            .fillMaxWidth(1f)
            .fillMaxHeight(1f)
            .wrapContentWidth(
                Alignment.CenterHorizontally
            )
    )
}
