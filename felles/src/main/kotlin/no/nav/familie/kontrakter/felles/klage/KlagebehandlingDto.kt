package no.nav.familie.kontrakter.felles.klage

import java.time.LocalDate
import java.time.LocalDateTime
import java.util.UUID

data class KlagebehandlingDto(
    val id: UUID,
    val fagsakId: UUID,
    val status: BehandlingStatus,
    val opprettet: LocalDateTime,
    val mottattDato: LocalDate,
    val resultat: BehandlingResultat?,
    val årsak: Årsak?,
    val vedtaksdato: LocalDateTime?,
)
