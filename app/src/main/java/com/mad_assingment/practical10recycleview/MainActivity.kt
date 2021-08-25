package com.mad_assingment.practical10recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.mad_assingment.practical10recycleview.data.MyAdapter
import com.mad_assingment.practical10recycleview.data.Product

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productList = listOf<Product>(
            Product("Pen", 12.50, R.drawable.ic_baseline_account_box_24),
            Product("computer", 3332.50, R.drawable.ic_baseline_account_circle_24),
            Product("ismail", 29.50, R.drawable.ic_baseline_account_box_24),
            Product("chicken wing", 8.50, R.drawable.ic_baseline_account_circle_24),
            Product("anwar", 9.50, R.drawable.ic_baseline_account_box_24),
            Product("superboy", 20.50, R.drawable.ic_baseline_account_circle_24),
        )
        val recyclerView = findViewById<RecyclerView>(R.id.productRecycleView)
        recyclerView.adapter = MyAdapter(productList)
        recyclerView.setHasFixedSize(true)

    }
}