package com.worker8.autoadapter.rows

import android.view.View
import com.bumptech.glide.Glide
import com.worker8.auto.adapter.library.BaseRow
import com.worker8.auto.adapter.library.NoAutoData
import com.worker8.autoadapter.R
import kotlinx.android.synthetic.main.image_row.view.*

class ImageRow() :
    BaseRow<NoAutoData>(NoAutoData(), R.layout.image_row) {
    override fun bind(itemView: View) {
        Glide.with(itemView.context)
            .load("https://i.imgur.com/55cN4iAh.png")
            .centerCrop()
            .into(itemView.image)
    }
}