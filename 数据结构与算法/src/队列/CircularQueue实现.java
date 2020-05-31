package 队列;

public class CircularQueue实现 {
	public String[] items;
	public int n;
	public int head;
	public int tail;

	public CircularQueue实现(int n) {
		super();
		this.n = n;
		this.head = 0;
		this.tail = 0;
		items = new String[n];
	}

	public boolean enqueue(String item) {
		if ((tail + 1) % n == 0)
			return false;
		items[tail] = item;
		tail = (tail + 1) % n;
		return true;
	}

	public String dequeue() {
		if (head == tail)
			return null;
		String result = items[head];
		head = (head + 1) % n;
		return result;
	}

}
