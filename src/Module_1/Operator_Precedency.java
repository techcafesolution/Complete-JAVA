package Module_1;

public class Operator_Precedency {
    public static void main(String[] args) {
        System.out.println(8-6/3);//Here BODMAS rule will apply.
        System.out.println(8/4/2);//Here execution always start from L-->R
        System.out.println(8/(4/2));//Here parenthesis has always first priority.
        System.out.println(8/(4*2-1));//Parenthesis and BODMAS rule will apply.
    }
}
