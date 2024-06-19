package br.com.appburgues.presenter.burguers

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.appburgues.databinding.BurguerItemBinding
import br.com.appburgues.domain.model.Burger
import br.com.appburgues.util.formattedValue
import com.squareup.picasso.Picasso

class BurgersAdapter(
    context: Context,
    private val burguers: List<Burger>,
    private val burguerClick: (Int) -> Unit
) : RecyclerView.Adapter<BurgersAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       return MyViewHolder(
           BurguerItemBinding.inflate(
               LayoutInflater.from(parent.context),
               parent,
               false
           )
       )
    }

    override fun getItemCount() = burguers.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       val burger = burguers[position]

        holder.binding.textName.text = burger.name
        holder.binding.textDescription.text = burger.name
        holder.binding.textPrice.text = burger.price?.formattedValue()

        Picasso.get()
            .load(burger.images?.get(1)?.lg)
            .into(holder.binding.imgBurguer)
        holder.itemView.setOnClickListener {
            burguerClick(burger.id ?: -1)
        }
    }

    inner class MyViewHolder (val binding: BurguerItemBinding) : RecyclerView.ViewHolder(binding.root)


}