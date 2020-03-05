package com.sonarsource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //TODO a todo
    }
    private static final int MAX_PRICE = 10;
    public void setPriceGitChecks(int price) {
        assert price >= 0 && price <= MAX_PRICE;
        // Set the price
    }




    public void aMethod(){
        int i=0;
        while (i<10){
            i++;
        }}

}
