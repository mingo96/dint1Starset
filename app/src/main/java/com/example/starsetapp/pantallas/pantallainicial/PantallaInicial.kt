package com.example.starsetapp.pantallainicial

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.starsetapp.carrusel.Carrusel
import com.example.starsetapp.pantallabasica.PantallaBasica
import com.example.starsetapp.pantallas.PantallaBasicaInstance
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText

/**
 * pantalla de inicio
 *
 * This composable was generated from the UI Package 'pantalla_inicial'.
 * Generated code; do not edit directly
 */
@Composable
fun PantallaInicial(modifier: Modifier = Modifier, navController: NavController) {
    TopLevel(modifier = modifier) {
        PantallaBasicaInstance(modifier = Modifier
            .rowWeight(1.0f)
            .columnWeight(1.0f), navController)
        Column (modifier = modifier,
            verticalArrangement = Arrangement.Top){

            Titulo(modifier = Modifier)

            ContenedorCarruselIntegrantes {
                ContenedorTextoTitulo() {
                    TextoTituloCarrusel()
                }
                CarruselInstance()
            }
            CuadroInferior(modifier = Modifier) {
                ContenedorTextoCuadroInferior(modifier = Modifier) {
                    TextoCuadroInferior(modifier = Modifier)
                }
            }

        }
    }
}



@Composable
fun TextoTituloCarrusel(modifier: Modifier = Modifier) {
    RelayText(
        content = "Conoce a los integrantes",
        fontSize = 20.0.sp,
        fontFamily = iBMPlexMono,
        color = Color(
            alpha = 255,
            red = 72,
            green = 145,
            blue = 255
        ),
        height = 1.0.em,
        letterSpacing = 1.6.sp,
        fontWeight = FontWeight(700),
        maxLines = -1,
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
            .wrapContentHeight(
                align = Alignment.CenterVertically,
                unbounded = true
            )
    )
}

@Composable
fun ContenedorTextoTitulo(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 44,
            green = 44,
            blue = 44
        ),
        isStructured = false,
        clipToParent = false,
        radius = 5.0,
        content = content,
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 64.0.dp,
                    end = 64.0.dp,
                    top = 12.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(0.2f)
    )
}

@Composable
fun CarruselInstance(modifier: Modifier = Modifier) {
    Carrusel(
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 16.0.dp,
                    bottom = 12.0.dp,
                    end = 16.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun ContenedorCarruselIntegrantes(
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
            .padding(
                paddingValues = PaddingValues(
                    start = 16.0.dp,
                    end = 16.0.dp,
                    top = 24.dp,
                    bottom = 24.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(0.7f)
    )
}

@Composable
fun TextoCuadroInferior(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Escúchalos en ")
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 50,
                        green = 254,
                        blue = 83
                    ),
                    fontSize = 35.0.sp
                )
            ) {
                append("Spotify")
            }
        },
        fontSize = 35.0.sp,
        fontFamily = iBMPlexMono,
        color = Color(
            alpha = 255,
            red = 72,
            green = 145,
            blue = 255
        ),
        height = 1.0599999237060547.em,
        letterSpacing = 2.8000000000000003.sp,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 8.0.dp,
                    top = 0.0.dp,
                    end = 8.0.dp,
                    bottom = 0.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
            .wrapContentHeight(
                align = Alignment.CenterVertically
            )
    )
}

@Composable
fun ContenedorTextoCuadroInferior(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 44,
            green = 44,
            blue = 44
        ),
        isStructured = false,
        clipToParent = false,
        radius = 5.0,
        content = content,
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 15.0.dp,
                    top = 16.0.dp,
                    end = 16.0.dp,
                    bottom = 16.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun CuadroInferior(
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
        isStructured = false,
        radius = 9.0,
        content = content,
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 16.0.dp,
                    end = 16.0.dp,
                    bottom = 24.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun Titulo(modifier: Modifier = Modifier) {
    RelayText(
        content = "Inicio",
        fontSize = 22.0.sp,
        fontFamily = iBMPlexMono,
        color = Color(
            alpha = 255,
            red = 72,
            green = 145,
            blue = 255
        ),
        height = 1.72.em,
        fontWeight = FontWeight(700),
        maxLines = -1,
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 87.65185546875.dp,
                    top = 24.0.dp,
                    end = 105.65193176269531.dp,
                    bottom = 16.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(0.1f)
            .wrapContentHeight(
                align = Alignment.CenterVertically,
                unbounded = true
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
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}
