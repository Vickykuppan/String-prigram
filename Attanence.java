public class Attanence
{
public static void main(String args[])
{
String names[]={"sam","raj","azar","zara","ram","raj"};
for(int i=0;i<names.length;i++)
{
for(int j=i+1;j<names.length;j++)
{
if(names[i].compareTo(names[j])>0)
{
String temp=names[i];
names[i]=names[j];
names[j]=temp;
}

}
}
for(String s:names)
{
System.out.println(s);
}

}
}
