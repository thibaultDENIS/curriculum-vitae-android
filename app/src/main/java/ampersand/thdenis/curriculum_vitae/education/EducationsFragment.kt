package ampersand.thdenis.curriculum_vitae.education

import ampersand.thdenis.curriculum_vitae.R
import ampersand.thdenis.curriculum_vitae.data.EducationList
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_educations.*

class EducationsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_educations, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        init()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun init() {

        val viewManager = LinearLayoutManager(context)
        val viewAdapter =
            EducationsAdapter(
                requireContext(),
                EducationList.list
            )

        education_recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }

    companion object {
        fun newInstance() =
            EducationsFragment()
    }
}