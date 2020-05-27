object salary{
	//This will take in two arguments to process - number of working hours, OT hours
	//We assume that the input will be in the order, no. of working hours and ot...
	//We also assume the inputs are numbers
	def main(args: Array[String]): Unit = {
		val result = (args(0).toInt * 150 + args(1).toInt * 75) * 0.9;
		printf("The salary of the worker, who worked for %s hours and %s OT hours is Rs. %.2f\n", args(0), args(1), result);
	}
}
