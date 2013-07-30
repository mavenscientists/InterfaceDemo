/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedemo;

/**
 *
 * @author hp
 */
public interface MyInterface extends MyInterface1, MyInterface2
{
    //MyInterface fields - are by default public, static and final
    int value = 23;
    String name = "Shiwani";
    
    void method();
    void method1();
    
}
