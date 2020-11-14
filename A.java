  
public class Animal{  
    Animal(){}  
	void A()
{
System.out.println("A of Animal");
}
    }  
    class Dog extends Animal{  
    Dog(){  }
     
    //System.out.println("dog is created"); 
	void A()
{
System.out.println("A of Dog");
} 
      
    }  
    class TestSuper{  
    public static void main(String args[]){  
    Dog d=new Dog(); 
    d.A(); 
    }}  
