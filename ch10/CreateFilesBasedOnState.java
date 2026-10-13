// alexis bowen
// p 473

import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption..*;
import java.util.Scanner;
import java.text.*;



public class CreateFilesBasedOnState 
{
public static void main(String[] args)
{
 Scanner input = new Scanner(System.in);
 Path instateFile =
    Paths.get("InStateCusts.txt");
Path outOfStateFile = 
    Paths.get("OutOfStateCusts.txt");
final String id_format = "000";
final String name_format =  "                ";
final int name_length = name_format.length();
final String home_stae = "WI";
final String balance_format = "0000.00";
String delimiter = ",";
String s = id_format + + delimiter + name_Format + 
    delimiter + home_state + delimiter + balance format;
    System.getProperty("line separator");
    final int recsize = s.length();
    FileChannel fcIn = null; 
    FileChannel fcOut = null;
    String idString;
    int id;
    String name;
    double balance;
    final String quit ="999";    createEmptyFile(inStateFile, s);
    createEmptyFile(outOfStateFile, s);
    }
    public static void createEmptyFile(Path file String args)
    {
        public class static void createEmptyFile(Pth file, strings)
    {
        final int numrecs = 1000;
        try
        {
            OutputStream outputStr =
            new BufferedOutputStream
            (Files.newOutputStream(file.CREATE));
        BufferedWriter writer =
        new BufferedWriter(new OutputStreaWriter(outputStr));
        for int count = 0; count < numrecs; ++
        }
    }
    }
}