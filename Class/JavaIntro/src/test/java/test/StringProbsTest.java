package test;

import javaIntro.StringProbs;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringProbsTest {

	@Test
	public void testHasMiddleQ() {
		Assert.assertTrue(StringProbs.hasMiddleQ("fooQfoo"));
		Assert.assertTrue(StringProbs.hasMiddleQ("blahQzzzz"));
		Assert.assertTrue(StringProbs.hasMiddleQ("Q"));
		Assert.assertFalse(StringProbs.hasMiddleQ("fooZfoo"));
		Assert.assertFalse(StringProbs.hasMiddleQ("QQQQ"));
		Assert.assertFalse(StringProbs.hasMiddleQ(""));
	}

	@Test
	public void testFirstMatchesLast() {
		Assert.assertTrue(StringProbs.firstMatchesLast("abca"));
		Assert.assertTrue(StringProbs.firstMatchesLast("zbdsadascz"));
		Assert.assertTrue(StringProbs.firstMatchesLast("h"));
		Assert.assertFalse(StringProbs.firstMatchesLast("bbca"));
		Assert.assertFalse(StringProbs.firstMatchesLast("qbdsadascz"));
		Assert.assertFalse(StringProbs.firstMatchesLast(""));
	}

	@Test
	public void testFirst4Match() {
		Assert.assertTrue(StringProbs.first4Match("aaaaBBBB", "aaaaCCCC"));
		Assert.assertTrue(StringProbs.first4Match("aaaaBBBB", "aaaa"));
		Assert.assertTrue(StringProbs.first4Match("abcdBBBB", "abcd"));
		Assert.assertFalse(StringProbs.first4Match("aaaBBBB", "aaaCCCC"));
		Assert.assertFalse(StringProbs.first4Match("abaaBBBB", "aaaa"));
		Assert.assertFalse(StringProbs.first4Match("abc", "abc"));
	}
	
	@Test
	public void testIsDoubled() {
		Assert.assertTrue(StringProbs.isDoubled("foofoo"));
		Assert.assertTrue(StringProbs.isDoubled("zz"));
		Assert.assertFalse(StringProbs.isDoubled("az"));
		Assert.assertFalse(StringProbs.isDoubled("foobar"));
		Assert.assertFalse(StringProbs.isDoubled("fooblah"));
		Assert.assertFalse(StringProbs.isDoubled("a"));
		Assert.assertTrue(StringProbs.isDoubled(""));
	}

}
