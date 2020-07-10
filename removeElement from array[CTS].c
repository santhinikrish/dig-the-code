int* removeElement(int *arr, int LENGTH, int index)
{
    if(index >= LENGTH)
    {
        return arr;
    }
    else if(index<=LENGTH && index>=0)
    {
        for(int i=index; i < LENGTH-1; i++)
        {
            arr[i] = arr[i+1];
        }
        int *rarr = malloc (sizeof(int)*(LENGTH-1));
        for(int i=0; i < LENGTH-1; i++)
        {
            rarr[i] = arr[i];
        }
        return rarr;
    }
}