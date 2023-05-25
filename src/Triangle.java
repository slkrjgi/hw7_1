public class Triangle extends Shape{

    private int[] a = new int[2];
    private int[] b = new int[2];
    private int[] c = new int[2];

    public Triangle() {

    }

    public Triangle (int a0, int a1, int b0, int b1, int c0, int c1) {
        this.a[0] = a0;
        this.a[1] = a1;
        this.b[0] = b0;
        this.b[1] = b1;
        this.c[0] = c0;
        this.c[1] = c1;
    }

    @Override
    public boolean equals(Shape obj) {
        Triangle triangle = (Triangle) obj;
            boolean isEqual = false;
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        int condition = 0;

        if (this.a[0] == ((Triangle) obj).a[0] && this.a[1] == ((Triangle) obj).a[1]) {
            condition++;
        }
        if (this.b[0] == ((Triangle) obj).b[0] && this.b[1] == ((Triangle) obj).b[1]) {
            condition++;
        }
        if (this.c[0] == ((Triangle) obj).c[0] && this.c[1] == ((Triangle) obj).c[1]) {
            condition++;
        }
        if (condition==3) {
            isEqual = true;
        }

        return isEqual;
    }

    @Override
    public int hashCode() {
        int result = this.color == null ? 0 : color.hashCode();
        result = 29 * result + this.a[1];
        result = 29 * result + this.b[0];
        return result;
    }

    @Override
    public String toString() {
        return  "Triangle coordinates: " + a[0] + "," + a[1] + "; " + b[0] + "," + b[1] + "; " + c[0] + "," + c[1] + ".\n"
                + "Area: " + this.calculateArea() + ".\n"
                + "Perimeter: " + this.calculatePerimeter() + ".\n"
                + "Color: " + this.color + ".";
    }


    @Override
    public double calculateArea() {
        return 0.5 * Math.abs((this.b[0] - this.a[0]) * (this.c[1] - this.a[1]) - (this.c[0] - this.a[0]) * (this.b[1] - this.a[1]));
    }

    @Override
    public double calculatePerimeter() {
        double abLength = Math.sqrt((Math.pow((this.b[0]-this.a[0]), 2)+Math.pow((this.b[1]-this.a[1]), 2)));
        double bcLength = Math.sqrt((Math.pow((this.b[0]-this.c[0]), 2)+Math.pow((this.b[1]-this.c[1]), 2)));
        double acLength = Math.sqrt((Math.pow((this.c[0]-this.a[0]), 2)+Math.pow((this.c[1]-this.a[1]), 2)));
        return abLength+bcLength+acLength;
    }

    @Override
    public void paint() {
        System.out.println(this);
    }

}
