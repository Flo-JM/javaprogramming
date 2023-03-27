class Swap2
{


public static void main (String[] args){
 
	int a=1000;
	int b=100;

//output as a=100 b=1000

a=a+b;//a=1100
b=a-b;//b=1000
a=a-b;//a=100


System.out.println("The value of a is "+a+"");
System.out.println("The value of b is "+b+"");
}
}