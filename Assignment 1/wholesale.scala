object wholesale{
	def book_cost(n: Int) = n * 24.95 * 0.6;
	def shipping_cost(n: Int) = if (n > 50) ((n - 50) * 0.75 + 50 * 3) else (n * 3);
	def total_cost(n: Int) = book_cost(n) + shipping_cost(n);
	def main(args: Array[String]): Unit = println("The total wholesale cost for 60 copies is " + total_cost(60));
}
