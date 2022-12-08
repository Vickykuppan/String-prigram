public class StackOverFlow
{
void display()
{
System.out.println("HELLO WORLD");
display();
}
public static void main(String args[])
{
StackOverFlow obj=new StackOverFlow();
obj.display();
}
}


