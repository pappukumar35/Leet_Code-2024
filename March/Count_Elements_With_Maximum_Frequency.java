class Count_Elements_With_Maximum_Frequency{
     public int maxFrequencyElements(int[] nums) {
        
          Map<Integer, Integer> freq = new HashMap<>();
  
          for(int e : nums) {
              freq.put(e, freq.getOrDefault(e, 0) + 1);
          }
  
          int maxFreq = 0;
          for(int e : freq.values()) {
              maxFreq = Math.max(maxFreq, e);
          }
  
          int freqOfMaxFrequency = 0;
  
          for(int frequency : freq.values()) {
              if(frequency == maxFreq) {
                  freqOfMaxFrequency++;
              }
          }
          return freqOfMaxFrequency * maxFreq;
      }
}