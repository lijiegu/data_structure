
package HighArray.copy.copy.copy;
public class HighArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HighArray a=new HighArray(100);
		
		//System.out.println("max="+a.getMax());			//已创建100大的数组，默认初始化0，那”–1 if the array is empty“怎么体现？
		
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
		
		// a[] is invalid  you need to create a method for HighArray say int get(i) to do that because
		// HighArray is a class not an array so [] does not work
		
		//HighArray a1=new HighArray(100);
		//for(int i=0; i<a.getSize(); i++){
		//	a1.insert(a[a.getSize()-1-i]);     //error here
		//}
		/*HighArray a1=new HighArray(100);
		int i=0;
		while(i<(a.getSize()-1)){
			a1.insert(a.getMax());
			a.removeMax();
			i++;
		}
		
		
		a1.display();
		
		System.out.println("max="+a.getMax());
		
		System.out.println("删除最大值");
		a.removeMax();
		a.display();
		
		System.out.println("删除24 44");
		a.delete(24);
		a.delete(44);
		
		a.display();
		
		long searchKey=44;
		if(a.search(searchKey))		System.out.println("found "+searchKey);
		else	System.out.println("not found "+searchKey);
		*/ 
	}

}
