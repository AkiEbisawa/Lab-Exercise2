import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	     
	    System.out.println("Input a word: ");
	    String word = scan.nextLine();
	    
	    int num = word.length();
	    
	    System.out.println("------------------");
	    
	    for(int i = 1; i <= num; i++){
	        System.out.println(word);
	    }
	    
	    scan.close();
	}

}
