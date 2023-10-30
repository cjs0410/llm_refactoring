/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 18 06:54:40 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Node_ESTest extends Node_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Document document0 = Document.createShell("k[a");
      String string0 = document0.absUrl("k[a");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Document document0 = Document.createShell("$T$J");
      document0.setBaseUri("$T$J");
      assertEquals("#document", document0.nodeName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Document document0 = Document.createShell("k[a");
      document0.attr("k[a", "k[a");
      String string0 = document0.absUrl("k[a");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("s)b(5Ww$k55;D]", "s)b(5Ww$k55;D]");
      Node node0 = textNode0.removeAttr("Y81]v");
      assertSame(textNode0, node0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Document document0 = new Document("h:h:b%$\"/\"j^g&vi:4");
      document0.html("abs:abs:lcx9q:ro@=l.n:");
      String string0 = document0.outerHtml();
      assertEquals("abs:abs:lcx9q:ro@=l.n:", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Document document0 = new Document("+u.%Jtidai'=p%c+F$");
      // Undeclared exception!
      try { 
        document0.replaceWith((Node) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Document document0 = Document.createShell("NestedGreaterGreater");
      // Undeclared exception!
      try { 
        document0.siblingNodes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comment comment0 = new Comment("$Tf/<$<", "$Tf/<$<");
      comment0.toString();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Document document0 = Document.createShell("$Tf/<$<");
      document0.clone();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Document document0 = new Document("K");
      // Undeclared exception!
      try { 
        document0.remove();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TextNode textNode0 = new TextNode("J\"{nLxM*'o", "J\"{nLxM*'o");
      textNode0.attributes();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Document document0 = Document.createShell("abs:");
      // Undeclared exception!
      try { 
        document0.absUrl("abs:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Document document0 = Document.createShell("$T$J");
      Element element0 = document0.head();
      element0.setParentNode(document0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Document document0 = Document.createShell("");
      // Undeclared exception!
      try { 
        document0.replaceChild(document0, document0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Document document0 = Document.createShell("");
      document0.setParentNode(document0);
      TextNode textNode0 = TextNode.createFromEncoded("org.jsoup.nodes.Node$OuterHtmlVisitor", "bemptyv");
      document0.replaceChild(document0, textNode0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Document document0 = Document.createShell("");
      document0.setParentNode(document0);
      // Undeclared exception!
      try { 
        document0.replaceChild(document0, document0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Document document0 = new Document("UrV");
      // Undeclared exception!
      try { 
        document0.removeChild(document0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Document document0 = new Document(":\"EC-o");
      document0.normalise();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Document document0 = new Document(":\"EC-o");
      document0.parentNode = (Node) document0;
      document0.previousSibling();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Document document0 = new Document(":\"EC-o");
      document0.parentNode = (Node) document0;
      document0.parentNode.siblingIndex = 776;
      // Undeclared exception!
      try { 
        document0.previousSibling();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 775, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Document document0 = Document.createShell("$Tf/<$<");
      document0.getElementsByIndexGreaterThan(2147483645);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded(":\"EC-o", "[;v0");
      textNode0.equals(textNode0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TextNode textNode0 = new TextNode("J\"{nLxM*'o", "J\"{nLxM*'o");
      Comment comment0 = new Comment("Y#S7", "J\"{nLxM*'o");
      textNode0.setParentNode(comment0);
      textNode0.hashCode();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Document document0 = Document.createShell("$Tf/<$<");
      TextNode textNode0 = TextNode.createFromEncoded("$Tf/<$<", "$Tf/<$<");
      textNode0.doClone(document0);
  }
}
