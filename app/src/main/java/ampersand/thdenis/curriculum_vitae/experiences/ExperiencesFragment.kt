package ampersand.thdenis.curriculum_vitae.experiences

import ampersand.thdenis.curriculum_vitae.R
import ampersand.thdenis.curriculum_vitae.data.ExperiencesList
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_experience.*

class ExperiencesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_experience, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        init()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun init() {

        val viewManager = LinearLayoutManager(context)
        val viewAdapter =
            ExperiencesAdapter(
                requireContext(),
                ExperiencesList.list
            )

        experience_recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }

    companion object {
        fun newInstance() =
            ExperiencesFragment()
    }
}