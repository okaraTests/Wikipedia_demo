package ok.okara.wikipedia_demo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ok.okara.wikipedia_demo.dataClasses.ItemPosts
import ok.okara.wikipedia_demo.databinding.ItemExploreBinding

class ExploreAdapter(private val data: ArrayList<ItemPosts>) :
    RecyclerView.Adapter<ExploreAdapter.ExploreViewHolder>() {
    private lateinit var binding: ItemExploreBinding

    inner class ExploreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindViews(itemPosts: ItemPosts){
            val glide = Glide.with(itemView.context)
                .load(itemPosts.imgUrl)
                .into(binding.exploreItemImg)


            binding.txtExploreTitle.text = itemPosts.txtTitle
            binding.txtExploreShortDescription.text = itemPosts.txtSubtitle
            binding.txtExploreDetail.text = itemPosts.txtDetails

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExploreViewHolder {
        binding = ItemExploreBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ExploreViewHolder(binding.root)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ExploreViewHolder, position: Int) {
        holder.bindViews(data[position])
    }
}