package com.example.atv.controller

import com.example.atv.model.Item

interface IItemController {
    fun addItem(name: String)
    fun getItems(): List<Item>
}
