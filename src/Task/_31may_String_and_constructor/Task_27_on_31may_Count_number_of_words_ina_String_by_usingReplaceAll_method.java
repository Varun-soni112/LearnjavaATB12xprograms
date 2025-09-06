package Task._31may_String_and_constructor;

public class Task_27_on_31may_Count_number_of_words_ina_String_by_usingReplaceAll_method {
    public static void main(String[] args) {
        String str= "  hello   how  are  you?  ";//space =3;
        str=str.trim().replaceAll("\\s+"," ");

        int count=1;//count=space +1;
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)== ' ')

            {
                count++;
            }
        }
        System.out.println("total count="+count);

        
    }
}
