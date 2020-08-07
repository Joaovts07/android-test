package com.example.android_test_einstein.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_test_einstein.R
import com.example.android_test_einstein.models.Categorys
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val exampleList = generateDummyList()
        recycler_view.adapter = CategoryAdapter(exampleList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }

    private fun generateDummyList(): List<Categorys> {

        val list = ArrayList<Categorys>()
        list.add(Categorys(R.drawable.ic_android_foreground, "animal" ))
        list.add(Categorys(R.drawable.ic_android_foreground, "career" ))
        list.add(Categorys(R.drawable.ic_android_foreground, "celebrity" ))
        list.add(Categorys(R.drawable.ic_android_foreground, "dev" ))
        list.add(Categorys(R.drawable.ic_android_foreground, "explicit" ))
        list.add(Categorys(R.drawable.ic_android_foreground, "fashion" ))
        list.add(Categorys(R.drawable.ic_android_foreground, "food" ))
        list.add(Categorys(R.drawable.ic_android_foreground, "history" ))
        list.add(Categorys(R.drawable.ic_android_foreground, "money" ))
        list.add(Categorys(R.drawable.ic_android_foreground, "movie" ))
        list.add(Categorys(R.drawable.ic_android_foreground, "music" ))
        list.add(Categorys(R.drawable.ic_android_foreground, "political" ))
        list.add(Categorys(R.drawable.ic_android_foreground, "religion" ))
        list.add(Categorys(R.drawable.ic_android_foreground, "science" ))
        list.add(Categorys(R.drawable.ic_android_foreground, "sport" ))
        list.add(Categorys(R.drawable.ic_android_foreground, "travel" ))
        return list
    }
}