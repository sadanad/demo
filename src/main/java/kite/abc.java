package kite;

import multi_level_inheristance.District;
import multi_level_inheristance.State;

public class abc {
	
	public class District extends State {

		public static void admin()
		{
			lawandorder();
			System.out.println(" maintain admin");
			
		}
		public static void lawandorder()
		
		{   
			System.out.println(" maintain law and order");
			
		}
		
		public static void main(String[] args) {
		 District B = new District();
		
	      B.defence();
	      B.emergency();
	      B.IR();

}
