package com.worker8.autoadapter.rows

import android.view.View
import com.worker8.auto.adapter.library.BaseRow
import com.worker8.auto.adapter.library.NoAutoData
import com.worker8.autoadapter.R
import kotlinx.android.synthetic.main.header_row.view.*

class HeaderRow(private val title: String) :
    BaseRow<NoAutoData>(NoAutoData(), R.layout.header_row) {
    override fun bind(itemView: View) {
        itemView.headerText.text = title
    }
}