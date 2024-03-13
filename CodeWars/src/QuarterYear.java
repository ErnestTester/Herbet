public class QuarterYear
{

    public static void main(String[] args)
    {
        int x=3;
        quarterOf(x);
        System.out.println(quarterOf(6));
    }

    public static int quarterOf(int month)
    {
        // Your code here
        int result=0;

        if(month<=3)
        {
            result=1;
        }
        else if((month>=4)&&(month<=6))
        {
            result=2;
        }
        else if((month>6)&&(month<=9))
        {
            result=3;
        }
        else if(month>9)
        {
            result=4;
        }
        return result;
    }

}



