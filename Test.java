public class Test {
public static int[] mystery(int[] a)
{
int[] b=a;
b[2]=40;
return b;
}

public static void main(String [] args){
int[] x={10,20,30};
int[] y=mystery(x);
System.out.println(x[2]+" "+(x==y));
}



}