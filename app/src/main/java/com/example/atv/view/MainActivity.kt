package com.example.atv.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.atv.R
import com.example.atv.controller.IItemController
import com.example.atv.controller.ItemController

class MainActivity : AppCompatActivity() {
    private lateinit var itemController: IItemController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        itemController = ItemController // Injeção manual da implementação

        val addButton = findViewById<Button>(R.id.addButton)
        addButton.setOnClickListener {
            startActivity(Intent(this, AddItemActivity::class.java))
        }
    }
}