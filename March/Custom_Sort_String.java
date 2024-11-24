class Custom_Sort_String {
     public String customSortString(String order, String s) {
          Map<Character, Integer> sCharFreqMp = new HashMap<>();
          for (char currChr : s.toCharArray()) {
               sCharFreqMp.put(currChr, sCharFreqMp.getOrDefault(currChr, 0) + 1);
          }

          StringBuilder res = new StringBuilder();

          for (char currChr : order.toCharArray()) {
               if (sCharFreqMp.containsKey(currChr)) {
                    int freq = sCharFreqMp.get(currChr);
                    while (freq-- > 0) {
                         res.append(currChr);
                    }
                    sCharFreqMp.put(currChr, 0);
               }
          }

          for (char currChr : s.toCharArray()) {
               if (sCharFreqMp.get(currChr) != 0) {
                    res.append(currChr);
                    sCharFreqMp.put(currChr, sCharFreqMp.get(currChr) - 1);
               }
          }

          return res.toString();
     }

     public static void main(String[] args) {

     }
}