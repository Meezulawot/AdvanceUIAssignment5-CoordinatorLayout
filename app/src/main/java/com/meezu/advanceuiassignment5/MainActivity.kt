package com.meezu.advanceuiassignment5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


//        scroll|enterAlways - When we scroll up the collapsed view becomes visible irrespective of
//        current position and when we scroll down the appbar (or the image view ) is shown first
//        then the collapsed view continues to scroll down
//        setContentView(R.layout.activity_main)

//        scroll|enterAlwaysCollapsed - When we scroll up the view is visible and when we scroll down
//        the collapsed view continues to scroll down just like any other scrollview which means the
//        collapsed view (text view)scrolls down first completely then only the appbar expands.
//        setContentView(R.layout.activity_layout1)

//        scroll|snap - Unlike others it scrolls based on the visibility of the view meaning while
//        scrolling if the visibility of the view(toolbar) is more than 50% then the view will show
//        itself and if it is less than 50% the view will hide.
//        setContentView(R.layout.activity_layout2)

//        scroll|exitUntilCollapsed - When we scroll up the view(toolbar) contracts and sticks at the
//        top  and when we scroll down the  collapsed view i.e textview is displayed first and only after
//        collapsed view  is completed the contracted sticky toolbar expands
//        setContentView(R.layout.activity_layout3)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar_layout.title = title
    }
}