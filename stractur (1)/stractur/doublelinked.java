/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication82;

/**
 *
 * @author LENOVO
 */
public class doublelinked<E> {
    Node<E>header;
    Node<E>trailer;
    private int size=0;
    

     static class Node<E>{
    private E element;
    Node<E>next;
    Node<E>prev;
public Node(E e, Node<E> p,Node<E> n){
element=e;
next=n;
prev=p;
}

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }


    }
    public doublelinked(){
    
    header=new Node<>(null,null,null);
    trailer=new Node<>(null,header,null);
    header.setNext(trailer);
    
    }

    public int getSize() {
        return size;
    }
    public boolean isempty(){
    return size==0;
    }
    public E first(){
    if(isempty())
        return null;
    return header.getNext().getElement();
    } 
      public E last(){
    if(isempty())
        return null;
    return trailer.getPrev().getElement();
    } 
      public void addfirst(E e){
      addbetwteen(e,header,header.getNext());
      
      }
        public void addlast(E e){
      addbetwteen(e,trailer.getPrev(),trailer);
      
      }
        public E removefirst(){
        if(isempty())
            return null;
        return remove(header.getNext());
        
        }   public E removelast(){
        if(isempty())
            return null;
        return remove(trailer.getPrev());
        
        }
      
      private void addbetwteen(E e,Node<E>predcessor,Node<E>sucessor){
          Node<E>newset= new Node<>(e,predcessor,sucessor);
          predcessor.setNext(newset);
          sucessor.setPrev(newset);
          size++;
      }
      private E remove(Node<E>node){
          Node<E> predcessor=node.getPrev();
          Node<E> sucessor=node.getNext();
          predcessor.setNext(sucessor);
          sucessor.setPrev(predcessor);
          size--;
          return node.getElement();
      
          
      }
      public void InsertAfter(Node<E>prev_Node, E new_data)
{
 
    if (prev_Node == null) {
        System.out.println(
            "The given previous node cannot be NULL ");
        return;
    }
 

    Node<E> new_node = new Node<>(new_data,header,trailer );
 
    new_node.next = prev_Node.next;
 
    prev_Node.next = new_node;
 
    new_node.prev = prev_Node;
 
    if (new_node.next != null)
        new_node.next.prev = new_node;
}
       public void printlist(Node<E> node)
    {
        Node<E> last = null;
        System.out.println(
            "Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.element + " ");
            last = node;
            node = node.next;
            if(node.next==null){
            break;
            }
          
        }
        System.out.println();
        System.out.println(
            "Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.element + " ");
            last = last.prev;
              if(last.prev==null){
            break;
            }
            }
        }
          public void deleteNode(E key) {
    
        Node<E> temp = header, prev = null;

      
        if (temp != null && temp.element == key) {
            header = temp.next; 
            temp.prev=header;
            
            return;
        }

        while (temp != null && temp.element != key) {
            prev = temp;
            temp = temp.next;
        }

      
        if (temp == null)
            return;

      
        prev.next = temp.next;
    }

    
    }

