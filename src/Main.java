
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//FIZZ BUZZ TESTING
		FizzBuzz fizzbuzz = new FizzBuzz();
		fizzbuzz.run();
		
		// SEARCH ALGORITHM TESTING FOR STRING 
		Search searchTest = new Search();
		searchTest.recursiveBinarySearch("Arda", 0, searchTest.sortedNames.length - 1);
		searchTest.loopBinarySearch("Arda", 0, searchTest.sortedNames.length - 1);
		
		// SEARCH ALGORITHM TESTING FOR INTEGER
		int[] numbers = new int[10000000];
		for(int i = 0; i < 10000000; i++) {
			numbers[i] = i + 1;
		}
		searchTest.recursiveBinarySearch(numbers, 311, 0, numbers.length - 1);
		searchTest.loopBinarySearch(numbers, 311, 0, numbers.length - 1);
		
		//FREQUENCY OF OCCURRENCE TESTING
		FrequencyOccurrence occurrence = new FrequencyOccurrence();
		occurrence.counting();
	}

}
