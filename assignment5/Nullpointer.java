/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

public class Nullpointer {

    public static void main(String args[]) 
    {
        String name = "";
        String a = null;
        try {
            Class.forName("Assignment4.Arithmetic1");

        } catch (NumberFormatException | ClassNotFoundException m) {
                    System.out.println(m.getMessage());

        }
    }
}
