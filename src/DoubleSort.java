
import java.util.Arrays;
import  java.util.Comparator;

public class DoubleSort {
  //  public static void main(String[] args) {
 //       Object[] arr = {2, 1, "a", 3, "bc", 0, "v"};
  //      Object[] h = dbSort(arr);
  //      System.out.println(Arrays.toString(h));
//String[] masiv = {"d","4","f","d","3","5","f","s","2","1","1"};
//Object[] h = dbSort(masiv);
//for (Object mas : h)
//{
//    System.out.print(mas.toString()+" ");
//}
 //   }
    public static Object[] dbSort(Object[] a)
    {
        Comparator<Object> comparator = (o1, o2) -> {
            if(o1 instanceof Integer && o2 instanceof String)
            {
                return -1;
            }
            if(o1 instanceof String && o2 instanceof Integer)
            {
                    return  1;
            }
            if(o1 instanceof String && o2 instanceof String)
            {
                return ((String)o1).compareTo((String)o2);
            }
            if(o1 instanceof Integer && o2 instanceof Integer)
            {
                return ((Integer)o1).compareTo((Integer) o2);
            }
            return 0;
        };
        Arrays.sort(a, comparator);

//        boolean neverno = true;
//        Comparator<Object> comparator = new Comparator<Object>() {
//            @Override
//            public int compare(Object o1, Object o2) {
//              return  o1.toString().compareTo(o2.toString());
//            }
//        };
//        while (neverno) {
//            neverno=false;
//            for (int i = 0; i < a.length - 1; i++) {
//                if (comparator.compare(a[i], a[i + 1]) > 0) {
//                    Object buf = a[i];
//                    a[i] = a[i + 1];
//                    a[i + 1] = buf;
//                    neverno=true;
//                }
//            }
//        }
        return a;
    }

}
