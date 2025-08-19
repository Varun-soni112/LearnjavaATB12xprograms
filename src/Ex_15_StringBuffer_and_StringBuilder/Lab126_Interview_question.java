package Ex_15_StringBuffer_and_StringBuilder;

public class Lab126_Interview_question {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("pramod");
        sb.append("dutta");
        System.out.println(sb);
        //it include only one String i.e "pramoddutta" which can be replaced by promod becoz it is immutable

        String s1= "pramod";
        s1=s1.concat("hudda");
        System.out.println(s1);
    }
}
