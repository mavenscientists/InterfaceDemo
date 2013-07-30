package interfacedemo;

import static interfacedemo.MyInterface.value;

/**
 *
 * @author  Karan Sharma
 * @time     Jul 30, 2013 8:56:49 AM 
 */
public class MyClass implements MyInterface 
{

    //MyClass field
    int field1;
    
    //Implementing abstract methods from MyInterface
    @Override
    public void method() 
    {
        System.out.println(value);
    }
    
    @Override
    public void method1()
    {
        
    }
    
    //MyClass Method
    void method2()
    {
        
    }
    
    public static void main(String[] args)
    {
        MyClass myclass = new MyClass();
        myclass.method();
    }
}
