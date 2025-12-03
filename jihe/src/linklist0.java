import java.util.LinkedList;

        public class linklist0 {
            public static void main(String[] args) {
                LinkedList<Integer> linkedList = new LinkedList<>();
                for (int i = 1; i <= 2; i++) {
                    linkedList.add(i);
                }
                linkedList.add(100);
                linkedList.add(100);
                System.out.println("初始集合：" + linkedList);
                int elementAt2 = linkedList.get(2);
                System.out.println("索引 2 对应的元素：" + elementAt2);
                int firstIndexOf100 = linkedList.indexOf(100);
                int lastIndexOf100 = linkedList.lastIndexOf(100);
                System.out.println("100 第一次出现的索引：" + firstIndexOf100);
                System.out.println("100 最后一次出现的索引：" + lastIndexOf100);
                linkedList.set(1, 200);
                System.out.println("修改后集合：" + linkedList);
                linkedList.remove(Integer.valueOf(100));
                System.out.println("删除第一个 100 后：" + linkedList);
                linkedList.remove(2);
                System.out.println("删除索引 2 的元素后：" + linkedList);
            }
        }
