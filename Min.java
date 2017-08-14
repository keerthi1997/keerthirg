import java.util.*;
class Min
{
public static void main(String ar[])throws Exception
{
    int r,h,k;
    int a[]=new int[100];
Scanner sc=new Scanner(System.in);
Min m1=new Min();
String g=new String();
g=sc.next();
k=sc.nextInt();
int n=Integer.parseInt(g);
h=0;
while(n>0)
{
r=n%10;
a[i++]=r;
n/=10;
}
m1.sort(g,k,h);
}
public void sort(int l[],int m,int g)
{
    int t;
for(int i=0;i<g-1;i++)
{
for(int j=i+1;j<g;j++)
{
if(l[i]>l[j])
{
t=l[i];
l[i]=l[j];
l[j]=t;
}
}
}
for(int i=0;i<m;i++)
    System.out.print(l[i]);
}
}
