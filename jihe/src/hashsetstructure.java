public class hashsetstructure {
    public static void main(String[] args) {
        Node0 [] table = new Node0[16];
        Node0 john = new Node0("john" , null);
        table[2] = john;
        Node0 jack = new Node0("jack",null);
         john.next = jack;
         Node0 rose = new Node0("rose",null);
         jack.next = rose;
         Node0 lucy = new Node0("lucy",null);
         table[3] = lucy;
        System.out.println("table = " + table);
    }
}
class Node0{
    Object item;
    Node0 next;

    public Node0(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}
