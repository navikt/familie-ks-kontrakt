package no.nav.familie.kontrakter.felles.journalpost

import no.nav.familie.kontrakter.felles.Brevkoder
import no.nav.familie.kontrakter.felles.Tema

data class DokumentInfo(
    val dokumentInfoId: String,
    val tittel: String? = null,
    val brevkode: String? = null,
    val dokumentstatus: Dokumentstatus? = null,
    val dokumentvarianter: List<Dokumentvariant>? = null,
    val logiskeVedlegg: List<LogiskVedlegg>? = null) {

    fun erDigitalBarnetrygdSøknad() =
        Brevkoder.BARNETRYGD_BREVKODER.any { brevkode -> brevkode == this.brevkode }

    fun erDigitalKontantstøtteSøknad() =
        Brevkoder.KONTANTSTØTTE_SØKNAD == this.brevkode

    fun erDigitalSøknad(tema: Tema): Boolean = when (tema) {
        Tema.BAR -> erDigitalBarnetrygdSøknad()
        Tema.KON -> erDigitalKontantstøtteSøknad()
        else -> throw Error("Støtter ikke tema $tema")
    }
}
