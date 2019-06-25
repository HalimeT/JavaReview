package ReviewOfClass26;
class A{

public int i;

public int j;

}

class B extends A{

void display(){

super.j = super.i + 1;

System.out.println(super.i + " " + super.j);

}

}

public class Inheritance {

public static void main(String args[]){

B obj = new B();

obj.i=1;

obj.j=3;

obj.display();

}

}


