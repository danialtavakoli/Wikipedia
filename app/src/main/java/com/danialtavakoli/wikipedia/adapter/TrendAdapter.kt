package com.danialtavakoli.wikipedia.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.danialtavakoli.wikipedia.data.ItemPost
import com.danialtavakoli.wikipedia.databinding.ItemTrendBinding
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

class TrendAdapter(private val data: ArrayList<ItemPost>, private val itemEvents: ItemEvents) :
    RecyclerView.Adapter<TrendAdapter.TrendViewHolder>() {

    private lateinit var binding: ItemTrendBinding

    inner class TrendViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindViews(itemPost: ItemPost) {
            Glide.with(binding.root).load(itemPost.imgUrl)
                .transform(RoundedCornersTransformation(32, 8)).into(binding.imgTrendMain)
            binding.txtTrendTitle.text = itemPost.txtTitle
            binding.txtTrendSubtitle.text = itemPost.txtSubtitle
            binding.txtTrendInsight.text = itemPost.insight
            binding.txtTrendNumber.text = adapterPosition.plus(1).toString()
            itemView.setOnClickListener { itemEvents.onItemClicked(itemPost) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendViewHolder {
        binding = ItemTrendBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TrendViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: TrendViewHolder, position: Int) {
        holder.bindViews(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

}