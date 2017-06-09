package project2;

public class HashTable {
	public static int hashTableSize;
	public static float loadFactor;
	static int a = 0;
	static int b = 0;
	static int p = 0;
	static int m = 10;
	static Vector array = new Vector(m);

	public HashTable(int size) {
		hashTableSize = size;
		loadFactor = (float) 0.7;

	}

	public HashTable(int size, float load) {
		hashTableSize = size;
		loadFactor = load;
	}

	public static void generateHashValues() {
		a = (int) (Math.random() * 123456);
		b = (int) (Math.random() * 123456);
		p = 15487469;
		System.out.println("a is : " + a + " b is : " + b + " p is : " + p);

	}

	public static void reHash() {
		generateHashValues();

	}

	public static void printTable() {
		System.out.println("Here is the Hash Table");
		array.print();
	}

	public static void insert(int value) {
		int index = 0;

		index = ((a * (value + b)) / p) % m;
		index = Math.abs(index);

		array.insert(index, value);

	}
}