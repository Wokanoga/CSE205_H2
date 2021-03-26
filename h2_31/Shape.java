import java.math.*;

public class Shape {

    private int totalSides;
    private double area;
    private double circumference;
    private double perimeter;

    // square/rectangle
    shape(int side1, int side2){

    }

    // triangle
    shape(int side1, int side2, int side3){
        totalSides = 3;
        perimeter = side1+side2+side3;
        // hP = half perimeter
        double hP = perimeter / 2;
        area = Math.sqrt(hP*(hP-side1)*(hP-side2)*(hP-side3));
    }

    // 
    shape(int radius){
        totalSides = 1;
        area = radius*radius*Math.PI;
        circumference = radius*2*Math.PI;
    }
}
