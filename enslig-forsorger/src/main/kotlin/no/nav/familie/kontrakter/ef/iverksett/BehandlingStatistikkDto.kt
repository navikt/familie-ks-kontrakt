package no.nav.familie.kontrakter.ef.iverksett

import java.time.ZonedDateTime
import java.util.UUID

data class BehandlingStatistikkDto(
        val behandlingId: UUID,
        val personIdent: String,
        val saksbehandlerId: String,
        val saksnummer: String,
        val hendelseTidspunkt: ZonedDateTime,
        val hendelse: Hendelse,
        val behandlingResultat: String,
        val resultatBegrunnelse: String,
        val venteAarsak: String
)

enum class Hendelse {
    MOTTATT,
    PÅBEGYNT,
    VEDTATT,
    BESLUTTET,
    FERDIG
}