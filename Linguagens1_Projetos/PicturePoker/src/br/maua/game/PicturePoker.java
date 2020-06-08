package br.maua.game;

import br.maua.models.PicturePokerCard;
import br.maua.models.PicturePokerCardValues;
import br.maua.models.PicturePokerDeck;

import java.util.List;

public class PicturePoker {
    public static void run(){
        System.out.println("Mario Poker!");
        PicturePokerDeck deck = new PicturePokerDeck();
        PicturePokerDealer dealer = new PicturePokerDealer("Luigi");

        //showPicturePokerList(dealer.getDeck().getDeckList());

        PicturePokerHand hand = new PicturePokerHand(dealer.deal());

        //showPicturePokerList(dealer.getDeck().getDeckList());

        showPicturePokerList(hand.getHand());
        System.out.println( hand.checkHand(hand.getHand()) );

    }

    private static void showPicturePokerList(List<PicturePokerCard> cardList) {
        System.out.println("Size: "+cardList.size());
        for (PicturePokerCard card: cardList) {
            System.out.println(card);
        }
    }
}
