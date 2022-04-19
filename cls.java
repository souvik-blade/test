// class Box
// {
//     double l,b,h;
//     double totA(){
//         double t=2*(l*b+b*h+l*h);
//         return t;
//     }
//     double latA(){
//         double L=2*h*(l+b);
//         return L;
//     }
//     double volume(){
//         return(l*b*h);
//     }

//     Box()
//     {
//         l=5.0;
//         b=4.5;
//         h=3.0;
//     }
//     Box(double x,double y,double z){
//         l=x;
//         b=y;
//         h=z;
//     }
//     Box(Box T){
//         l=T.l;
//         b=T.b;
//         h=T.h;
//     }
// }

class animal
{
    animal()
    {
        System.out.println("eats");
        System.out.println("walks");
        System.out.println("sleeps");
    }


    /////dsdsdsds
}


class cat extends animal
{
    cat(){
        System.out.println("species cat");
        System.out.println("category Tiger,Lion");
    }
}



public class cls 
{
    public static void main(String args[])
    {
        // Box B=new Box();
        // Box B1=new Box(7.0,8.5,3.3);//takes double argument only.
        // Box B3=B1;
        cat c=new cat();        


        // System.out.println(B.l);
        // System.out.println(B.b);
        // System.out.println(B.h);
        // System.out.println(B.totA());
        // System.out.println(B.volume());
        // System.out.println(B.latA());

        // System.out.println(B1.l);
        // System.out.println(B1.b);
        // System.out.println(B1.h);
        // System.out.println(B1.totA());
        // System.out.println(B1.volume());
        // System.out.println(B1.latA());

        // System.out.println(B3.l);
        // System.out.println(B3.b);
        // System.out.println(B3.h);
        // System.out.println(B3.totA());
        // System.out.println(B3.volume());
        // System.out.println(B3.latA());


    }    
}

