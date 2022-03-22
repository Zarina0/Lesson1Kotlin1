package com.example.lesson1kotlin1.ui.fragments.view_model

import androidx.lifecycle.ViewModel
import com.example.lesson1kotlin1.data.client.BooksClient
import com.example.lesson1kotlin1.models.BooksModel

class BooksViewModel : ViewModel() {
    fun getBooks() : List <BooksModel>{
        return BooksClient().getData()
    }
}