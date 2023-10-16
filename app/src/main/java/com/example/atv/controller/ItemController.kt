package com.example.atv.controller

import com.example.atv.model.Item

object ItemController : IItemController {
    private val items = mutableListOf<Item>()

    override fun addItem(name: String) {
        val newItem = Item(items.size + 1, name)
        items.add(newItem)
    }

    override fun getItems(): List<Item> {
        return items.toList()
    }
}
