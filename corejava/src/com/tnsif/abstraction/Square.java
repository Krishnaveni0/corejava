package com.tnsif.abstraction;

public class Square extends Shape{
		private float side;   // data member or variables
	
		public Square() {
				side=3.2f;
		}

		@Override
		void calarea() {
				super.area=side*side;
		
		}

}



