package com.example.atv.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.atv.R
import com.example.atv.controller.IItemController
import com.example.atv.controller.ItemController

class AddItemActivity : AppCompatActivity() {
    private lateinit var itemController: IItemController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_item)

        itemController = ItemController // Injeção manual da implementação

        val saveButton = findViewById<Button>(R.id.saveButton)
        val itemNameEditText = findViewById<EditText>(R.id.itemNameEditText)

        saveButton.setOnClickListener {
            val itemName = itemNameEditText.text.toString()
            itemController.addItem(itemName)
            startActivity(Intent(this, ItemListActivity::class.java))
        }
    }
}