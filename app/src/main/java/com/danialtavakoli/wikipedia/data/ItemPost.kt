package com.danialtavakoli.wikipedia.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ItemPost(
    val imgUrl: String,
    val txtTitle: String,
    val txtSubtitle: String,
    val txtDetail: String,

    //for trend fragment:
    val isTrend: Boolean,
    val insight: String
) : Parcelable