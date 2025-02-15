/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 18 06:57:46 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Node_ESTest extends Node_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Document document0 = new Document("Cw+Q33)e0");
      // Undeclared exception!
      try { 
        document0.before((Node) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("leftarrowtail", "leftarrowtail");
      textNode0.setBaseUri("leftarrowtail");
      assertEquals(0, textNode0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Document document0 = Document.createShell("a5s:bet4r6Oh");
      // Undeclared exception!
      try { 
        document0.after((Node) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("abs:beth", "abs:beth");
      // Undeclared exception!
      try { 
        textNode0.after("abs:beth");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TextNode textNode0 = new TextNode("abs:beth", "abs:beth");
      Node[] nodeArray0 = textNode0.childNodesAsArray();
      assertEquals(0, nodeArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("abs:beth", "abs:beth");
      Node node0 = textNode0.clone();
      assertNotSame(node0, textNode0);
      assertNotNull(node0);
      assertEquals(0, node0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("abs:beth", "abs:beth");
      textNode0.outerHtml();
      assertEquals(0, textNode0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TextNode textNode0 = new TextNode("T'k`m#!pP[mE3fp!l", "T'k`m#!pP[mE3fp!l");
      // Undeclared exception!
      try { 
        textNode0.remove();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("abs:beth", "abs:beth");
      textNode0.attr("abs:beth", "abs:beth");
      String string0 = textNode0.absUrl("abs:beth");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TextNode textNode0 = new TextNode("T'k`m#!pP[mE3fp!l", "T'k`m#!pP[mE3fp!l");
      Node node0 = textNode0.removeAttr("T'k`m#!pP[mE3fp!l");
      assertEquals(0, node0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TextNode textNode0 = new TextNode("T'k`m#!pP[mE3fp!l", "T'k`m#!pP[mE3fp!l");
      // Undeclared exception!
      try { 
        textNode0.replaceWith(textNode0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Document document0 = Document.createShell("org.jsoup.nodes.Node");
      Elements elements0 = document0.select("org.jsoup.nodes.Node");
      assertTrue(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("abs:beth", "abs:beth");
      // Undeclared exception!
      try { 
        textNode0.siblingNodes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Document document0 = Document.createShell("]v#gb`&i");
      document0.outerHtml();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Document document0 = Document.createShell("abs:beth");
      document0.attributes();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TextNode textNode0 = new TextNode("abs:beth", "abs:beth");
      textNode0.absUrl("abs:beth");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TextNode textNode0 = new TextNode("abs:beth", "abs:beth");
      Document document0 = Document.createShell("abs:beth");
      document0.appendChild(textNode0);
      textNode0.before("abs:beth");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TextNode textNode0 = new TextNode("abs:beth", "abs:beth");
      // Undeclared exception!
      try { 
        textNode0.wrap("abs:beth");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.TreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("a5s:bet4r6Oh", "a5s:bet4r6Oh");
      Document document0 = Document.createShell("a5s:bet4r6Oh");
      document0.appendChild(textNode0);
      textNode0.wrap("a5s:bet4r6Oh");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TextNode textNode0 = new TextNode("T'k`m#!pP[mE3fp!l", "T'k`m#!pP[mE3fp!l");
      DataNode dataNode0 = new DataNode("T'k`m#!pP[mE3fp!l", "T'k`m#!pP[mE3fp!l");
      // Undeclared exception!
      try { 
        dataNode0.replaceChild(textNode0, textNode0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Document document0 = Document.createShell("horb");
      Document document1 = (Document)document0.appendChild(document0);
      // Undeclared exception!
      try { 
        document1.replaceChild(document0, document0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("](#g&i", "](#g&i");
      Document document0 = Document.createShell(":)cs<");
      DataNode dataNode0 = new DataNode("](#g&i", "nl5=m2");
      Node[] nodeArray0 = new Node[6];
      nodeArray0[0] = (Node) document0;
      nodeArray0[1] = (Node) dataNode0;
      nodeArray0[2] = (Node) dataNode0;
      nodeArray0[3] = (Node) document0;
      nodeArray0[4] = (Node) document0;
      nodeArray0[5] = (Node) textNode0;
      dataNode0.addChildren(nodeArray0);
      TextNode textNode1 = new TextNode("#text", "&Y");
      dataNode0.replaceChild(document0, textNode1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TextNode textNode0 = new TextNode("and", "and");
      // Undeclared exception!
      try { 
        textNode0.removeChild(textNode0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("and", "and");
      Document document0 = new Document("and");
      document0.appendChild(textNode0);
      textNode0.previousSibling();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Document document0 = Document.createShell("\"-8T|3&v3B]qk&");
      document0.appendChild(document0);
      document0.previousSibling();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("a5s:beth", "a5s:beth");
      textNode0.equals("us|");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("]v#gb`&i", "]v#gb`&i");
      textNode0.equals(textNode0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TextNode textNode0 = new TextNode("abs:beth", "abs:beth");
      textNode0.hashCode();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Document document0 = new Document("T'k`m#!pP[mE3fp!l");
      Element element0 = document0.appendChild(document0);
      // Undeclared exception!
      try { 
        element0.hashCode();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Document document0 = new Document("T'k`m#!pP[mE3fp!l");
      document0.hashCode();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Document document0 = Document.createShell(":)cs<");
      document0.clone();
  }
}
