public class Scope {
    public static void main(String[] args) {
        int x; //know to all code within main method
        x=10;
        if(x == 10)
        {
            int y=20;
           // x  & Y know here
            System.out.println("x and y: " +x +" "+y);
            x=y*2;
        }

        // y not know here
        System.out.println("x : " +x );


    }
}
