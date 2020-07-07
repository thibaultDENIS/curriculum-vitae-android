package ampersand.thdenis.curriculum_vitae.data

import ampersand.thdenis.curriculum_vitae.education.EducationsFragment
import ampersand.thdenis.curriculum_vitae.home.HomeFragment
import ampersand.thdenis.curriculum_vitae.skills.KnowledgeFragment
import ampersand.thdenis.curriculum_vitae.R
import androidx.fragment.app.Fragment

enum class PageType(index: Int) {
    HOME(0), SKILLS(1), EDUCATION(2), EXPERIENCE(3), PROJECT(4);

    val fragment: Fragment
        get() {
            return when (this) {
                HOME -> HomeFragment.newInstance()
                SKILLS -> KnowledgeFragment.newInstance()
                EDUCATION -> EducationsFragment.newInstance()
                /*EXPERIENCE -> OrganismListFragment.newInstance()
                PROJECT -> OrganismListFragment.newInstance()
            */else -> HomeFragment.newInstance()
            }
        }

    val title: Int
        get() {
            return when (this) {
                HOME -> R.string.menu_title_home
                SKILLS -> R.string.menu_title_skills // ENLEVER LES STRINGS EN DUR
                EDUCATION -> R.string.menu_title_education
                /*EXPERIENCE -> OrganismListFragment.newInstance()
                PROJECT -> OrganismListFragment.newInstance()
            */else -> R.string.menu_title_home
            }
        }
}