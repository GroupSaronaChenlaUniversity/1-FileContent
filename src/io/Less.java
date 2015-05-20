package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Less
{
    public static void main(String args[]) throws IOException
    {
        FileReader reader = new FileReader(args[0]);
        BufferedReader buff = new BufferedReader(reader);
        String readLine;
        int lineCount = 0;
        while ((readLine = buff.readLine()) != null)
        {
           System.out.println(readLine);
            lineCount++;
            if (lineCount > 10)
            { 
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
            }
        }
     }
}