package exercise;

// BEGIN
import lombok.Getter;

@Getter
public class Segment {
     private Point beginPoint;
     private Point endPoint;

     public Segment(){}

     public Segment(Point beginPoint, Point endPoint) {
         this.beginPoint = beginPoint;
         this.endPoint = endPoint;
     }
     public Point getMidPoint() {
	 return new Point((beginPoint.getX() + endPoint.getX()) / 2,
                        (beginPoint.getY() + endPoint.getY()) / 2 );
     }
// END
