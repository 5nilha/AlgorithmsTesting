
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FizzBuzz fizzbuzz = new FizzBuzz();
		fizzbuzz.run();
		
		
		Search searchTest = new Search();

		searchTest.recursiveBinarySearch("Arda", 0, searchTest.sortedNames.length - 1);
		searchTest.loopBinarySearch("Arda", 0, searchTest.sortedNames.length - 1);
		
		int[] numbers = new int[10000000];
		
		for(int i = 0; i < 10000000; i++) {
			numbers[i] = i + 1;
		}

		searchTest.recursiveBinarySearch(numbers, 311, 0, numbers.length - 1);

		searchTest.loopBinarySearch(numbers, 311, 0, numbers.length - 1);
	}

}
