package Test3D;

public class Polygon2DTest {

    public static void main(String[] args) {
        Window window = new Window(800, 800);

        window.setViewPort(200, 200);

        window.shiftViewPort(200, 200);

        window.clearScreen();

        Vector2D[] points = {
                new Vector2D(-200.0f, 0.0f),
                new Vector2D(200.0f, 0.0f),
                new Vector2D(-200.0f, -600.0f),
                /*
                new Vector2D(10.0f, -20.0f),
                new Vector2D(5.0f, -40.0f),
                new Vector2D(-5.0f, -59.0f),
                new Vector2D(-10.0f, -0.0f),
                new Vector2D(-20.0f, 20.0f),
                 */
        };

        Polygon2D p = new Polygon2D(points);

        Functions.bindWindow(window);
        Functions.drawPolygon2D(p);
    }
}
