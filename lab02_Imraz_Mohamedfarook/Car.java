public class Car {
    private Rect newRectTop;
    private Square newSquare;
    private Square newSquareLeft;
    private Person newPerson;
    private Triangle newTriangleLap;
    private Circle newCircleLeftLap;
    private Circle newCircleLap;
    private Rect newRectLap;
    public Car(){
        //Canvas newCanvas = Canvas.getCanvas();
        newRectTop = new Rect();
        newSquare = new Square();
        newSquareLeft = new Square();
        newPerson = new Person();
        newRectLap = new Rect();
        newCircleLap = new Circle();
        newCircleLeftLap = new Circle();
        newTriangleLap = new Triangle();




    }
    public void draw(){
// Rect newRect = new Rect();
// newRect.makeVisible();
//newRect.moveHorizontal(-220);
//newRect.changeSize(220,90);


       // newRectTop = new Rect();
        newRectTop.makeVisible();
        newRectTop.moveHorizontal(-220);
        newRectTop.changeSize(160,70);
        newRectTop.moveVertical(-70);


//        newSquare = new Square();
        newSquare.makeVisible();
        newSquare.moveHorizontal(-135);
        newSquare.changeColor("blue");
        newSquare.moveVertical(-50);


//        newSquareLeft = new Square();
        newSquareLeft.makeVisible();
        newSquareLeft.moveHorizontal(-210);
        newSquareLeft.changeColor("blue");
        newSquareLeft.moveVertical(-50);


//        newPerson = new Person();
        newPerson.makeVisible();
        newPerson.changeColor("black");
        newPerson.moveVertical(-87);
        newPerson.moveHorizontal(-75);


//        newRectLap = new Rect();
        newRectLap.makeVisible();
        newRectLap.moveHorizontal(-220);
        newRectLap.changeSize(220,90);


//        newCircleLap = new Circle();
        newCircleLap.makeVisible();
        newCircleLap.moveVertical(90);
        newCircleLap.changeColor("Black");


//        newCircleLeftLap = new Circle();
        newCircleLeftLap.makeVisible();
        newCircleLeftLap.moveVertical(90);
        newCircleLeftLap.changeColor("black");
        newCircleLeftLap.moveHorizontal(-125);


//        newTriangleLap = new Triangle();
        newTriangleLap.makeVisible();
        newTriangleLap.changeColor("yellow");
        newTriangleLap.moveVertical(150);
        newTriangleLap.moveHorizontal(-45);
        newTriangleLap.changeSize(30,30);


    }
    public void highBeam(int highBeam){
        for(int i=0;i<=highBeam;i+=5){
            newTriangleLap.changeSize(i,i);
        }
        for(int j=highBeam;j>30;j-=5){
            newTriangleLap.changeSize(j,j);
        }
    }
}

