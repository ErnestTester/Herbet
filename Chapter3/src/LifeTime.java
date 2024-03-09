public class LifeTime {
    public static void main(String[] args) {
        int x;

        for(x=0; x<3; x++)
        {
            int y=-1; //initialized each time blocl is entered
            System.out.println("y is"+y);
        }
    }
}
