package Test1_codingchallenge_ques;

public class question13_multiplication_table_using_nestedForloop {
//    Write a program to print multiplication tables using nested loops.
//
//            **Requirements:**
// - Print multiplication tables for numbers 1 to 5
// - Each table should show multiplications from 1 to 10
// - Use nested for loops
//- Format output clearly
public static void main(String[] args) {
    for(int j=1; j<=5; j++)
    {
        System.out.println("Table of " +j +" ");
        for(int i=1; i<=10;i++)
        {
            System.out.printf("%d*%d=%d" ,j,i,j*i).println();
        }


    }}
}
