package test;


import javaIntro.LoopProbs;
import org.junit.Test;
import org.testng.Assert;

public class LoopProbsTest {


	@Test
	public void testBunchOfOnes() {
		Assert.assertEquals(1, LoopProbs.bunchOfOnes(1));
		Assert.assertEquals(11, LoopProbs.bunchOfOnes(2));
		Assert.assertEquals(1111111, LoopProbs.bunchOfOnes(7));
	}
	
	@Test
	public void testFact() {
		Assert.assertEquals(1, LoopProbs.fact(0));
		Assert.assertEquals(1, LoopProbs.fact(1));
		Assert.assertEquals(2, LoopProbs.fact(2));
		Assert.assertEquals(6, LoopProbs.fact(3));
		Assert.assertEquals(24, LoopProbs.fact(4));
		Assert.assertEquals(120, LoopProbs.fact(5));
		Assert.assertEquals(362880, LoopProbs.fact(9));
	}
	
	@Test
	public void testCountXX() {
		Assert.assertEquals(0, LoopProbs.countXX(null));
		Assert.assertEquals(0, LoopProbs.countXX(""));
		Assert.assertEquals(0, LoopProbs.countXX("abx"));
		Assert.assertEquals(1, LoopProbs.countXX("abxxcd"));
		Assert.assertEquals(1, LoopProbs.countXX("abcxx"));
		Assert.assertEquals(2, LoopProbs.countXX("xxx"));
		Assert.assertEquals(3, LoopProbs.countXX("xxxx"));
	}

	@Test
	public void testStringBits() {
		Assert.assertEquals("", LoopProbs.stringBits(null));
		Assert.assertEquals("", LoopProbs.stringBits(""));
		Assert.assertEquals("Hlo", LoopProbs.stringBits("Hello"));
		Assert.assertEquals("H", LoopProbs.stringBits("Hi"));
		Assert.assertEquals("Hello", LoopProbs.stringBits("Heeololeo"));
		Assert.assertEquals("Ac", LoopProbs.stringBits("Abc"));
	}

	@Test
	public void testPairedX() {
		Assert.assertFalse(LoopProbs.pairedX("aabb"));
		Assert.assertFalse(LoopProbs.pairedX("x"));
		Assert.assertTrue(LoopProbs.pairedX("axxbb"));
		Assert.assertFalse(LoopProbs.pairedX("axaxax"));
		Assert.assertFalse(LoopProbs.pairedX("aaxxxb"));
		Assert.assertFalse(LoopProbs.pairedX("aaxxbbx"));
		Assert.assertTrue(LoopProbs.pairedX("xxxx"));
	}

	@Test
	public void testStringSplosion() {
		Assert.assertEquals("", LoopProbs.stringSplosion(null));
		Assert.assertEquals("", LoopProbs.stringSplosion(""));
		Assert.assertEquals("CCoCodCode", LoopProbs.stringSplosion("Code"));
		Assert.assertEquals("aababc", LoopProbs.stringSplosion("abc"));
		Assert.assertEquals("aab", LoopProbs.stringSplosion("ab"));
	}
}
