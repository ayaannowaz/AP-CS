public class Complex {
    private double real;
    private double imag;

    public Complex(double r, double i) {
    real = r;
    imag = i;
    }
    public Complex(double r) {
    real = r;
    imag = 0.0;
    }
    public String toString() {
        return real + " + " + imag + "i";
    }
    public Complex add(Complex other) {
        double r = this.real + other.real;
        double i = this.imag + other.imag;
        Complex n1 = new Complex(r,i);
        return n1;
    }
    public Complex add(double x) {
        double r = real + x;
        double i = imag;
        Complex n2 = new Complex(r,i);
        return n2;
    }

    public Complex multiply(Complex other) {
        double r = this.real*other.real - this.imag*other.imag;
        double i = this.real*other.imag + other.real*this.imag;
        return new Complex(r,i);
    }
    public Complex multiply(double y) {
        double r = real*y;
        double i = imag*y;
        Complex n3 = new Complex(r,i);
        return n3;
    } 
    public static void main(String[] args) {
        Complex num1 = new Complex (1,2);
        Complex num2 = new Complex (2,3);
        Complex num3 = new Complex (0, 3);
        Complex num4 = new Complex (3,0);
        Complex num5 = new Complex (7,-9);
        Complex num6 = new Complex (-4,8);
        
        Complex apple = num1.add(num2);
        Complex banana = num3.multiply(num4);
        Complex cantaloupe = num5.add(7);
        Complex durian = num6.multiply(-4);

        System.out.println(apple);
        System.out.println(banana);
        System.out.println(cantaloupe); 
        System.out.println(durian);
    }
}