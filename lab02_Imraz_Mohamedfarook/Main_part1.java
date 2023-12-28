import java.awt.Canvas;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main_part1 {
    public static void main(String[] args) {
        Canvas newCanvas = new Canvas();

        Rect newRectTop = new Rect();
        newRectTop.makeVisible();
        newRectTop.moveHorizontal(-220);
        newRectTop.changeSize(160,70);
        newRectTop.moveVertical(-70);


        Square newSquare = new Square();
        newSquare.makeVisible();
        newSquare.moveHorizontal(-135);
        newSquare.changeColor("blue");
        newSquare.moveVertical(-50);


        Square newSquareLeft = new Square();
        newSquareLeft.makeVisible();
        newSquareLeft.moveHorizontal(-210);
        newSquareLeft.changeColor("blue");
        newSquareLeft.moveVertical(-50);


        Person newPerson = new Person();
        newPerson.makeVisible();
        newPerson.changeColor("black");
        newPerson.moveVertical(-87);
        newPerson.moveHorizontal(-75);


        Rect newRectLap = new Rect();
        newRectLap.makeVisible();
        newRectLap.moveHorizontal(-220);
        newRectLap.changeSize(220,90);


        Circle newCircleLap = new Circle();
        newCircleLap.makeVisible();
        newCircleLap.moveVertical(90);
        newCircleLap.changeColor("Black");


        Circle newCircleLeftLap = new Circle();
        newCircleLeftLap.makeVisible();
        newCircleLeftLap.moveVertical(90);
        newCircleLeftLap.changeColor("black");
        newCircleLeftLap.moveHorizontal(-125);


        Triangle newTriangleLap = new Triangle();
        newTriangleLap.makeVisible();
        newTriangleLap.changeColor("yellow");
        newTriangleLap.moveVertical(150);
        newTriangleLap.moveHorizontal(-45);
        newTriangleLap.changeSize(30,30);

    }
}