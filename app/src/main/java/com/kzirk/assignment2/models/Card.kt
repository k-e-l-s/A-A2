package com.kzirk.assignment2.models

class Card(thisId: String, thisName: String, thisImage: Int, desc: String, thisCategories: Array<String> ) {
    var id: String = thisId;
    var name: String = thisName;
    var image: Int = thisImage;
    var description: String = desc;
    var categories: Array<String> = thisCategories;
}