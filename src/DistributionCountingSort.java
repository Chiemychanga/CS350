//Sorts an array of integers from a limited range by distribution
//counting.
//Input: An array A[0..n-1] of integers between l and u (l <= u)
//Output: Array S[0..n-1] of A's elements sorted in nondecreasing order.
public class DistributionCountingSort {
    int[] sort(int[] arr, int l, int u)
    {
        int n = arr.length;
        int D[] = new int[u-l+1];
        int S[] = new int[n];

        //Compute frequencies
        for (int i=0; i<=n-1; i++) {
           D[arr[i]-l] = D[arr[i]-l] + 1;
        }
        //reuse for distribution
        for(int j=1; j<=u-l; j++) {
            D[j] = D[j-1] + D[j];
        }
        for(int i = n-1; i>=0; i--) {
            int j = arr[i] - l;
            S[D[j]-1] = arr[i];
            D[j] -= 1;
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
        DistributionCountingSort ob = new DistributionCountingSort();
        int arrSame[] = {13,11,12,13,12,12};
        arrSame = ob.sort(arrSame,11,13);
        System.out.println("Sorted array");
        ob.printArray(arrSame);
    }
}

