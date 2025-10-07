public class Cylinder {
    private Circle base;
         
    private double height;
    public Cylinder (double radius, double h) {
        base = new Circle (radius);
        height = h;
}
    // Calculates and returns the volume
    // @return v - returns volume of the cylinder
    public double volume() {
        double v = base.area()*height;
        return v;
    }

    // Calculates and returns the surface area
    // @return surfA - returns surface area of the cylinder
    public double surfArea() {
        double surfA = 2*base.area()+height*base.circumference();
        return surfA;
    }
}
