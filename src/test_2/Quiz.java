package test_2;

public class Quiz {
	private String question;
	private String answer;
	private String exampleOne;
	private String exampleTwo;
	private String exampleThree;
	
	private String [] randomList = new String[4];
	
	public Quiz(String question, String answer, String exampleOne, String exampleTwo, String exampleThree) {
		this.question = question;
		this.answer = answer;
		this.exampleOne = exampleOne;
		this.exampleTwo = exampleTwo;
		this.exampleThree = exampleThree;
	}

	@Override
	public String toString() {
		String data = null;
		
		/* (return 데이터 조합의 예) 
		 * [문제] 대한민국의 수도는?
		 * 1. 인천
		 * 2. 대구
		 * 3. 서울
		 * 4. 부산
		 * 
		 * (조건) 예문은 랜덤하게 섞어서 출력한다. 
		 */
		
		return data;
	}

	public String[] getRandomList() {
		return randomList;
	}

	public void setRandomList(String[] randomList) {
		this.randomList = randomList;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getExampleOne() {
		return exampleOne;
	}

	public void setExampleOne(String exampleOne) {
		this.exampleOne = exampleOne;
	}

	public String getExampleTwo() {
		return exampleTwo;
	}

	public void setExampleTwo(String exampleTwo) {
		this.exampleTwo = exampleTwo;
	}

	public String getExampleThree() {
		return exampleThree;
	}

	public void setExampleThree(String exampleThree) {
		this.exampleThree = exampleThree;
	}
	
	
}
