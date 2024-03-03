import com.sun.security.jgss.GSSUtil;

public class Light
{
    public static void main(String[] args) {

        int lightspeed;
        long days;
        long seconds;
        long distance;

        //approximate speed of the light in miles per second
        lightspeed=186000;

        days=1;  // specify the numbers of days here

        seconds=days*24*60*60;

        distance=lightspeed * seconds;

        System.out.println("In days "+days);
        System.out.println("days light will travel about");
        System.out.println(distance + " miles");


    }
}
