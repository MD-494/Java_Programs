package trycatchblock;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args){

        String str = null;
        try {
            IO.println(str.length());
        } catch (NullPointerException e){
            IO.println("String is null");
        }

        int[] arr = new int[10];
        try {
            IO.println(arr[15]);
        } catch (ArrayIndexOutOfBoundsException e){
            IO.println("Array index out of bounds");
        }
    }
}
