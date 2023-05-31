public abstract class Shape {

    public String color;

    public Shape () {

    }
    // не знайшла як можна оверрайднути метод з обджекту, бо там не буде потрібних аргументів
    public boolean equals(Object obj){
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

    public static double getLength(int a[], int b[]) {
        return Math.sqrt((Math.pow((b[0]-a[0]), 2)+Math.pow((b[1]-a[1]), 2)));
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public void paint() {

    }




}
