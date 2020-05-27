object primeSequence{
	def prime(n: Int, d: Int = 2): Boolean = {
		if (n < 2) return false;
		else if (d == n) return true;
		else if (n % d == 0) return false;
		else prime(n, d + 1);
	}
	def primeSeq(n: Int): Unit = {
		if (n <= 2) return;
		else{
			primeSeq(n - 1);
			if (prime(n)) { printf("\t%d\n", n); }
		}
	}
	def main(args: Array[String]): Unit = {
		val n = 100;
		printf("Prime sequence of %d;\n", n);
		primeSeq(n);
	}
}
