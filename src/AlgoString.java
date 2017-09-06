import java.util.Arrays;

public class AlgoString {
	
	public static void main(String[] args) {
		AlgoString AlgoString = new AlgoString();
		System.out.println(AlgoString.count(1,1));
		
		System.out.println(AlgoString.checkAnagram("LISTION", "NOTILSI"));
		
	}
	
	/**
	 * 입력값을 정수 m, 한자릿수 정수 n으로 받았을 때
	 * 1부터 정수 m까지중에 정수 n이 몇개가 있는지 카운트하는 메소드
	 * 
	 *  ex) 입력값	:	10000, 8
	 * 					1부터 10000 사이에 8이라는 숫자가 몇개가 있는지 카운트하는데
	 * 					8888 인 경우에는 4로 카운트한다.
	 * 
	 * @param m : 검색하고 싶은 값
	 * @param n : 찾고싶은 값
	 * @return
	 */
	public int count(int m, int n) {
		int result = 0;
		String checkNum = Integer.toString(n);
		
		for(int index = 1 ; index <= m; index = index +1) {
			String number = Integer.toString(index);
			String temps[] = number.split("");
			
			for(String temp : temps) {
				if(temp.contains(checkNum)) {
					result++;
				}
			}
		}
		return result; 
	}
	
	
	/**
	 * 아나그램 알고리즘
	 * 두 개의 문자열을 입력 받아 두 개의 관계가 아나그램 관계인지 확인하는 프로그램을 개발하세요.
	 * 
	 * option>> 받은 문자열의 공백 제거
	 * 	1. 받은 문자열의 길이를 체크
	 * 	2. 받은 문자열을 정렬
	 *  3. 정렬된 문자열을 비교
	 * 
	 *  cat -> act
	 *  listen -> silent
	 *  dormitory -> dirty room
	 *
	 */
	public boolean checkAnagram(String a, String b) {
		boolean result = false;
		
		String chaA[] = a.toLowerCase().replace(" ","").split("");
		String chaB[] = b.toLowerCase().replace(" ","").split("");

		if(chaA.length == chaB.length) {
			Arrays.sort(chaA);
			Arrays.sort(chaB);
			
			result = Arrays.equals(chaA, chaB);
		}
		return result;
	}
}
