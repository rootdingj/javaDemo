package com.dj.ch08.lx_05;

public class Test 
{
	public static void main(String[] args) 
	{
		MyStack stack = new MyStack();
		stack.push(new Integer(1));
		stack.push(new Integer(2));
		
		System.out.println(stack.pop());
		
		stack.push(new Integer(4));
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		stack.push(new Integer(5));
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		MyQueue queue = new MyQueue();
		queue.in(new Integer(1));
		queue.in(new Integer(2));
		System.out.println(queue.out());
		
		queue.in(new Integer(4));
		System.out.println(queue.out());
		System.out.println(queue.out());
		System.out.println(queue.out());
		
		queue.in(new Integer(5));
		System.out.println(queue.out());
		System.out.println(queue.out());
	}
}
