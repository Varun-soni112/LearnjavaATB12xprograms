package Test1_codingchallenge_ques;

public class question15_print_primenumber_from1to100_usingnestedloop {
    public static void main(String[] args) {

//        for(int i=2; i<100; i++)
//        {
//           boolean isPrime =true;
//
//           for(int j=2; j<=i;j++)
//           {
//               if(i%j==0)
//               {
//                   isPrime=false;
//                   break;
//               }
//           }
//           if(isPrime)
//           {
//               System.out.println(i +" " );
//           }
//        }


        for(int i=2; i<=100;i++)
        {
            int count =0;
            for(int j=1; j<=i; j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println(i +" ");
            }
        }
    }
}

