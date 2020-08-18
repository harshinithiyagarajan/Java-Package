/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise4;
import package1.first;
import package1.second;
import package2.first1;
import package1.subpack.sub;



/**
 *
 * @author Thiagarajan
 */
public class packsubpack {
    public static void main(String[] args){
    first obj=new first();
    obj.pack();
    second obj2=new second();
    obj2.print();
    first1 obj1=new first1();
    obj1.sec();
    sub obj3=new sub();
    obj3.third();
    
    }
    
}
