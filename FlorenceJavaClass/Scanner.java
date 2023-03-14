class Scanner{

public static void main (String[] args)
  {

java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the season of the year");
String SeasonOfTheYear=scn.next();
System.out.println("Enter a whole number");
int numberOfCoffeeCups=scn.nextInt();
System.out.println("Enter an adjective");
String adjective=scn.next();
System.out.println("On a "+adjective+" "+SeasonOfTheYear+" day, I drink a minimum of "+numberOfCoffeeCups+" cups of coffee");

}
} 