package com.kzirk.assignment2

import com.kzirk.assignment2.models.Card

public class CardRepository {

    var card1 = Card(
        thisId = "SERIAL #123456",
        thisName = "Gold Sarcophagus",
        thisImage = R.drawable.goldsarcophagus,
        desc = "Banish 1 card from your Deck, face-up. During your 2nd Standby Phase after this card's activation, add that card to the hand.",
        thisCategories = arrayOf("Spell Card", "Normal")
    )
    var card2 = Card(
        thisId = "SERIAL #234567",
        thisName = "Card Advance",
        thisImage = R.drawable.cardadvance,
        desc = "Look at up to 5 cards from the top of your Deck, then place them on the top of the Deck in any order. You can Tribute Summon 1 monster in addition to your Normal Summon/Set this turn. (You can only gain this effect once per turn.)",
        thisCategories = arrayOf("Spell Card", "Normal")
    )
    var card3 = Card(
        thisId = "SERIAL #345678",
        thisName = "Winged Dragon",
        thisImage = R.drawable.wingeddragon,
        desc = "A dragon commonly found guarding mountain fortresses. Its signature attack is a sweeping dive from out of the blue.",
        thisCategories = arrayOf("Dragon", "Normal")
    )
    var card4 = Card(
        thisId = "SERIAL #456789",
        thisName = "Card Destruction",
        thisImage = R.drawable.carddestruction,
        desc = "Both players discard as many cards as possible from their hands, then each player draws the same number of cards they discarded.",
        thisCategories = arrayOf("Spell Card", "Normal")
    )
    var card5 = Card(
        thisId = "SERIAL #123451",
        thisName = "Jinzo",
        thisImage = R.drawable.jinzo,
        desc = "Trap Cards, and their effects on the field, cannot be activated. Negate all Trap effects on the field.",
        thisCategories = arrayOf("Spell Card", "Trap")
    )
    var card6 = Card(
        thisId = "SERIAL #123452",
        thisName = "Blue Eyes White Dragon",
        thisImage = R.drawable.blueeyes,
        desc = "This legendary dragon is a powerful engine of destruction. Virtually invincible, very few have faced this awesome creature and lived to tell the tale.",
        thisCategories = arrayOf("Dragon", "Normal")
    )

    var cardList: Array<Card> = arrayOf(card1, card2, card3, card4, card5, card6)

}