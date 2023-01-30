/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication82;

/**
 *
 * @author LENOVO
 */
public class JavaApplication82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        doublelinked list=new doublelinked();
       list.addfirst("shadi");
        list.first();
    //  list.removefirst();
        list.addlast("tabash");
        list.InsertAfter(list.header, "3");
        list.deleteNode("shadi");
        list.printlist(list.header.next);
        list.last();
     //  list.removelast();
       
        
    }
    
}
