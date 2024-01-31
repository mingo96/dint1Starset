package com.example.starsetapp.cartaintegrante

import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.starsetapp.R
import com.google.relay.compose.BoxScopeInstanceImpl.align
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText

// Design to select for CartaIntegrante
enum class Property1 {
    Default,
    Dustin,
    Ron,
    Brock,
    Adam
}

/**
 * cartas de integrante
 *
 * This composable was generated from the UI Package 'carta_integrante'.
 * Generated code; do not edit directly
 */
@Composable
fun CartaIntegrante(
    modifier: Modifier = Modifier,
    property1: Property1 = Property1.Default
) {
    when (property1) {
        Property1.Default -> TopLevelProperty1Default(modifier = modifier) {
            TextoDustinProperty1Default(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 8.0.dp,
                        y = 96.0.dp
                    )
                )
            )
            ContenedorFotoProperty1Default(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 8.0.dp,
                        y = 8.0.dp
                    )
                )
            ) {}
        }
        Property1.Dustin -> TopLevelProperty1Dustin(modifier = modifier) {
            DerechaProperty1Dustin()
            DustinCantanteProperty1Dustin()
        }
        Property1.Ron -> TopLevelProperty1Ron(modifier = modifier) {
            DerechaProperty1Ron()
            RonBajoProperty1Ron()
        }
        Property1.Brock -> TopLevelProperty1Brock(modifier = modifier) {
            DerechaProperty1Brock()
            BrockGuitarristaProperty1Brock()
        }
        Property1.Adam -> TopLevelProperty1Adam(modifier = modifier) {
            ImagenAdamProperty1Adam()
            TextoAdamProperty1Adam()
        }
    }
}

@Preview(widthDp = 136, heightDp = 112)
@Composable
private fun CartaIntegranteProperty1DefaultPreview() {
    MaterialTheme {
        RelayContainer {
            CartaIntegrante(
                property1 = Property1.Default,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaIntegranteProperty1DustinPreview() {
    MaterialTheme {
        RelayContainer {
            CartaIntegrante(
                property1 = Property1.Dustin,
                modifier = Modifier.columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 264)
@Composable
private fun CartaIntegranteProperty1RonPreview() {
    MaterialTheme {
        CartaIntegrante(property1 = Property1.Ron)
    }
}

@Preview(widthDp = 152, heightDp = 264)
@Composable
private fun CartaIntegranteProperty1BrockPreview() {
    MaterialTheme {
        CartaIntegrante(property1 = Property1.Brock)
    }
}

@Preview(widthDp = 152, heightDp = 264)
@Composable
private fun CartaIntegranteProperty1AdamPreview() {
    MaterialTheme {
        CartaIntegrante(property1 = Property1.Adam)
    }
}

@Composable
fun TextoDustinProperty1Default(modifier: Modifier = Modifier) {
    RelayText(
        content = "Nombre : Puesto",
        fontSize = 10.0.sp,
        fontFamily = iBMPlexMono,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.72.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(120.0.dp).requiredHeight(16.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun ContenedorFotoProperty1Default(
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
        modifier = modifier.requiredWidth(120.0.dp).requiredHeight(88.0.dp)
    )
}

@Composable
fun TopLevelProperty1Default(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 102,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        radius = 5.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun DerechaProperty1Dustin(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_integrante_derecha),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(136.0.dp).requiredHeight(176.0.dp)
    )
}

@Composable
fun DustinCantanteProperty1Dustin(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            withStyle(style = SpanStyle(fontSize = 15.0.sp)) {
                append("Dustin \n")
            }
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Cantante")
            }
        },
        fontSize = 10.0.sp,
        fontFamily = iBMPlexMono,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.72.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(136.0.dp).requiredHeight(24.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelProperty1Dustin(
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
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 24.0,
        radius = 5.0,
        content = content,
        modifier = modifier.fillMaxHeight()
            .align(Alignment.CenterStart)
    )
}

@Composable
fun DerechaProperty1Ron(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_integrante_derecha1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(136.0.dp).requiredHeight(176.0.dp)
    )
}

@Composable
fun RonBajoProperty1Ron(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            withStyle(style = SpanStyle(fontSize = 15.0.sp)) {
                append("Ron\n")
            }
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Bajo")
            }
        },
        fontSize = 10.0.sp,
        fontFamily = iBMPlexMono,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.72.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(136.0.dp).requiredHeight(24.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelProperty1Ron(
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
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 24.0,
        radius = 5.0,
        content = content,
        modifier = modifier.fillMaxHeight()
            .align(Alignment.CenterStart)
    )
}

@Composable
fun DerechaProperty1Brock(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_integrante_derecha2),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(136.0.dp).requiredHeight(176.0.dp)
    )
}

@Composable
fun BrockGuitarristaProperty1Brock(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Brock\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Guitarrista")
            }
        },
        fontSize = 15.0.sp,
        fontFamily = iBMPlexMono,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.41.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(136.0.dp).requiredHeight(24.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelProperty1Brock(
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
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 24.0,
        radius = 5.0,
        content = content,
        modifier = modifier.fillMaxHeight()
            .align(Alignment.CenterStart)
    )
}

@Composable
fun ImagenAdamProperty1Adam(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_integrante_imagen_adam),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(136.0.dp).requiredHeight(176.0.dp)
    )
}

@Composable
fun TextoAdamProperty1Adam(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Adam\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Bateria")
            }
        },
        fontSize = 15.0.sp,
        fontFamily = iBMPlexMono,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.41.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(136.0.dp).requiredHeight(24.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelProperty1Adam(
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
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 24.0,
        radius = 5.0,
        content = content,
        modifier = modifier.fillMaxHeight()
            .align(Alignment.CenterStart)
    )
}
