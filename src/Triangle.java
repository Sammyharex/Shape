
 class Triangle extends Shape{
	 double base;
	 double height;
	 
	 Triangle(double base, double height){
		 this.base = base;
		 this.height = height;
	 }
	 @Override
	 double calculateArea() {
		 return 0.5 * base * height;	 
		}
	}
