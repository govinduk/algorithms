package linkedlist;

public class SingletonTest {

    private static SingletonTest t=null;
     private SingletonTest(){

     }
     public static SingletonTest getTest(){
         if(t==null){
             t=new SingletonTest();
         }
         return  t;
     }

     public static void main(String args[]){
         System.out.println(SingletonTest.getTest().hashCode());
         System.out.println(SingletonTest.getTest().hashCode());
         System.out.println(SingletonTest.getTest().hashCode());

     }


}
