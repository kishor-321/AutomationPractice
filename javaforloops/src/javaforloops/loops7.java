package javaforloops;

//import java.awt.Checkbox;

public class loops7 {

	public static void main(String args[]) {
		char ch = 'b';
		switch (ch) {
		case 'e':
			System.out.println("Value matched - e, a vowel");
			break;
		case 'a':
			System.out.println("Value matched - a, a vowel");
			break;
		case 'w':
			System.out.println("Value matched - w, not a vowel");
			break;
		case 'o':
			System.out.println("Value matched - o, a vowel");
			break;
		case 'i':
			System.out.println("Value matched - i, a vowel");
			break;
		default:
			System.out.println("Given character is not a vowel");
			break;
		}
		
		System.out.println("vowels ct: "+checkVowelsCt('a', 'z'));// second method result
		System.out.println("cons ct: "+checkConsCt('a', 'z'));// third method result
		checkVowels('a');//for last method
	
	}
	public static int checkVowelsCt(char start,char ends) {
		int ct=0;
		for(char c1=start;c1<=ends;c1++) {
			if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u') {
				ct=ct+1;
			}
		}
		return ct;
	}

	public static int checkConsCt(char start,char ends) {
		int ct=0;
		for(char c1=start;c1<=ends;c1++) {
			if(!(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')) {
				ct=ct+1;
			}
		}
		return ct;
	}
	public static void checkVowels(char lll) {
		char ll1 = 'a';
		switch (ll1) {
		case 'e':
			System.out.println("Value matched - e, a vowel");
			break;
		case 'a':
			System.out.println("Value matched - a, a vowel");
			break;
		case 'w':
			System.out.println("Value matched - w, not a vowel");
			break;
		case 'o':
			System.out.println("Value matched - o, a vowel");
			break;
		case 'i':
			System.out.println("Value matched - i, a vowel");
			break;
		default:
			System.out.println("Given character is not a vowel");
			break;
		}
	

}

}
