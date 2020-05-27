object primeNum{
	def prime(n: Int, d: Int = 2): Boolean = {
		if (n < 2) return false;
		else if (d == n) return true;
		else if (n % d == 0) return false;
		else prime(n, d + 1);
	}
	def main(args: Array[String]){
		for (x <- 1 to 100){
			printf("Is %d prime?: %b\n", x, prime(x));
		}	
	}
}
