package ampersand.thdenis.curriculum_vitae.education

import ampersand.thdenis.curriculum_vitae.R
import ampersand.thdenis.curriculum_vitae.data.Education
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EducationsViewHolder(
    private val context: Context,
    inflater: LayoutInflater,
    parent: ViewGroup
) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_education, parent, false)) {
    private var date: TextView? = null
    private var university: TextView? = null
    private var location: TextView? = null
    private var description: TextView? = null

    init {
        date = itemView.findViewById(R.id.company_textView)
        university = itemView.findViewById(R.id.poste_textView)
        location = itemView.findViewById(R.id.duration_textView)
        description = itemView.findViewById(R.id.description_textView)
    }

    fun bind(education: Education) {
        date?.text = context.getString(education.date)
        university?.text = context.getString(education.diploma)
        location?.text = context.getString(education.location)
        description?.text = context.getString(education.description)
    }
}