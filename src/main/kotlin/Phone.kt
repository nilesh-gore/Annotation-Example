package org.example

@Smart(os = "Android")
@Smart(os = "iOS")
class Phone {

    @set: Smart(os = "Android")
    var brand = "Samsung-Tech"

    @get: Smart(os = "Android")
    var model = "Galaxy S21"

    @Smart(os = "Android")
    fun camera(){

    }

}