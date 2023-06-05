class Employee{
int id;
String name;
float salary;
void insert(int i,String n,float s){
id=i;
name=n;
salary=s;
}
void display(){
System.out.println(id+" "+name+" "+salary);
}
}
public class TestEmpolyee{
public static void main(String args[]){
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insert(475,"Sul",5500);
e2.insert(485,"Sulthana",6400);
e3.insert(496,"begum",4600);
e1.display();
e2.display();
e3.display();
}
}
