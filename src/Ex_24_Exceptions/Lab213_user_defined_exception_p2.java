package Ex_24_Exceptions;

public class Lab213_user_defined_exception_p2 {
    public static void main(String[] args) throws Exception {
      Test.validate_age(12);
    }
    class Test
    {
        static void validate_age(int age) throws Exception
        {
            if(age<18)
            {
                try
                {
                    throw new Exception("Age can't be 18");
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }
            else
            {
                System.out.println("enjoy clubbing");
            }
       }


    }
}
