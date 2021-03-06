package com.worker8.autoadapter.rows

import android.view.View
import com.worker8.auto.adapter.library.AutoAdapter
import com.worker8.auto.adapter.library.BaseRow
import com.worker8.autoadapter.R
import kotlinx.android.synthetic.main.horizontal_list.view.*

class HorizontalListRow(override val data: ColumnList) :
    BaseRow<ColumnList>(data, R.layout.horizontal_list) {
    override fun bind(itemView: View) {
        val adapter = AutoAdapter()
        itemView.horizontalRecyclerView.adapter = adapter
        val list = data.list.map { item ->
            Column(item)
        }
        adapter.submitList(list)
    }
}