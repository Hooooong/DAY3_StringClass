
public class StringApi {
	
	public void text() {
		
		String str = "String Test";
		String str2 = "Sring/Test";
		
		/*
		 * ���� ���ϴ� �޼ҵ� 
		 * 
		 * String��ü.length();
		 * RETURN : int
		 */
		
		System.out.println(str.length());
		
		/*
		 * ��ġ ���ϴ� �޼ҵ�
		 * ���ڿ��� �� ��� �� �� ù������ ��ġ�� ��ȯ
		 * 
		 * String��ü.indexOf("ã����� ���ڿ�");
		 * RETURN : int
		 */
		System.out.println(str.indexOf("T"));
		
		/*
		 * Ư�� �����ڷ� �����ϴ� �޼ҵ�
		 * �� ���ڿ��� �ڸ��� �Ǹ� ���� �ϳ� ������ �����Ѵ�.
		 * 
		 * String��ü.split(������);
		 * RETURN : �迭
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
		 * ���ڿ��� �ڸ��� �޼ҵ�
		 * ���۹�ȣ�� ����ȣ�� �Ű������� ������
		 * �� ������ ���ڿ��� ��ȯ�Ѵ�.
		 * 
		 * String��ü.subString(���۹�ȣ);
		 * String��ü.subString(���۹�ȣ, ����ȣ);
		 * RETURN : String
		 */
		System.out.println(str.substring(1, 3));
		
		/*
		 * Ư�� ���ڸ� �ٲٴ� �޼ҵ�
		 * 
		 * String��ü.replace(Ư������, �ٲܹ���);
		 * RETURN : String
		 */
		System.out.println(str.replace('T', 't'));
		
		/*
		 * Ư�� ���ڿ��� ���۵Ǵ����� �˻��ϴ� �޼ҵ�
		 * 
		 * String��ü.startsWith(���ڿ�);
		 * RETURN : boolean
		 */
		System.out.println(str.startsWith("Str"));
		
		String address ="naver.com";
		if(!address.startsWith("http:")) {
			address = "http://"+address;
		}
	}
	
	public void builderVsBuffer() {
		
		String result = "��" + "����" + "����" + "! �ݰ����ϴ�.";
		/*
		 * JDK 1.5 ���� �̻���ʹ� �Ϲ����� String ������ SringBulider�� �����Ϸ��� �ڵ���ȯ ���ش�.
		 * String �� ��� ������ �߻��� �� ���� ���ο� �޸� Ǯ�� �߰��ȴ�.
		 * 
		 * Constant Pool(JDK 1.6 ���ϴ� Perm Area, JDK 1.7 ���ķδ� Heap Area ���� �̵���)
		 * ==========================================
		 * | 	HashCode		|		��			|
		 * ------------------------------------------
		 * | 	   ~~~~			|		��			|
		 * ------------------------------------------
		 * | 	   ~~~~			| 		�ȳ��� 	    |
		 * 					   ...
		 */
		
		/*
		 * StringBuffer VS StringBuilder
		 * 
		 * �ӵ� 		:	StringBuilder
		 * ������		:	StringBuffer �� �񵿱⿡�� �������� ���������, StringBuilder �� �񵿱⿡�� �������� ������� �ʴ´�.
		 * 				���� Thread ȯ�濡���� StringBulider�� ������� �ʴ´�.
		 */
		StringBuffer buffer = new StringBuffer();
		buffer.append("��");
		buffer.append("����").append("����");
		buffer.append("�ݰ����ϴ�.");
		
		System.out.println(buffer.toString());
	
		StringBuilder builder = new StringBuilder();
		builder.append("��"); 
		builder.append("����").append("����");
		builder.append("�ݰ����ϴ�.");
	}
	
	public void stringConstantPool() {
		String a = "�ȳ��ϼ���";
		String b = "�ȳ��ϼ���";
		String c = new String("�ȳ��ϼ���");
		
		System.out.println(a == b);					// �ּ� ýũ
		System.out.println(a.equals(b));			// �� üũ
		
		System.out.println(b == c);					// �ּ� ýũ
		System.out.println(b.equals(c));			// �� üũ
		
		String d = c.intern();						// new �� ������� ��ü�� Constant Pool �� �̵���Ų��.
	}
}	
