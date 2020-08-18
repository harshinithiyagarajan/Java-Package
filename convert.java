/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Scanner;



/**
 *
 * @author Thiagarajan
 */
public class convert {
    
    public void con()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("distance conversion");
        System.out.println("enter a number to convert into meter and kilometer");
        double n=obj.nextDouble();
        double km=n/1000;
        double m=n*1000;
        System.out.println(n+"m into kilometer -> "+km+"km");
        System.out.println(n+"km into meter -> "+m+"m");
        System.out.println("enter a number to convert into miles and kilometer");
        double a=obj.nextDouble();
        double mi=a/1.609;
        double k=a*1.609;
        System.out.println(a+"km into miles -> "+mi+"miles");
        System.out.println(a+"miles into kilometer -> "+k+"km");
    }
}
