package ampersand.thdenis.curriculum_vitae.data

import ampersand.thdenis.curriculum_vitae.HomeFragment
import ampersand.thdenis.curriculum_vitae.KnowledgeFragment
import ampersand.thdenis.curriculum_vitae.R
import androidx.fragment.app.Fragment

enum class PageType(index: Int) {
    HOME(0), KNOWLEDGE(1), EDUCATION(2), EXPERIENCE(3), PROJECT(4);

    val fragment: Fragment
        get() {
            return when (this) {
                HOME -> HomeFragment.newInstance()
                KNOWLEDGE -> KnowledgeFragment.newInstance()
                /*EDUCATION -> OrganismListFragment.newInstance()
                EXPERIENCE -> OrganismListFragment.newInstance()
                PROJECT -> OrganismListFragment.newInstance()
            */else -> HomeFragment.newInstance()
            }
        }

    val title: Int
        get() {
            return when (this) {
                HOME -> R.string.menu_title_home
                KNOWLEDGE -> R.string.menu_title_knowledge // ENLEVER LES STRINGS EN DUR
                /*EDUCATION -> OrganismListFragment.newInstance()
                EXPERIENCE -> OrganismListFragment.newInstance()
                PROJECT -> OrganismListFragment.newInstance()
            */else -> R.string.menu_title_home
            }
        }
}