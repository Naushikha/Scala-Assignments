object sumEven{
	def even(n: Int, i: Int): Int = { //i variable keeps the even check going, n keeps track of what the original number was
		  if (i < 0) return 0;
		  else if (i == 0) return n;//Only returns the original number when it is even
		  else if (i == 1) return 0;
		  else even(n, i - 2);
	}
	def addition(n: Int): Int = {
		if (n == 1) return 0;// 0 is not even
		else return addition(n - 1) + even(n, n);
	}

	def main(args: Array[String]): Unit = {
		val n = 10;
		printf("Addition of even numbers from 1 to %d: %d\n", n, addition(n));
	}
}
