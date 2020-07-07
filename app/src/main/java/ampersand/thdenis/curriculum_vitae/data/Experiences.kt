package ampersand.thdenis.curriculum_vitae.data

import ampersand.thdenis.curriculum_vitae.R.string.*

data class Experiences(
    val company: Int,
    val poste: Int,
    val duration: Int,
    val description: Int
)

object ExperiencesList {
    val list = listOf(
        Experiences(
            company = experience_company_shopmium,
            poste = experience_poste_shopmium,
            duration = experience_duration_shopmium,
            description = experience_description_shopmium
        ),
        Experiences(
            company = experience_company_atos2,
            poste = experience_poste_atos2,
            duration = experience_duration_atos2,
            description = experience_description_atos2
        ),
        Experiences(
            company = experience_company_mcdo,
            poste = experience_poste_mcdo,
            duration = experience_duration_mcdo,
            description = experience_description_mcdo
        ),
        Experiences(
            company = experience_company_atos2,
            poste = experience_poste_atos,
            duration = experience_duration_atos,
            description = experience_description_atos
        ),
        Experiences(
            company = experience_company_skf,
            poste = experience_poste_skf,
            duration = experience_duration_skf,
            description = experience_description_skf
        )
    )
}