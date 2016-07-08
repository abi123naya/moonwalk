# moonwalk
impor.java.util.*;
class trial
{ void pow(int c,int d)
 {
  int n=1;
  for(int i=0;i<d;i++)
    { n=n*c;
    }
     System.out.println(n);
  }
  


}
class Power
{ public static void main(String[] args)
   { int a,b;
   Scanner s= new Scanner(System.in);
     System.out.println("Enter the base number");
     a=s.nextInt();
     System.out.println("Enter the power");
    b=s.nextInt();
    trial t=new trial();
    t.pow(a,b);
   
   }




}
