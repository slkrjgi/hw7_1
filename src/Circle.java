public class Circle extends Shape{
    private int center[] = new int[2];
    private int a[] = new int[2];

    public Circle() {

    }

    public Circle(int center0, int center1, int a0, int a1) {
        this.center[0] = center0;
        this.center[1] = center1;
        this.a[0] = a0;
        this.a[1] = a1;

    }

    @Override
    public boolean equals(Shape obj) {
        boolean isEqual = false;
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this.center[0] == ((Circle) obj).center[0] && this.center[1] == ((Circle) obj).center[1] && this.a[0] == ((Circle) obj).a[0] && this.a[1] == ((Circle) obj).a[1]) {
            isEqual = true;
        }
        return isEqual;
    }

    @Override
    public int hashCode() {
        int result = this.color == null ? 0 : color.hashCode();
        result = 29 * result + this.center[1];
        result = 29 * result + this.a[0];
        return result;
    }

    @Override
    public String toString() {
        return "Circle coordinates: " + center[0] + "," + center[1] + "; " + a[0] + "," + a[1] + ".\n"
                + "Area: " +this.calculateArea() + ".\n"
                + "Perimeter: " + this.calculatePerimeter() + ".\n"
                + "Color: " + this.color;
    }

    @Override
    public double calculateArea() {
    double radius = Math.sqrt((Math.pow((this.center[0]-this.a[0]), 2)+Math.pow((this.center[1]-this.a[1]), 2)));
    return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        double radius = Math.sqrt((Math.pow((this.center[0]-this.a[0]), 2)+Math.pow((this.center[1]-this.a[1]), 2)));
        return 2*(Math.PI*radius);
    }

    @Override
    public void paint() {
        System.out.println(this);
    }

}
