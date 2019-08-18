import javax.xml.bind.SchemaOutputResolver;
import java.util.*;
public class Practice {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add("我");
        list.add("爱");
        list.add("java");
        System.out.println(list.size());
        System.out.println(list.isEmpty());



        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));

        for(String s : list){
            System.out.println(s);
        }

        list.remove("爱");

        for(String s : list){
            System.out.println(s);
        }

        System.out.println("+++++++++++++");
        System.out.println(list.contains("我"));
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
