package com.rpam.rd.autotasks;
import  java.io.IOException;
import java.io.FileNotFoundException;

public class CatchEmAll {

    //You may set another exception in this field;
    static Exception exception = new FileNotFoundException();

    public static void riskyMethod() throws Exception {
        throw exception;

    }

    public static void main(String[] args) throws Exception {
        try {
            riskyMethod();
            System.out.println("Success");
        } catch (FileNotFoundException e) {
             throw new IllegalArgumentException("Resource is missing",e);
           
        } catch(IOException e){
             throw new IllegalArgumentException("Resource error",e);
        }
        catch(ArithmeticException | NumberFormatException e){
            System.err.println("Caught: "+ e.getMessage());
        }
        catch(Exception e){
            throw e;
        }
        
    }
}
