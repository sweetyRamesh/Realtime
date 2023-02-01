//using java 8
import java.util.*;
public class Large{
public static int getSecondLargest(Integer[] a, int total){
List<Integer> list=Arrays.asList(a);
Collections.sort(list);
int element=list.get(total-2);
return element;
}
}