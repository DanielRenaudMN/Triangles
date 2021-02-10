import java.util.LinkedList;

/**
 * @author Daniel Renaud
 */

/**
 * The Triangles class creates a LinkedList of type Triangle to hold the
 * instances of Triangles created so that group manipulation can occur.
 *
 */

public class Triangles {
	/**
	 * The below code creates a linked list of type Triangle to hold the triangles.
	 */
	private LinkedList<Triangle> triangles = new LinkedList<>();

	/**
	 * The addTriangle method adds a passed triangle into the linked list.
	 */
	public void addTriangle(Triangle aTriangle) {
		triangles.add(aTriangle);
	}

	/**
	 * The addTriangle method deletes a passed triangle from the linked list if it
	 * is in the list.
	 * 
	 * @param aTriangle
	 * @return
	 */
	public Triangle deleteTriangle(Triangle aTriangle) {
		int index = triangles.indexOf(aTriangle);
		if (index == -1) {
			return null;

		}
		return triangles.remove(index);
	}

	/**
	 * The getTriangle method checks each triangle in the list for the id passed as
	 * an argument. If a match is found, the index of the match is returned,
	 * otherwise a null value is returned.
	 */
	public Triangle getTriangle(int id) {
		int index = 0;
		while (index < triangles.size()) {
			if (id == triangles.get(index).getId()) {
				return triangles.get(index);
			}
			index++;
		}
		return null;

	}

	/**
	 * A toString method that displays all the fields of every instance of the Point
	 * class for each triangle in the linked list, and each triangle's id.
	 */
	@Override
	public String toString() {
		int index = 0;
		String output = "Triangles:";
		while (index < triangles.size()) {
			output += "\n" + triangles.get(index).toString();
			index++;
		}
		return output;
	}

}
