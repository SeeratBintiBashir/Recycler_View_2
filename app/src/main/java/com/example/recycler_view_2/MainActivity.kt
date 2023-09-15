package com.example.recycler_view_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var phoneDetails: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        phoneDetails = findViewById(R.id.phoneDetails)

        val detailsObjects = mutableListOf<Details>()
        detailsObjects.add(Details("Seerat", "0987654321"))
        detailsObjects.add(Details("Fatimah", "2314567890"))
        detailsObjects.add(Details("Ruqia", "9807654321"))
        detailsObjects.add(Details("Aayeena", "7654321890"))
        detailsObjects.add(Details("Azra", "0986754231"))
        detailsObjects.add(Details("Aliyah", "2134576890 "))
        detailsObjects.add(Details("Muskan", "6543217890"))
        detailsObjects.add(Details("Tabeena", "0985672341"))
        detailsObjects.add(Details("Haya", "67543210987"))
        detailsObjects.add(Details("Bazilah","9876541230"))
        detailsObjects.add(Details("Daifah", "7654321890"))
        detailsObjects.add(Details("Shayesta", "7634521890"))
        detailsObjects.add(Details("Farhat", "5674321890"))
        detailsObjects.add(Details("Farzana", "7654123890"))

        phoneDetails.adapter = Adapter(detailsObjects)
        phoneDetails.layoutManager = LinearLayoutManager(this)
    }
}