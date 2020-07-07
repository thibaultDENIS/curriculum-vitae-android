package ampersand.thdenis.curriculum_vitae.home

import ampersand.thdenis.curriculum_vitae.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_principal.*


class HomeFragment : Fragment() {

    private lateinit var presenter: HomePresenter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val result: View = inflater.inflate(R.layout.fragment_principal, container, false)
        presenter =
            HomePresenter(context)
        return result
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        init()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun init() {
        email_textView.setOnClickListener {
            presenter.copyThat(email_textView)
        }
        email_imageView.setOnClickListener {
            presenter.copyThat(email_textView)
        }
        copy_email_address_imageView.setOnClickListener {
            presenter.copyThat(email_textView)
        }
        phone_imageView.setOnClickListener {
            presenter.copyThat(phone_textView)
        }
        phone_textView.setOnClickListener {
            presenter.copyThat(phone_textView)
        }
        copy_phone_number_imageView.setOnClickListener {
            presenter.copyThat(phone_textView)
        }
    }

    companion object {
        fun newInstance() =
            HomeFragment()
    }
}