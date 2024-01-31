package com.example.starsetapp.carrusel

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.starsetapp.cartacancion.Cancion
import com.example.starsetapp.cartacancion.CartaCancion
import com.example.starsetapp.cartaintegrante.CartaIntegrante
import com.example.starsetapp.cartaintegrante.Property1
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope

// Design to select for Carrusel
enum class Tipo {
    Integrantes,
    CancionesVessels,
    CancionesDivisions,
    CancionesHorizons,
    CancionesTransmissions
}

class CancionesPorAlbum(){

    companion object {
        val CancionesDivisions: Array<Cancion> = arrayOf(
            Cancion.ABriefHistoryOfTheFuture,
            Cancion.Manifest,
            Cancion.Echo,
            Cancion.WhereTheSkiesEnd,
            Cancion.PerfectMachine,
            Cancion.Telekinetic,
            Cancion.Stratosphere,
            Cancion.Faultline,
            Cancion.Solstice,
            Cancion.Trials,
            Cancion.WakingUp,
            Cancion.OtherWorldsThanThese,
            Cancion.DivingBell
        )
        val CancionesVessels: Array<Cancion> = arrayOf(
            Cancion.TheOrder,
            Cancion.Satellite,
            Cancion.Frequency,
            Cancion.DieForYou,
            Cancion.Ricochet,
            Cancion.Starlight,
            Cancion.IntoTheUnknown,
            Cancion.GravityOfYou,
            Cancion.BackToTheEarth,
            Cancion.LastToFall,
            Cancion.BringingItDown,
            Cancion.Unbecoming,
            Cancion.Monster,
            Cancion.Telepathic,
            Cancion.Everglow
        )
        val CancionesHorizons: Array<Cancion> = arrayOf(
            Cancion.UnveiligTheArchitecture,
            Cancion.TheBreach,
            Cancion.Otherworldly,
            Cancion.Icarus,
            Cancion.Earthrise,
            Cancion.LeavingThisWorldBehind,
            Cancion.Devolution,
            Cancion.AnihilatedLove,
            Cancion.Alchemy,
            Cancion.Disappear,
            Cancion.TheEndlessEndeavor,
            Cancion.Symbiotic,
            Cancion.Dreamcatcher,
            Cancion.Tunnelvision,
            Cancion.Infected,
            Cancion.SomethingWicked
        )
        val CancionesTransmissions: Array<Cancion> = arrayOf(
            Cancion.FirstLight,
            Cancion.DownWithTheFallen,
            Cancion.Halo,
            Cancion.Carnivore,
            Cancion.Telescope,
            Cancion.ItHasBegun,
            Cancion.MyDemons,
            Cancion.Antigravity,
            Cancion.DarkOnMe,
            Cancion.LetItDie,
            Cancion.TheFutureIsNow,
            Cancion.PointOfNoReturn,
            Cancion.RiseAndFall
        )
    }
}

/**
 * carruseles
 *
 * This composable was generated from the UI Package 'carrusel'.
 * Generated code; do not edit directly
 */
@Composable
fun Carrusel(
    modifier: Modifier = Modifier,
    tipo: Tipo = Tipo.Integrantes
) {

    TopLevelCarrusel(tipo = tipo)

}



@Composable
fun TopLevelCarrusel(
    modifier: Modifier = Modifier,
    tipo: Tipo,
) {
    RelayContainer(
        isStructured = true,
        scrollable = true,
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        radius = 5.0,
        content = { Contenedor(tipo = tipo) },
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}


@Composable
fun Contenedor(
    modifier: Modifier = Modifier,
    tipo: Tipo
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 102,
            red = 255,
            green = 255,
            blue = 255
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 16.0.dp),
        itemSpacing = 24.0,
        radius = 5.0,
        content = when(tipo){
                            Tipo.Integrantes->{
                                {
                                    for (i in Property1.values()){
                                        CartaCantante(property1 = i)
                                    }
                                }
                            }
                            Tipo.CancionesDivisions->{
                                {
                                    for (i in CancionesPorAlbum.CancionesDivisions){
                                        CartaCancion(Modifier,i)
                                    }
                                }
                            }
                            Tipo.CancionesTransmissions-> {
                                {
                                    for (i in CancionesPorAlbum.CancionesTransmissions){
                                    CartaCancion(Modifier,i)
                                }
                                }
                            }
                            Tipo.CancionesHorizons-> {
                                {
                                    for (i in CancionesPorAlbum.CancionesHorizons){
                                        CartaCancion(Modifier,i)
                                    }
                                }
                            }
                            else->{
                                {
                                    for (i in CancionesPorAlbum.CancionesVessels){
                                        CartaCancion(Modifier,i)
                                    }
                                }
                            }
                },
        modifier = modifier
            .requiredWidth(712.0.dp)
            .fillMaxHeight(1.0f)
    )
}


@Composable
fun CartaCantante(modifier: Modifier = Modifier, property1: Property1) {
    CartaIntegrante(
        property1 = property1,
        modifier = modifier.fillMaxHeight(1.0f)
    )
}