package com.cards.card;

import java.util.ArrayList;
import java.util.List;

/**
 * This is Builder class for deck Of cards.
 */
public class CardBuilderImpl implements ICardBuilder {


    /**
     * Builder implementation for all 52 cards
     * @return
     */
    public List<Card> buildDeckofCards() {
        List<Card> deckOfCards=new ArrayList<Card>(52);

       for(SUITE suiteVal: SUITE.values()){

           for(int i=1;i<=13;i++){
               deckOfCards.add(new Card(i,suiteVal));
           }
       }
       return deckOfCards;
    }
}
