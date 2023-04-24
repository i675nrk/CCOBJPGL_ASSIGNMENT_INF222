public class exercise1 {

    static boolean iwillBehave = true;
    static boolean IwillGraduate = true;


    public static void main(String[] args) throws Exception {
       
        //precondition
        assert iwillBehave == true :"stop sleeping and start listening!!";

        //method
        College();

        //postcondition
        assert IwillGraduate == true : "puro ka kasi tulog :)";
    }

        static void College(){
            IwillGraduate = false;
            System.out.println("wala naaa. matulog ka nalang forever !!");

        }
}
