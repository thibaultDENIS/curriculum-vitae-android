package ampersand.thdenis.curriculum_vitae.main

import ampersand.thdenis.curriculum_vitae.R
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        configureViewPager()
    }

    private fun configureViewPager() {
        // 1 - Get ViewPager from layout
        val pager = findViewById<ViewPager>(R.id.activity_main_viewpager)
        // 2 - Set Adapter PageAdapter and glue it together
        pager.adapter = PageAdapter(
            this,
            supportFragmentManager
        )
        val layoutParams = tab_layout.layoutParams as ViewPager.LayoutParams
        layoutParams.width = LinearLayout.LayoutParams.WRAP_CONTENT
        tab_layout.layoutParams = layoutParams
    }
}
