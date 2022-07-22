package com.danialtavakoli.wikipedia.adapter

import com.danialtavakoli.wikipedia.data.ItemPost

interface ItemEvents {

    fun onItemClicked(itemPost: ItemPost)

}