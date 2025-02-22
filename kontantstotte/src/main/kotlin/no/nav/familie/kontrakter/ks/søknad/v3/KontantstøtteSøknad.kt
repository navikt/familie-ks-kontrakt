package no.nav.familie.kontrakter.ks.søknad.v3

import no.nav.familie.kontrakter.felles.søknad.BaksSøknadBase
import no.nav.familie.kontrakter.felles.søknad.BaksSøknadPersonBase
import no.nav.familie.kontrakter.felles.søknad.Søknadsfelt
import no.nav.familie.kontrakter.ks.søknad.v1.BarnehageplassPeriode
import no.nav.familie.kontrakter.ks.søknad.v1.IdNummer
import no.nav.familie.kontrakter.ks.søknad.v1.KontantstøttePeriode
import no.nav.familie.kontrakter.ks.søknad.v1.Locale
import no.nav.familie.kontrakter.ks.søknad.v1.Pensjonsperiode
import no.nav.familie.kontrakter.ks.søknad.v1.RegistrertBostedType
import no.nav.familie.kontrakter.ks.søknad.v1.Søknaddokumentasjon
import no.nav.familie.kontrakter.ks.søknad.v1.TekstPåSpråkMap
import no.nav.familie.kontrakter.ks.søknad.v1.Utbetalingsperiode
import no.nav.familie.kontrakter.ks.søknad.v1.Utenlandsopphold
import no.nav.familie.kontrakter.ks.søknad.v2.Arbeidsperiode
import no.nav.familie.kontrakter.ks.søknad.v2.Omsorgsperson
import no.nav.familie.kontrakter.ks.søknad.v2.Søker

@Deprecated("Bruk v4", replaceWith = ReplaceWith("no.nav.familie.kontrakter.ks.søknad.v4.KontantstøtteSøknad"))
data class KontantstøtteSøknad(
    override val kontraktVersjon: Int,
    override val søker: Søker,
    override val barn: List<Barn>,
    val antallEøsSteg: Int,
    val dokumentasjon: List<Søknaddokumentasjon>,
    val teksterTilPdf: Map<String, TekstPåSpråkMap>,
    val originalSpråk: Locale,
    val erNoenAvBarnaFosterbarn: Søknadsfelt<String>,
    val søktAsylForBarn: Søknadsfelt<String>,
    val oppholderBarnSegIInstitusjon: Søknadsfelt<String>,
    val barnOppholdtSegTolvMndSammenhengendeINorge: Søknadsfelt<String>,
    val erBarnAdoptert: Søknadsfelt<String>,
    val mottarKontantstøtteForBarnFraAnnetEøsland: Søknadsfelt<String>,
    val harEllerTildeltBarnehageplass: Søknadsfelt<String>,
    val erAvdødPartnerForelder: Søknadsfelt<String>?,
) : BaksSøknadBase

@Deprecated("Bruk v4", replaceWith = ReplaceWith("no.nav.familie.kontrakter.ks.søknad.v4.Barn"))
data class Barn(
    override val ident: Søknadsfelt<String>,
    val harEøsSteg: Boolean,
    val navn: Søknadsfelt<String>,
    val registrertBostedType: Søknadsfelt<RegistrertBostedType>,
    val alder: Søknadsfelt<String>?,
    val teksterTilPdf: Map<String, TekstPåSpråkMap>,
    // Om Barna
    val erFosterbarn: Søknadsfelt<String>,
    val oppholderSegIInstitusjon: Søknadsfelt<String>,
    val erAdoptert: Søknadsfelt<String>,
    val erAsylsøker: Søknadsfelt<String>,
    val boddMindreEnn12MndINorge: Søknadsfelt<String>,
    val kontantstøtteFraAnnetEøsland: Søknadsfelt<String>,
    val harBarnehageplass: Søknadsfelt<String>,
    val andreForelderErDød: Søknadsfelt<String>?,
    // Om barnet - oppfølgningsspørsmål fra "om barna"
    val utbetaltForeldrepengerEllerEngangsstønad: Søknadsfelt<String>?,
    val mottarEllerMottokEøsKontantstøtte: Søknadsfelt<String>?,
    val pågåendeSøknadFraAnnetEøsLand: Søknadsfelt<String>?,
    val pågåendeSøknadHvilketLand: Søknadsfelt<String>?,
    val planleggerÅBoINorge12Mnd: Søknadsfelt<String>?,
    val eøsKontantstøttePerioder: List<Søknadsfelt<KontantstøttePeriode>> = listOf(),
    val barnehageplassPerioder: List<Søknadsfelt<BarnehageplassPeriode>> = listOf(),
    // Om barnet
    val borFastMedSøker: Søknadsfelt<String>,
    val foreldreBorSammen: Søknadsfelt<String>?,
    val søkerDeltKontantstøtte: Søknadsfelt<String>?,
    val andreForelder: AndreForelder?,
    val utenlandsperioder: List<Søknadsfelt<Utenlandsopphold>> = listOf(),
    // EØS
    val søkersSlektsforhold: Søknadsfelt<String>?,
    val søkersSlektsforholdSpesifisering: Søknadsfelt<String>?,
    val borMedAndreForelder: Søknadsfelt<String>?,
    val borMedOmsorgsperson: Søknadsfelt<String>?,
    val adresse: Søknadsfelt<String>?,
    val omsorgsperson: Omsorgsperson?,
    val idNummer: List<Søknadsfelt<IdNummer>> = listOf(),
) : BaksSøknadPersonBase

@Deprecated("Bruk v4", replaceWith = ReplaceWith("no.nav.familie.kontrakter.ks.søknad.v4.AndreForelder"))
data class AndreForelder(
    val kanIkkeGiOpplysninger: Søknadsfelt<String>,
    val navn: Søknadsfelt<String>?,
    val fnr: Søknadsfelt<String>?,
    val fødselsdato: Søknadsfelt<String>?,
    val yrkesaktivFemÅr: Søknadsfelt<String>?,
    val pensjonUtland: Søknadsfelt<String>?,
    val arbeidUtlandet: Søknadsfelt<String>?,
    // EØS
    val pensjonNorge: Søknadsfelt<String>?,
    val arbeidNorge: Søknadsfelt<String>?,
    val andreUtbetalinger: Søknadsfelt<String>?,
    val kontantstøtteFraEøs: Søknadsfelt<String>?,
    val arbeidsperioderUtland: List<Søknadsfelt<Arbeidsperiode>> = listOf(),
    val pensjonsperioderUtland: List<Søknadsfelt<Pensjonsperiode>> = listOf(),
    val arbeidsperioderNorge: List<Søknadsfelt<Arbeidsperiode>> = listOf(),
    val pensjonsperioderNorge: List<Søknadsfelt<Pensjonsperiode>> = listOf(),
    val pågåendeSøknadFraAnnetEøsLand: Søknadsfelt<String>?,
    val pågåendeSøknadHvilketLand: Søknadsfelt<String>?,
    val eøsKontantstøttePerioder: List<Søknadsfelt<KontantstøttePeriode>> = listOf(),
    val andreUtbetalingsperioder: List<Søknadsfelt<Utbetalingsperiode>> = listOf(),
    val idNummer: List<Søknadsfelt<IdNummer>> = listOf(),
    val adresse: Søknadsfelt<String>?,
)
