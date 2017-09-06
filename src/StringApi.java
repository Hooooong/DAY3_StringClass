
public class StringApi {
	
	public void text() {
		
		String str = "String Test";
		String str2 = "Sring/Test";
		
		/*
		 * 길이 구하는 메소드 
		 * 
		 * String객체.length();
		 * RETURN : int
		 */
		
		System.out.println(str.length());
		
		/*
		 * 위치 구하는 메소드
		 * 문자열을 쓸 경우 맨 앞 첫글자의 위치를 반환
		 * 
		 * String객체.indexOf("찾고싶은 문자열");
		 * RETURN : int
		 */
		System.out.println(str.indexOf("T"));
		
		/*
		 * 특정 구분자로 분해하는 메소드
		 * 빈 문자열로 자르게 되면 글자 하나 단위로 분해한다.
		 * 
		 * String객체.split(구분자);
		 * RETURN : 배열
		 */
		String temp[] = str2.split("/");
		for(String item : temp) {
			System.out.println(item);
		}
		
		String temp2[] = str2.split("");
		for(String item: temp2) {
			System.out.println(item);
		}
		/*
		 * 문자열을 자르는 메소드
		 * 시작번호와 끝번호를 매개변수로 넣으면
		 * 그 사이의 문자열을 반환한다.
		 * 
		 * String객체.subString(시작번호);
		 * String객체.subString(시작번호, 끝번호);
		 * RETURN : String
		 */
		System.out.println(str.substring(1, 3));
		
		/*
		 * 특정 문자를 바꾸는 메소드
		 * 
		 * String객체.replace(특정문자, 바꿀문자);
		 * RETURN : String
		 */
		System.out.println(str.replace('T', 't'));
		
		/*
		 * 특정 문자열로 시작되는지를 검사하는 메소드
		 * 
		 * String객체.startsWith(문자열);
		 * RETURN : boolean
		 */
		System.out.println(str.startsWith("Str"));
		
		String address ="naver.com";
		if(!address.startsWith("http:")) {
			address = "http://"+address;
		}
	}
	
	public void builderVsBuffer() {
		
		String result = "안" + "녕하" + "세요" + "! 반갑습니다.";
		/*
		 * JDK 1.5 버전 이상부터는 일반적인 String 연산을 SringBulider로 컴파일러가 자동변환 해준다.
		 * String 인 경우 연산이 발생할 때 마다 새로운 메모리 풀에 추가된다.
		 * 
		 * Constant Pool(JDK 1.6 이하는 Perm Area, JDK 1.7 이후로는 Heap Area 으로 이동함)
		 * ==========================================
		 * | 	HashCode		|		값			|
		 * ------------------------------------------
		 * | 	   ~~~~			|		안			|
		 * ------------------------------------------
		 * | 	   ~~~~			| 		안녕하 	    |
		 * 					   ...
		 */
		
		/*
		 * StringBuffer VS StringBuilder
		 * 
		 * 속도 		:	StringBuilder
		 * 차이점		:	StringBuffer 는 비동기에서 안정성이 보장되지만, StringBuilder 는 비동기에서 안정성이 보장되지 않는다.
		 * 				다중 Thread 환경에서는 StringBulider를 사용하지 않는다.
		 */
		StringBuffer buffer = new StringBuffer();
		buffer.append("안");
		buffer.append("녕하").append("세요");
		buffer.append("반갑습니다.");
		
		System.out.println(buffer.toString());
	
		StringBuilder builder = new StringBuilder();
		builder.append("안"); 
		builder.append("녕하").append("세요");
		builder.append("반갑습니다.");
	}
	
	public void stringConstantPool() {
		String a = "안녕하세요";
		String b = "안녕하세요";
		String c = new String("안녕하세요");
		
		System.out.println(a == b);					// 주소 첵크
		System.out.println(a.equals(b));			// 값 체크
		
		System.out.println(b == c);					// 주소 첵크
		System.out.println(b.equals(c));			// 값 체크
		
		String d = c.intern();						// new 로 만들어진 객체를 Constant Pool 로 이동시킨다.
	}
}	
