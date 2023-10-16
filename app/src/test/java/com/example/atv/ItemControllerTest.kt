package com.example.atv

import com.example.atv.controller.IItemController
import com.example.atv.model.Item
import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertEquals

class ItemControllerTest {

    private lateinit var itemController: IItemController

    @Before
    fun setUp() {
        // Use a implementação de teste para o IItemController nos testes
        itemController = TestItemController()
    }

    @Test
    fun testAddItem() {
        val itemName = "Item 1"
        itemController.addItem(itemName)
        val items = itemController.getItems()
        assertEquals(1, items.size)
        assertEquals(itemName, items[0].name)
    }

    @Test
    fun testGetItems() {
        val items = itemController.getItems()
        assertEquals(0, items.size)
    }

    // Implementação de teste simples para o IItemController
    private class TestItemController : IItemController {
        private val items = mutableListOf<Item>()

        override fun addItem(name: String) {
            val newItem = Item(items.size + 1, name)
            items.add(newItem)
        }

        override fun getItems(): List<Item> {
            return items.toList()
        }
    }
}