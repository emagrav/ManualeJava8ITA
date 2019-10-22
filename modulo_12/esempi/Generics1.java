import java.util.*;

public class Generics1 {
  public static void main(String args[]) {
    final Vector <Number> v = new Vector<Number>();
    v.add(1);
    v.add(2.0F);
    v.add(2.0D);
    v.add(2L);
    Iterator<Number> iter = v.iterator();
    while(iter.hasNext()) {
      Number n = iter.next();
    }


    Map<Integer, String> map = new HashMap<Integer, String>();
    map.put(0,"0");
    map.put(1,"1");
    map.put(2,"2");
    map.put(3,"3");
    System.out.println(getListOfMapValues(map));
    /*Integer in = 0;
    Double d = 2.2;
    char c = new Character('c');
    */
    List strings = new ArrayList( );
    strings.add("Lambda");
    strings.add("Streams API");
    strings.add("Date and Time API");
    strings.add("JavaFX");
    Iterator  i = strings.iterator();
    while (i.hasNext()) {
      String string = (String)i.next();
      System.out.println(string);
    }
    /*      Integer i1 = 256;
    Integer i2 = 256;
    if (i1 == i2) System.out.println("Equal!");
    else System.out.println("Not equal!");
    Integer i = null;
    int j = i;*/
  }
  public static List<String> getListOfMapValues (Map<Integer, String> map) {
    List <String> list = new ArrayList <String>();
    for (int i = 0; i < map.size(); i++) {
      list.add((String)map.get(i));
    }
    return list;
  }
}