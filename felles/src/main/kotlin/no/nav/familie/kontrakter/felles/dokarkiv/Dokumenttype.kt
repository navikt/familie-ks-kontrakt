package no.nav.familie.kontrakter.felles.dokarkiv

enum class Dokumenttype {
    SKJEMA_ARBEIDSSØKER,
    BARNETILSYNSTØNAD_ETTERSENDING,
    BARNETILSYN_BLANKETT_SAKSBEHANDLING,
    BARNETILSYNSTØNAD_SØKNAD,
    BARNETILSYNSTØNAD_VEDLEGG,
    BARNETRYGD_HENLEGGE_TRUKKET_SØKNAD,
    BARNETRYGD_INFORMASJONSBREV_DELT_BOSTED,
    BARNETRYGD_INFORMASJONSBREV_FØDSEL_MINDREÅRIG,
    BARNETRYGD_INFORMASJONSBREV_FØDSEL_UMYNDIG,
    BARNETRYGD_INFORMASJONSBREV_FØDSEL_VERGEMÅL,
    BARNETRYGD_INFORMASJONSBREV_KAN_SØKE,
    BARNETRYGD_INFORMASJONSBREV_FØDSEL_GENERELL,
    BARNETRYGD_INNHENTE_OPPLYSNINGER,
    BARNETRYGD_INNHENTE_OPPLYSNINGER_INSTITUSJON,
    BARNETRYGD_OPPHØR,
    BARNETRYGD_EØS,
    BARNETRYGD_ORDINÆR,
    BARNETRYGD_UTVIDET,
    BARNETRYGD_VARSEL_OM_REVURDERING,
    BARNETRYGD_VARSEL_OM_REVURDERING_INSTITUSJON,
    BARNETRYGD_VARSEL_OM_REVURDERING_DELT_BOSTED_PARAGRAF_14,
    BARNETRYGD_VARSEL_OM_REVURDERING_SAMBOER,
    BARNETRYGD_VEDLEGG,
    BARNETRYGD_VEDTAK,
    BARNETRYGD_VEDTAK_INNVILGELSE,
    BARNETRYGD_VEDTAK_AVSLAG,
    BARNETRYGD_SVARTIDSBREV,
    BARNETRYGD_FORLENGET_SVARTIDSBREV,
    BARNETRYGD_SVARTIDSBREV_INSTITUSJON,
    BARNETRYGD_FORLENGET_SVARTIDSBREV_INSTITUSJON,
    BARNETRYGD_INFORMASJONSBREV_KAN_SØKE_EØS,
    BARNETRYGD_VARSEL_OM_VEDTAK_ETTER_SØKNAD_I_SED,
    BARNETRYGD_INNHENTE_OPPLYSNINGER_ETTER_SØKNAD_I_SED,
    BARNETRYGD_VARSEL_OM_REVURDERING_FRA_NASJONAL_TIL_EØS,
    BARNETRYGD_VARSEL_OM_ÅRLIG_REVURDERING_EØS,
    BARNETRYGD_VARSEL_OM_ÅRLIG_REVURDERING_EØS_MED_INNHENTING_AV_OPPLYSNINGER,
    KONTANTSTØTTE_SØKNAD,
    KONTANTSTØTTE_SØKNAD_VEDLEGG,
    KONTANTSTØTTE_HENLEGGE_TRUKKET_SØKNAD,
    KONTANTSTØTTE_INFORMASJONSBREV_DELT_BOSTED,
    KONTANTSTØTTE_INFORMASJONSBREV_KAN_SØKE,
    KONTANTSTØTTE_INNHENTE_OPPLYSNINGER,
    KONTANTSTØTTE_OPPHØR,
    KONTANTSTØTTE_EØS,
    KONTANTSTØTTE_VARSEL_OM_REVURDERING,
    KONTANTSTØTTE_VEDLEGG,
    KONTANTSTØTTE_VEDTAK,
    KONTANTSTØTTE_VEDTAK_INNVILGELSE,
    KONTANTSTØTTE_VEDTAK_AVSLAG,
    KONTANTSTØTTE_SVARTIDSBREV,
    KONTANTSTØTTE_FORLENGET_SVARTIDSBREV,
    KONTANTSTØTTE_INFORMASJONSBREV_KAN_SØKE_EØS,
    KONTANTSTØTTE_VARSEL_OM_VEDTAK_ETTER_SØKNAD_I_SED,
    KONTANTSTØTTE_INNHENTE_OPPLYSNINGER_ETTER_SØKNAD_I_SED,
    KONTANTSTØTTE_VARSEL_OM_REVURDERING_FRA_NASJONAL_TIL_EØS,
    OVERGANGSSTØNAD_BLANKETT,
    OVERGANGSSTØNAD_BLANKETT_SAKSBEHANDLING,
    OVERGANGSSTØNAD_ETTERSENDING,
    OVERGANGSSTØNAD_FRITTSTÅENDE_BREV,
    OVERGANGSSTØNAD_SØKNAD,
    OVERGANGSSTØNAD_SØKNAD_VEDLEGG,
    VEDTAKSBREV_OVERGANGSSTØNAD,
    VEDTAKSBREV_BARNETILSYN,
    VEDTAKSBREV_SKOLEPENGER,
    SKOLEPENGER_ETTERSENDING,
    SKOLEPENGER_FRITTSTÅENDE_BREV,
    SKOLEPENGER_SØKNAD,
    SKOLEPENGER_BLANKETT_SAKSBEHANDLING,
    SKOLEPENGER_VEDLEGG,
    BARNETRYGD_TILBAKEKREVING_BREV,
    BARNETRYGD_TILBAKEKREVING_VEDTAK,
    KONTANTSTØTTE_TILBAKEKREVING_BREV,
    KONTANTSTØTTE_TILBAKEKREVING_VEDTAK,
    OVERGANGSSTØNAD_TILBAKEKREVING_BREV,
    OVERGANGSSTØNAD_TILBAKEKREVING_VEDTAK,
    BARNETILSYN_FRITTSTÅENDE_BREV,
    BARNETILSYN_TILBAKEKREVING_BREV,
    BARNETILSYN_TILBAKEKREVING_VEDTAK,
    SKOLEPENGER_TILBAKEKREVING_BREV,
    SKOLEPENGER_TILBAKEKREVING_VEDTAK,

    // KLAGE
    KLAGE_VEDTAKSBREV_OVERGANGSSTØNAD,
    KLAGE_VEDTAKSBREV_BARNETILSYN,
    KLAGE_VEDTAKSBREV_SKOLEPENGER,
    KLAGE_VEDTAKSBREV_BARNETRYGD,
    KLAGE_VEDTAKSBREV_KONTANTSTØTTE,

    KLAGE_BLANKETT_SAKSBEHANDLING_OVERGANGSSTØNAD,
    KLAGE_BLANKETT_SAKSBEHANDLING_BARNETILSYN,
    KLAGE_BLANKETT_SAKSBEHANDLING_SKOLEPENGER,
    KLAGE_BLANKETT_SAKSBEHANDLING_BARNETRYGD,
    KLAGE_BLANKETT_SAKSBEHANDLING_KONTANTSTØTTE,
}
