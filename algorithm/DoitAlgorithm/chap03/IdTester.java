package DoitAlgorithm.chap03;

class Id {
	private static int counter = 0;
	private int id;
	
	public Id() { id = ++counter; }
	
	public int getId() { return id; }

	public static int getCounter() { return counter; }
}

public class IdTester {
	
	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("a�� ���̵� : "+a.getId());
		System.out.println("b�� ���̵� : "+b.getId());
		
		System.out.println("�ο��� ���̵��� ���� : "+Id.getCounter());
	}

}
