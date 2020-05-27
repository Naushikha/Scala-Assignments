object sum{
	def addition(n: Int): Int = {
		if (n == 1) return 1;
		else return addition(n - 1) + n;
	}

	def main(args: Array[String]): Unit = {
		val n = 100;
		printf("Addition of numbers from 1 to %d: %d\n", n, addition(n));
	}
}
