JAVA Programing
----------------------------------------------------
#### 3일차 (String Class)
____________________________________________________

  - String Class

    JAVA에서 중요한 기본 API 중 하나이다. 문자열을 사용할 때  String Class 를 사용한다.

    - String class 생성자

        - 기본적으로 String 생성은 다음과 같다.

          ```java
          // 가장 많이 사용되는 방법
          String str = "문자열";

          // 생성자를 사용해서 사용하는 방법
          String str = new String("문자열");

          // 자주 사용되지는 않지만 알아두면 좋은 방법들
          // 배열 전체를 String 객체로 생성
          String str = new String(byte[] bytes);
          // 배열을 지정한 문자셋으로 디코딩
          String str = new String(byte[] bytes, String charsetName);
          // 배열의 offset 인덱스 위치로부터 length만큼 String 객체로 생성
          String str = new String(byte[] bytes, int offset, int length);
          // 지정한 문자셋으로 디코딩
          String str = new String(byte[] bytes, int offset, int length, String charsetName);

          // 리터럴로 생성할 시
          String str = "문자열";
          String str2 = "문자열";
          // new로 생성할 시
          String str3 = new String("문자열");
          System.out.println(str == str2);
          // 출력 : true
          System.out.println(str2 == str3);
          // 출력 : false;

          // 리터럴로 생성할 시 내부적으로 intern();이 호출되어 같은 주소값으로 생성이 된다.
          // new 로 생성할 시 Constant Pool에 새로이 생성되므로 주소값이 다르다.
          ```

    - [String class 의 주요 메소드]()

        - charAt() : 문자 추출

          ```java
          /*
           * 특정 위치에 있는 문자 추출하는 메소드
           *
           * String객체.charAt(특정 위치);
           * RETURN : char
           */
          String str = "String test";
          System.out.println(str.charAt(3));
          // 출력 : i
          ```

        - equals() : 문자열 비교

          ```java
          /*
           * 문자열 내용을 비교하는 메소드
           *
           * String객체.equals("비교할 문자열")
           * RETURN : boolean
           */
          String str = "String Test";
          String str2 = "String test";
          System.out.println(str.equals(str2));
          // 출력 : false (T ,t 가 다르기 때문에)
          ```

        - indexOf() : 문자열 찾기

          ```java
          /*
           * 위치 구하는 메소드
           * 문자열을 쓸 경우 맨 앞 첫글자의 위치를 반환
           *
           * String객체.indexOf("찾고싶은 문자열");
           * RETURN : int
           */
          String str = "String Test";
          System.out.println(str.indexOf("T"));
          // 출력 : 7
          ```
        - length() : 문자열 길이

          ```java
          /*
           * 길이 구하는 메소드
           *
           * String객체.length();
           * RETURN : int
           */
          String str = "String Test";
          System.out.println(str.length());
          // 출력 : 11
          ```

        - replace() : 문자열 대치

          ```java
          /*
           * 특정 문자를 바꾸는 메소드
           *
           * String객체.replace(특정문자, 바꿀문자);
           * RETURN : String
           */
          String str = "String Test";
          System.out.println(str.replace('T', 't'));
          // 출력 : String test
          ```

        - substring() : 문자열 잘라내기

          ```java
          /*
           * 문자열을 자르는 메소드
           * 시작번호와 끝번호를 매개변수로 넣으면
           * 그 사이의 문자열을 반환한다.
           *
           * String객체.subString(시작번호);
           * String객체.subString(시작번호, 끝번호);
           * RETURN : String
           */
          String str = "String Test";
          System.out.println(str.substring(1, 3));
          // 출력 : tr
          ```

        - split() : 특정 구분자로 분해하기

          ```java
          /*
           * 특정 구분자로 분해하는 메소드
           * 빈 문자열로 자르게 되면 글자 하나 단위로 분해한다.
           *
           * String객체.split(구분자);
           * RETURN : 배열
           */
           String str = "String/Test";
           String temp[] = str.split("/");
           for(String item : temp) {
            System.out.println(item);
           }
           // 출력 :
           // String
           // Test

           String temp2[] = str.split("");
           for(String item: temp2) {
             System.out.print(item + " ");
           }
           // 출력 :
           // S t r i n g / T e s t
          ```

        - trim() : 문자열 앞 뒤 공백 잘라내기

          ```java
          /*
           * 앞, 뒤 공백을 제거하는 메소드
           *
           * String객체.trim();
           * RETURN : String
           */
          String str = "   String Test   ";
          System.out.println(str.trim());
          // 출력 : String Test
          ```
        - startsWith() : 특정 문자열로 시작하는지 검사

          ```java
          /*
           * 특정 문자열로 시작되는지를 검사하는 메소드
           *
           * String객체.startsWith(문자열);
           * RETURN : boolean
           */
           String str = "String Test";
           System.out.println(str.startsWith("Str"));
           // 출력 : true
           String address ="naver.com";
           if(!address.startsWith("http:")) {
            address = "http://"+address;
           }
          ```

        - valueOf() : 문자열 변환

          ```java
          /*
           * 매개변수에 들어가는 타입을 String형으로 변환하는 메소드
           *
           * String.valuOf(boolean, char, int, floot, double, int, long, Object)
           * RETURN : String
           */
          System.out.println(String.valueOf(100));
          // 출력 : 100
          System.out.println(String.valueOf(true));
          // 출력 : true
          System.out.println(String.valueOf(123.4));
          // 출력 : 123.4
          System.out.println(String.valueOf('a'));
          // 출력 : a
          ```

  - StringBuffer VS StringBuilder

    - String 인 경우 연산을 할 경우에 Constant Pool 에 새로 생성이 된다.

      ```java
      String result = "안" + "녕하" + "세요" + "! 반갑습니다.";
      /*
       * JDK 1.5 버전 이상부터는 일반적인 String 연산을 SringBulider로 컴파일러가 자동변환 해준다.
       * String 인 경우 연산이 발생할 때 마다 새로운 메모리 풀에 추가된다.
       *
       * Constant Pool(JDK 1.6 이하는 Perm Area, JDK 1.7 이후로는 Heap Area 으로 이동함)
       * ===========================
       * |  HashCode  |   값       |
       * ===========================
       * |    ~~~~    |   안       |
       * ---------------------------
       * |    ~~~~    |   안녕하   |
       *            ...
       */
      ```

    - 그렇기 때문에 메모리 낭비가 심하기 때문에 문자열을 붙이는 연산은 StringBuffer와 StringBuilder를 사용하는 것이 좋다.

    - StringBuffer 와 StringBuilder 사용법

      ```java
      /*
       * StringBuffer VS StringBuilder
       *
       * 속도      :	StringBuilder
       * 차이점    :	StringBuffer 는 비동기에서 안정성이 보장되지만,
       *               StringBuilder 는 비동기에서 안정성이 보장되지 않는다.
       *               다중 Thread 환경에서는 StringBulider를 사용하지 않는다.
       */
       StringBuffer buffer = new StringBuffer();
       buffer.append("안");
       buffer.append("녕하").append("세요");
       buffer.append("반갑습니다.");

       System.out.println(buffer.toString());
       // 출력 : 안녕하세요반갑습니다.

       StringBuilder builder = new StringBuilder();
       builder.append("안");
       builder.append("녕하").append("세요! ");
       builder.append("반갑습니다.");

       System.out.println(builder.toString());
       // 출력 : 안녕하세요! 반갑습니다.
      ```

#### 예제
____________________________________________________

  - [숫자 카운팅]()
  - [아나그램 알고리즘]()
