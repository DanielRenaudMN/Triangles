import java.util.Arrays;

/**
 * @author Daniel Renaud;
 * */

/**
 * The Triangle uses an array of the Point class to hold the three coordinates
 * that make up the triangle.
 *
 */
public class Triangle {
	private Point[] vertices = new Point[3];
	private int id;
	private static int idCounter = 0;

	/**
	 * A constructor that accepts the three points to be used to make up the
	 * triangle.
	 */
	public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
		super();
		this.vertices[0] = firstPoint;
		this.vertices[1] = secondPoint;
		this.vertices[2] = thirdPoint;
		this.id = ++idCounter;
	}

	/**
	 * A constructor that uses the above constructor to create an instance of the
	 * Triangle class with no assigned points (inserting three null values).
	 */
	public Triangle() {
		this(null, null, null);
	}

	/**
	 * A constructor that accepts a single point and uses the first constructor,
	 * inserting the point along with two null values.
	 */
	public Triangle(Point firstPoint) {
		this(firstPoint, null, null);
	}

	/**
	 * A method to insert a passed point into a chosen slot in the array.
	 * 
	 * @param index
	 * @param point
	 */
	public void setPoint(int index, Point point) {
		if ((index >= 0) && (index <= 2)) {
			this.vertices[index] = point;
		}
	}

	/**
	 * toString method that displays all the fields of every instance of the Point
	 * class in the triangle, and the triangle's id.
	 */
	@Override
	public String toString() {
		return "Triangle [vertices=" + Arrays.toString(vertices) + ", id=" + id + "]";
	}

	/**
	 * A hashCode method for the class.
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + Arrays.hashCode(vertices);
		return result;
	}

	/**
	 * An equals method that compares one triangle to another. Two triangles are
	 * equal if they have the same id.
	 */
	@Override
	public boolean equals(Object triangle) {
		if (this == triangle) {
			return true;
		}
		if (triangle == null) {
			return false;
		}
		if (getClass() != triangle.getClass()) {
			return false;
		}
		Triangle other = (Triangle) triangle;
		if (id != other.id) {
			return false;
		}
		return true;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

}
