class Swap1{


public static void main (String[] args){
 
	int a=100;
	int b=200;

//output as a=200 b=100 

int temp;
temp=a;
a=b;
b=temp;
System.out.println("The value of a is "+a+"");
System.out.println("The value of b is "+b+"");
}
}