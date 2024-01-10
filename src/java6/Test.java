package java6;

public class Test {
	public static void main(String[] args) {
		System.out.println(countUppercaseLetter("TestNoMojiRetudayOO"));
	}
	
	public static int countUppercaseLetter(String letter) {
		int count = 0;
		
		for (int i = 0; i < letter.length(); i++) {
			char ch = letter.charAt(i);
			
			if (Character.isUpperCase(ch)) {
				count++;
			}
		}
		
		
		return count;
	}
}
