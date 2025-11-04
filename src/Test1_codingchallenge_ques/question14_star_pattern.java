package Test1_codingchallenge_ques;

public class question14_star_pattern {
    public static void main(String[] args) {
        int n=5;
        for(int row =1; row<=n;row++) //no of lines = no of rows
            //no of  times outer loop will run.
        {
            for(int col=1; col<=row; col++) // identify for every row no - how many col are there, types of elements in col.
                // no of col of every row is equal to "row no or not".
            {
                System.out.print("* "); // what do you need  to print. 

            }
            System.out.println(" ");
        }
/*
        //pyramid star pattern.
        int r;
        int k;
        int c;
        int m=6;
        for(int r=1; r<=m; r++)
        {
            for(k=1; k<=n-r; k++)
            System.out.print(" ");//print space.
        }
        for(c=1; c<=r;c++)
        {
            System.out.println("* ");// print star and space also.
        }
        System.out.println();
*/
    }
}



