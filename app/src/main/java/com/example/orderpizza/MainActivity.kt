package com.example.orderpizza

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Список пицц
        val pizzas = listOf(
            Pizza("Margherita", R.drawable.margherita),
            Pizza("Pepperoni", R.drawable.pepperoni),
            Pizza("Hawaiian", R.drawable.hawaiian)
        )

        // Настройка ListView
       /* val pizzaListView: ListView = findViewById(R.id.pizzaListView)

        // Перед настройкой убедитесь, что данные не пустые
        if (pizzas.isNotEmpty()) {
            pizzaListView.adapter = PizzaAdapter(this, pizzas)

            // Обработка нажатия на элемент списка
            pizzaListView.setOnItemClickListener { _, _, position, _ ->
                val selectedPizza = pizzas[position]
                val intent = Intent(this, SizeToppingsActivity::class.java)
                intent.putExtra("selectedPizza", selectedPizza)
                startActivity(intent)
            }
        }*/
    }
}
