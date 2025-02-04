import java.awt.*;
import java.util.*;
import java.util.List;

//import java.util.*;   import หมดแต่จบในที่เดียว

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!" + args[2] + " " + args[3]);

        // กด สามจุด -> run with parameter -> Edit  (ดูค่าใน array)

        List<String> aList = new ArrayList<>();
        // List บอก กล่อง, <> บอก type, ArrayList<>() เป็น dynamic ขยายค่าไปเรื่อยๆ
        for (int i = 0; i < args.length; i++)
            aList.add(args[i]);
        System.out.println(aList);
        Collections.shuffle(aList, new Random());   // shuffle ทำหน้าที่สับเปลี่ยน
        System.out.println(aList);

        Set<String> hSet = new HashSet<>();
        hSet.add("OOP");
        hSet.add("GG");
        hSet.add("EZ");
        hSet.add("F");
        hSet.add("not");
        hSet.add("drop");
        hSet.add("GG");
        hSet.add("GG");
        hSet.add("GG");
        hSet.remove("GG");
        System.out.println(hSet);
        System.out.println("\n");

        SortedSet<String> sSet = new TreeSet<>();
        sSet.add("OOP");
        sSet.add("GG");
        sSet.add("EZ");
        sSet.add("F");
        sSet.add("not");
        sSet.add("drop");
        sSet.add("GG");
        sSet.add("ZZZ");
        sSet.add("123");
        sSet.add("กขค");
        System.out.println(sSet);
        System.out.println("\n");

        Stack<String> stacko = new Stack<>();
        stacko.push("a");
        stacko.push("b");
        stacko.push("c");
        System.out.println(stacko);
        System.out.println(stacko.pop());
        System.out.println(stacko);
        System.out.println("\n");

        Map<String, Color> favoriteColors = new HashMap<String, Color>();
        favoriteColors.put("Juliet", Color.BLUE);
        favoriteColors.put("Romeo", Color.GREEN);
        favoriteColors.put("Adam", Color.RED);
        favoriteColors.put("Eve", Color.BLUE);
        favoriteColors.put("Robert", Color.BLACK);
        favoriteColors.put("Mark", Color.WHITE);
        favoriteColors.put("Pedro", Color.YELLOW);
        favoriteColors.put("Cole", Color.BLUE);


        Set<String> keySet = favoriteColors.keySet();
        for (String key : keySet)
        {
            Color value = favoriteColors.get(key);
            System.out.println(key + " : " + value);
        }
        System.out.println("\n");

        Map<String, Color> sortedColors = new TreeMap<String, Color>();  // ไม่จำเป็นต้องตั้งว่า sorted
        sortedColors.put("Juliet", Color.BLUE);
        sortedColors.put("Romeo", Color.GREEN);
        sortedColors.put("Adam", Color.RED);
        sortedColors.put("Eve", Color.BLUE);
        sortedColors.put("Robert", Color.BLACK);
        sortedColors.put("Mark", Color.WHITE);
        sortedColors.put("Pedro", Color.YELLOW);
        sortedColors.put("Cole", Color.BLUE);


        Set<String> logSet = sortedColors.keySet();
        for (String log : logSet)
        {
            Color value = sortedColors.get(log);
            System.out.println(log + " : " + value);
        }
    }

}