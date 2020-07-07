package ampersand.thdenis.curriculum_vitae.main

import android.content.Context
import ampersand.thdenis.curriculum_vitae.data.PageType
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

open class PageAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val typeList = listOf(PageType.HOME, PageType.SKILLS, PageType.EDUCATION, PageType.EXPERIENCE, PageType.PROJECT)

    override fun getItem(position: Int): Fragment {
        return typeList[position].fragment
    }

    override fun getCount(): Int = typeList.size

    override fun getPageTitle(position: Int): CharSequence? {
        return context.getString(typeList[position].title)
    }
}