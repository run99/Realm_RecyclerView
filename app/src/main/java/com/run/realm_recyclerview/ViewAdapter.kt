package com.run.realm_recyclerview

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.SimpleAdapter
import androidx.databinding.DataBindingUtil
import androidx.databinding.adapters.ViewBindingAdapter
import androidx.recyclerview.widget.RecyclerView
import io.realm.OrderedRealmCollection
import io.realm.RealmRecyclerViewAdapter

class ViewAdapter(private val context: Context, private val collection: OrderedRealmCollection<Person>?, private val autoUpdate: Boolean)
    : RealmRecyclerViewAdapter<Person, ViewAdapter.CustomViewHolder>(collection, autoUpdate) {

    override fun getItemCount(): Int {
        return collection?.size ?: 0
    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): CustomViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return CustomViewHolder(DataBindingUtil.bind(view)!!)
    }

    override fun onBindViewHolder(viewHolder: CustomViewHolder, position: Int) {
        val person = collection?.get(position)
        viewHolder.binding.cellName.text = person?.name
        viewHolder.binding.cellAge.text = person?.age.toString()
        viewHolder.binding.cellGender.text = person?.gender
        viewHolder.binding.cellLayout.setBackgroundColor(if (position % 2 == 0) Color.LTGRAY else Color.WHITE)
    }

    class CustomViewHolder{val binding: ViewCellBinding): RecyclerView.ViewHolder(binding.root)

