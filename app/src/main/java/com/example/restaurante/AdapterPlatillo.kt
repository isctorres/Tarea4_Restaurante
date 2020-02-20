package com.example.restaurante

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.layout_tarjeta.view.*

class AdapterPlatillo(var list:ArrayList<Platillo>): RecyclerView.Adapter<AdapterPlatillo.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v= LayoutInflater.from(parent?.context).inflate(R.layout.layout_tarjeta,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(list[position])
   }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bindItem(data:Platillo){
            itemView.txtPlatillo.text = data.platillo
            Glide.with(itemView.context).load(data.imagen).into(itemView.imvPlatillo)
            itemView.imvMore.setOnClickListener{
                val intDetalle = Intent(itemView.context,DetallePlatillo::class.java)
                intDetalle.putExtra("PLATILLO",data.platillo)
                intDetalle.putExtra("DETALLE",data.descripcion)
                intDetalle.putExtra("IMAGEN",data.imagen)
                itemView.context.startActivity(intDetalle)
            }
        }
    }
}