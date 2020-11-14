import java.util.*;
class Box
{
    public int volume(int l, int w, int h)
    {
        int vol=l*h*w;
        return(vol);
    }
}

class Demo extends Box
{
    int ln, wd, ht;
    public void d()
    {
        Box b=new Box();
        b.vol(ln, wd, ht);
        System.out.println("Volume of the box with the given dimensions is "+v);
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of length, width and height respectively : ");
        ln=sc.nextInt();
        wd=sc.nextInt();
        ht=sc.nextInt();
        d();
    }
}