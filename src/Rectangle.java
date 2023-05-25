public class Rectangle extends Shape{

    private int[] a = new int[2];
    private int[] b = new int[2];
    private int[] c = new int[2];
    private int[] d = new int[2];

    public Rectangle() {

    }

    public Rectangle(int a0, int a1, int b0, int b1, int c0, int c1, int d0, int d1) {
        this.a[0] = a0;
        this.a[1] = a1;
        this.b[0] = b0;
        this.b[1] = b1;
        this.c[0] = c0;
        this.c[1] = c1;
        this.d[0] = d0;
        this.d[1] = d1;
    }

    @Override
    public boolean equals(Shape obj) {
        boolean isEqual = false;
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        int condition = 0;

        if (this.a[0] == ((Rectangle) obj).a[0] && this.a[1] == ((Rectangle) obj).a[1]) {
            condition++;
        }
        if (this.b[0] == ((Rectangle) obj).b[0] && this.b[1] == ((Rectangle) obj).b[1]) {
            condition++;
        }
        if (this.c[0] == ((Rectangle) obj).c[0] && this.c[1] == ((Rectangle) obj).c[1]) {
            condition++;
        }
        if (this.d[0] == ((Rectangle) obj).d[0] && this.d[1] == ((Rectangle) obj).d[1]) {
            condition++;
        }
        if (condition==4) {
            isEqual = true;
        }

        return isEqual;
    }

    @Override
    public int hashCode() {
        int result = this.color == null ? 0 : color.hashCode();
        result = 29 * result + this.a[1];
        result = 29 * result + this.d[0];
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle coordinates: " + a[0] + "," + a[1] + "; " + b[0] + "," + b[1] + "; " + c[0] + "," + c[1] + "; " + d[0] + "," + d[1] + ".\n"
                + "Area: " + this.calculateArea() + ".\n"
                + "Perimeter: " + this.calculatePerimeter() + ".\n"
                + "Color: " + this.color;
    }

    @Override
    public double calculateArea() {
        double abLength = Math.sqrt((Math.pow((this.b[0]-this.a[0]), 2)+Math.pow((this.b[1]-this.a[1]), 2)));
        double adLength = Math.sqrt((Math.pow((this.d[0]-this.a[0]), 2)+Math.pow((this.d[1]-this.a[1]), 2)));
        return abLength*adLength;
    }

    @Override
    public double calculatePerimeter() {
        double abLength = Math.sqrt((Math.pow((this.b[0]-this.a[0]), 2)+Math.pow((this.b[1]-this.a[1]), 2)));
        double adLength = Math.sqrt((Math.pow((this.d[0]-this.a[0]), 2)+Math.pow((this.d[1]-this.a[1]), 2)));
        return (abLength+adLength)*2;
    }

    @Override
    public void paint() {
        System.out.println(this);
    }

}
