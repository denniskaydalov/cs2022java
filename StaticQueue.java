class StaticQueue<T> implements QueueADT<T> {
    private int top;
    private T[] queueArray;
    private final int MAX_SIZE;
    
    // Creates an empty queue using the specified capacity.
    public StaticQueue(int maxSize) {
        MAX_SIZE = maxSize;
        clear();
    }
    
    @Override
    public void enqueue(T element) {
        if ( top < queueArray.length-1 ) {
            top++;
            queueArray[top] = element;
        }
    }

    @Override
    public T dequeue() {
        if ( isEmpty() )
            return null;
        
        T result = queueArray[0];
        for(int i = 0; i < top; ++i) queueArray[i] = queueArray[i + 1];
        queueArray[top] = null;
        top--;
        return result; 
    }
    
    public T peek() {
        if ( isEmpty() )
            return null;
        
        return queueArray[0];
    }
    
    @Override
    public boolean isEmpty() {
        return (top == -1);
    }
    
    @Override
    public int size() {
        return (top+1);
    }

    @Override
    @SuppressWarnings("unchecked")      // Don't show warning, line 59 is safe!
    public void clear() {
        top = -1;
        queueArray = (T[])(new Object[MAX_SIZE]);
    }
    
    @Override
    public String toString() {
        String result = "Queue Contains: ";
        
        for (T element : queueArray) {
            result += "["+element+"] ";
        }
        
        return result;
    }  
}
