package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestWordCounter {

  // TODO complete this test class

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter

  @Before
  public void setUp() {
    // TODO create the SUT instance
	WordCounter count = new WordCounter;
  }

  @After
  public void tearDown() {
    // TODO set the SUT instance to null
	  count = null;
  }

  @Test
  public void testGetCountEmpty() {

    // TODO verify that the SUT initially returns an empty map
	  AssertEquals(count.getCounts(), Collections.emptyMap());
    //fail();

  }

  @Test
  public void testGetCountNonEmpty() {

    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
	List inStream = Arrays.asList("hello", "world", "ben", "hello", "Taylor", "world", "Taylor", "what", "is", "new").iterator();
	count.countWords(inStream);
	AssertEquals(count.getCount("hello"), 2);
	AsserEquasl(count.getCount("world"), 2);
    //fail();

  }
}
