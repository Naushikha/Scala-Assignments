object fahrenheit{
	def convert_centi(c: Double) = c * 1.8 + 32;
	def main(args: Array[String]): Unit = println("35C converted to Fahrenheit is " + convert_centi(35) + "F");
}
