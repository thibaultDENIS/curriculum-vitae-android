package ampersand.thdenis.curriculum_vitae

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter()
        init()
    }

    private fun init() {
        email_textView.setOnClickListener {
            presenter.copyThat(this, email_textView)
        }
        email_imageView.setOnClickListener {
            presenter.copyThat(this, email_textView)
        }
        copy_email_address_imageView.setOnClickListener {
            presenter.copyThat(this, email_textView)
        }
        phone_imageView.setOnClickListener {
            presenter.copyThat(this, phone_textView)
        }
        phone_textView.setOnClickListener {
            presenter.copyThat(this, phone_textView)
        }
        copy_phone_number_imageView.setOnClickListener {
            presenter.copyThat(this, phone_textView)
        }
    }
}
