 void heap_sort(int Arr[ ])
    {
        int heap_size = N;
        build_maxheap(Arr);
        for(int i = N; i>=2 ; i-- )
        {
            swap(Arr[ 1 ], Arr[ i ]);
            heap_size = heap_size-1;
            max_heapify(Arr, 1, heap_size);
        }
    }

 void increase_value (int Arr[ ], int i, int val)
    {
        if(val < Arr[ i ])
        {
            cout<<”New value is less than current value, can’t be inserted” <<endl;
            return;
        }
        Arr[ i ] = val;
        while( i > 1 and Arr[ i/2 ] < Arr[ i ])
        {
            swap(Arr[ i/2 ], Arr[ i ]);
            i = i/2;
        }
    }

void insert_value (int Arr[ ], int val)
    {
    length = length + 1;
    Arr[ length ] = -1;  //assuming all the numbers greater than 0 are to be inserted in queue.
    increase_val (Arr, length, val);
    }


void build_maxheap (int Arr[ ])
    {
        for(int i = N/2 ; i >= 1 ; i-- )
        {
            max_heapify (Arr, i) ;
        }
    }


void max_heapify (int Arr[ ], int i, int N)
    {
        int left = 2*i                   //left child
        int right = 2*i +1           //right child
        if(left<= N and Arr[left] > Arr[i] )
              largest = left;
        else
             largest = i;
        if(right <= N and Arr[right] > Arr[largest] )
            largest = right;
        if(largest != i )
        {
            swap (Arr[i] , Arr[largest]);
            max_heapify (Arr, largest,N);
        } 
     }
