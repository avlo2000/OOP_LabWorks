package com.tasks3.carddeck;

public class Deck {
    private Card cards[];
    private int size;
    private Card used[];
    public Deck()
    {
        int index = 0;
        this.size = 36;
        cards  = new Card[this.size];
        used = new Card[this.size];
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                this.cards[index] = new Card(Rank.values[j], Suit.values[i]);
                index++;
            }
        }
    }

    public void shuffle() {

        for(int i = 0; i < this.size; i++) {
            int random_num = (int)(Math.random()*this.size);

            Card tmp = this.cards[i];
            this.cards[i] = this.cards[random_num];
            this.cards[random_num] = tmp;
        }

    }

    public void order() {
        int index = 0;
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                boolean create = true;
                for(int k = size; k < 36; k++)
                {
                    if((used[k].getRank() == Rank.values[i])&&(used[k].getSuit() == Suit.values[j]))
                        create = false;
                }
                if(create) {
                    this.cards[index].setRank(Rank.values[j]);
                    this.cards[index].setSuit(Suit.values[i]);
                    index++;
                }
            }
        }
    }

    public boolean hasNext() {
        if(size != 0)
            return true;
        else
            return false;
    }

    public Card drawOne() {
        size--;
        if(size >= 0) {
            used[size] = new Card(cards[size].getRank(), cards[size].getSuit());
            return cards[size];
        }
        else
            return null;
    }
}
