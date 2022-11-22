import java.util.Scanner;
public class SelectionSortAnagrams {

	public static void main(String[] args) {
		String word1;
		String word2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		word1 = input.nextLine();
		System.out.print("Enter another word: ");
		word2 = input.nextLine();

		char[] word1_array = word1.toCharArray();
		char[] word2_array = word2.toCharArray();
		
		// Sort character arrays before comparing values
		selectionSort(word1_array);
		selectionSort(word2_array);
		
		for(int i = 0; i < word1_array.length; i++) {
			if(word1_array[i] == word2_array[i]) { 
				if(i == word1_array.length - 1) {
					System.out.printf("%s and %s are anagrams.", word1, word2);
					break;
				}
			}
			
			else{
					System.out.printf("%s and %s are not anagrams.", word1, word2);
					break;
			}
		}
		
		input.close();
		System.out.println();
	}
	
	// Sorts character array using selection sort algorithm
	public static char[] selectionSort(char[] word) {
		int current_minimum;
		char temp;
		
		for(int i = 0; i < word.length; i++) {
			current_minimum = i;
			for(int j = i; j < word.length; j++) {
				if(word[j] < word[current_minimum]) {
					current_minimum = j;
				}
			}
			
			temp = word[current_minimum];
			word[current_minimum] = word[i];
			word[i] = temp;
		}
		
		return word;
	}
}


