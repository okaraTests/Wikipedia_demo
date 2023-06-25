package ok.okara.wikipedia_demo.dataClasses

import android.telecom.Call.Details

data class ItemPosts(
    val imgUrl: String,
    val txtTitle: String,
    val txtSubtitle: String,
    val txtDetails: String,


    val isTrend: Boolean,
    val insight: String
)
