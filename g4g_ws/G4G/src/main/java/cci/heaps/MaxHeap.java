package cci.heaps;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap {
	

	final List<Integer> values;

	public MaxHeap() {
		super();
		this.values = new ArrayList<>();
		values.add(Integer.MAX_VALUE); // first one is useless. 
	}
	
	int size() {
		return values.size() -1;
	}
	
	void push(int x) {
		values.add(x);
		int idx = size();
		
		while(idx > 1 ) {
			int valIdx = values.get(idx);
			int valParent = values.get(idx/2);
			//swap
			if(valIdx > valParent) {
				values.set(idx, valParent);
				values.set(idx/2, valIdx);
				idx = idx /2;
			}else {
				return;
			}
		}
	}
	
	
	int max() {		if(size() >=1) {
			return values.get(1);
		}else {
			throw new RuntimeException("Max on empty");
		}
		
	}
	
	int popMax() {
		if(size() < 1) {
			throw new RuntimeException("pop max on empty");
		}
		int max = values.get(1);
		if(size()>1) {
		  values.set(1, values.get(size()));
		}
		values.remove(size());
		
		int idx = 1;
		while(idx < size()) {
			int root = values.get(idx);
			int left = idx * 2 <= size()? values.get(idx *2) : Integer.MIN_VALUE;
			int right = idx * 2 + 1 <= size()? values.get(idx *2 + 1) : Integer.MIN_VALUE;
			if(root < left || root < right) {
				int swapIdx = left > right ? idx*2 : idx*2+1;
				swap(idx, swapIdx);
				idx = swapIdx;
			}else {
				return max;
			}
		}
		return max;
	}
	
	private void swap(int i , int j) {
		int temp = values.get(i);
		values.set(i, values.get(j));
		values.set(j, temp);
	}
	
	
	

}
