import java.util.Scanner;
class CircleApp
{
	
	static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
   {
      System.out.print("Enter the radius: ");
      double radius = sc.nextDouble(); //store in double so user can input decimal numbers
      //Area = PI*radius*radius
      double area = Math.PI * (radius * radius); //3.14 * (radius*radius)
      System.out.println("The area of circle is: " + area);
      double circumference= Math.PI * (2*radius); //3.14 * (radius*2)
      System.out.println( "The circumference of the circle is:"+circumference) ;
      
      Circle.getCircumference(radius);
   }
}