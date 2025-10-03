public class Circle {
    private double radius;
    public Circle(double r)
    {
        radius = r;
    }

// Calculates the area of a circle
// @return area - returns the area of the circle

    public double area() {
    double area = Math.PI*Math.pow(radius,2);
    
    return area;
}

// Calculates circumference of a circle
// @return circumference - returns the circumference of the circle
public double circumference() {
    double circumference = Math.PI*2*radius;
    return circumference;
}
}