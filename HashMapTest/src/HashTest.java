import java.io.*;
import java.lang.reflect.Type;
import java.net.Proxy;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import static java.lang.System.exit;

public class HashTest {

    public static void main(String[] args) throws IOException {
      try {
          File file = new File("C:\\Users\\User\\IdeaProjects\\build-test\\HashMapTest\\src\\Text.txt");
          FileReader fr = new FileReader(file);
          BufferedReader reader = new BufferedReader(fr);
          String line = reader.readLine();
          String content = Files.lines(Paths.get("C:\\Users\\User\\IdeaProjects\\build-test\\HashMapTest\\src\\Text.txt")).reduce("", String::concat);

//          File file = new File("C:\\Users\\User\\IdeaProjects\\build-test\\HashMapTest\\src\\Text.txt");
//          FileReader fr = new FileReader(file);
//          int ch;
          Map<String, Integer> dict= new HashMap<> ();

          String str = " ";

          String[] words = content.split("\\W");


          for (String word : words){
              str = word.toLowerCase();
              if(dict.keySet().contains(str)) {
                  dict.put(str, dict.get(str) + 1);

              } else {
                  if (str != " ") {
                      dict.put(str, 1);
                  }
              }
          }

          for(Map.Entry<String, Integer> item : dict.entrySet()){

              System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue());
          }
          Map<String, Integer> map = new TreeMap<>(dict);
          System.out.println(" ");
          System.out.println("Отсартированный Map");
          for(String ke: map.keySet()){
              System.out.println("Key: "+ ke + " Value : " +map.get(ke));
          }


      } catch (IOException exception){
          System.out.println("Ошибка при чтении файла");
          exit(0);
        }


    }
}
