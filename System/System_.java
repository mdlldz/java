package com.hspedu.system_;

import java.util.Arrays;

public class System_ {
    public static void main(String[] args) {
//        System.out.println("ok1");
//        System.exit(0);//
//        System.out.println("ok2");
        int[] src={1,2,3};
        int[] dest = new int[3];// dest 当前是 {0,0,0}
        System.arraycopy(src, 0, dest, 0, src.length);
        // int[] src={1,2,3};
        System.out.println("dest=" + Arrays.toString(dest));//[1, 2, 3]
        System.out.println(System.currentTimeMillis());
    }
}
