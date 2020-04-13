package buffers;

import java.util.*;

public class Buffer {

	private List<Message<String>> buffer = new LinkedList<Message<String>>();
	public int CAPACITY = 3;
			
	public synchronized boolean write(Message<String> msg) { 
		while(buffer.size() >= CAPACITY) {
			try {
				wait();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		Utils.sleep(100);
		boolean success = false;
		
		if (buffer.size() < CAPACITY) {
			buffer.add(msg);
			success = true;
			notify();
		}
		Utils.sleep(50);
		return success;
	}
	
	public synchronized Message<String> read() { 
		Utils.sleep(50);
		if (buffer.size() == 0) {
			try {
				wait();
				
			}catch (InterruptedException e) {
				e.printStackTrace();
		}
		}
		Message<String> res = (buffer.isEmpty())? null: buffer.remove(0); 
		notify();
		Utils.sleep(100);
		
		return res;
	}
	 
	public String toString() { return buffer.toString(); }

}