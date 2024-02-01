package com.example.starsetapp.registro

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.starsetapp.cuadroformulario.CuadroFormulario
import com.example.starsetapp.cuadrotexto.CuadroTexto
import com.example.starsetapp.pantallabasica.PantallaBasica
import com.example.starsetapp.pantallas.PantallaBasicaInstance
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText

/**
 * pantalla de registro
 *
 * This composable was generated from the UI Package 'registro'.
 * Generated code; do not edit directly
 */
@Composable
fun Registro(modifier: Modifier = Modifier, navController: NavController) {
    TopLevel(modifier = modifier) {

        PantallaBasicaInstance(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f),navController)
        Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top){
            Titulo(modifier = Modifier)

            CuadroTextoInstance(modifier = Modifier)
            ContenedorFormulario(modifier = Modifier) {
                CuadroPassword(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                CuadroCorreo(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                CuadroNombreUsuario(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Frame16(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                    RegStrame(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.15587234497070312.dp
                            )
                        ),navController
                    )
                }
                CuadroTextoFormulario(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                    Formulario(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
        }
    }
}

@Composable
fun CuadroTextoInstance(modifier: Modifier = Modifier) {
    CuadroTexto(
        modifier = Modifier.padding(horizontal = 24.dp).fillMaxWidth(1.0f).fillMaxHeight(0.3f),
        "Aún estamos trabajando en esto, registrate para tener ventajas de veterano !"
    )
}

@Composable
fun CuadroPassword(modifier: Modifier = Modifier) {
    CuadroFormulario(
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 16.0.dp,
                top = 76.08908081054688.dp,
                end = 16.0.dp,
                bottom = 228.3474464416504.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f),1
    )
}

@Composable
fun CuadroCorreo(modifier: Modifier = Modifier) {
    CuadroFormulario(
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 16.0.dp,
                top = 155.46546936035156.dp,
                end = 16.0.dp,
                bottom = 148.9710578918457.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f),2
    )
}

@Composable
fun CuadroNombreUsuario(modifier: Modifier = Modifier) {
    CuadroFormulario(
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 16.0.dp,
                top = 234.84185791015625.dp,
                end = 16.0.dp,
                bottom = 66.62806701660156.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f),3
    )
}

@Composable
fun RegStrame(modifier: Modifier = Modifier,navController: NavController) {
    RelayText(
        content = "Regístrame",
        fontSize = 15.0.sp,
        fontFamily = iBMPlexMono,
        color = Color(
            alpha = 255,
            red = 72,
            green = 145,
            blue = 255
        ),
        height = 1.5.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(264.0.dp).requiredHeight(44.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        ).clickable { navController.navigate("PantallaInicial") }
    )
}

@Composable
fun Frame16(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 127,
            red = 254,
            green = 254,
            blue = 254
        ),
        isStructured = false,
        radius = 5.0,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 16.0.dp,
                top = 306.2806396484375.dp,
                end = 16.0.dp,
                bottom = 14.031166076660156.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Formulario(modifier: Modifier = Modifier) {
    RelayText(
        content = "Formulario",
        fontSize = 30.0.sp,
        fontFamily = iBMPlexMono,
        color = Color(
            alpha = 255,
            red = 72,
            green = 145,
            blue = 255
        ),
        height = 1.5.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun CuadroTextoFormulario(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 127,
            red = 254,
            green = 254,
            blue = 254
        ),
        isStructured = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 307.8841857910156.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ContenedorFormulario(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 127,
            red = 254,
            green = 254,
            blue = 254
        ),
        isStructured = false,
        radius = 5.0,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 32.0.dp,
                top = 24.0.dp,
                end = 32.0.dp,
                bottom = 24.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Titulo(modifier: Modifier = Modifier) {
    RelayText(
        content = "Pre-Registro",
        fontSize = 22.0.sp,
        fontFamily = iBMPlexMono,
        color = Color(
            alpha = 255,
            red = 72,
            green = 145,
            blue = 255
        ),
        height = 1.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 87.65185546875.dp,
                end = 104.65193176269531.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(0.175f).padding(top = 36.dp)
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
