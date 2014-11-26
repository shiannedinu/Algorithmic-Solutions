import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Numbers {
	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String s = b.readLine();
		int numCount = Integer.parseInt(s);
		
		String numbers = b.readLine();
		String[] nArr = numbers.split(" ");
		int numbersArr[] = new int[numCount];
		int i=0;
	
	  for (String st : nArr) {
		    numbersArr[i++]= Integer.parseInt(st);
	  }
	
	  int res = (numbersArr[0]+numbersArr[numCount-1])*(numCount+1)/2;
	  
	  for (int j = 0; j < numbersArr.length; j++) {
		    res -= numbersArr[j];
	 }
	
	
		System.out.println("The missing number : " + res);
		
		
		
	}

}
