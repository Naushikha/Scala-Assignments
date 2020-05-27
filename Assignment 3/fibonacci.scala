object fibonacci{
	def getNum(n: Int): Int = {
		if (n == 1) return 0;
		else if (n == 2) return 1;
		else return getNum(n - 1) + getNum(n - 2);
	}
	def fibonacciSeq(n: Int): Unit = {
		if (n == 0) return;
		else{
			fibonacciSeq(n - 1);
			printf("\t%d\n", getNum(n));
		}
	}
	def main(args: Array[String]): Unit = {
		val n = 10;
		printf("Fibonacci sequence of %d;\n", n);
		fibonacciSeq(n);
	}
}
