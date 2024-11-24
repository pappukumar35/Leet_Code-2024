package october;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Remove_Sub_Folders_from_the_Filesystem {
     public List<String> removeSubfolders(String[] folder) {
          Arrays.sort(folder);
          List<String> list = new ArrayList<>();

          for (String f : folder) {
               if (list.isEmpty() || !f.startsWith(list.get(list.size() - 1) + "/")) {
                    list.add(f);
               }
          }
          return list;
     }

     public static void main(String[] args) {

     }
}