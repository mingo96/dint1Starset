package com.example.starsetapp.salir

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.tappable

/**
 * boton de salir
 *
 * This composable was generated from the UI Package 'salir'.
 * Generated code; do not edit directly
 */
@Composable
fun Salir(
    modifier: Modifier = Modifier,
    onSalirClicked: () -> Unit = {}
) {
    TopLevel(
        onSalirClicked = onSalirClicked,
        modifier = modifier
    ) {
        Volver()
    }
}

@Preview(widthDp = 72, heightDp = 24)
@Composable
private fun SalirPreview() {
    MaterialTheme {
        RelayContainer {
            Salir(
                onSalirClicked = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Volver(modifier: Modifier = Modifier) {
    RelayText(
        content = "Volver",
        fontSize = 7.0.sp,
        fontFamily = iBMPlexMono,
        color = Color(
            alpha = 255,
            red = 249,
            green = 255,
            blue = 0
        ),
        height = 1.1761647796630859.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun TopLevel(
    onSalirClicked: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 38,
            red = 254,
            green = 254,
            blue = 254
        ),
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 15.0,
        strokeWidth = 2.0,
        strokeColor = Color(
            alpha = 127,
            red = 255,
            green = 255,
            blue = 255
        ),
        content = content,
        modifier = modifier.tappable(onTap = onSalirClicked).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
