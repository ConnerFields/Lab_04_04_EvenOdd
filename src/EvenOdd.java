//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EvenOdd
{
    public static void main(String[] args)
    {
        int numToSolve = 1296; //user will input number later
        int remaining; //remainder

        remaining = numToSolve % 2; //getting remainder

        if (remaining == 1)
        {
            System.out.println("The number you selected is odd");
             } else {
        } if (remaining == 0)
             {
            System.out.println("The number you selected is even");
        }

    }
}