
import java.util.Arrays;
import java.util.Random;
public class BinarySearch
{
private int[] data; 
    public BinarySearch( int size ) {
        data = new int[ size ];
        Random generator = new Random();
        for ( int i = 0; i < size; i++ )
            data[ i ] = 10 + generator.nextInt( 90 );
            Arrays.sort( data );
        }
        public int iterativeBinarySearch( int searchKey ) {

        int left = 0;
        int right = data.length - 1;

        while (left <= right) {
            int current = left + (right - left) / 2;

            if (data[current] == searchKey)
            return current;
            if (data[current] < searchKey)
            left = current + 1;
            else
            right = current - 1;
        }

        return -1;
    } 
} 
