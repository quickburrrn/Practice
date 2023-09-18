public class Sum {
    public int GetSum(int a, int b)
    {
        //order number
        int low; int high;
        if (a<b) {
            low = a; high = b;}
        else{
            low = b; high = a;}
        //loop through number
        int result = 0;
        for (low=low; low<=high; low++)
        {
            result += low;
        }
        return result;
    }
}
