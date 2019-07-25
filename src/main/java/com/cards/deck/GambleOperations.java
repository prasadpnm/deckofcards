package com.cards.deck;

import com.cards.card.Card;
import com.cards.card.CardBuilderImpl;
import com.cards.card.ICardBuilder;

import java.util.List;
import java.util.Random;

/**
 * Gamble Operations.
 */
public class GambleOperations {

    private List<Card> deckOfCards;
    private ICardBuilder cardBuilder=new CardBuilderImpl();
    private int decIndex=0;
    private int decSize;
    private static GambleOperations gambleOperations;
    private Random random=new Random();

    /**
     * Build the deck of cards.
     */
    private GambleOperations(){
        deckOfCards=cardBuilder.buildDeckofCards();
        decSize=deckOfCards.size();
    }

    /**
     * Singleton Instance method
     * @return
     */
    public static synchronized GambleOperations getInstance(){
        if(gambleOperations==null){
            gambleOperations=new GambleOperations();
        }

        return gambleOperations;
    }

    /**
     * Shuffle Logic Implementation
     */
    public void shuffle(){
        int size=deckOfCards.size();

        for(int i=0;i<size;i++){

            int next=random.nextInt(size);
            //swap index with random positions.

          Card temp=deckOfCards.get(i);
          deckOfCards.set(i,deckOfCards.get(next));
          deckOfCards.set(next,temp);

        }
        decIndex=0;

    }

    /**
     * Dealof the card.
     * @return
     * @throws Exception
     */
    public Card dealOneCard() throws Exception {
        if(decIndex==52){
            throw new Exception("No cards in Deck to return. please shuffle once again.");
        }
        Card card=deckOfCards.get(decIndex);
        decIndex++;

        return card;
    }




}
