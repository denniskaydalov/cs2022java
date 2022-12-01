import java.util.Scanner;
public class BinarySearchTest
{
    public static void main( String args[] ){
        int searchKey; 
        int foundIndex; 
        Scanner input = new Scanner( System.in );
        BinarySearch searchArray = new BinarySearch( 15 );
        System.out.println(searchArray);
        System.out.print("Please enter an integer value (-1 to quit): ");
        searchKey=input.nextInt(); 
        while (searchKey!=-1)
        {
            foundIndex = searchArray.iterativeBinarySearch( searchKey );
            if ( foundIndex != -1 )
                System.out.println( "Integer " + searchKey + " was found at index " + foundIndex + ".\n" );
            else System.out.println( "Integer " + searchKey + " was not found.\n" );
            System.out.print( "Please enter an integer value (-1 to quit): " );
            searchKey = input.nextInt(); 
        } 
    } 
} 
