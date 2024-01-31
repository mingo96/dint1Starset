package com.example.starsetapp.cartacancion

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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.starsetapp.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText

// Design to select for CartaCancion
enum class Cancion {
    FirstLight,
    Telescope,
    LetItDie,
    TheFutureIsNow,
    RiseAndFall,
    Everglow,
    LastToFall,
    Ricochet,
    Telepathic,
    BackToTheEarth,
    DieForYou,
    Monster,
    SomethingWicked,
    Infected,
    Disappear,
    Earthrise,
    Tunnelvision,
    Alchemy,
    Icarus,
    Dreamcatcher,
    AnihilatedLove,
    Symbiotic,
    Otherworldly,
    Devolution,
    TheBreach,
    TheEndlessEndeavor,
    LeavingThisWorldBehind,
    UnveiligTheArchitecture,
    DivingBell,
    OtherWorldsThanThese,
    WakingUp,
    Trials,
    Solstice,
    Faultline,
    Stratosphere,
    Telekinetic,
    PerfectMachine,
    WhereTheSkiesEnd,
    Echo,
    Manifest,
    ABriefHistoryOfTheFuture,
    Frequency,
    GravityOfYou,
    Unbecoming,
    BringingItDown,
    IntoTheUnknown,
    Starlight,
    Satellite,
    TheOrder,
    PointOfNoReturn,
    ItHasBegun,
    MyDemons,
    Antigravity,
    DarkOnMe,
    Carnivore,
    Halo,
    DownWithTheFallen
}

/**
 * cartas de cancion
 *
 * This composable was generated from the UI Package 'carta_cancion'.
 * Generated code; do not edit directly
 */
@Composable
fun CartaCancion(
    modifier: Modifier = Modifier,
    cancion: Cancion
) {
    when (cancion) {
        Cancion.FirstLight -> TopLevelCancionFirstLight(modifier = modifier) {
            ImagenCancionCancionFirstLight(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionFirstLight(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Telescope -> TopLevelCancionTelescope(modifier = modifier) {
            ImagenCancionCancionTelescope(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionTelescope(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.LetItDie -> TopLevelCancionLetItDie(modifier = modifier) {
            ImagenCancionCancionLetItDie(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionLetItDie(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.TheFutureIsNow -> TopLevelCancionTheFutureIsNow(modifier = modifier) {
            ImagenCancionCancionTheFutureIsNow(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionTheFutureIsNow(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.RiseAndFall -> TopLevelCancionRiseAndFall(modifier = modifier) {
            ImagenCancionCancionRiseAndFall(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionRiseAndFall(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Everglow -> TopLevelCancionEverglow(modifier = modifier) {
            ImagenCancionCancionEverglow(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionEverglow(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.LastToFall -> TopLevelCancionLastToFall(modifier = modifier) {
            ImagenCancionCancionLastToFall(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionLastToFall(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Ricochet -> TopLevelCancionRicochet(modifier = modifier) {
            ImagenCancionCancionRicochet(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionRicochet(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Telepathic -> TopLevelCancionTelepathic(modifier = modifier) {
            ImagenCancionCancionTelepathic(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionTelepathic(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.BackToTheEarth -> TopLevelCancionBackToTheEarth(modifier = modifier) {
            ImagenCancionCancionBackToTheEarth(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionBackToTheEarth(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.DieForYou -> TopLevelCancionDieForYou(modifier = modifier) {
            ImagenCancionCancionDieForYou(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionDieForYou(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Monster -> TopLevelCancionMonster(modifier = modifier) {
            ImagenCancionCancionMonster(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionMonster(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.SomethingWicked -> TopLevelCancionSomethingWicked(modifier = modifier) {
            ImagenCancionCancionSomethingWicked(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionSomethingWicked(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Infected -> TopLevelCancionInfected(modifier = modifier) {
            ImagenCancionCancionInfected(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionInfected(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Disappear -> TopLevelCancionDisappear(modifier = modifier) {
            ImagenCancionCancionDisappear(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionDisappear(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Earthrise -> TopLevelCancionEarthrise(modifier = modifier) {
            ImagenCancionCancionEarthrise(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionEarthrise(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Tunnelvision -> TopLevelCancionTunnelvision(modifier = modifier) {
            ImagenCancionCancionTunnelvision(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionTunnelvision(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Alchemy -> TopLevelCancionAlchemy(modifier = modifier) {
            ImagenCancionCancionAlchemy(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionAlchemy(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Icarus -> TopLevelCancionIcarus(modifier = modifier) {
            ImagenCancionCancionIcarus(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionIcarus(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Dreamcatcher -> TopLevelCancionDreamcatcher(modifier = modifier) {
            ImagenCancionCancionDreamcatcher(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionDreamcatcher(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.AnihilatedLove -> TopLevelCancionAnihilatedLove(modifier = modifier) {
            ImagenCancionCancionAnihilatedLove(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionAnihilatedLove(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Symbiotic -> TopLevelCancionSymbiotic(modifier = modifier) {
            ImagenCancionCancionSymbiotic(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionSymbiotic(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Otherworldly -> TopLevelCancionOtherworldly(modifier = modifier) {
            ImagenCancionCancionOtherworldly(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionOtherworldly(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Devolution -> TopLevelCancionDevolution(modifier = modifier) {
            ImagenCancionCancionDevolution(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionDevolution(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.TheBreach -> TopLevelCancionTheBreach(modifier = modifier) {
            ImagenCancionCancionTheBreach(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionTheBreach(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.TheEndlessEndeavor -> TopLevelCancionTheEndlessEndeavor(modifier = modifier) {
            ImagenCancionCancionTheEndlessEndeavor(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionTheEndlessEndeavor(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.LeavingThisWorldBehind -> TopLevelCancionLeavingThisWorldBehind(modifier = modifier) {
            ImagenCancionCancionLeavingThisWorldBehind(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionLeavingThisWorldBehind(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.UnveiligTheArchitecture -> TopLevelCancionUnveiligTheArchitecture(modifier = modifier) {
            ImagenCancionCancionUnveiligTheArchitecture(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionUnveiligTheArchitecture(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.DivingBell -> TopLevelCancionDivingBell(modifier = modifier) {
            ImagenCancionCancionDivingBell(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionDivingBell(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.OtherWorldsThanThese -> TopLevelCancionOtherWorldsThanThese(modifier = modifier) {
            ImagenCancionCancionOtherWorldsThanThese(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionOtherWorldsThanThese(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.WakingUp -> TopLevelCancionWakingUp(modifier = modifier) {
            ImagenCancionCancionWakingUp(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionWakingUp(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Trials -> TopLevelCancionTrials(modifier = modifier) {
            ImagenCancionCancionTrials(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionTrials(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Solstice -> TopLevelCancionSolstice(modifier = modifier) {
            ImagenCancionCancionSolstice(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionSolstice(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Faultline -> TopLevelCancionFaultline(modifier = modifier) {
            ImagenCancionCancionFaultline(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionFaultline(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Stratosphere -> TopLevelCancionStratosphere(modifier = modifier) {
            ImagenCancionCancionStratosphere(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionStratosphere(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Telekinetic -> TopLevelCancionTelekinetic(modifier = modifier) {
            ImagenCancionCancionTelekinetic(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionTelekinetic(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.PerfectMachine -> TopLevelCancionPerfectMachine(modifier = modifier) {
            ImagenCancionCancionPerfectMachine(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionPerfectMachine(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.WhereTheSkiesEnd -> TopLevelCancionWhereTheSkiesEnd(modifier = modifier) {
            ImagenCancionCancionWhereTheSkiesEnd(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionWhereTheSkiesEnd(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Echo -> TopLevelCancionEcho(modifier = modifier) {
            ImagenCancionCancionEcho(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionEcho(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Manifest -> TopLevelCancionManifest(modifier = modifier) {
            ImagenCancionCancionManifest(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionManifest(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.ABriefHistoryOfTheFuture -> TopLevelCancionABriefHistoryOfTheFuture(modifier = modifier) {
            ImagenCancionCancionABriefHistoryOfTheFuture(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionABriefHistoryOfTheFuture(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Frequency -> TopLevelCancionFrequency(modifier = modifier) {
            ImagenCancionCancionFrequency(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionFrequency(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.GravityOfYou -> TopLevelCancionGravityOfYou(modifier = modifier) {
            ImagenCancionCancionGravityOfYou(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionGravityOfYou(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Unbecoming -> TopLevelCancionUnbecoming(modifier = modifier) {
            ImagenCancionCancionUnbecoming(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionUnbecoming(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.BringingItDown -> TopLevelCancionBringingItDown(modifier = modifier) {
            ImagenCancionCancionBringingItDown(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionBringingItDown(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.IntoTheUnknown -> TopLevelCancionIntoTheUnknown(modifier = modifier) {
            ImagenCancionCancionIntoTheUnknown(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionIntoTheUnknown(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Starlight -> TopLevelCancionStarlight(modifier = modifier) {
            ImagenCancionCancionStarlight(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionStarlight(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Satellite -> TopLevelCancionSatellite(modifier = modifier) {
            ImagenCancionCancionSatellite(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionSatellite(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.TheOrder -> TopLevelCancionTheOrder(modifier = modifier) {
            ImagenCancionCancionTheOrder(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionTheOrder(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.PointOfNoReturn -> TopLevelCancionPointOfNoReturn(modifier = modifier) {
            ImagenCancionCancionPointOfNoReturn(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionPointOfNoReturn(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.ItHasBegun -> TopLevelCancionItHasBegun(modifier = modifier) {
            ImagenCancionCancionItHasBegun(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionItHasBegun(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.MyDemons -> TopLevelCancionMyDemons(modifier = modifier) {
            ImagenCancionCancionMyDemons(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionMyDemons(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Antigravity -> TopLevelCancionAntigravity(modifier = modifier) {
            ImagenCancionCancionAntigravity(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionAntigravity(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.DarkOnMe -> TopLevelCancionDarkOnMe(modifier = modifier) {
            ImagenCancionCancionDarkOnMe(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionDarkOnMe(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Carnivore -> TopLevelCancionCarnivore(modifier = modifier) {
            ImagenCancionCancionCarnivore(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionCarnivore(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.Halo -> TopLevelCancionHalo(modifier = modifier) {
            ImagenCancionCancionHalo(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionHalo(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Cancion.DownWithTheFallen -> TopLevelCancionDownWithTheFallen(modifier = modifier) {
            ImagenCancionCancionDownWithTheFallen(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextoCancionCancionDownWithTheFallen(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionFirstLightPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.FirstLight,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionTelescopePreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Telescope,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionLetItDiePreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.LetItDie,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionTheFutureIsNowPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.TheFutureIsNow,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionRiseAndFallPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.RiseAndFall,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionEverglowPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Everglow,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionLastToFallPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.LastToFall,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionRicochetPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Ricochet,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionTelepathicPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Telepathic,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionBackToTheEarthPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.BackToTheEarth,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionDieForYouPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.DieForYou,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionMonsterPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Monster,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionSomethingWickedPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.SomethingWicked,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionInfectedPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Infected,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionDisappearPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Disappear,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionEarthrisePreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Earthrise,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionTunnelvisionPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Tunnelvision,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionAlchemyPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Alchemy,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionIcarusPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Icarus,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionDreamcatcherPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Dreamcatcher,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionAnihilatedLovePreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.AnihilatedLove,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionSymbioticPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Symbiotic,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionOtherworldlyPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Otherworldly,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionDevolutionPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Devolution,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionTheBreachPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.TheBreach,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionTheEndlessEndeavorPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.TheEndlessEndeavor,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionLeavingThisWorldBehindPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.LeavingThisWorldBehind,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionUnveiligTheArchitecturePreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.UnveiligTheArchitecture,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionDivingBellPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.DivingBell,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionOtherWorldsThanThesePreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.OtherWorldsThanThese,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionWakingUpPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.WakingUp,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionTrialsPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Trials,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionSolsticePreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Solstice,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionFaultlinePreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Faultline,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionStratospherePreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Stratosphere,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionTelekineticPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Telekinetic,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionPerfectMachinePreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.PerfectMachine,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionWhereTheSkiesEndPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.WhereTheSkiesEnd,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionEchoPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Echo,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionManifestPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Manifest,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionABriefHistoryOfTheFuturePreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.ABriefHistoryOfTheFuture,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionFrequencyPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Frequency,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionGravityOfYouPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.GravityOfYou,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionUnbecomingPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Unbecoming,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionBringingItDownPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.BringingItDown,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionIntoTheUnknownPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.IntoTheUnknown,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionStarlightPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Starlight,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionSatellitePreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Satellite,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionTheOrderPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.TheOrder,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionPointOfNoReturnPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.PointOfNoReturn,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionItHasBegunPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.ItHasBegun,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionMyDemonsPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.MyDemons,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionAntigravityPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Antigravity,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionDarkOnMePreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.DarkOnMe,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionCarnivorePreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Carnivore,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionHaloPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.Halo,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 224)
@Composable
private fun CartaCancionCancionDownWithTheFallenPreview() {
    MaterialTheme {
        RelayContainer {
            CartaCancion(
                cancion = Cancion.DownWithTheFallen,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun ImagenCancionCancionFirstLight(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionFirstLight(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("First Light (1:24)\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionFirstLight(
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
fun ImagenCancionCancionTelescope(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionTelescope(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Telescope")
            append(" (")
            append("5:31")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionTelescope(
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
fun ImagenCancionCancionLetItDie(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionLetItDie(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Let It Die")
            append(" (")
            append("4:32")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionLetItDie(
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
fun ImagenCancionCancionTheFutureIsNow(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionTheFutureIsNow(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("The Future Is Now ")
            append("(")
            append("4:45")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionTheFutureIsNow(
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
fun ImagenCancionCancionRiseAndFall(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionRiseAndFall(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Rise And Fall ")
            append("(")
            append("5:54")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionRiseAndFall(
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
fun ImagenCancionCancionEverglow(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionEverglow(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Everglow \n")
            append("(")
            append("7:54")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionEverglow(
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
fun ImagenCancionCancionLastToFall(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionLastToFall(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Last To Fall ")
            append("(")
            append("5:03")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionLastToFall(
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
fun ImagenCancionCancionRicochet(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionRicochet(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Ricochet \n")
            append("(")
            append("5:10")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionRicochet(
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
fun ImagenCancionCancionTelepathic(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionTelepathic(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Telepathic ")
            append("(")
            append("4:42")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionTelepathic(
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
fun ImagenCancionCancionBackToTheEarth(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionBackToTheEarth(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Back To The Earth ")
            append("(")
            append("4:13")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionBackToTheEarth(
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
fun ImagenCancionCancionDieForYou(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionDieForYou(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Die For You ")
            append("(")
            append("5:17")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionDieForYou(
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
fun ImagenCancionCancionMonster(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionMonster(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Monster \n")
            append("(")
            append("4:16")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionMonster(
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
fun ImagenCancionCancionSomethingWicked(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion2),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionSomethingWicked(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Something Wicked ")
            append("(")
            append("3:59")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Bates, Rob Graves, Ric")
            }
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("kard")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionSomethingWicked(
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
fun ImagenCancionCancionInfected(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion3),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionInfected(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Infected \n")
            append("(")
            append("3:08")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Bates, Andrews")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionInfected(
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
fun ImagenCancionCancionDisappear(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion4),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionDisappear(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Disappear \n")
            append("(")
            append("5:53")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Bates, Trust, Rickard")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionDisappear(
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
fun ImagenCancionCancionEarthrise(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion5),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionEarthrise(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Earthrise \n")
            append("(")
            append("4:56")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Bates, Trust, Rickard")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionEarthrise(
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
fun ImagenCancionCancionTunnelvision(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion6),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionTunnelvision(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Tunnelvision \n")
            append("(")
            append("4:09")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Bates, Aiello")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionTunnelvision(
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
fun ImagenCancionCancionAlchemy(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion7),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionAlchemy(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Alchemy \n")
            append("(")
            append("5:19")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Bates, Erik Ron, Rick")
            }
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("ard")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionAlchemy(
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
fun ImagenCancionCancionIcarus(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion8),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionIcarus(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Icarus \n")
            append("(")
            append("4:48")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Bates, Trust, Rickard")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionIcarus(
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
fun ImagenCancionCancionDreamcatcher(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion9),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionDreamcatcher(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Dreamcatcher \n")
            append("(")
            append("4:53")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Bates, Turner, Rickard")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionDreamcatcher(
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
fun ImagenCancionCancionAnihilatedLove(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion10),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 64.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionAnihilatedLove(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Annihilated Love ")
            append("(")
            append("4:44")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Bates, Ticotin, Johnny Andrews")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 160.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionAnihilatedLove(
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
fun ImagenCancionCancionSymbiotic(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion11),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionSymbiotic(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Symbiotic \n")
            append("(")
            append("3:23")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Bates, Stephen Aiell")
            }
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("o")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionSymbiotic(
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
fun ImagenCancionCancionOtherworldly(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion12),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionOtherworldly(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Otherworldly \n")
            append("(")
            append("5:02")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Bates, Sahaj Ticotin")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionOtherworldly(
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
fun ImagenCancionCancionDevolution(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion13),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 64.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionDevolution(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Devolution \n")
            append("(")
            append("5:09")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Bates, Trust, Rickard, Stacy Hogan")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 160.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionDevolution(
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
fun ImagenCancionCancionTheBreach(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion14),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 64.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionTheBreach(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("The Breach \n")
            append("(")
            append("4:20")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Bates,Garrison Turner, Joe Rickard")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 160.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionTheBreach(
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
fun ImagenCancionCancionTheEndlessEndeavor(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion15),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 64.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionTheEndlessEndeavor(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("This Endless Endeavor ")
            append("(")
            append("5:02")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Bates, Ricky Armellino, Rickard")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 160.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionTheEndlessEndeavor(
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
fun ImagenCancionCancionLeavingThisWorldBehind(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion16),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 72.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionLeavingThisWorldBehind(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Leaving This World Behind \n")
            append("(")
            append("4:27")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Bates, Turner")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 152.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionLeavingThisWorldBehind(
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
fun ImagenCancionCancionUnveiligTheArchitecture(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion17),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 72.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionUnveiligTheArchitecture(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Unveiling the Architecture \n")
            append("(")
            append("1:45")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates, ")
            }
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Paul Trust")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 152.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionUnveiligTheArchitecture(
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
fun ImagenCancionCancionDivingBell(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion18),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionDivingBell(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Diving Bell\n")
            append("(")
            append("5:38")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionDivingBell(
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
fun ImagenCancionCancionOtherWorldsThanThese(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion19),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 64.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionOtherWorldsThanThese(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Other Worlds Than These \n")
            append("(")
            append("4:18")
            append(")")
            append(" Bates")
        },
        fontSize = 15.0.sp,
        fontFamily = iBMPlexMono,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 160.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionOtherWorldsThanThese(
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
fun ImagenCancionCancionWakingUp(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion20),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionWakingUp(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Waking Up \n")
            append("(")
            append("3:50")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionWakingUp(
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
fun ImagenCancionCancionTrials(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion21),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionTrials(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Trials \n")
            append("(")
            append("4:19")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionTrials(
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
fun ImagenCancionCancionSolstice(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion22),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionSolstice(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Solstice \n")
            append("(")
            append("5:42")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionSolstice(
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
fun ImagenCancionCancionFaultline(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion23),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionFaultline(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Faultline \n")
            append("(")
            append("3:36")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionFaultline(
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
fun ImagenCancionCancionStratosphere(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion24),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionStratosphere(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Stratosphere \n")
            append("(")
            append("4:17")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionStratosphere(
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
fun ImagenCancionCancionTelekinetic(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion25),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionTelekinetic(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Telekinetic \n")
            append("(")
            append("5:13")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionTelekinetic(
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
fun ImagenCancionCancionPerfectMachine(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion26),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionPerfectMachine(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Perfect Machine \n")
            append("(")
            append("5:24")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionPerfectMachine(
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
fun ImagenCancionCancionWhereTheSkiesEnd(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion27),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionWhereTheSkiesEnd(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Where The Skies End ")
            append("(")
            append("6:34")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionWhereTheSkiesEnd(
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
fun ImagenCancionCancionEcho(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion28),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionEcho(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Echo\n")
            append("(")
            append("3:37")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionEcho(
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
fun ImagenCancionCancionManifest(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion29),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionManifest(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Manifest \n")
            append("(")
            append("4:27")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionManifest(
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
fun ImagenCancionCancionABriefHistoryOfTheFuture(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion30),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 64.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionABriefHistoryOfTheFuture(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("A Brief History of the Future \n")
            append("(")
            append("4:16")
            append(")")
            append(" Bates")
        },
        fontSize = 15.0.sp,
        fontFamily = iBMPlexMono,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 160.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionABriefHistoryOfTheFuture(
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
fun ImagenCancionCancionFrequency(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionFrequency(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Frequency\n")
            append("(")
            append("4:41")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionFrequency(
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
fun ImagenCancionCancionGravityOfYou(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionGravityOfYou(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Gravity Of You ")
            append("(")
            append("4:46")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionGravityOfYou(
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
fun ImagenCancionCancionUnbecoming(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionUnbecoming(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Unbecoming ")
            append("(")
            append("4:10)\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionUnbecoming(
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
fun ImagenCancionCancionBringingItDown(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionBringingItDown(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Bringing It Down ")
            append("(")
            append("5:48")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionBringingItDown(
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
fun ImagenCancionCancionIntoTheUnknown(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionIntoTheUnknown(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Into The Unknown ")
            append("(")
            append("4:30")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionIntoTheUnknown(
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
fun ImagenCancionCancionStarlight(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionStarlight(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Starlight ")
            append("(")
            append("4:46")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionStarlight(
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
fun ImagenCancionCancionSatellite(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionSatellite(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Satellite ")
            append("(")
            append("3:59")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionSatellite(
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
fun ImagenCancionCancionTheOrder(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionTheOrder(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("The Order ")
            append("(")
            append("1:06")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionTheOrder(
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
fun ImagenCancionCancionPointOfNoReturn(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionPointOfNoReturn(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Point Of No Return ")
            append("(")
            append("3:39")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 6.0.sp)) {
                append("Dustin Bates, Rob Graves, Alan Powell")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionPointOfNoReturn(
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
fun ImagenCancionCancionItHasBegun(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionItHasBegun(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("It Has Begun")
            append(" (")
            append("5:16")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionItHasBegun(
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
fun ImagenCancionCancionMyDemons(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionMyDemons(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("My Demons\n")
            append("(")
            append("4:48")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates, Stephen Aelio")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionMyDemons(
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
fun ImagenCancionCancionAntigravity(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionAntigravity(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("AntiGravity\n")
            append("(")
            append("6:09")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionAntigravity(
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
fun ImagenCancionCancionDarkOnMe(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionDarkOnMe(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Dark On Me\n")
            append("(")
            append("5:38")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates, Trust")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionDarkOnMe(
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
fun ImagenCancionCancionCarnivore(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionCarnivore(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Carnivore")
            append(" (")
            append("4:23")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionCarnivore(
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
fun ImagenCancionCancionHalo(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionHalo(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Halo")
            append(" \n(")
            append("3:46")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionHalo(
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
fun ImagenCancionCancionDownWithTheFallen(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.carta_cancion_imagen_cancion),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.0.dp,
                top = 8.0.dp,
                end = 8.0.dp,
                bottom = 48.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextoCancionCancionDownWithTheFallen(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Down With The Fallen")
            append(" (")
            append("4:18")
            append(")\n")
            withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                append("Dustin Bates, Paul Trust")
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
        height = 1.3.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 176.0.dp,
                end = 8.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevelCancionDownWithTheFallen(
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
