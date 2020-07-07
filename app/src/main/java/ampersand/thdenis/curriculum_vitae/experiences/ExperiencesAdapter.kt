package ampersand.thdenis.curriculum_vitae.experiences

import ampersand.thdenis.curriculum_vitae.data.Experiences
import ampersand.thdenis.curriculum_vitae.experiences.ExperiencesViewHolder
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ExperiencesAdapter(private val context: Context, private val list: List<Experiences>) :
    RecyclerView.Adapter<ExperiencesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExperiencesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ExperiencesViewHolder(
            context,
            inflater,
            parent
        )
    }

    override fun onBindViewHolder(holder: ExperiencesViewHolder, position: Int) {
        val experiences: Experiences = list[position]
        holder.bind(experiences)
    }

    override fun getItemCount(): Int = list.size

}