package com.example.atv.view

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.atv.R
import com.example.atv.controller.IItemController
import com.example.atv.controller.ItemController

class ItemListActivity : AppCompatActivity() {
    private lateinit var itemController: IItemController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_list)

        itemController = ItemController // Injeção manual da implementação

        val itemListListView = findViewById<ListView>(R.id.itemListListView)
        val items = itemController.getItems().map { it.name }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        itemListListView.adapter = adapter

        val addButton = findViewById<Button>(R.id.addButton)
        addButton.setOnClickListener {
            startActivity(Intent(this, AddItemActivity::class.java))
        }
    }
}