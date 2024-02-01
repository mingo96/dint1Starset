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
import androidx.compose.ui.text.AnnotatedString
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

class CancionTexto{
    companion object{
        val correspondencia = arrayOf<Pair<Cancion, AnnotatedString>>(
            Pair(Cancion.FirstLight,buildAnnotatedString {
                append("First Light (1:24)\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.Telescope,buildAnnotatedString {
                append("Telescope")
                append(" (")
                append("5:31")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.LetItDie,buildAnnotatedString {
                append("Let It Die")
                append(" (")
                append("4:32")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.TheFutureIsNow,buildAnnotatedString {
                append("The Future Is Now ")
                append("(")
                append("4:45")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.RiseAndFall,buildAnnotatedString {
                append("Rise And Fall ")
                append("(")
                append("5:54")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.Everglow,buildAnnotatedString {
                append("Everglow \n")
                append("(")
                append("7:54")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.LastToFall,buildAnnotatedString {
                append("Last To Fall ")
                append("(")
                append("5:03")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.Ricochet,buildAnnotatedString {
                append("Ricochet \n")
                append("(")
                append("5:10")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.Telepathic,buildAnnotatedString {
                append("Telepathic ")
                append("(")
                append("4:42")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.BackToTheEarth,buildAnnotatedString {
                append("Back To The Earth ")
                append("(")
                append("4:13")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.DieForYou,buildAnnotatedString {
                append("Die For You ")
                append("(")
                append("5:17")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.Monster,buildAnnotatedString {
                append("Monster \n")
                append("(")
                append("4:16")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.SomethingWicked,buildAnnotatedString {
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
            }),
            Pair(Cancion.Infected,buildAnnotatedString {
                append("Infected \n")
                append("(")
                append("3:08")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Bates, Andrews")
                }
            }),
            Pair(Cancion.Disappear,buildAnnotatedString {
                append("Disappear \n")
                append("(")
                append("5:53")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Bates, Trust, Rickard")
                }
            }),
            Pair(Cancion.Earthrise,buildAnnotatedString {
                append("Earthrise \n")
                append("(")
                append("4:56")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Bates, Trust, Rickard")
                }
            }),
            Pair(Cancion.Tunnelvision,buildAnnotatedString {
                append("Tunnelvision \n")
                append("(")
                append("4:09")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Bates, Aiello")
                }
            }),
            Pair(Cancion.Alchemy,buildAnnotatedString {
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
            }),
            Pair(Cancion.Icarus,buildAnnotatedString {
                append("Icarus \n")
                append("(")
                append("4:48")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Bates, Trust, Rickard")
                }
            }),
            Pair(Cancion.Dreamcatcher,buildAnnotatedString {
                append("Dreamcatcher \n")
                append("(")
                append("4:53")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Bates, Turner, Rickard")
                }
            }),
            Pair(Cancion.AnihilatedLove,buildAnnotatedString {
                append("Annihilated Love ")
                append("(")
                append("4:44")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Bates, Ticotin, Johnny Andrews")
                }
            }),
            Pair(Cancion.Symbiotic,buildAnnotatedString {
                append("Symbiotic \n")
                append("(")
                append("3:23")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Bates, Stephen Aiello")
                }
            }),
            Pair(Cancion.Otherworldly,buildAnnotatedString {
                append("Otherworldly \n")
                append("(")
                append("5:02")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Bates, Sahaj Ticotin")
                }
            }),
            Pair(Cancion.Devolution,buildAnnotatedString {
                append("Devolution \n")
                append("(")
                append("5:09")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Bates, Trust, Rickard, Stacy Hogan")
                }
            }),
            Pair(Cancion.TheBreach,buildAnnotatedString {
                append("The Breach \n")
                append("(")
                append("4:20")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Bates,Garrison Turner, Joe Rickard")
                }
            }),
            Pair(Cancion.TheEndlessEndeavor,buildAnnotatedString {
                append("This Endless Endeavor ")
                append("(")
                append("5:02")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Bates, Ricky Armellino, Rickard")
                }
            }),
            Pair(Cancion.LeavingThisWorldBehind,buildAnnotatedString {
                append("Leaving This World Behind \n")
                append("(")
                append("4:27")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Bates, Turner")
                }
            }),
            Pair(Cancion.UnveiligTheArchitecture,buildAnnotatedString {
                append("Unveiling the Architecture \n")
                append("(")
                append("1:45")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates, Paul Trust")
                }
            }),
            Pair(Cancion.DivingBell,buildAnnotatedString {
                append("Diving Bell\n")
                append("(")
                append("5:38")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.OtherWorldsThanThese,buildAnnotatedString {
                append("Other Worlds Than These \n")
                append("(")
                append("4:18")
                append(") : ")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.WakingUp,buildAnnotatedString {
                append("Waking Up \n")
                append("(")
                append("3:50")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.Trials,buildAnnotatedString {
                append("Trials \n")
                append("(")
                append("4:19")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.Solstice,buildAnnotatedString {
                append("Solstice \n")
                append("(")
                append("5:42")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.Faultline,buildAnnotatedString {
                append("Faultline \n")
                append("(")
                append("3:36")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.Stratosphere,buildAnnotatedString {
                append("Stratosphere \n")
                append("(")
                append("4:17")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.Telekinetic,buildAnnotatedString {
                append("Telekinetic \n")
                append("(")
                append("5:13")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.PerfectMachine,buildAnnotatedString {
                append("Perfect Machine \n")
                append("(")
                append("5:24")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.WhereTheSkiesEnd,buildAnnotatedString {
                append("Where The Skies End ")
                append("(")
                append("6:34")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.Echo,buildAnnotatedString {
                append("Echo\n")
                append("(")
                append("3:37")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.Manifest,buildAnnotatedString {
                append("Manifest \n")
                append("(")
                append("4:27")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.ABriefHistoryOfTheFuture,buildAnnotatedString {
                append("A Brief History\nof the Future \n")
                append("(")
                append("4:16")
                append(")")
                append(" Bates")
            }),
            Pair(Cancion.Frequency,buildAnnotatedString {
                append("Frequency\n")
                append("(")
                append("4:41")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.GravityOfYou,buildAnnotatedString {
                append("Gravity Of You ")
                append("(")
                append("4:46")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.Unbecoming,buildAnnotatedString {
                append("Unbecoming ")
                append("(")
                append("4:10)\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.BringingItDown,buildAnnotatedString {
                append("Bringing It Down ")
                append("(")
                append("5:48")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.IntoTheUnknown,buildAnnotatedString {
                append("Into The Unknown ")
                append("(")
                append("4:30")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.Starlight,buildAnnotatedString {
                append("Starlight ")
                append("(")
                append("4:46")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.Satellite,buildAnnotatedString {
                append("Satellite ")
                append("(")
                append("3:59")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.TheOrder,buildAnnotatedString {
                append("The Order ")
                append("(")
                append("1:06")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.PointOfNoReturn,buildAnnotatedString {
                append("Point Of No Return ")
                append("(")
                append("3:39")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 6.0.sp)) {
                    append("Dustin Bates, Rob Graves, Alan Powell")
                }
            }),
            Pair(Cancion.ItHasBegun,buildAnnotatedString {
                append("It Has Begun")
                append(" (")
                append("5:16")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.MyDemons,buildAnnotatedString {
                append("My Demons\n")
                append("(")
                append("4:48")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates, Stephen Aelio")
                }
            }),
            Pair(Cancion.Antigravity,buildAnnotatedString {
                append("AntiGravity\n")
                append("(")
                append("6:09")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.DarkOnMe,buildAnnotatedString {
                append("Dark On Me\n")
                append("(")
                append("5:38")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates, Trust")
                }
            }),
            Pair(Cancion.Carnivore,buildAnnotatedString {
                append("Carnivore")
                append(" (")
                append("4:23")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.Halo,buildAnnotatedString {
                append("Halo")
                append(" \n(")
                append("3:46")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates")
                }
            }),
            Pair(Cancion.DownWithTheFallen,buildAnnotatedString {
                append("Down With The Fallen")
                append(" (")
                append("4:18")
                append(")\n")
                withStyle(style = SpanStyle(fontSize = 8.0.sp)) {
                    append("Dustin Bates, Paul Trust")
                }
            })
        )
    }
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
        Cancion.FirstLight -> TopLevelCancion(modifier = modifier) {
            ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Telescope -> TopLevelCancion(modifier = modifier) {
            ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.LetItDie -> TopLevelCancion(modifier = modifier) {
                        ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.TheFutureIsNow -> TopLevelCancion(modifier = modifier) {
            ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.RiseAndFall -> TopLevelCancion(modifier = modifier) {
                        ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Everglow -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion1))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.LastToFall -> TopLevelCancion(modifier = modifier) {
                        ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion1))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Ricochet -> TopLevelCancion(modifier = modifier) {
                        ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion1))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Telepathic -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion1))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.BackToTheEarth -> TopLevelCancion(modifier = modifier) {
             ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion1))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.DieForYou -> TopLevelCancion(modifier = modifier) {
                            ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion1))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Monster -> TopLevelCancion(modifier = modifier) {
            ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion1))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.SomethingWicked -> TopLevelCancion(modifier = modifier) {
                        ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion2))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Infected -> TopLevelCancion(modifier = modifier) {
                        ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion3))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Disappear -> TopLevelCancion(modifier = modifier) {
                            ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion4))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Earthrise -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion5))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Tunnelvision -> TopLevelCancion(modifier = modifier) {
                        ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion6))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Alchemy -> TopLevelCancion(modifier = modifier) {
                        ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion7))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Icarus -> TopLevelCancion(modifier = modifier) {
            ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion8))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Dreamcatcher -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion9))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.AnihilatedLove -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion10))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Symbiotic -> TopLevelCancion(modifier = modifier) {
                        ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion11))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Otherworldly -> TopLevelCancion(modifier = modifier) {
                        ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion12))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Devolution -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion13))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.TheBreach -> TopLevelCancion(modifier = modifier) {
                            ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion14))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.TheEndlessEndeavor -> TopLevelCancion(modifier = modifier) {
                        ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion15))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.LeavingThisWorldBehind -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion16))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.UnveiligTheArchitecture -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion17))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.DivingBell -> TopLevelCancion(modifier = modifier) {
             ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion18))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.OtherWorldsThanThese -> TopLevelCancion(modifier = modifier) {
                        ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion19))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.WakingUp -> TopLevelCancion(modifier = modifier) {
                        ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion20))


            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Trials -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion21))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Solstice -> TopLevelCancion(modifier = modifier) {
            ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion22))


            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Faultline -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion23))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Stratosphere -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion24))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Telekinetic -> TopLevelCancion(modifier = modifier) {
             ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion25))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.PerfectMachine -> TopLevelCancion(modifier = modifier) {
            ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion26))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.WhereTheSkiesEnd -> TopLevelCancion(modifier = modifier) {
                        ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion27))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Echo -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion28))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Manifest -> TopLevelCancion(modifier = modifier) {
                            ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion29))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.ABriefHistoryOfTheFuture -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion30))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Frequency -> TopLevelCancion(modifier = modifier) {
                            ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion1))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.GravityOfYou -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion1))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Unbecoming -> TopLevelCancion(modifier = modifier) {
            ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion1))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.BringingItDown -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion1))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.IntoTheUnknown -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion1))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Starlight -> TopLevelCancion(modifier = modifier) {
            ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion1))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Satellite -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion1))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.TheOrder -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion1))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.PointOfNoReturn -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.ItHasBegun -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.MyDemons -> TopLevelCancion(modifier = modifier) {
                            ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Antigravity -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.DarkOnMe -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Carnivore -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.Halo -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
        Cancion.DownWithTheFallen -> TopLevelCancion(modifier = modifier) {
                    ImagenCancionPocoTexto(imagen = (R.drawable.carta_cancion_imagen_cancion))
            TextoCancion(text = CancionTexto.correspondencia.find { it.first==cancion }!!.second)
        }
    }
}

@Composable
fun TextoCancion(modifier:Modifier = Modifier, text:AnnotatedString){
    RelayText(
        content = text,
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
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 8.0.dp,
                    end = 8.0.dp,
                    bottom = 8.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
            .wrapContentHeight(
                align = Alignment.Bottom,
                unbounded = true
            )
    )
}

@Composable
fun TopLevelCancion(
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
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

@Composable
fun ImagenCancionMuchoTexto(modifier: Modifier = Modifier, imagen:Int) {
    RelayImage(
        image = painterResource(imagen),
        contentScale = ContentScale.Crop,
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 9.0.dp,
                    top = 8.0.dp,
                    end = 8.0.dp,
                    bottom = 72.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}


@Composable
fun ImagenCancionPocoTexto(modifier: Modifier = Modifier, imagen:Int) {
    RelayImage(
        image = painterResource(imagen),
        contentScale = ContentScale.Crop,
        modifier = modifier
            .padding(
                paddingValues = PaddingValues(
                    start = 8.0.dp,
                    top = 8.0.dp,
                    end = 8.0.dp,
                    bottom = 64.0.dp
                )
            )
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
    )
}

