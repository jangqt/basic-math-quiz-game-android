package com.example.programmizz

data class Question(
    val question: String,
    val options: List<String>,
    val correctOption: Int
)