package no.nav.familie.kontrakter.ef.søknad

import kotlinx.serialization.ContextualSerialization
import kotlinx.serialization.Serializable
import java.time.LocalDate

@Serializable
data class Bosituasjon(val delerDuBolig: Spørsmål<String>,
                       val samboerdetaljer: PersonMinimumDto?,
                       val sammenflyttingsdato: Spørsmål<@ContextualSerialization LocalDate>?)