class MyFirstMethod{

//Create a method

public static void add(int a,int b){

System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
}

public static void main (String [] args){
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter a number");
int a=scn.nextInt();
System.out.println("Enter another number");
int b=scn.nextInt();
add(a,b);
}


}