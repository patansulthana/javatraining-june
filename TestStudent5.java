//Initializating object through constructor

class Student{
int rollno;
String name;
Student(){rollno=0;name=null;}
Student(int r,String n){
rollno=r;
name=n;
}
void displayInformation(){
System.out.println(rollno+" "+name);}
}
class TestStudent5{
public static void main(String args[]){
Student s1;
s1=new Student();
Student s2=new Student(475,"Sulthana");
s1.displayInformation();
s2.displayInformation();
}
}