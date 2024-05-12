
class Cube extends ThreeDimensionalShape {
	double side;
	
	Cube(double side){
		this.side = side;
	}
	@Override
	double calculateArea() {
		return 6 * side * side;
	}
	@Override
	double calculateVolume() {
		return Math.pow(side,3);
	}
}
