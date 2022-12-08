/*public class StringReverse
{
public static void main(String args[])
{
String s="I AM LEARNING JAVA";
for(int i=s.length()-1;i>=0;i--)
{
System.out.println(s.charAt(i));

}

}
}*/


/*public class StringReverse
{
public static void main(String args[])
{
String s="I AM LEARNING JAVA";
String splits[]=s.split(" ");
String reverse=" ";
for(int i= splits.length-1;i>=0;i--)
{
reverse +=splits[i]+" ";
}
System.out.println(reverse);
}
}*/


/*public class StringReverse
{
public static void main(String args[])
{
String s="I AM LEARNING JAVA";
String splits[]=s.split(" ");
for(int i=0;i<s.length();i++)
{
System.out.print(s.charAt(i));
}
for(int i=splits.length-1;i>=0;i--)

System.out.print(i);
}
}*/



public class StringReverse
{
public static void main(String args[])
{
String input="I AM LEARNING JAVA";
StringBuilder input1=new StringBuilder();
input1.append(input);
input1.reverse();
{
System.out.println(input);
}
}
}



