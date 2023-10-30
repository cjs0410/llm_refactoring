/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 14 08:13:48 GMT 2023
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("<!", "<!");
      assertEquals("#document", document0.nodeName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Document document0 = Parser.parse("<![CDATA[", "<![CDATA[");
      assertEquals("<![CDATA[", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Document document0 = Parser.parse("<!--%s-->", "<!--");
      assertEquals("<!--", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Document document0 = Parser.parse("<?", "<?");
      assertEquals("#root", document0.tagName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("</k(1 `U1", "</k(1 `U1");
      assertEquals("#document", document0.nodeName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Document document0 = Parser.parse("<!--", "<!--");
      assertEquals("<!--", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Document document0 = Parser.parse("</", "</");
      assertEquals("</", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("'<W!sdV@Zzh=/8&L<", "'<W!sdV@Zzh=/8&L<");
      assertEquals("'<W!sdV@Zzh=/8&L<", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parser.parse("5.rm\"<A=[R:", "5.rm\"<A=[R:");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parser.parse("RNX<0SAc]8Avcht", "RNX<0SAc]8Avcht");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Parser.parse("RNX<0SAcF<Avcht", "RNX<0SAcF<Avcht");
  }
}
