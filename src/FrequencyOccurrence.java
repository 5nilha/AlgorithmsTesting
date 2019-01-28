import java.util.HashMap;
import java.util.Map;
import java.util.Random;


/*
*************************************************************************
Generating 100 random integers between 0 and 9
(your program must display the number of occurrence it happens to each number generated.)

*************************************************************************
*/


public class FrequencyOccurrence {

	
	private Random rand = new Random();
	int[] randomNumbers = new int[100];

	
	public FrequencyOccurrence() {
		super();
		rand.setSeed(160);
		for(int i = 0 ; i < 100; i++) {
			randomNumbers[i] = rand.nextInt(10);		}
	}

	public void counting () {
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i < randomNumbers.length; i++) {	
			if  (map.get(randomNumbers[i]) != null) {
				int numberFrequencyCount = map.get(randomNumbers[i]);
				map.put(randomNumbers[i], numberFrequencyCount + 1);
			} else {
				map.put(randomNumbers[i], 1);
			}		
		}
		
		for (Map.Entry dic : map.entrySet()) {
			System.out.println(dic.getKey() + " occurs " + dic.getValue() + " time(s).");
		}
		

	}
	
}
