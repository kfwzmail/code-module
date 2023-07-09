package listremove;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Forremove {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        //1、for循环遍历list
        //只删除了一个“one”还有一个“one”,因为删除的关系后面的元素都往前移动了一位
        /*for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            if (temp.equals("one")) {
                list.remove(i);
                //i--;//就可以全部删除one
            }
        }
        System.out.println(list);*/

        //2、增强for循环
        //删除元素后继续循环会报错误信息ConcurrentModificationException
        //因为元素在使用的时候发生了并发的修改，导致异常抛出
        /*for (String ss : list) {
            if (ss.equals("one")) {
                list.remove(ss);
            }
        }
        System.out.println(list);*/

        //3、iterator遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            if (str.equals("one")) {
                it.remove();//1:迭代器删除,成功的
//                list.remove(str);//2:列表删除,失败的,会报ConcurrentModificationException
            }
        }
        System.out.println(list);
    }
}
