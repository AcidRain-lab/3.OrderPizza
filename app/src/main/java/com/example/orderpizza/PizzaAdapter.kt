package com.example.orderpizza

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.BaseAdapter

class PizzaAdapter(
    private val context: Context,
    private val pizzas: List<Pizza>
) : BaseAdapter() {

    override fun getCount(): Int = pizzas.size

    override fun getItem(position: Int): Any = pizzas[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.pizza_list_item, parent, false)

        val pizzaName = view.findViewById<TextView>(R.id.pizzaName)
        val pizzaImage = view.findViewById<ImageView>(R.id.pizzaImage)

        val pizza = pizzas[position]
        pizzaName.text = pizza.name
        pizzaImage.setImageResource(pizza.imageResId)

        return view
    }
}
