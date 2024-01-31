package com.example.starsetapp.framealbum

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

// Design to select for FrameAlbum
enum class Album {
    Transmissions,
    Vessels,
    Divisions,
    Horizons
}

/**
 * frames
 *
 * This composable was generated from the UI Package 'frame_album'.
 * Generated code; do not edit directly
 */
@Composable
fun FrameAlbum(
    modifier: Modifier = Modifier,
    album: Album = Album.Transmissions
) {
    when (album) {
        Album.Transmissions -> TopLevelAlbumTransmissions(modifier = modifier) {
            TTransmissionsAlbumTransmissions()
        }
        Album.Vessels -> TopLevelAlbumVessels(modifier = modifier) {
            TVesselsAlbumVessels()
        }
        Album.Divisions -> TopLevelAlbumDivisions(modifier = modifier) {
            TDivisionsAlbumDivisions()
        }
        Album.Horizons -> TopLevelAlbumHorizons(modifier = modifier) {
            THorizonsAlbumHorizons()
        }
    }
}

@Preview(widthDp = 72, heightDp = 24)
@Composable
private fun FrameAlbumAlbumTransmissionsPreview() {
    MaterialTheme {
        RelayContainer {
            FrameAlbum(
                album = Album.Transmissions,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 72, heightDp = 24)
@Composable
private fun FrameAlbumAlbumVesselsPreview() {
    MaterialTheme {
        RelayContainer {
            FrameAlbum(
                album = Album.Vessels,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 72, heightDp = 24)
@Composable
private fun FrameAlbumAlbumDivisionsPreview() {
    MaterialTheme {
        RelayContainer {
            FrameAlbum(
                album = Album.Divisions,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 72, heightDp = 24)
@Composable
private fun FrameAlbumAlbumHorizonsPreview() {
    MaterialTheme {
        RelayContainer {
            FrameAlbum(
                album = Album.Horizons,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun TTransmissionsAlbumTransmissions(modifier: Modifier = Modifier) {
    RelayText(
        content = "Transmissions",
        fontSize = 7.0.sp,
        fontFamily = iBMPlexMono,
        color = Color(
            alpha = 255,
            red = 243,
            green = 139,
            blue = 81
        ),
        height = 1.1761647796630859.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun TopLevelAlbumTransmissions(
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
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TVesselsAlbumVessels(modifier: Modifier = Modifier) {
    RelayText(
        content = "Vessels",
        fontSize = 7.0.sp,
        fontFamily = iBMPlexMono,
        color = Color(
            alpha = 255,
            red = 75,
            green = 244,
            blue = 255
        ),
        height = 1.1761647796630859.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun TopLevelAlbumVessels(
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
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TDivisionsAlbumDivisions(modifier: Modifier = Modifier) {
    RelayText(
        content = "Divisions",
        fontSize = 7.0.sp,
        fontFamily = iBMPlexMono,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.1761647796630859.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun TopLevelAlbumDivisions(
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
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun THorizonsAlbumHorizons(modifier: Modifier = Modifier) {
    RelayText(
        content = "Horizons",
        fontSize = 7.0.sp,
        fontFamily = iBMPlexMono,
        color = Color(
            alpha = 255,
            red = 255,
            green = 70,
            blue = 236
        ),
        height = 1.1761647796630859.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun TopLevelAlbumHorizons(
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
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
