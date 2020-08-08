import scala.math

object pointQ extends App{
	case class Point(a: Int, b: Int){
		def x: Int = a
		def y: Int = b
		def +(that: Point) = Point(this.x + that.x, this.y + that.y)
		def move(dx: Int, dy: Int) = Point(this.x + dx, this. y + dy)
		
		override def toString = "(" + x + ", " + y + ")"
	}
	
	val invert = (iPt: Point) => Point(iPt.y, iPt.x)
	val distance = (p1: Point, p2: Point) => math.sqrt(math.pow(p1.x - p2.x, 2) + math.pow(p1.y - p2.y, 2))
	
		val p1 = Point(2, 5);
		val p2 = Point(3, 6);
		printf("Points used in the demonstration are p1(2, 5) and p2(3, 6).");
		printf("\n\tp1 + p2 => "); print(p1 + p2);
		printf("\n\tMoving p1 by 1 unit in both x and y directions => "); print(p1.move(1, 1));
		printf("\n\tInverting p2 => "); print(invert(p2));
		printf("\n\tDistance between p1 and p2 => "); print(distance(p1, p2));
		printf("\n");
}
