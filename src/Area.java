import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class RectangleArea {
    double length;
    double width;
    double area;


    void getData() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the length of the rectangle: ");
            length = Double.parseDouble(reader.readLine());
            System.out.print("Enter the width of the rectangle: ");
            width = Double.parseDouble(reader.readLine());
        }
        void computeField() { area = length * width;}
    void fieldDisplay() {
        System.out.println("Length of the rectangle: " + length);
        System.out.println("Width of the rectangle: " + width);
        System.out.println("Area of the rectangle: " + area);
    }

    static void start() throws IOException {

      RectangleArea ra= new RectangleArea();
      ra.getData();
      ra.computeField();
      ra.fieldDisplay();


        }
}