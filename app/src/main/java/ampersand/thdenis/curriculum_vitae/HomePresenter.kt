package ampersand.thdenis.curriculum_vitae

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.TextView
import android.widget.Toast

class HomePresenter(private val context: Context?) {

    fun copyThat(textView: TextView) {
        val clipboard: ClipboardManager =
            context?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText("", textView.text.toString())
        clipboard.setPrimaryClip(clip)
        Toast.makeText(
            context,
            "Le texte : ${textView.text} a bien été copié",
            Toast.LENGTH_SHORT
        ).show()
    }
}