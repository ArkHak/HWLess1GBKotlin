package com.example.hwless1gbkotlin

data class Person(val firstName: String, val secondName: String)

fun stringTextView(person: Person): String = "${person.firstName} ${person.secondName}"