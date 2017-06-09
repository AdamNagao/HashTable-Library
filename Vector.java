package project2;



public class Vector {
	public  int size;

	LinkedList[] array;

	public Vector(int vectorSize) {
	
	 size = vectorSize;
	 array = new LinkedList[size];
	 for(int i = 0; i < size; i++){
		 LinkedList object = new LinkedList();
		 array[i] = object;
	 }
	}

	public void insert(int index, int data) {
		
		System.out.println("I'm trying to insert " + data + " at " + index);
		array[index].insert(data);
	
		
		//if((array[index].size / size) >= HashTable.loadFactor ){
		//	 array = doubleSize();
		//	 
	//	}
	}


	public void remove( int index) {

		for (int i = index; i < size; i++) {
			array[i] = array[i + 1];
		}
		size--;

	}
	

	private LinkedList[] doubleSize() {
		LinkedList[] newArray = new LinkedList[size*2];
		size = size * 2;
		for(int i = 0;i < array.length;i++){
			newArray[i] = array[i];
		}
	
		return newArray;
		
	}

	public void print() {
			for(int i = 0; i < size ;i++){
			
				System.out.print("Vector Row " + i + " : ");
				array[i].printList();
				System.out.println();
			}
	}

}
