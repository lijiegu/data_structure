
package HighArray.copy.copy.copy;

public class HighArray {
	private long[] array;
	private int nElems;

	public HighArray(int maxSize){
		array=new long[maxSize];
		nElems=0;
	}
	
	public int getSize(){
		return nElems;
	}
	
	public void insert(long value){
		array[nElems]=value;
		nElems++;
	}
	
	public boolean search(long key){
		int i;							
		for(i=0; i<nElems; i++){
			if(array[i]==key)	break;
		}
		if(i==nElems)	return false;//为了让此处的i为已知量，int i;得在for外面完成。
		else 			return true;
	}
	
	public void delete(long key){
		int i;
		for(i=0; i<nElems; i++){
			if(array[i]==key)	break;
		}
		if(i!=nElems)
			for(int j=i; j<nElems; j++){
				array[j]=array[j+1];
			}
		nElems--;
		
	}
	
	/*public long getMax(){
		if(array==null)	return -1;
		else{
			long max=array[0];
			for(int i=1; i<nElems; i++){
				if(array[i]>max)	max=array[i];
			}
		return max;
		}
	}
	
	public void removeMax(){
		long rMax=getMax();
		if(rMax==-1)	System.out.println("空数组！");
		else	delete(rMax);
	}*/
	
	public void display(){
		for(int i=0; i<nElems; i++){
			System.out.print(array[i]+" ");
		}
		System.out.println("");
	}
}
