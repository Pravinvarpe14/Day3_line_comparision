/*
 * line comparision problem
 */
public class line_comparision {

	public static void main(String[] args) {
		
		/*
		 * printing messaage
		 */
	System.out.println("Welcome to Line comparision computation");
	
	/*
	 * taking variable 			
	 */

		int x1 = 1;
		int x2 = 2;
		int y1 = 3;
		int y2 = 4;
		
		System.out.println("Coordinates x1 and y1 of first point is " + x1 + ", " + y1);
		System.out.println("Coordinates x2 and y2 of second point is " + x2 + ", " + y2);
	
		/*
		 * by using math.sq finding lnght of line one
		 */
				double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
				
				System.out.println("Length pf line1 is " + length1);
	
	
	
	}

}
