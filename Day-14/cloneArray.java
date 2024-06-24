//Java Program to clone the array  
class cloneArray{  
public static void main(String args[]){  
int arr[]={33,3,4,5};  
System.out.println("\nPrinting original array:");  
for(int i:arr)  
{
    System.out.print(" "+ i);
}  
  
System.out.println("\nPrinting clone of the array:");  
int carr[]=arr.clone();  
for(int i:carr)  
{
    System.out.print(" "+ i); 
} 
  
System.out.println("\n Are both equal?");  
System.out.println(arr==carr);  
  
}}  