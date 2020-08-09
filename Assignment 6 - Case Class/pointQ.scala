import scala.math

object pointQ extends App{
	case class Point(a: Int, b: Int){
		def x: Int = a
		def y: Int = b
		def +(that: Point) = Point(this.x + that.x, this.y + that.y)
		def move(dx: Int, dy: Int) = Point(this.x + dx, this. y + dy)
		def invert = Point(this.y, this.x)
		def distance = (that: Point) => math.sqrt(math.pow(this.x - that.x, 2) + math.pow(this.y - that.y, 2))
		
		override def toString = "(" + x + ", " + y + ")"
	}
	
	
		val p1 = Point(2, 5);
		val p2 = Point(3, 6);
		printf("Points used in the demonstration are p1(2, 5) and p2(3, 6).");
		printf("\n\tp1 + p2 => "); print(p1 + p2);
		printf("\n\tMoving p1 by 1 unit in both x and y directions => "); print(p1.move(1, 1));
		printf("\n\tInverting p2 => "); print(p2.invert);
		printf("\n\tDistance between p1 and p2 => "); print(p1.distance(p2));
		printf("\n");
}
