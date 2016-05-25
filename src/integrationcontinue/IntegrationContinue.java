/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrationcontinue;

/**
 *
 * @author Nold
 */
public class IntegrationContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isPair1(3));
        
        System.out.println("Ceci est un test de commit");
    }
    
    /**
     * Check if number is pair
     * Return true if number is pair
     * This method is right
     * @param number
     * @return 
     */
    public static boolean isPair1(int number){
        
        return (number%2 == 0) ? true : false;
    }
    
    /**
     * This is the same method as the previous one
     * But this one is wrong.
     * @param number
     * @return 
     */
    public static boolean isPair2(int number){
        
        return (number%2 == 0) ? false : true;
    }
    
}
