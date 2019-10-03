package no.nav.familie.ks.kontrakter.søknad

import com.fasterxml.jackson.module.kotlin.readValue
import no.nav.familie.ks.kontrakter.Kontrakt
import no.nav.familie.ks.kontrakter.objectMapper
import java.time.LocalDateTime
import javax.validation.constraints.Pattern

data class Søknad(
    @Pattern(regexp = "[0-9]{11}")
    val søkerFødselsnummer: String,
    val språk: String?,
    val oppgittAnnenPartFødselsnummer: String?,
    val innsendtTidspunkt: LocalDateTime?,
    val oppgittFamilieforhold: OppgittFamilieforhold,
    val oppgittUtlandsTilknytning: OppgittUtlandsTilknytning,
    val oppgittErklæring: OppgittErklæring
) : Kontrakt

fun String.toSøknad(): Søknad = objectMapper.readValue<Søknad>(this)

fun Søknad.toJson(): String = objectMapper.writeValueAsString(this)
