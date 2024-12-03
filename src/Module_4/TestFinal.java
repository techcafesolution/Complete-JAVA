package Module_4;

public class TestFinal {
    /**
     * Final value should initialize at the time of declaration.
     * Final value can't be change after the declaration.
     * Final variable name/literal must be mentioned as in BLOCK latter.
     */
    public final String NAME="Sanjeeb";
//    TestFinal(String NAME){
//        this.NAME="Rajib";
//    }
//    void change(){
//        NAME="Ranjita";
//    }
    public static void main(String[] args) {
        TestFinal TA=new TestFinal();
        System.out.println(TA.NAME);
       // TA.NAME="Manas";
    }

}
