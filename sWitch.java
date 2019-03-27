

import java.util.Scanner;
public class sWitch 
{
	Scanner enter = new Scanner(System.in);
	int l;
	int w;
	int r;
	int h;
	
	sWitch()
	{
		
		System.out.println("*********THIS CODE WILL HELP UNDERSTAND HOW SWITHC WORKS**********");
		display();
	}
	
	public void display() 
	{
		
		System.out.print("Do you want to calculate area: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = "yes";
		if(s.equals(s1)) 
		{
			System.out.print("For which you want to calculate area (Triangle,Square or Circle) : ");
			Scanner input = new Scanner(System.in);
			String in = input.next();
			switch(in) 
			{
				case "triangle" : 		System.out.print("Enter length of the triangle: ");
										l = enter.nextInt();
										System.out.print("Enter height of the triangle: ");
										h = enter.nextInt();
										System.out.print("Area of the triangle: "+(0.5*l*h));
										break;
				
				case "recatangle" : 		System.out.print("Enter length of the rectangle: ");
										l = enter.nextInt();
										System.out.print("Enter width of the rectangle: ");
										w = enter.nextInt();
										System.out.print("Area of the rectangle: "+(l*w));
										break;
										

				case "circle" : 		System.out.print("Enter radius of circle: ");
										r = enter.nextInt();
										System.out.print("Area of the circle: "+(3.14*r*r));
										break;
										
				default : 				System.out.println("Wrong choice !!!");
			
			}
		}
		
	}
	
	public static void main(String args[]) 
	{
		
		new sWitch();
		
	}
}
