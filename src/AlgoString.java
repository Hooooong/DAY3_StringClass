import java.util.Arrays;

public class AlgoString {
	
	public static void main(String[] args) {
		AlgoString AlgoString = new AlgoString();
		System.out.println(AlgoString.count(1,1));
		
		System.out.println(AlgoString.checkAnagram("LISTION", "NOTILSI"));
		
	}
	
	/**
	 * �Է°��� ���� m, ���ڸ��� ���� n���� �޾��� ��
	 * 1���� ���� m�����߿� ���� n�� ��� �ִ��� ī��Ʈ�ϴ� �޼ҵ�
	 * 
	 *  ex) �Է°�	:	10000, 8
	 * 					1���� 10000 ���̿� 8�̶�� ���ڰ� ��� �ִ��� ī��Ʈ�ϴµ�
	 * 					8888 �� ��쿡�� 4�� ī��Ʈ�Ѵ�.
	 * 
	 * @param m : �˻��ϰ� ���� ��
	 * @param n : ã����� ��
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
	 * �Ƴ��׷� �˰���
	 * �� ���� ���ڿ��� �Է� �޾� �� ���� ���谡 �Ƴ��׷� �������� Ȯ���ϴ� ���α׷��� �����ϼ���.
	 * 
	 * option>> ���� ���ڿ��� ���� ����
	 * 	1. ���� ���ڿ��� ���̸� üũ
	 * 	2. ���� ���ڿ��� ����
	 *  3. ���ĵ� ���ڿ��� ��
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
