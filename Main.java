package project2;

public class Main {

	public static void main(String[] args){
		HashTable table = new HashTable(10);
		
		table.generateHashValues();
		for(int i = 0; i < 25; i++){
			table.insert((int) Math.ceil(Math.random() * 1000));
		}
		
		table.printTable();
	}
}
