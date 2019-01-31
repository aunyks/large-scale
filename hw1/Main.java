import java.util.Arrays;

public class Main {
  public static void main(String[] main) {
    int[] myArray = {
      
    };
    OrderChecker c = new OrderChecker();
    if(c.isAscending(myArray)) {
      System.out.println("Array " + Arrays.toString(myArray) + " is in ascending order!");
    } else {
      System.out.println("Array " + Arrays.toString(myArray) + " is NOT in ascending order!");
    }

    if(c.isDescending(myArray)) {
      System.out.println("Array " + Arrays.toString(myArray) +  " is in descending order!");
    } else {
      System.out.println("Array " + Arrays.toString(myArray) + " is NOT in descending order!");
    }
  }
}