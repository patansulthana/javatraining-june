//java program to illustarte how to define a class and feilds
//Defining a student class

class Student{
//defining fields
int id; //field or data member or instance variable
String name;
//creating main method inside the student class
public static void main(String args[]){
//creating an object or instance
Student s1=new Student(); //creating an object of a student
//printing value of the object
System.out.println(s1.id); //accessing member through reference variable
System.out.println(s1.name);
}
}
