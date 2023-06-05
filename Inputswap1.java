import java.util.Scanner;
class Inputswap2{
public static void main(String args[]){
Scanner sul=new Scanner(System.in);
int num1,num2;
num1=sul.nextInt();
num2=sul.nextInt();
int temp;
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.print(num1+""+num2);
}
}
