//mea
/**
 * Write a description of class ArrayStats here.
 * 
 * @author Ms. Bradford
 * @version jan 2021
 */
public class ArrayStats
{
    public static double findMean(int[] a)
    {
        int sum = 0;
        for(int n : a)
        {
            sum += n;
        }
        return (double)sum /a.length;
    }
    
    public static int findMedian(int[] a)
    {
        return a[a.length / 2];
    }
    
    public static int findMode(int[] a)
    {
        int count = 1;
        int maxCount = 1;
        int index = 0;
        for(int i = 1; i < a.length; i++)
        {
            if(a[i-1] == a[i])
            {
                count++;
                if(count > maxCount)
                {
                    maxCount = count;
                    index = i;
                }
            }
            else
            {
                count = 1;
            }
        }
        return a[index];
    }
}
