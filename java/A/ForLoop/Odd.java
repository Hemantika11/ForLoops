package A.ForLoop;

public class Odd
{
    public static void main(String[] args)
    {
        int n=10;
        System.out.println("Print the Odd Numbers");
        for(int i=1; i<=n; i++)
        {
            if(i % 2 !=0)
            {
                System.out.println(i+ " ");
            }
        }
    }
}
