object evenOdd{
	def determine(n: Int): String = {
		  if (n < 0) return "Negative Number";
		  else if (n == 0) return "Even Number";
		  else if (n == 1) return "Odd Number";
		  else determine(n - 2);
	}

	def main(args: Array[String]): Unit = {
		val n = 10;
		printf("Number %d is a/n %s\n", n, determine(n));
	}
}
