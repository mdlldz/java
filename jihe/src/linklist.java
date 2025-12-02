public class linklist {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node mdl = new Node("mdl");
        jack.next = tom;
        tom.next = mdl;
        mdl.pre = tom;
        tom.pre = jack;
        Node first = jack;
        Node last = mdl;
        while(true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        while(true){
            if(last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }
        Node smith = new Node("smith");
        smith.next = mdl;
        smith.pre = tom;
        mdl.pre = smith;
        tom.next = smith;
        first = jack;
        last = mdl;
        while(true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        while(true){
            if(last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }
    }
}
class Node{
    public Object item;
    public Node next;
    public Node pre;
    public Node(Object name){
        this.item = name;
    }

    @Override
    public String toString() {
       return "Node name = " + item;
    }
}
