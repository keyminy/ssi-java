package d2;

import java.util.HashSet;

public class ExampleTwo {

	public static void main(String[] args) {
//		ArrayList<Integer> lottoNumbers = new ArrayList<>();
		HashSet<Integer> lottoNumbers = new HashSet<>();
		
		while(true) {
			int lottoNumber = (int)(Math.random() * 45) + 1;
			lottoNumbers.add(lottoNumber);
		
			if(lottoNumbers.size() == 6) {
				break;
			}
		}
		System.out.println(lottoNumbers);

	}

}
