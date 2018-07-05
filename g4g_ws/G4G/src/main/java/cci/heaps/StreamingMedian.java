package cci.heaps;

public class StreamingMedian {
	
	final MaxHeap low ;
	final MinHeap top; 
	
	
	
	public StreamingMedian() {
		super();
		this.low = new MaxHeap();
		this.top = new MinHeap();
	}

	void addElement(int x) {
		//add to empty. 
		if(low.size() ==0) {
			low.push(x);
			return;
		}
		if(x < low.max()) {
			low.push(x);
			if(low.size() - top.size() > 1) {
				top.push(low.popMax());
			}
		}else {
			top.push(x);
			if(top.size() - low.size() > 1) {
				low.push(top.popMin());
			}
		}
	}
	
	float getMedian() {
		if(low.size() + top.size() == 0) throw new RuntimeException("median on empty");
		if(low.size() == top.size()) {
			return (low.max() + top.min()) /2f;
		}else {
			return low.size() > top.size() ? low.max() : top.min();
		}
	}

}
