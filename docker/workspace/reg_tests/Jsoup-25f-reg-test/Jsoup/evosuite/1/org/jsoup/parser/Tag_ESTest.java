/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 18 07:36:11 GMT 2023
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.Tag;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Tag_ESTest extends Tag_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Tag tag0 = Tag.valueOf("br");
      boolean boolean0 = tag0.isData();
      assertFalse(boolean0);
      assertFalse(tag0.canContainBlock());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Tag tag0 = Tag.valueOf("bF");
      assertNotNull(tag0);
      
      boolean boolean0 = tag0.preserveWhitespace();
      assertTrue(tag0.canContainBlock());
      assertFalse(tag0.isSelfClosing());
      assertTrue(tag0.isInline());
      assertFalse(boolean0);
      assertTrue(tag0.formatAsBlock());
      assertFalse(tag0.isData());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Tag tag0 = Tag.valueOf("&vR6w)VxPz>%{");
      boolean boolean0 = tag0.formatAsBlock();
      assertFalse(tag0.isSelfClosing());
      assertFalse(tag0.preserveWhitespace());
      assertTrue(tag0.canContainBlock());
      assertFalse(tag0.isBlock());
      assertTrue(boolean0);
      assertFalse(tag0.isData());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Tag tag0 = Tag.valueOf("frameset");
      String string0 = tag0.getName();
      assertEquals("frameset", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Tag tag0 = Tag.valueOf("UO1vpg");
      tag0.toString();
      assertFalse(tag0.isSelfClosing());
      assertFalse(tag0.isBlock());
      assertFalse(tag0.preserveWhitespace());
      assertTrue(tag0.canContainBlock());
      assertFalse(tag0.isData());
      assertTrue(tag0.formatAsBlock());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Tag tag0 = Tag.valueOf("br");
      boolean boolean0 = tag0.isBlock();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Tag tag0 = Tag.valueOf("&vR6w)VxPz>%{");
      boolean boolean0 = tag0.canContainBlock();
      assertTrue(boolean0);
      assertTrue(tag0.formatAsBlock());
      assertFalse(tag0.isData());
      assertFalse(tag0.isSelfClosing());
      assertFalse(tag0.preserveWhitespace());
      assertTrue(tag0.isInline());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Tag tag0 = Tag.valueOf("dd");
      boolean boolean0 = tag0.isInline();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Tag tag0 = Tag.valueOf("&vR6w)VxPz>%{");
      boolean boolean0 = tag0.isInline();
      assertFalse(tag0.isData());
      assertTrue(tag0.canContainBlock());
      assertFalse(tag0.isSelfClosing());
      assertTrue(tag0.formatAsBlock());
      assertTrue(boolean0);
      assertFalse(tag0.preserveWhitespace());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Tag tag0 = Tag.valueOf("button");
      boolean boolean0 = tag0.isData();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Tag tag0 = Tag.valueOf("br");
      boolean boolean0 = tag0.isSelfClosing();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Tag tag0 = Tag.valueOf("'Fs[v=qXsgDyS=K[E");
      boolean boolean0 = tag0.isSelfClosing();
      assertTrue(tag0.formatAsBlock());
      assertFalse(boolean0);
      assertFalse(tag0.isBlock());
      assertFalse(tag0.preserveWhitespace());
      assertTrue(tag0.canContainBlock());
      assertFalse(tag0.isData());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Tag tag0 = Tag.valueOf("'Fs[v=qXsgDyS=K[E");
      assertFalse(tag0.isSelfClosing());
      
      Tag tag1 = tag0.setSelfClosing();
      boolean boolean0 = tag1.isSelfClosing();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Tag tag0 = Tag.valueOf("`}=4M");
      boolean boolean0 = tag0.isKnownTag();
      assertFalse(boolean0);
      assertTrue(tag0.canContainBlock());
      assertFalse(tag0.preserveWhitespace());
      assertFalse(tag0.isSelfClosing());
      assertFalse(tag0.isBlock());
      assertTrue(tag0.formatAsBlock());
      assertFalse(tag0.isData());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Tag tag0 = Tag.valueOf("br");
      boolean boolean0 = tag0.isKnownTag();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = Tag.isKnownTag("M3");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = Tag.isKnownTag("br");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Tag tag0 = Tag.valueOf("command");
      Object object0 = new Object();
      boolean boolean0 = tag0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Tag tag0 = Tag.valueOf("M3");
      boolean boolean0 = tag0.equals(tag0);
      assertFalse(tag0.isBlock());
      assertTrue(tag0.canContainBlock());
      assertTrue(tag0.formatAsBlock());
      assertFalse(tag0.isSelfClosing());
      assertTrue(boolean0);
      assertFalse(tag0.preserveWhitespace());
      assertFalse(tag0.isData());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Tag tag0 = Tag.valueOf("command");
      Tag tag1 = Tag.valueOf("button");
      boolean boolean0 = tag0.equals(tag1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Tag tag0 = Tag.valueOf("1x`&oozxr");
      Tag tag1 = Tag.valueOf("ruby");
      boolean boolean0 = tag0.equals(tag1);
      assertFalse(tag0.isData());
      assertTrue(tag0.canContainBlock());
      assertFalse(boolean0);
      assertFalse(tag0.preserveWhitespace());
      assertFalse(tag0.isSelfClosing());
      assertTrue(tag0.formatAsBlock());
      assertFalse(tag0.isBlock());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Tag tag0 = Tag.valueOf("M3");
      Tag tag1 = Tag.valueOf("M3");
      boolean boolean0 = tag0.equals(tag1);
      assertFalse(tag1.isSelfClosing());
      assertTrue(boolean0);
      assertTrue(tag1.formatAsBlock());
      assertFalse(tag1.preserveWhitespace());
      assertFalse(tag1.isData());
      assertTrue(tag1.canContainBlock());
      assertFalse(tag1.isBlock());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Tag tag0 = Tag.valueOf("pre");
      Tag tag1 = Tag.valueOf("0N[;y");
      boolean boolean0 = tag0.equals(tag1);
      assertFalse(tag1.isData());
      assertTrue(tag1.canContainBlock());
      assertFalse(tag1.isSelfClosing());
      assertFalse(tag1.preserveWhitespace());
      assertFalse(tag1.isBlock());
      assertFalse(boolean0);
      assertTrue(tag1.formatAsBlock());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Tag tag0 = Tag.valueOf("hgroup");
      Tag tag1 = Tag.valueOf("*rbd_o*}au");
      boolean boolean0 = tag0.equals(tag1);
      assertFalse(boolean0);
      assertFalse(tag1.isSelfClosing());
      assertTrue(tag1.formatAsBlock());
      assertFalse(tag1.isData());
      assertTrue(tag1.canContainBlock());
      assertFalse(tag1.preserveWhitespace());
      assertFalse(tag1.isBlock());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Tag tag0 = Tag.valueOf("M3");
      Tag tag1 = Tag.valueOf("M3");
      assertFalse(tag1.isSelfClosing());
      
      tag1.setSelfClosing();
      boolean boolean0 = tag0.equals(tag1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Tag tag0 = Tag.valueOf(",D)~PM*jtLL");
      Tag tag1 = Tag.valueOf("'fs^v=qxsgdys=k[e");
      boolean boolean0 = tag0.equals(tag1);
      assertFalse(tag1.isData());
      assertTrue(tag1.formatAsBlock());
      assertFalse(boolean0);
      assertTrue(tag1.isInline());
      assertTrue(tag1.canContainBlock());
      assertFalse(tag1.preserveWhitespace());
      assertFalse(tag1.isSelfClosing());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Tag tag0 = Tag.valueOf("&vR6w)VxPz>%{");
      tag0.hashCode();
      assertFalse(tag0.preserveWhitespace());
      assertTrue(tag0.formatAsBlock());
      assertTrue(tag0.canContainBlock());
      assertFalse(tag0.isSelfClosing());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Tag tag0 = Tag.valueOf("frameset");
      tag0.hashCode();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Tag tag0 = Tag.valueOf("br");
      tag0.hashCode();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Tag tag0 = Tag.valueOf("textarea");
      tag0.hashCode();
  }
}
