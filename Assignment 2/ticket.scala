object ticket{
	//Refer ticket_argument.txt for the explanation
	def calculate(p: Int, a: Int) = -(5 * p - a - 15) / 10.0;
	def main(args: Array[String]): Unit = {
		val bestPrice = 15 + calculate(15, 120);
		printf("Best ticket price for the given scenario is %.2f\n", bestPrice);
	}
}
