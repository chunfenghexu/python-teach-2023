package overclass;

import java.util.ArrayList;

public class QuesDatabase { 
	static ArrayList<Question> questions = new ArrayList<Question>();

	public static void generateQuestions(){
		// 用硬编码的方式去为系统添加一些题
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
	}
	public static Question selectOneFromQuestions(){
		Question ques = null;
		// 用 random 函数去随机选择
		return ques;
	}

}
