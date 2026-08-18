package lab4;

import java.util.Arrays;
import java.util.Random;

public class CardGame {

	public static void result() {

		String[] cards = { "A ♠", "2 ♠", "3 ♠", "4 ♠", "5 ♠", "6 ♠", "7 ♠", "8 ♠", "9 ♠", "10 ♠", "J ♠", "Q ♠", "K ♠",
				"A ♥", "2 ♥", "3 ♥", "4 ♥", "5 ♥", "6 ♥", "7 ♥", "8 ♥", "9 ♥", "10 ♥", "J ♥", "Q ♥", "K ♥", "A ♣",
				"2 ♣", "3 ♣", "4 ♣", "5 ♣", "6 ♣", "7 ♣", "8 ♣", "9 ♣", "10 ♣", "J ♣", "Q ♣", "K ♣", "A ♦", "2 ♦",
				"3 ♦", "4 ♦", "5 ♦", "6 ♦", "7 ♦", "8 ♦", "9 ♦", "10 ♦", "J ♦", "Q ♦", "K ♦" };
		int[] values = { 10, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 2,
				3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };

		System.out.println(getWinner(getPlayerCards(cards, values, 3), getComputerCards(cards, values, 3)));

	}

	public static String[] getPlayerCards(String[] cards, int[] values, int numOfCards) {

		Random rand = new Random();
		String[] playerCards = new String[numOfCards + 1];

		int index = 0;
		int score = 0;

		for (String card : playerCards) {

			if (index != playerCards.length - 1) {
				int indexCard = rand.nextInt(cards.length);

				score = score + values[indexCard];
				playerCards[index] = cards[indexCard];
				playerCards[playerCards.length - 1] = String.valueOf(score);

				index++;
			}

		}

		return playerCards;

	}

	public static String[] getComputerCards(String[] cards, int[] values, int numOfCards) {

		Random rand = new Random();
		String[] computerCards = new String[numOfCards + 1];

		int index = 0;
		int score = 0;

		for (String card : computerCards) {

			if (index != computerCards.length - 1) {
				int indexCard = rand.nextInt(cards.length);

				score = score + values[indexCard];
				computerCards[index] = cards[indexCard];
				computerCards[computerCards.length - 1] = String.valueOf(score);

				index++;
			}

		}

		return computerCards;

	}

	public static String getWinner(String[] playerCards, String[] computerCards) {

		int playerScore = Integer.parseInt(playerCards[playerCards.length - 1]);
		int computerScore = Integer.parseInt(computerCards[playerCards.length - 1]);

		String result = "";

		if (playerScore > computerScore) {
			result = "Player Wins!\n" + "Player cards: " + Arrays.toString(playerCards) + "\nComputer cards: "
					+ Arrays.toString(computerCards);
		} else if (playerScore < computerScore) {
			result = "Computer Wins!\n" + "Computer cards: " + Arrays.toString(computerCards) + "\nPlayer cards: "
					+ Arrays.toString(playerCards);
		} else {
			result = "Draw!\n" + Arrays.toString(playerCards) + "Computer cards: " + Arrays.toString(computerCards);
		}

		return result;

	}

}
