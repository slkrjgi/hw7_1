import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Triangle(0, 0, 1 ,10, 3, 20);
        shapes[1] = new Rectangle(0, 0, 0, 4, 5, 4, 5, 0);
        shapes[2] = new Circle(0, 0, 0, 2);


        shapes[0].color = "Pink";
        shapes[1].color = "Red";
        shapes[2].color = "Purple";


        for (int i = 0; i < shapes.length; i++) {
            shapes[i].paint();
            System.out.println();
        }

            Triangle firstTriangle = new Triangle(0, 0, 1 ,10, 3, 20);
            Triangle secondTriangle = new Triangle(0, 0, 1 ,10, 3, 20);

            Rectangle firstRectangle = new Rectangle(0, 0, 0, 4, 5, 4, 5, 0);
            Rectangle secondRectangle = new Rectangle(0, 0, 0, 4, 5, 4, 5, 0);

            Circle firstCircle = new Circle(0, 0, 0, 2);
            Circle secondCircle = new Circle(0, 0, 0, 2);

            // не знайшла чи можемо ми порівняти об'єкт сабкласа як об'єкт так як елемент масива об'єктів
            // якщо так то буду вдячна за підказку в комменті до ДЗ

            System.out.println("Triangles equal: " + firstTriangle.equals(secondTriangle));
            System.out.println("Rectangles equal: " + firstRectangle.equals(secondRectangle));
            System.out.println("Circles equal: " + firstCircle.equals(secondCircle));
    }
}