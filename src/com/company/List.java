package com.company;

public class List<T> {
    private Node<T> head;
    private Node<T> last;
    private int size = 0;
    public void add(T t)
    {
     Node<T> newNode = new Node<T>(t);
    if(head == null)
    {
      head = newNode;
      last = newNode;
    }
    else
    {
        last.setNext(newNode);
        newNode.setPrev(last);
        last = newNode;
    }
    size ++;
    }
    public T get(int index)
    {
        if(size < index)throw new RuntimeException("index out of bounds");

        Node<T> Head = head;
        T t;
        for(int i = 0; i < index-1;i++)
        {
            Head = Head.getNext();
        }
        return Head.getT();
    }
    public void remove(int i)
    {

        Node<T> Head = head;
        for(int j = 0; j < i-1;j++)
        {
            Head = Head.getNext();
        }
        if(Head == head)
        {
            head = head.getNext();
            return;
        }
        if(Head == last)
        {
            Head.getPrev().setNext(null);
            last = last.getPrev();
            return;
        }
        Head.getPrev().setNext(head.getNext());
        Head.getNext().setPrev(head.getPrev());
        size --;
    }
    public void replace(int i, T t)
    {
        if(size < i) throw new RuntimeException("index out of bounds");

        Node<T> Head = head;
        for(int j = 0; j < i-1;j++)
        {
            Head = Head.getNext();
        }
        Head.setT(t);
    }
    public int getSize() {
        return size;
    }

    public class Node<T> {
        private Node next;
        private Node prev;
        private T num;

        public Node(T n)
        {
            this.num = n;
        }

        public T getT() {
            return num;
        }

        public Node getPrev() {
            return prev;
        }

        public Node getNext() {
            return next;
        }

        public void setT(T num) {
            this.num = num;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
