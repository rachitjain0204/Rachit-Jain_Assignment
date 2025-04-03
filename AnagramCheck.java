import java.util.*;;
public class AnagramCheck {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    String str1=sc.nextLine().toLowerCase();
	    String str2=sc.nextLine().toLowerCase();
	    
	    if(str1.length() == str2.length()) {
	      char[] arr1 = str1.toCharArray();
	      char[] arr2 = str2.toCharArray();
	      Arrays.sort(arr1);
	      Arrays.sort(arr2);
	      boolean result = Arrays.equals(arr1, arr2);

	      if(result) {
	        System.out.println("true");
	      }
	      else {
	        System.out.println("false");
	      }
	    }
	    else {
	      System.out.println("false");
	    }
	  }
}
