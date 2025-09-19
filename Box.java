public class Box {
    // attributes
    private double height;
    private double width;
    private double length;
    private String color;
    private boolean hasALid; 

    /* 
     * Constructor - sets all of the attributes 
     */
    public Box (double h, double l, double w, String c, boolean lid){
        height = h;
        length = 1;
        width = w;
        color = c;
        hasALid = lid;
    }

    /*
     *  Overloaded constructor
     */
    /*
    * Default constructor
    */
    public Box(double h, double l, double w){
        height = h;
        length = 1;
        width = w;
        color = "brown";
        hasALid = false;
    }
    public double getHeight(){
        return height;
    }

    public void setHeight(double h){
        height = h;
    }

    public String getColor(){
        return color;

    }

    public double getVolume(){
        double v = height * width * length;
        return v;
    }
    public static void main(String[] args){
        Box b1 = new Box(5.4, 8.3, 2.7, "purple", true);
        Box b2 = new Box(8.2, 4.7, 6.0, "green", false);

        double h = b1.getHeight();
        System.out.println(h);
        b1.setHeight(7.5);
        System.out.println(b1.getHeight());
        System.out.println(b2.getColor());
        System.out.println(b1.getVolume());
        System.out.println(b2.getVolume());
        
        int x = 5;
        String name = "Howdy Doody";
        System.out.println(x);
        System.out.println(name);
        System.out.println(b1);
    }
        /*
         * toString - allows us to print a Box
         * @return String
         */
        public String toString(){
            String s = "A box with dimensions " + height + " " + length + " " + width;
            s += " Its color is " + color + " and it has a lid?" + hasALid;
            return s;
        }

}