package com.example.homeworkfour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.homeworkfour.adapter.ShoeAdapter
import com.example.homeworkfour.model.Shoe
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var shoeArray=ArrayList<Shoe>()
        shoeArray.add(Shoe("Nike","$449",R.drawable.nike))
        shoeArray.add(Shoe("Adidas","$67",R.drawable.adidas))
        shoeArray.add(Shoe("Lacoste","$320",R.drawable.lacoste))
        shoeArray.add(Shoe("Mango","$105",R.drawable.mango))
        shoeArray.add(Shoe("Yellow Mango","$100",R.drawable.mangoyellow))
        shoeArray.add(Shoe("Puma","$500",R.drawable.puma))
        var shoeAdapter=ShoeAdapter(shoeArray)
        recyclerView.layoutManager=GridLayoutManager(this,2)
        recyclerView.adapter=shoeAdapter

    }
}
