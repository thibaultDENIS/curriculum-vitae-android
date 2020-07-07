package ampersand.thdenis.curriculum_vitae.experiences

import ampersand.thdenis.curriculum_vitae.R
import ampersand.thdenis.curriculum_vitae.data.Education
import ampersand.thdenis.curriculum_vitae.data.Experiences
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExperiencesViewHolder(
    private val context: Context,
    inflater: LayoutInflater,
    parent: ViewGroup
) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_experiences, parent, false)) {
    private var duration: TextView? = null
    private var company: TextView? = null
    private var poste: TextView? = null
    private var description: TextView? = null

    init {
        duration = itemView.findViewById(R.id.duration_textView)
        company = itemView.findViewById(R.id.company_textView)
        poste = itemView.findViewById(R.id.poste_textView)
        description = itemView.findViewById(R.id.description_textView)
    }

    fun bind(experiences: Experiences) {
        duration?.text = context.getString(experiences.duration)
        company?.text = context.getString(experiences.company)
        poste?.text = context.getString(experiences.poste)
        description?.text = context.getString(experiences.description)
    }
}