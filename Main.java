import java.util.ArrayList;

public class Main
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
      
      //a
      names.add("Alice");
      names.add("Bob");
      names.add("Connie");
      names.add("David");
      names.add("Edward");
      names.add("Fran");
      names.add("Gomez");
      names.add("Harry");
      System.out.println("a) "+names);

      //b
      System.out.println("b) First Name: "+ names.get(0) + "," + "Last Name: " + names.get(names.size() - 1));
      
      //c
      System.out.println("c) Size of ArrayList names: "+ names.size());

      //d 
      System.out.println("d) Last Name: " + names.get(names.size()-1));

      //e
      names.set(0,"Alice B. Toklas");
       System.out.println("e) " + names);

      //f
      names.add(4, "Doug");
      System.out.println("f) " + names);
      
      //g
      System.out.println("g) ");
      for (String s: names)
      {
        System.out.print(s);
        System.out.print(",");
      };
      
      //h
      System.out.print("\nh) ");
      ArrayList<String> names2 = new ArrayList<String>(names);

      //i
      System.out.println(names2);
      System.out.println("i) ");
      names.remove(0);
      System.out.println("names: " + names);
      System.out.println("names2: " + names2);

   }
} 
