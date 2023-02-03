package com.kzirk.assignment2.models

/*
* This is our card object, it contains all the information we need to render it
* */
class Card(thisId: String, thisName: String, thisImage: Int, desc: String, thisCategories: Array<String> ) {
    var id: String = thisId;
    var name: String = thisName;
    var image: Int = thisImage;
    var description: String = desc;
    var categories: Array<String> = thisCategories;
}