package com.example.starsetapp.pantallabasica

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.starsetapp.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.tappable

/**
 * Pantalla basica
 *
 * This composable was generated from the UI Package 'pantalla_basica'.
 * Generated code; do not edit directly
 *
 * @param onIconoMenuPressed abrir menu
 */
@Composable
fun PantallaBasica(
    modifier: Modifier = Modifier,
    onIconoMenuPressed: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Fondo(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        CuadroSuperior(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            ImagenLogo(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Image5(
                onIconoMenuPressed = onIconoMenuPressed,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
private fun PantallaBasicaPreview() {
    MaterialTheme {
        RelayContainer {
            PantallaBasica(
                onIconoMenuPressed = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Fondo(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.pantalla_basica_fondo),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ImagenLogo(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.pantalla_basica_imagen_logo),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 288.0.dp,
                bottom = 6.1538543701171875.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image5(
    onIconoMenuPressed: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.pantalla_basica_image_5),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 272.0.dp,
                top = 12.30767822265625.dp,
                end = 16.0.dp,
                bottom = 18.461551666259766.dp
            )
        ).tappable(onTap = onIconoMenuPressed).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CuadroSuperior(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 25,
            red = 254,
            green = 254,
            blue = 254
        ),
        isStructured = false,
        strokeWidth = 8.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 560.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(0.7f).wrapContentHeight(
            align = Alignment.CenterVertically
        )
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
