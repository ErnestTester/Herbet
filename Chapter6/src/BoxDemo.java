class Box
{
    double width;
    double height;
    double dept;
}

class BoxDemo {
    public static void main(String[] args) {
        Box myBox=new Box();
        double vol;

        //assign values to myBox's instance variables
        myBox.width=10;
        myBox.height=20;
        myBox.dept=15;

        //compute volume of box
        vol= myBox.dept *myBox.height * myBox.width;
        System.out.println("Volume is: "+vol);

    }
}
