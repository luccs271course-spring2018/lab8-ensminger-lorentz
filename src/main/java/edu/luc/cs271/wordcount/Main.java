package edu.luc.cs271.wordcount;

import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");

    // TODO complete this main program
    // 1. create a WordCounter instance
    Map<String, Integer> data = Collections.emptyMap();
    WordCounter WCounter = new WordCounter(data);
    // 2. use this to count the words in the input
    WCounter.countWords(input);
    // 3. determine the size of the resulting map
    int size = WCounter.getCounts().size();
    // 4. create an ArrayList of that size and
    List<Map.Entry<String, Integer>> MapEntries = new ArrayList<>(size);
    // 5.  store the map's entries in it (these are of type Map.Entry<String, Integer>)
    MapEntries.addAll(WCounter.getCounts().entrySet());

    // 6. sort the ArrayList in descending order by count

    Collections.sort(MapEntries, new DescendingByCount());
    //    using Collections.sort and an instance of the provided comparator (after fixing the
    // latter)
    // 7. print the (up to) ten most frequent words in the text
    for (int i = 0; i < 11; i++) {
      System.out.println(MapEntries.get(i));
    }
  }
}
