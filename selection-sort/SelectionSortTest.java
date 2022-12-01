public class SelectionSortTest 
{
    public static void main( String[] args ) {
        long start, finish;
        
        SelectionSort sortArray = new SelectionSort( 100000, SelectionSort.RANDOM );
        
        System.out.println( "Selection Sort v1.0 (100000 randomly ordered integers): " );
        start = System.currentTimeMillis();
        sortArray.selectionSort();
        finish = System.currentTimeMillis();
        System.out.println( (finish - start) + "ms." );     
    } 
} 
