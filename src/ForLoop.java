/**
 * 
 */

/**
 * @author LAP-9
 *
 */
public class ForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("For Loop Practice");
		System.out.println("");
		for (int a = 0; a<4; a++) {
			
			for (int b = 0; b< 4 ; b++) {
				
				System.out.print("*"+ " ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for (int a = 0; a<6; a++) {
			
			for (int b = 0; b< a ; b++) {
				System.out.print("*" +" ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		
		for (int a = 0; a<7; a++) {
			
			for (int b = 0; b< a ; b++) {
				System.out.print(b +" ");
			}
			System.out.println("");
		}
		
		
		System.out.println("");
		System.out.println("");
		
		for (int a=5; a> 0 ; a--) {
			
			for(int b = 1; b <a ; b++) {
				System.out.print(" ");
				
			}
			for(int c= 6; c > a ; c--) {
				System.out.print("*");

				System.out.print(" ");
			}

			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("");
		
        for (int a = 2, d = 1, e = 1, f=1, j =0; a<7 ; a++, d++, e++, f++, j++) {

			for (int b =1; b< a ; b++) {
				System.out.print(b);

			}
			
			for(int c =2; c< a; c=6) {
				d--;
				System.out.print(d);
				d++;
			}
			for(int c =3; c< a; c=6) {
				e--;
				e--;
				System.out.print(e);
				e++;
				e++;
				
			}
			for(int c =4; c< a; c=6) {
				f--;
				f--;
				f--;
				System.out.print(f);
				f++;
				f++;
				f++;
			}
			for(int c =5; c< a; c=6) {            
                j--;
                j--;
                j--;
				System.out.print(j);
			
			}
			
			
			System.out.println("");
		}
		
        System.out.println("");


	}

}
