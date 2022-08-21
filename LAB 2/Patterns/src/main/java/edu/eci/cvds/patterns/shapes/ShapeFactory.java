package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
	public static Shape create(RegularShapeType input) {
		Shape s = null;
		System.out.println(input.name());
		
		switch(input) {
		
			case Triangle:
				s = new Triangle();
				break;
			case Quadrilateral:
				s = new Quadrilateral();
				break;
			case Pentagon:
				s = new Pentagon();
				break;
			case Hexagon:
				s = new Hexagon();
		}
		return s;
	}
}