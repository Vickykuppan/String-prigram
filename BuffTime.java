public class BuffTime
{
public static void main(String args[])
{
long starttime=System.currentTimeMillis();
StringBuffer sb=new StringBuffer("java");
for(int i=1;i<=100000;i++)
{
sb.append("pro");
}
long endtime=System.currentTimeMillis();
{
System.out.println(endtime-starttime);
}
}

}
