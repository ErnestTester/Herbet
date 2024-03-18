class Box2
{
    double width;
    double height;
    double depth;
}
 class BoxDemo2 {

     public static void main(String[] args)
     {
         Box2 myBox1=new Box2();
         Box2 myBox2=new Box2();
         double  vol;

         myBox1.width=10;
         myBox1.height=20;
         myBox1.depth=15;

         //assign different values to myBox2
         myBox2.width=3;
         myBox2.height=6;
         myBox2.depth=9;

         vol=myBox1.width*myBox1.height*myBox1.depth;
         System.out.println("The Volume is: "+vol);


         vol=myBox2.width*myBox2.height*myBox2.depth;
         System.out.println("The Volume is: "+vol);

     }

}

