public class ComparisonCountingSort {
    int[] sort(int[] arr)
    {
        int n = arr.length;
        int count[] = new int[n];
        int S[] = new int[n];

        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] < arr[j])
                    count[j] = count[j] + 1;
                else count[i] = count[i] + 1;
            }
        }
        for(int i=0; i<n; i++) {
            S[count[i]] = arr[i];
        }
        return S;
    }

    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[])
    {
        ComparisonCountingSort ob = new ComparisonCountingSort();
        int arr[] = {62,31,84,96,19,47};
        int arrSame[] = {1,1};
        arrSame = ob.sort(arrSame);
        System.out.println("Sorted array");
        ob.printArray(arrSame);
    }
}

