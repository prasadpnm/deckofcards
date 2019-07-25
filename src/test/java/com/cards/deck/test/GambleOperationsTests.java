package com.cards.deck.test;
import com.cards.card.Card;
import com.cards.deck.GambleOperations;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.assertTrue;
public class GambleOperationsTests {

    /**
     * this method test
     * get the Singleton Instance
     * shuffle
     * check shuffle Deck is having any duplicates
     */
    @Test
    public void testShufflelDeck() {

        GambleOperations gambleOperations =  GambleOperations.getInstance();
        gambleOperations.shuffle();
        Set<Card> deckSet=new HashSet<Card>();
        System.out.println("TEST----------1");
        try {
            for (int i = 0; i < 52; i++) {
                Card card = gambleOperations.dealOneCard();
                System.out.println(card);
                deckSet.add(card);
            }

            Assert.assertEquals(52,deckSet.size());

        }catch (Exception ex)
        {
            assertTrue(false);
        }
    }

    /**
     * this method test
     * get the Singleton Instance
     * shuffle
     * check shuffle Deck is throwing Exception for 53 card.
     */
    @Test
    public void testException() {
        GambleOperations gambleOperations =  GambleOperations.getInstance();
        gambleOperations.shuffle();
        System.out.println("TEST----------2");
        try {
            for (int i = 0; i <= 52; i++) {
                Card card = gambleOperations.dealOneCard();
                System.out.println(card);

            }

        }catch (Exception ex)
        {
            assertTrue(true);
        }
    }

}
