/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1personclass_luis_miguel_ramirez;
/**
 *
 * @author lmram
 */
public class MainPersonClass {
    
    
    
    public static void main(String[] args) {
      
       PersonClass Person = new PersonClass("Luis",'M',"29/06/2000","Cédula",102077005,"Coordinador",'S',true,true,"Basketball",true,'C',"Bogota");
       System.out.println("\n**********WELCOME!!!*********\n");
       Person.Basic_Info_Person();
       Person.work();
       Person.Sports_Practice();
       Person.City_Of_Living();
    }
}
