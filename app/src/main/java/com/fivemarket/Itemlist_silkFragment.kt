package com.fivemarket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.fivemarket.databinding.FragmentItemlistSilkBinding


class Itemlist_silkFragment : Fragment() {

    var binding: FragmentItemlistSilkBinding? = null

    private val itemViewModel by activityViewModels<ItemViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val items: ArrayList<Items> = itemViewModel.items_silk
        binding = FragmentItemlistSilkBinding.inflate(layoutInflater)
        binding?.recItemsSilk?.layoutManager = LinearLayoutManager(context)
        binding?.recItemsSilk?.adapter = ItemsAdapter(items)
        return binding?.root
    }


}