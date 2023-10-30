/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 25 05:28:23 GMT 2023
 */

package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JsonPointer_ESTest extends JsonPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JsonPointer jsonPointer0 = new JsonPointer();
      jsonPointer0.hashCode();
      assertEquals((-1), jsonPointer0.getMatchingIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer.valueOf("");
      String string0 = jsonPointer0.getMatchingProperty();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonPointer jsonPointer0 = new JsonPointer();
      JsonPointer jsonPointer1 = jsonPointer0.tail();
      assertNull(jsonPointer1);
      assertEquals((-1), jsonPointer0.getMatchingIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("UVu}ddG=wL{0( 73~", 5);
      boolean boolean0 = jsonPointer0.mayMatchProperty();
      assertTrue(boolean0);
      assertEquals("UVu}ddG=wL{0( 73~", jsonPointer0.toString());
      assertFalse(jsonPointer0.matches());
      assertEquals("Vu}~dG=wL{0( 73~", jsonPointer0.getMatchingProperty());
      assertEquals((-1), jsonPointer0.getMatchingIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer.compile("");
      String string0 = jsonPointer0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer.compile("");
      int int0 = jsonPointer0.getMatchingIndex();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer.compile((String) null);
      assertTrue(jsonPointer0.mayMatchProperty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer.compile("/'y^DebHmj>8BY");
      assertEquals("'y^DebHmj>8BY", jsonPointer0.getMatchingProperty());
      assertFalse(jsonPointer0.matches());
      assertEquals("/'y^DebHmj>8BY", jsonPointer0.toString());
      assertEquals((-1), jsonPointer0.getMatchingIndex());
      assertTrue(jsonPointer0.mayMatchProperty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        JsonPointer.valueOf("\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid input: JSON Pointer expression must start with '/': \"\"\"
         //
         verifyException("com.fasterxml.jackson.core.JsonPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer._parseTail("F%] E!k!R(2otUN[&");
      boolean boolean0 = jsonPointer0.matches();
      assertEquals((-1), jsonPointer0.getMatchingIndex());
      assertFalse(boolean0);
      assertEquals("%] E!k!R(2otUN[&", jsonPointer0.getMatchingProperty());
      assertEquals("F%] E!k!R(2otUN[&", jsonPointer0.toString());
      assertTrue(jsonPointer0.mayMatchProperty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer.EMPTY;
      boolean boolean0 = jsonPointer0.matches();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer.EMPTY;
      boolean boolean0 = jsonPointer0.mayMatchElement();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer._parseTail("G4");
      boolean boolean0 = jsonPointer0.mayMatchElement();
      assertEquals("G4", jsonPointer0.toString());
      assertEquals("4", jsonPointer0.getMatchingProperty());
      assertFalse(jsonPointer0.matches());
      assertTrue(jsonPointer0.mayMatchProperty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer.EMPTY;
      JsonPointer jsonPointer1 = jsonPointer0.matchProperty("[.#\"O-cJy");
      assertNull(jsonPointer1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer._parseTail("|");
      assertTrue(jsonPointer0.mayMatchProperty());
      
      JsonPointer jsonPointer1 = jsonPointer0.matchProperty("|");
      assertEquals((-1), jsonPointer0.getMatchingIndex());
      assertFalse(jsonPointer0.matches());
      assertEquals("|", jsonPointer0.toString());
      assertNull(jsonPointer1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer._parseTail("|");
      JsonPointer jsonPointer1 = new JsonPointer("|", "|", jsonPointer0);
      JsonPointer jsonPointer2 = jsonPointer1.matchProperty("|");
      assertNotNull(jsonPointer2);
      assertEquals((-1), jsonPointer2.getMatchingIndex());
      assertEquals("", jsonPointer2.getMatchingProperty());
      assertEquals("|", jsonPointer2.toString());
      assertEquals((-1), jsonPointer1.getMatchingIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JsonPointer jsonPointer0 = new JsonPointer();
      jsonPointer0.matchElement(0);
      assertEquals((-1), jsonPointer0.getMatchingIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer._parseTail("G4");
      JsonPointer jsonPointer1 = jsonPointer0.matchElement(4);
      assertNotNull(jsonPointer1);
      assertEquals((-1), jsonPointer1.getMatchingIndex());
      assertEquals("4", jsonPointer0.getMatchingProperty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JsonPointer jsonPointer0 = new JsonPointer();
      jsonPointer0.matchElement((-1));
      assertEquals((-1), jsonPointer0.getMatchingIndex());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JsonPointer jsonPointer0 = new JsonPointer();
      boolean boolean0 = jsonPointer0.equals((Object) null);
      assertEquals((-1), jsonPointer0.getMatchingIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JsonPointer jsonPointer0 = new JsonPointer();
      boolean boolean0 = jsonPointer0.equals(jsonPointer0);
      assertEquals((-1), jsonPointer0.getMatchingIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JsonPointer jsonPointer0 = new JsonPointer();
      JsonPointer jsonPointer1 = new JsonPointer("", "", jsonPointer0);
      boolean boolean0 = jsonPointer0.equals(jsonPointer1);
      assertEquals((-1), jsonPointer0.getMatchingIndex());
      assertTrue(boolean0);
      assertEquals((-1), jsonPointer1.getMatchingIndex());
      assertFalse(jsonPointer1.matches());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer.EMPTY;
      boolean boolean0 = jsonPointer0.equals("%");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail(". ]<p1I", 5);
      assertFalse(jsonPointer0.matches());
      assertEquals((-1), jsonPointer0.getMatchingIndex());
      assertEquals(" ]</I", jsonPointer0.getMatchingProperty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer._parseTail("i1R@AEs^{/*");
      assertEquals((-1), jsonPointer0.getMatchingIndex());
      assertFalse(jsonPointer0.matches());
      assertEquals("1R@AEs^{", jsonPointer0.getMatchingProperty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer._parseTail("i335,U");
      assertEquals("i335,U", jsonPointer0.toString());
      assertEquals("335,U", jsonPointer0.getMatchingProperty());
      assertEquals((-1), jsonPointer0.getMatchingIndex());
      assertFalse(jsonPointer0.matches());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer._parseTail("\". ]<~R");
      assertEquals(". ]<~R", jsonPointer0.getMatchingProperty());
      assertEquals((-1), jsonPointer0.getMatchingIndex());
      assertFalse(jsonPointer0.matches());
      assertEquals("\". ]<~R", jsonPointer0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer._parseTail("UVu}ddG=wLx{0(73~");
      assertEquals("Vu}ddG=wLx{0(73~", jsonPointer0.getMatchingProperty());
      assertEquals("UVu}ddG=wLx{0(73~", jsonPointer0.toString());
      assertEquals((-1), jsonPointer0.getMatchingIndex());
      assertFalse(jsonPointer0.matches());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("5i3>$,U", 0);
      assertEquals("5i3>$,U", jsonPointer0.toString());
      assertEquals((-1), jsonPointer0.getMatchingIndex());
      assertEquals("~5i3>$,U", jsonPointer0.getMatchingProperty());
      assertFalse(jsonPointer0.matches());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("Invalid input: JSON Pointer expression must start with '/': \"", 18);
      assertEquals((-1), jsonPointer0.getMatchingIndex());
      assertEquals("nvalid input: JS~N Pointer expression must start with '", jsonPointer0.getMatchingProperty());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("UVu}ddG=wLx{0(73~,", 12);
      assertEquals((-1), jsonPointer0.getMatchingIndex());
      assertEquals("Vu}ddG=wLx~(73~,", jsonPointer0.getMatchingProperty());
      assertFalse(jsonPointer0.matches());
      assertEquals("UVu}ddG=wLx{0(73~,", jsonPointer0.toString());
  }
}
