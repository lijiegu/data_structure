package HighArray;

public class HighArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HighArray a=new HighArray(100);
		
		System.out.println("max="+a.getMax());			//�Ѵ���100������飬Ĭ�ϳ�ʼ��0���ǡ��C1 if the array is empty����ô���֣�
		
		a.insert(0);
		a.insert(67);
		a.insert(7);
		a.insert(64);
		a.insert(85);
		a.insert(53);
		a.insert(24);
		a.insert(44);
		a.insert(27);
		a.insert(84);
		
		a.display();
		
		System.out.println("max="+a.getMax());
		
		System.out.println("ɾ�����ֵ");
		a.removeMax();
		a.display();
		
		System.out.println("ɾ��24 44");
		a.delete(24);
		a.delete(44);
		
		a.display();
		
		long searchKey=44;
		if(a.search(searchKey))		System.out.println("found "+searchKey);
		else	System.out.println("not found "+searchKey);
		
	}

}
