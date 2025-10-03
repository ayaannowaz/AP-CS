public class Circle {
    private double radius;
    public Circle(double r)
    {
        radius = r;
    }
public double area() {
    double area = Math.PI*Math.pow(radius,2);
    
    return area;
}
public double circumference() {
    double circumference = Math.PI*2*radius;
    return circumference;
}
}