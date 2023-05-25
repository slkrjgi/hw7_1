public class Shape {
    public String color;
    protected int center[] = new int[2];

    protected int[] a = new int[2];
    protected int[] b = new int[2];
    protected int[] c = new int[2];
    protected int[] d = new int[2];

    public Shape () {

    }
    // не знайшла як можна оверрайднути метод з обджекту, бо там не буде потрібних аргументів
    public boolean equals(Shape obj){
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public double calculateArea() {
        return 0;
    }

    public double calculatePerimeter() {
        return 0;
    }

    public void paint() {

    }




}
