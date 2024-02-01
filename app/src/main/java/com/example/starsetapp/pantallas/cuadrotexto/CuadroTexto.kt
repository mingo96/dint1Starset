package com.example.starsetapp.cuadrotexto

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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'cuadro_texto'.
 * Generated code; do not edit directly
 */
@Composable
fun CuadroTexto(modifier: Modifier = Modifier,contenido :String) {
    TopLevel(modifier = modifier) {
        CuadroInterior(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            Texto(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f), contenido = contenido)
        }
    }
}


@Composable
fun Texto(modifier: Modifier = Modifier, contenido : String) {
    RelayText(
        content = buildAnnotatedString {
            append(contenido)
        },
        fontSize = 18.0.sp,
        fontFamily = iBMPlexMono,
        color = Color(
            alpha = 255,
            red = 72,
            green = 145,
            blue = 255
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 16.0.dp,
                top = 23.3846435546875.dp,
                end = 16.0.dp,
                bottom = 23.38458251953125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun CuadroInterior(
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
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
