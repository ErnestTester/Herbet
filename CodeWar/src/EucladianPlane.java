public class EucladianPlane {

    //Given a point in Eucladian Plane (x,y), retunr the cuadrant the point exists:1,2,3,4.


    public static void main(String[] args) {

        int x,y;
        x=-1;
        y=1;
        Quadrant(x,y);


    }


    static void Quadrant(int x, int y)
    {
        if((x>0) && (x>0))
        {
            System.out.println("The points:("+x +"," +y+") are in the Quadrant: " + "I");
        }
        else if((x<0)&&(y>0))
        {
            System.out.println("The points:("+x +"," +y+") are in the Quadrant: " +"II");
        }
        else if((x>0)&&(y<0))
        {
            System.out.println("The points:("+x +"," +y+") are in the Quadrant: " +"III");
        }
        else if((x>0)&&(y<0))
        {
            System.out.println("The points:("+x +"," +y+") are in the Quadrant: " +"IV");
        }


    }


}
