package com.cards.card;



public  class Card {

    private int value;

    public Card(int value, SUITE suite) {
        this.value = value;
        this.suite = suite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return getValue() == card.getValue() &&
                getSuite() == card.getSuite();
    }

    @Override
    public int hashCode() {
        int result = 35;
        result= 17*result+this.value;
        result=result*17+this.suite.hashCode();
        return result;
    }

    private SUITE suite;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SUITE getSuite() {
        return suite;
    }

    public void setSuite(SUITE suite) {
        this.suite = suite;
    }

    @Override
    public String toString() {
        String faceVal=String.valueOf(value);
        if(value==1){
            faceVal="Ace";
        }else if(value==11){
            faceVal="Jack";
        }else if(value==12){
            faceVal="Queen";
        }else if(value==13){
            faceVal="King";
        }
        return "Card{" +
                "value=" + faceVal +
                ", suite=" + suite +
                '}';
    }
}
