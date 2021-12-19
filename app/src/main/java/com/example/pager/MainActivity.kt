package com.example.pager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {


    private lateinit var tabBar: TabLayout
    private lateinit var viewPager: ViewPager2
    private lateinit var viewPagerFragmentAdapter: ViewPagerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        tabBar = findViewById(R.id.TabLayout)
        viewPager = findViewById(R.id.viewPager2)


        viewPagerFragmentAdapter = ViewPagerAdapter(this)


        viewPager.adapter = viewPagerFragmentAdapter


        TabLayoutMediator(tabBar,viewPager){tab,position->


            when(position){

                0-> tab.text = "1"
                1-> tab.text = "2"
                2-> tab.text = "3"
            }

        }.attach()


    }
}