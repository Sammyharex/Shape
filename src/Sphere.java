
class Sphere extends ThreeDimensionalShape {
	double radius;
	
	Sphere(double radius){
		this.radius = radius;
	}
	@Override
	double calculateArea() {
		return 4 * Math.PI * radius * radius;
	}
	@Override
	double calculateVolume() {
		return (4.0/3) * Math.PI * Math.pow(radius, 3);
	}
}
