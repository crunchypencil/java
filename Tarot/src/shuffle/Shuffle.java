package shuffle;


public class Shuffle {

	public static void main(String[] args) {
		// create an ordered, sample array of ints
		int[] sample = new int[78];
		for (int i = 0; i < sample.length; i++) {
			sample[i] = i;
		}

		System.out.println("BEFORE:");
		printArray(sample, sample.length);

		shuffleDeck(sample);

		System.out.println();
		System.out.println("AFTER:");
		printArray(sample, -1);

		System.out.println();
		System.out.println("UP/DOWN:");

		// for (int j = 0; j < sample.length; j++) {
		for (int j = 0; j < sample.length + 1; j++) {
			if (j >= sample.length) {
				System.out.println("THE END.");
			} else {
				addRand(sample, j);
			}
		}

		System.out.println();
		System.out.println("FIRST CARD:");
		pickOne(sample, 0);
		// System.out.println(Deck.tarotdeck[sample.length][4]);
	}

	// shuffle int[]
	public static void shuffleDeck(int[] numbers) {

		for (int i = numbers.length - 1; i > 0; i--) {
			int select = (int) (Math.random() * (i + 1)); // 0 <= select <= i

			// swap current value with selected value
			int temp = numbers[i];
			numbers[i] = numbers[select];
			numbers[select] = temp;
		}
	}

	// print numbers array
	public static void printArray(int[] numbers, int div) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
		}
		System.out.println();
	}

	// pick a card
	public static void addRand(int[] numbers, int sel) {
		// inverted or normal
		char inv;
		double invran = Math.random();
		if (invran <= .5) {
			inv = 'I';
			System.out.print(numbers[sel] + "" + inv + ", ");
		} else {
			inv = 'N';
			System.out.print(numbers[sel] + "" + inv + ", ");

		}
		// System.out.print(Deck.tarotdeck[numbers[sel]][0]+""+inv+", ");
	}

	public static void pickOne(int[] numbers, int sel) {
		// inverted or normal
		// char inv;
		double invran = Math.random();
		if (invran <= .5) {
			// inv = 'I'; INVERSED
			System.out.println(Deck.tarotdeck[numbers[sel]][0] + ", Inverted");
			System.out.println(Deck.tarotdeck[numbers[sel]][3]);
			System.out.println("Description: "
					+ Deck.tarotdeck[numbers[sel]][4]);
			System.out.println(Deck.tarotdeck[numbers[sel]][6]);
		} else {
			// inv = 'N';
			System.out.println(Deck.tarotdeck[numbers[sel]][0]);
			System.out.println(Deck.tarotdeck[numbers[sel]][2]);
			System.out.println("Description: "
					+ Deck.tarotdeck[numbers[sel]][4]);
			System.out.println("Meaning: " + Deck.tarotdeck[numbers[sel]][5]);
		}
		// System.out.print(Deck.tarotdeck[numbers[sel]][0]+""+inv+", ");
	}

}
