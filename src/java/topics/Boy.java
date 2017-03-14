package com.java.topics;
//class Human
//{
//        String s1, s2;
//        public Human()
//        {
//              s1 ="Super class";
//              s2 ="Parent class";
//        }
//        public Human(String str)
//        {
//               s1= str;
//               s2= str;
//        }
//        public void disp(int a){System.out.println("Nothing"+a);}
//}
//class Boy extends Human
//{
//	public Boy()
//	{
//	    // super("calling super one");
//	     s2 ="Child class";
//	}
//	//private Boy(int num){}
//	//public void Boy(){}
//        public void disp()
//        {
//               System.out.println("String 1 is: "+s1);
//               System.out.println("String 2 is: "+s2);
//        }
//        public static void main(String args[])
//        {
//                Boy obj = new Boy();
//                obj.disp();
//        }
//}

class Human{
   public void eat()
   {
      System.out.println("Human is eating");
   }
   public void riding()
   {
      System.out.println("Human is riding");
   }
   
}
class Boy extends Human{
   public void eat(){
      System.out.println("Boy is eating");
   }
   public void sleep(){
	   System.out.println("Boy is sleeping");  
   }
   public static void main( String args[]) {
      Boy obj = new Boy();
      obj.eat();
      obj.riding();
      obj.sleep();
      
   }
}