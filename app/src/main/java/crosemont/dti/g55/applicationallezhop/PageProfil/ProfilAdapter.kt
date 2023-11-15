package crosemont.dti.g55.applicationallezhop.PageProfil

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import crosemont.dti.g55.applicationallezhop.Modèle.Trajet
import crosemont.dti.g55.applicationallezhop.R

class ProfilAdapter(private val data: List<Trajet>) : RecyclerView.Adapter<ProfilAdapter.ProfilViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfilViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_trajet, parent, false)
        return ProfilViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProfilViewHolder, position: Int) {
        val trajet = data[position]
        holder.bind(trajet)
    }

    override fun getItemCount(): Int = data.size

    class ProfilViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val dateTextView: TextView = itemView.findViewById(R.id.dateTextView)
        private val destinationTextView: TextView = itemView.findViewById(R.id.destinationTextView)
        private val conducteurTextView: TextView = itemView.findViewById(R.id.conducteurTextView)

        fun bind(trajet: Trajet) {
            dateTextView.text = trajet.date
            destinationTextView.text = trajet.destination
            conducteurTextView.text = trajet.conducteur
        }
    }
}
