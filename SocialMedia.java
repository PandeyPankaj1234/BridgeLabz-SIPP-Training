package Workshop;
class Node<T>{
    T data;
    Node next;

    Node(T data){
        this.data=data;
        this.next=null;
    }
    Node(T data, Node next){
        this.data=data;
        this.next=next;
    }
    
}

public class SocialMedia {
    public static void main(String[] args) {
        Node y=new Node(2);
        Node w = new Node(2);
        System.out.println(y.data +"->"+ w.data);
        
    }
    
}
