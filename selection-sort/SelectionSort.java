import java.util.Random;
import java.util.Arrays;

public class SelectionSort{
    private int[] data;
    public static final int RANDOM = 0;
    public static final int ASCENDING = 1;
    public static final int DESCENDING = 2;
    
    // create array of given size and fill with random integers
    public SelectionSort( int size ) {
        this( size, RANDOM );
    }
    
    // create array of given size and fill with integers in a specified order
    public SelectionSort( int size, int order ) {
        Random generator = new Random();
        data = new int[ size ];
        
        for ( int i = 0; i < size; i++ ) {
            data[ i ] = 100 + generator.nextInt(900);
            // BETTER: data[ i ] = generator.nextInt();
        }
        
        if (order == RANDOM)
            return;
        else {
            Arrays.sort(data);
            if (order == ASCENDING)
                return;
            else if (order == DESCENDING) {
                for(int i=0; i < data.length / 2; i++) {
                    // swap the elements
                    swap( i, data.length-(i+1) );
                }
            }
        }
    }

public void selectionSort(){
    for (int i = 0; i < data.length - 1; i++) {
        int index = i;
        for (int j = i + 1; j < data.length; j++) {
            if (data[j] < data[index])
                index = j;
        }
        int smallerNumber = data[index];
        data[index] = data[i];
        data[i] = smallerNumber;
    }
}

private void swap( int first, int second ) {
        int temporary = data[ first ];  
        data[ first ] = data[ second ]; 
        data[ second ] = temporary;     
    } 
    
    // Return string representing all elements in array
    public String toString() {
        return Arrays.toString( data ) + "\n";
    }
}
