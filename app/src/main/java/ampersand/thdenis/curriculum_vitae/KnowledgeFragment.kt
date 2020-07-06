package ampersand.thdenis.curriculum_vitae

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class KnowledgeFragment(private val position: Int) : Fragment() {

    private lateinit var presenter: KnowledgePresenter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val result: View = inflater.inflate(R.layout.fragment_about, container, false)
        presenter = KnowledgePresenter()
        return result
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        init()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun init() {
    }

    companion object {
        fun newInstance() = KnowledgeFragment(0)
    }
}