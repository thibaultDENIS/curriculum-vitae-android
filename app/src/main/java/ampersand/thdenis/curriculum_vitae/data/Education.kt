package ampersand.thdenis.curriculum_vitae.data

import ampersand.thdenis.curriculum_vitae.R.string.*

data class Education(
    val date: Int,
    val diploma: Int,
    val location: Int,
    val description: Int
)

object EducationList {
    val list = listOf(
        Education(
            date = education_date_19_20,
            diploma = education_diploma_qc,
            location = education_location_qc,
            description = education_description_qc
        ),
        Education(
            date = education_date_16_19,
            diploma = education_diploma_polytech,
            location = education_location_polytech,
            description = education_description_polytech
        ),
        Education(
            date = education_date_14_16,
            diploma = education_diploma_dut,
            location = education_location_dut,
            description = education_description_dut
        ),
        Education(
            date = education_date_14,
            diploma = education_diploma_bac,
            location = education_location_bac,
            description = education_description_bac
        )
    )
}