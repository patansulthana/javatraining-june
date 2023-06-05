import java.util.Scanner;
class Test3aa{
public static void main(String args[]){
Scanner sul=new Scanner(System.in);
int num=sul.nextInt();
int inc=sul.nextInt();
String str="";
for(int i=0;i<=num;i=i+inc){
str=str+i+",";
}
for(int i=0;i<str.length()-1;i++)
System.out.print(str.charAt(i));
}
}
