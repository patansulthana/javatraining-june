import java.util.Scanner;
class Test3a{
public static void main(String args[])
{
Scanner sul=new Scanner(System.in);
int num=sul.nextInt();
int inc=sul.nextInt();
for(int i=0;i<=num;i=i+inc){
System.out.print(i);
if(i<num){
System.out.print(",");
}
}
}
}
