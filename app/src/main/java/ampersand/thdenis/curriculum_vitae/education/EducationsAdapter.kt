package ampersand.thdenis.curriculum_vitae.education

import ampersand.thdenis.curriculum_vitae.data.Education
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class EducationsAdapter(private val context: Context, private val list: List<Education>) :
    RecyclerView.Adapter<EducationsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EducationsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return EducationsViewHolder(
            context,
            inflater,
            parent
        )
    }

    override fun onBindViewHolder(holder: EducationsViewHolder, position: Int) {
        val education: Education = list[position]
        holder.bind(education)
    }

    override fun getItemCount(): Int = list.size

}