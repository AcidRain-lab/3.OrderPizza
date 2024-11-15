package com.example.orderpizza

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SizeToppingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_size_toppings)

        // Получение выбранной пиццы
        val selectedPizza = intent.getSerializableExtra("selectedPizza") as Pizza

        val selectedPizzaTextView: TextView = findViewById(R.id.selectedPizzaTextView)
        selectedPizzaTextView.text = "You selected: ${selectedPizza.name}"
    }
}
