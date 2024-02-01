package com.example.starsetapp.cuadroformulario

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText

/**
 * cuadro de formulario
 *
 * This composable was generated from the UI Package 'cuadro_formulario'.
 * Generated code; do not edit directly
 */
@Composable
fun CuadroFormulario(modifier: Modifier = Modifier, opcion:Int) {
    val texto = when (opcion){
        1->"Contraseña : "
        2->"Correo : "
        3->"Nombre de usuario :"
        else->"campo no encontrado"
    }
    TopLevel(modifier = modifier) {
        TipoDato(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f),texto)
        Rellenable(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
    }
}

@Composable
fun TipoDato(modifier: Modifier = Modifier, texto:String) {
    RelayText(
        content = texto,
        fontSize = 15.0.sp,
        fontFamily = iBMPlexMono,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.5.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 8.0.dp,
                end = 136.0.dp,
                bottom = 9.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        ).wrapContentWidth(Alignment.Start)
    )
}

@Composable
fun Rellenable(
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
                start = 136.0.dp,
                top = 24.0.dp,
                end = 8.0.dp,
                bottom = 25.0.dp
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
        isStructured = false,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 127,
            red = 254,
            green = 254,
            blue = 254
        ),
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
