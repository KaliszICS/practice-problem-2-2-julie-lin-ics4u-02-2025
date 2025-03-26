public class PracticeProblem {

	public static void main(String args[]) {
		
	}
	public static int[] compareSearch(int[] array, int number){
		int sequentialLoops = 0;
		int binaryLoops = 0;

		//Sequential loops
		for (int i = 0; i < array.length; i++){
			sequentialLoops++;
			if (array[i] == number){
				break;
			}
		}

		// Binary Loops
		int min = 0;
		int max = array.length -1;
		while (min <= max){
			binaryLoops++;
			int mid = (min + max)/2;
			if (array[mid] == number) {
				break;
			}
			else if (array[mid] < number){
				min = mid + 1;
			}
			else {
				max = mid - 1;
			}
		}
		return new int[] {sequentialLoops, binaryLoops};
	}
	public static int[] compareStringSearch (String[] array, String word) {
		int sequentialLoops = 0;
		int binaryLoops = 0;

		
		//Sequential loops
		for (int i = 0; i < array.length; i++){
			sequentialLoops++;
			if (array[i].equals(word)){
				break;
			}
		}

		// Binary Loops
		int min = 0;
		int max = array.length -1;
		while (min <= max){
			binaryLoops++;
			int mid = (min + max)/2;
			if (array[mid].equals(word)) {
				break;
			}
			else if (word.compareTo(array[mid]) > 0){
				min = mid + 1;
			}
			else {
				max = mid - 1;
			}
		}

		return new int[] {sequentialLoops, binaryLoops};
	}
}
