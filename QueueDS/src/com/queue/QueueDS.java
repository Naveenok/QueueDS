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

		queue[rear] = data;
		rear = rear + 1;
		size = size + 1;
	}

	public int dequeue() {
		int data = queue[front];
		front = front + 1;
		size = size - 1;
		return data;
	}
}
