import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/*
    原因：Arrays.asList 方法的返回类型是ArrayList类型，
    该类型并不是java.util.ArrayList 而是 java.util.Arrays.ArrayList
    是Arrays的内部类，该实现类AbstractList实现类，并没有实现removeAll方法，
    当调用removeAll时因为需要调用remove方法，
    但是java.util.Arrays.ArrayList中没有remove方法，
    会调用AbstractList的remove方法



    该AbstractList只是简单地在已有的元素数组上套了一层List 的接口，
    所以不支持增删改操作。如果希望能增删改，必须 new 一个LinkedList 或ArrayList。
    原因：Arrays.asList 是 AbstractList。
    该AbstractList只是简单地在已有的元素数组上套了一层List 的接口，
    所以不支持增删改操作。


 */

public class Del_ArrayElement {
    @Test
    public void test(){
        int[] ints = {12,45,78,78,46};
        Integer[] integers = new Integer[ints.length];

        // 将基本类型的数组转化为包装类数组
       for(int i = 0;i<ints.length;i++){
           integers[i] = ints[i];
       }

       // 将数组转化为集合
        List<Integer> integers1 = Arrays.asList(integers);
        ArrayList<Integer> integers2 = new ArrayList<>(integers1);
        integers2.add(98);

        Iterator<Integer> iterator = integers2.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals(78)){
                iterator.remove();
            }
        }
        // 不推荐
//        for(int i = 0;i<integers2.size();i++){
//            if(integers2.get(i) == 78){
//                try {
//                    integers2.remove(i);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        System.out.print(integers1);
        System.out.print(integers2);
        Object[] objects = integers2.toArray();
        for(int i = 0;i<objects.length;i++){
            System.out.print(objects[i] +"\t");
        }


    }
}
