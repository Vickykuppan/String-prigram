public class BuilderTime
{
public static void main(String args[])
{
long starttime=System.currentTimeMillis();
StringBuilder sb=new StringBuilder("java");
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
