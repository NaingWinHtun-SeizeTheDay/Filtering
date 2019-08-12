package com.seizetheday.filtering

import android.os.Bundle
import android.view.Menu
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.seizetheday.filtering.adapters.ItemAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var items: MutableList<String> = ArrayList()
    var displayItem: MutableList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()

        rv_main.layoutManager = LinearLayoutManager(this)
        rv_main.adapter = ItemAdapter(displayItem)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)

        val searchItem = menu?.findItem(R.id.search)

        if (searchItem != null) {

            val searchView = searchItem.actionView as SearchView
            searchView.queryHint = "Search Here"

            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String?): Boolean {
                    return true
                }

                override fun onQueryTextChange(newText: String?): Boolean {
                    if (newText!!.isNotEmpty()) {
                        displayItem.clear()
                        val search = newText.toLowerCase()
                        items.forEach {
                            if (it.toLowerCase().contains(search)) {
                                displayItem.add(it)
                            }
                        }
                        rv_main.adapter?.notifyDataSetChanged()
                    } else {
                        displayItem.clear()
                        displayItem.addAll(items)
                        rv_main.adapter?.notifyDataSetChanged()
                    }
                    return true
                }

            })
        }

        return super.onCreateOptionsMenu(menu)
    }

    fun loadData() {
        items.add("One")
        items.add("Two")
        items.add("Three")
        items.add("Four")
        items.add("Five")
        items.add("Six")
        items.add("Seven")
        items.add("Eight")
        items.add("Nine")
        items.add("Ten")
        items.add("Eleven")
        items.add("Twelve")
        items.add("Thirteen")
        items.add("Fourteen")
        items.add("Fifteen")
        items.add("Sixteen")
        items.add("Seventeen")
        items.add("Eighteen")
        items.add("Nineteen")
        items.add("Twenty")
        items.add("TwentyOne")
        items.add("TwentyTwo")
        items.add("TwentyThree")
        items.add("TwentyFour")
        items.add("TwentyFive")
        items.add("TwentySix")
        displayItem.addAll(items)
    }
}