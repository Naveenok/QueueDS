/**
 * 
 */
package com.queue;

public class QueueDS {
	int[] queue = new int[5];
	int size;
	int rear;
	int front;

	public void enqueue(int data) {
		if (!isfull()) {
			queue[rear] = data;
			rear = rear + 1;
			size = size + 1;
		}
		else {
			System.out.println("queue is full");
		}
	}

	public void dequeue() {
		if (!isempty()) {
			int data = queue[front];
			front = front + 1;
			size = size - 1;
		}
		// return data;
		else {
			System.out.println("queue is empty");
		}
	}

	public void show() {
		for (int i = front; i < queue.length; i++) {
			System.out.println(queue[i]);
		}
	}

	public boolean isempty() {
		return (size == 0);
	}

	public boolean isfull() {
		return (size == 5);
	}
}
