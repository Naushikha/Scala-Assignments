object volume{
	def calculate(r: Double) = 4.0 / 3 * scala.math.Pi * scala.math.pow(r,3);
	def main(args: Array[String]): Unit = println("The volume of a sphere with radius 5 is " + calculate(5));
}
