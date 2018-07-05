package cci.heaps;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {
	
	final List<Integer> values ;

	public MinHeap() {
		super();
		this.values = new ArrayList<>();
		values.add(Integer.MIN_VALUE);//fill zero index with garbage. 
	}
	
	int size() {
		return values.size() -1;
	}
	
	void push(int x) {
		values.add(x);
		int current = x;
		int currentIdx = size();
		int parentValue = values.get(currentIdx/2);
		while(currentIdx > 1) {
			if(current < parentValue) {
				values.set(currentIdx/2, current);
				values.set(currentIdx, parentValue);
				currentIdx = currentIdx/2;
			}else {
				return;
			}
		}
	}
	
	int min() {
		if(size()<1) throw new RuntimeException("min on empty");
		return values.get(1);
	}
	
	int popMin() {
		if(size()<1) throw new RuntimeException("popMin  on empty");
		int min = values.get(1);
		if(size() > 1) {
			values.set(1, values.get(size()));
			values.remove(size());
			
			//while loop. 
			int idx = 1;
			while(idx < size()) {
				int root = values.get(idx);
				int left = idx * 2 <= size() ? values.get(idx*2) : Integer.MAX_VALUE;
				int right = idx * 2 + 1  <= size() ? values.get(idx*2 + 1) : Integer.MAX_VALUE;
				if(root > left || root > right) {
					int idxOfSmallerChild = left < right ? idx *2 : idx *2 +1;
					swap(idx, idxOfSmallerChild);
					idx = idxOfSmallerChild;
				}else {
					return min;
				}
			}
		}else {
			values.remove(size());
		}
		return min;
				
	}

	private void swap(int i, int j) {
		int temp = values.get(i);
		values.set(i, values.get(j));
		values.set(j, temp);
	}
	
	
	
	
	
	

}
