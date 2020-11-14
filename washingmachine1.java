
interface motor
{
int capacity=50;
void run();
void consume();
}
class wm implements motor
{
public static void main(String args[])
{
wm w=new wm();
w.run();
w.consume();
}
public void run()
{
System.out.println("Capacity at which the motor is running is "+capacity);
}
public void consume()
{
System.out.println("The electricity consumed by motor running at full capacity is "+capacity);
}
}