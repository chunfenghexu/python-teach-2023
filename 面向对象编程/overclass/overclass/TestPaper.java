package overclass;

public class TestPaper {

    private final static int quesNum = 10;
    private ArrayList<Question> quess = new ArrayList<Question>();  //
    
    public static TestPaper generateTestPaper(){
        //
        TestPaper testPaper = new TestPaper();
        for (int i=0 ; i < quesNum ; i++){
            testPaper.quess.add(QuesDatabase.generateQuestions());
        }
        return testPaper;
    }
}
