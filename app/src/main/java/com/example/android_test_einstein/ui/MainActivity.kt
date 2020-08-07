package com.example.android_test_einstein.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_test_einstein.R
import com.example.android_test_einstein.models.Categorys
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),CategoryAdapter.OnItemClickListener {
    val categoryList = generateDummyList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.adapter = CategoryAdapter(categoryList,this)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }
    override fun onItemClick(position: Int) {
        Toast.makeText(this, "Item $position. clicked ${categoryList.get(0).text1}", Toast.LENGTH_SHORT).show()
        val clickedItem = categoryList[position]
//        clickedItem.text1 = "Clicked"
//        adapter.notifyItemChanged(position)
    }

    private fun generateDummyList(): List<Categorys> {

        val list = ArrayList<Categorys>()
        list.add(Categorys(R.drawable.ic_animal_foreground, "animal" ))
        list.add(Categorys(R.drawable.ic_career_foreground, "career" ))
        list.add(Categorys(R.drawable.ic_celebrity_foreground, "celebrity" ))
        list.add(Categorys(R.drawable.ic_bug_foreground, "dev" ))
        list.add(Categorys(R.drawable.ic_explicit_foreground, "explicit" ))
        list.add(Categorys(R.drawable.ic_fashion_foreground, "fashion" ))
        list.add(Categorys(R.drawable.ic_food_foreground, "food" ))
        list.add(Categorys(R.drawable.ic_history_foreground, "history" ))
        list.add(Categorys(R.drawable.ic_money_foreground, "money" ))
        list.add(Categorys(R.drawable.ic_movie_foreground, "movie" ))
        list.add(Categorys(R.drawable.ic_music_foreground, "music" ))
        list.add(Categorys(R.drawable.ic_political_foreground, "political" ))
        list.add(Categorys(R.drawable.ic_religion_foreground, "religion" ))
        list.add(Categorys(R.drawable.ic_science_foreground, "science" ))
        list.add(Categorys(R.drawable.ic_sports_foreground, "sport" ))
        list.add(Categorys(R.drawable.ic_travel_foreground, "travel" ))
        return list
    }


}