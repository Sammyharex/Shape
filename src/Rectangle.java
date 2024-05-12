
class Rectangle extends Shape {
	double length;
	double breadth;
	
	Rectangle(double length, double breadth){
		this.length =  length;
		this.breadth = breadth;
	}
	@Override
	double calculateArea() {
		return length * breadth;
	}
}
