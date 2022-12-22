package Programmers.level1;
/**�ڿ��� ������ �迭�� �����
���� ����
�ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.

���� ����
n�� 10,000,000,000������ �ڿ����Դϴ�.
**/
class ReverseNumArray {
    public int[] solution(long n) {
        int length = Long.toString(n).length();
        
        int[] answer = new int[length];
        
        for (int i=0; i<length; i++) {
            answer[i] = (int)(n%10);
            n /= 10;
        }
        
        return answer;
    }
}