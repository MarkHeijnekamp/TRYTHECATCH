package com.company;

public class Main {
        public static void main(String[] args){
            System.out.println("lets do some math");
            System.out.println("first lets start to do 1706 divided by 0");
            //try block = to handle Exception's
            //we try to do something that might bring up an error
            try {
                //we try to 1706 divided by 0
                //that concludeds to an error
                int example = 1706/0;
            }
            //catch is the fix for the error if there is the you said might appear
            //if that happens do the things between the brackets
            catch (ArithmeticException e){
                System.out.println("THIS ISSNT GONNA WORK IS IT ");
            }
            }
        }
        //Copyright © Mark Heijnekamp