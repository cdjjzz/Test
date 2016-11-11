package test;


public class Linelist<T extends Comparable<T>>{
	private class Node<T>{
		private T data;
		private Node<T> next;
		public Node(T data,Node<T> next){
			this.data=data;
			this.next=next;
		}
		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
		
	}
	transient Node<T> first;
	private int size;
	private void LineAddSort(T data){
		if(data==null)
			return;
		final Node<T> node=new Node<T>(data, null);
		if(first==null){
			first=node;
		}else{
			Node<T> temp=first,prev = null;
			while(temp!=null&&temp.data.compareTo(data)<0){
				prev=temp;
				temp=temp.next;
			}
			prev.next=node;
			node.next=temp;
		}
		System.out.println(first);
		size++;
	}
	public int size(){
		return size;
	}
	public void add(T data){
		LineAddSort(data);
	}
	public T get(int index){
		return node(index).data;
	}
	private Node<T> node(int index){
		if(index<size){
			for(Node<T> temp=first;temp!=null;temp=temp.next){
				if(index==0)
					return temp;
				index--;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		Linelist<Integer> linelist=new Linelist<Integer>();
		linelist.add(1);
		linelist.add(8);
		linelist.add(5);
		linelist.add(4);
		linelist.add(6);
		linelist.add(80);
		for (int i = 0; i <linelist.size; i++) {
			System.out.println(linelist.get(i));
		}
	}
}
