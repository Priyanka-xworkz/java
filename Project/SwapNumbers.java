class SwapNumbers{
public static void main(String[] args){
//using third variable
int a=25;
int b=20;
int c=0;
System.out.println("Value of a and b before swapping "+a+"  " +b);
c=a;
a=b;
b=c;
System.out.println("Value of a and b after swapping "+a+ " "+b);
//without third variable

int x=10;
int y=20;

System.out.println("Value of x and y before swapping "+x+ " "+y);
x=x+y;
y=x-y;
x=x-y;
System.out.println("Value of x and y after swapping "+x+ " "+y);
}


}