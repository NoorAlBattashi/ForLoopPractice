/**
 * 
 */

/**
 * @author LAP-9
 *
 */
import java.util.Scanner;
import java.util.ArrayList;

public class PracticeArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Request for the student name
//		System.out.print("1-Write the student name: ");
//		Scanner nameInput = new Scanner(System.in);
//		String studentName = nameInput.nextLine();
//		
//		String [] studentNameArray = new String [100];
//		System.out.print("Number of studet you want to add: ");
//		Scanner numberInput = new Scanner(System.in);
//		int numberOfSudent = numberInput.nextInt()
//		
//		int a = numberOfSudent;
		
		
		
		
		//ARRAYLIST OF ARRAYLIST
		int n = 3;
		  
        // Here aList is an ArrayList of ArrayLists
        ArrayList<ArrayList<Integer> > aList = 
                  new ArrayList<ArrayList<Integer> >(n);
  
        // Create n lists one by one and append to the 
        // master list (ArrayList of ArrayList)
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        aList.add(a);
  
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(5);
        aList.add(b);
  
        ArrayList<String> a3 = new ArrayList<String>();
        a3.add("b");
        a3.add("c");
        a3.add("d");
        aList.add(a3);
  
        for (int i = 0; i < aList.size(); i++) {
            for (int j = 0; j < aList.get(i).size(); j++) {
                System.out.print(aList.get(i).get(j) + " ");
            }
            System.out.println();
        }

	}

}
