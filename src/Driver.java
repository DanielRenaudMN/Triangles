
public class Driver {

	public static void main(String[] args) {
		Point pointA = new Point(1, 2);
		Point pointB = new Point(3, 4);
		Point pointC = new Point(5, 6);
		Point pointD = new Point(7, 8);
		Point pointE = new Point(9, 10);
		Point pointF = new Point(11, 12);
		Point pointG = new Point(13, 14);
		Point pointH = new Point(14, 15);
		Point pointI = new Point(16, 17);
		// assert pointA.getX() == 5; correctly throws assertion error
		assert pointA.getX() == 1;
		assert pointA.getY() == 2;
		System.out.println(pointA instanceof Point);
		System.out.println(pointA.toString());
		assert pointA.equals(pointB) == false;
		assert pointA.equals(pointA) == true;
		Triangle firstTriangle = new Triangle(pointA, pointB, pointC);
		Triangle secondTriangle = new Triangle();
		Triangle thirdTriangle = new Triangle(pointG);
		secondTriangle.setPoint(0, pointD);
		secondTriangle.setPoint(1, pointE);
		secondTriangle.setPoint(2, pointF);
		thirdTriangle.setPoint(1, pointH);
		thirdTriangle.setPoint(2, pointI);
		assert firstTriangle.equals(firstTriangle) == true;
		assert firstTriangle.equals(secondTriangle) == false;
		assert firstTriangle.getId() == 1;
		Triangles listOfTriangles = new Triangles();
		listOfTriangles.addTriangle(firstTriangle);
		listOfTriangles.addTriangle(secondTriangle);
		listOfTriangles.addTriangle(thirdTriangle);
		assert listOfTriangles.deleteTriangle(firstTriangle) == firstTriangle;
		assert listOfTriangles.deleteTriangle(firstTriangle) == null;
		assert listOfTriangles.getTriangle(2) == secondTriangle;
		System.out.println(listOfTriangles.toString());

	}

}
