/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 18 07:24:35 GMT 2023
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.CombiningEvaluator;
import org.jsoup.select.Evaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CombiningEvaluator_ESTest extends CombiningEvaluator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedHashSet<Evaluator> linkedHashSet0 = new LinkedHashSet<Evaluator>();
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(linkedHashSet0);
      combiningEvaluator_Or0.toString();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Evaluator[] evaluatorArray0 = new Evaluator[1];
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(evaluatorArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedHashSet<Evaluator> linkedHashSet0 = new LinkedHashSet<Evaluator>();
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(linkedHashSet0);
      combiningEvaluator_And0.toString();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedHashSet<Evaluator> linkedHashSet0 = new LinkedHashSet<Evaluator>();
      Pattern pattern0 = Pattern.compile("S$;s20", 531);
      Evaluator.Matches evaluator_Matches0 = new Evaluator.Matches(pattern0);
      linkedHashSet0.add(evaluator_Matches0);
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(linkedHashSet0);
      Document document0 = new Document("S$;s20");
      combiningEvaluator_And0.matches(document0, document0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedHashSet<Evaluator> linkedHashSet0 = new LinkedHashSet<Evaluator>();
      Pattern pattern0 = Pattern.compile("S$;s20", 531);
      Evaluator.Matches evaluator_Matches0 = new Evaluator.Matches(pattern0);
      linkedHashSet0.add(evaluator_Matches0);
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(linkedHashSet0);
      Document document0 = new Document("S$;s20");
      Element element0 = document0.html("S$;s20");
      combiningEvaluator_And0.matches(element0, document0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<Evaluator> linkedList0 = new LinkedList<Evaluator>();
      Evaluator.AttributeStarting evaluator_AttributeStarting0 = new Evaluator.AttributeStarting("");
      linkedList0.addLast(evaluator_AttributeStarting0);
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(linkedList0);
      linkedList0.add((Evaluator) combiningEvaluator_Or0);
      CombiningEvaluator.Or combiningEvaluator_Or1 = new CombiningEvaluator.Or(linkedList0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinkedHashSet<Evaluator> linkedHashSet0 = new LinkedHashSet<Evaluator>();
      Pattern pattern0 = Pattern.compile("S$;s20", 531);
      Evaluator.Matches evaluator_Matches0 = new Evaluator.Matches(pattern0);
      linkedHashSet0.add(evaluator_Matches0);
      Document document0 = new Document("S$;s20");
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(linkedHashSet0);
      combiningEvaluator_Or0.matches(document0, document0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LinkedHashSet<Evaluator> linkedHashSet0 = new LinkedHashSet<Evaluator>();
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(linkedHashSet0);
      Document document0 = new Document("S$;s20");
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(linkedHashSet0);
      combiningEvaluator_Or0.add(combiningEvaluator_And0);
      combiningEvaluator_Or0.matches(document0, document0);
  }
}
