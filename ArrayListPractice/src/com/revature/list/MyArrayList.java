package com.revature.list;

public class MyArrayList {

	int[] arr = new int[1];
	int capacity = 1;
	int size = 0;
	
	public void add(int val) {
		if(capacity > size) {
			arr[size] = val;
			size++;
		} else {
			capacity *= 2;
			int[] xpandArr = new int[capacity];
			for(int i = 0; i < arr.length; i++) {
				xpandArr[i] = arr[i];
			}
			arr = xpandArr;
			arr[size] = val;
			size++;
		}
		
	}

	public void set(int index, int val) {
		if(index > size - 1) {
			System.out.println("the current array is size: " + size + ". \n Please select an appropriate index.");
		}
		else if(((index + 1) <= size) && (index >= 0)) {
			arr[index] = val;
		}
	}

	public void remove(int index) {
		if(index > size - 1) {
			System.out.println("the current array is size: " + size + ". \n Please select an appropriate index.");
		}
		else if(((index + 1) <= size) && (index >= 0)) {
			arr[index] = 0;
		}
		
	}

	public int get(int index) {
		if(index > size - 1) {
			System.out.println("the current array is size: " + size + ". \n Please select an appropriate index.");
			return -1;
		}
		else if(((index + 1) <= size) && (index >= 0)) {
			return arr[index];
		}
		else return 0;
	}

	@Override
	public String toString() {
		String print = "Array size: " + size + "[";
		for(int i = 0; i < size; i++) {
			print += arr[i];
			if(i + 1 < size) {
				print += ", ";
			}
		}
		print += "]";
		return print;
	}
}
