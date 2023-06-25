package ok.okara.wikipedia_demo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import jp.wasabeef.glide.transformations.RoundedCornersTransformation
import ok.okara.wikipedia_demo.dataClasses.ItemPosts
import ok.okara.wikipedia_demo.databinding.ItemTrendsBinding

class TrendsAdapter(private val data: ArrayList<ItemPosts>) :
    RecyclerView.Adapter<TrendsAdapter.TrendsViewHolder>() {
    private lateinit var binding: ItemTrendsBinding

    inner class TrendsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindViews(itemPosts: ItemPosts){
            Glide.with(itemView.context)
                .load(itemPosts.imgUrl)
                .into(binding.itemTrendsImg)


            binding.itemTrendsTitle.text = itemPosts.txtTitle
            binding.itemTrendsSubtitle.text = itemPosts.txtSubtitle
            binding.itemTrendsInsight.text = itemPosts.insight

            binding.itemTrendsItemNum.text = (adapterPosition + 1).toString()


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendsViewHolder {
        binding = ItemTrendsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TrendsViewHolder(binding.root)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: TrendsViewHolder, position: Int) {
        holder.bindViews(data[position])
    }
}