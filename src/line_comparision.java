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
				 * by using math.sq finding lenght of line one
				 */
					double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
				
				System.out.println("Length of line1 is " + length1);
				/*
				 * line2 variables
				 */
				int x3 = 5;
				int x4 = 6;
				int y3 = 7;
				int y4 = 8;
				
				System.out.println("Coordinates x1 and y1 of first point is " + x1 + ", " + y1);
				System.out.println("Coordinates x2 and y2 of second point is " + x2 + ", " + y2);
				
				double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
				
				System.out.println("Length of line1 is " + length2);
				
				/*
				 * using if else statement to verifying the condition
				 */
				
				if (length1 > length2) {
					
					System.out.println("Line1 is grather than Line2...");
					
				} else if ( length2 >length1){
					
					System.out.println("Line2 is grater than Line1...");
					
				}else {
					
					System.out.println("Line1 & Line2 are equal...");
				
	}

}
}