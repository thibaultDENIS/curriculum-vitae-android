package ampersand.thdenis.curriculum_vitae.skills

import ampersand.thdenis.curriculum_vitae.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class KnowledgeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_skills, container, false)
    }

    companion object {
        fun newInstance() =
            KnowledgeFragment()
    }
}