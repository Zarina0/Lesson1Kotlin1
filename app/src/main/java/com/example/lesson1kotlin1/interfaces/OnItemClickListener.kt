package com.example.kotlin1lesson1.interfaces

interface OnItemClickListener<T> {
fun onClick(model : T, position: Int)
}