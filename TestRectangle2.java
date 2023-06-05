class Rectangle{
int length;
int width;
void insert(int i,int w){
length=i;
width=w;
}
void calculateArea(){
System.out.println(length*width);}
}
class TestRectangle2{
public static void main(String args[]){
Rectangle r1=new Rectangle(),r2=new Rectangle();//creating two objects
r1.insert(11,6);
r2.insert(15,7);
r1.calculateArea();
r2.calculateArea();
}
}
