{
  "filepath": "/tmp/Jsoup-12f/src/main/java/org/jsoup/select/Selector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Selector",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 58,
      "end_line": 445,
      "comment": "\n CSS-like element selector, that finds elements matching a query.\n\n \u003ch2\u003eSelector syntax\u003c/h2\u003e\n A selector is a chain of simple selectors, seperated by combinators. Selectors are case insensitive (including against\n elements, attributes, and attribute values).\n \u003cp/\u003e\n The universal selector (*) is implicit when no element selector is supplied (i.e. {@code *.header} and {@code .header}\n is equivalent).\n\n \u003ctable\u003e\n  \u003ctr\u003e\u003cth\u003ePattern\u003c/th\u003e\u003cth\u003eMatches\u003c/th\u003e\u003cth\u003eExample\u003c/th\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e*\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eany element\u003c/td\u003e\u003ctd\u003e\u003ccode\u003e*\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003etag\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements with the given tag name\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ediv\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003ens|E\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements of type E in the namespace \u003ci\u003ens\u003c/i\u003e\u003c/td\u003e\u003ctd\u003e\u003ccode\u003efb|name\u003c/code\u003e finds \u003ccode\u003e\u0026lt;fb:name\u003e\u003c/code\u003e elements\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e#id\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements with attribute ID of \"id\"\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ediv#wrap\u003c/code\u003e, \u003ccode\u003e#logo\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e.class\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements with a class name of \"class\"\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ediv.left\u003c/code\u003e, \u003ccode\u003e.result\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e[attr]\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements with an attribute named \"attr\" (with any value)\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ea[href]\u003c/code\u003e, \u003ccode\u003e[title]\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e[^attrPrefix]\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements with an attribute name starting with \"attrPrefix\". Use to find elements with HTML5 datasets\u003c/td\u003e\u003ctd\u003e\u003ccode\u003e[^data-]\u003c/code\u003e, \u003ccode\u003ediv[^data-]\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e[attr\u003dval]\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements with an attribute named \"attr\", and value equal to \"val\"\u003c/td\u003e\u003ctd\u003e\u003ccode\u003eimg[width\u003d500]\u003c/code\u003e, \u003ccode\u003ea[rel\u003dnofollow]\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e[attr^\u003dvalPrefix]\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements with an attribute named \"attr\", and value starting with \"valPrefix\"\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ea[href^\u003dhttp:]\u003c/code\u003e\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e[attr$\u003dvalSuffix]\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements with an attribute named \"attr\", and value ending with \"valSuffix\"\u003c/td\u003e\u003ctd\u003e\u003ccode\u003eimg[src$\u003d.png]\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e[attr*\u003dvalContaining]\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements with an attribute named \"attr\", and value containing \"valContaining\"\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ea[href*\u003d/search/]\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e[attr~\u003d\u003cem\u003eregex\u003c/em\u003e]\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements with an attribute named \"attr\", and value matching the regular expression\u003c/td\u003e\u003ctd\u003e\u003ccode\u003eimg[src~\u003d(?i)\\\\.(png|jpe?g)]\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003c/td\u003e\u003ctd\u003eThe above may be combined in any order\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ediv.header[title]\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ctd colspan\u003d\"3\"\u003e\u003ch3\u003eCombinators\u003c/h3\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003eE F\u003c/code\u003e\u003c/td\u003e\u003ctd\u003ean F element descended from an E element\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ediv a\u003c/code\u003e, \u003ccode\u003e.logo h1\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003eE \u003e F\u003c/code\u003e\u003c/td\u003e\u003ctd\u003ean F direct child of E\u003c/td\u003e\u003ctd\u003e\u003ccode\u003eol \u003e li\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003eE + F\u003c/code\u003e\u003c/td\u003e\u003ctd\u003ean F element immediately preceded by sibling E\u003c/td\u003e\u003ctd\u003e\u003ccode\u003eli + li\u003c/code\u003e, \u003ccode\u003ediv.head + div\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003eE ~ F\u003c/code\u003e\u003c/td\u003e\u003ctd\u003ean F element preceded by sibling E\u003c/td\u003e\u003ctd\u003e\u003ccode\u003eh1 ~ p\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003eE, F, G\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eall matching elements E, F, or G\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ea[href], div, h3\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ctd colspan\u003d\"3\"\u003e\u003ch3\u003ePseudo selectors\u003c/h3\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e:lt(\u003cem\u003en\u003c/em\u003e)\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements whose sibling index is less than \u003cem\u003en\u003c/em\u003e\u003c/td\u003e\u003ctd\u003e\u003ccode\u003etd:lt(3)\u003c/code\u003e finds the first 2 cells of each row\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e:gt(\u003cem\u003en\u003c/em\u003e)\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements whose sibling index is greater than \u003cem\u003en\u003c/em\u003e\u003c/td\u003e\u003ctd\u003e\u003ccode\u003etd:gt(1)\u003c/code\u003e finds cells after skipping the first two\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e:eq(\u003cem\u003en\u003c/em\u003e)\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements whose sibling index is equal to \u003cem\u003en\u003c/em\u003e\u003c/td\u003e\u003ctd\u003e\u003ccode\u003etd:eq(0)\u003c/code\u003e finds the first cell of each row\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e:has(\u003cem\u003eselector\u003c/em\u003e)\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements that contains at least one element matching the \u003cem\u003eselector\u003c/em\u003e\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ediv:has(p)\u003c/code\u003e finds divs that contain p elements \u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e:not(\u003cem\u003eselector\u003c/em\u003e)\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements that do not match the \u003cem\u003eselector\u003c/em\u003e. See also {@link Elements#not(String)}\u003c/td\u003e\u003ccode\u003ediv:not(.logo)\u003c/code\u003e finds all divs that do not have the \"logo\" class\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e:contains(\u003cem\u003etext\u003c/em\u003e)\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements that contains the specified text. The search is case insensitive. The text may appear in the found element, or any of its descendants.\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ep:contains(jsoup)\u003c/code\u003e finds p elements containing the text \"jsoup\".\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e:matches(\u003cem\u003eregex\u003c/em\u003e)\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements whose text matches the specified regular expression. The text may appear in the found element, or any of its descendants.\u003c/td\u003e\u003ctd\u003e\u003ccode\u003etd:matches(\\\\d+)\u003c/code\u003e finds table cells containing digits. \u003ccode\u003ediv:matches((?i)login)\u003c/code\u003e finds divs containing the text, case insensitively.\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e:containsOwn(\u003cem\u003etext\u003c/em\u003e)\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements that directly contains the specified text. The search is case insensitive. The text must appear in the found element, not any of its descendants.\u003c/td\u003e\u003ctd\u003e\u003ccode\u003ep:containsOwn(jsoup)\u003c/code\u003e finds p elements with own text \"jsoup\".\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003ccode\u003e:matchesOwn(\u003cem\u003eregex\u003c/em\u003e)\u003c/code\u003e\u003c/td\u003e\u003ctd\u003eelements whose own text matches the specified regular expression. The text must appear in the found element, not any of its descendants.\u003c/td\u003e\u003ctd\u003e\u003ccode\u003etd:matchesOwn(\\\\d+)\u003c/code\u003e finds table cells directly containing digits. \u003ccode\u003ediv:matchesOwn((?i)login)\u003c/code\u003e finds divs containing the text, case insensitively.\u003c/td\u003e\u003c/tr\u003e\n  \u003ctr\u003e\u003ctd\u003e\u003c/td\u003e\u003ctd\u003eThe above may be combined in any order and with other selectors\u003c/td\u003e\u003ctd\u003e\u003ccode\u003e.light:contains(name):eq(0)\u003c/code\u003e\u003c/td\u003e\u003c/tr\u003e\n  \u003c/table\u003e\n\n @see Element#select(String)\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "combinators"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "elements"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " LHS for unique and ordered elements"
    },
    {
      "type": "field",
      "varNames": [
        "query"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tq"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Selector.Selector(java.lang.String, org.jsoup.nodes.Element)",
      "begin_line": 65,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.select(java.lang.String, org.jsoup.nodes.Element)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     Find elements matching selector.\n     @param query CSS selector\n     @param root root element to descend into\n     @return matching elements, empty if not\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.select(java.lang.String, java.lang.Iterable\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 93,
      "end_line": 102,
      "comment": "\n     Find elements matching selector.\n     @param query CSS selector\n     @param roots root elements to descend into\n     @return matching elements, empty if not\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.select()",
      "begin_line": 104,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.combinator(char)",
      "begin_line": 137,
      "end_line": 154,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.consumeSubQuery()",
      "begin_line": 156,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.findElements()",
      "begin_line": 171,
      "end_line": 203,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.addElements(java.util.Collection\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 205,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.intersectElements(java.util.Collection\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 209,
      "end_line": 211,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.byId()",
      "begin_line": 213,
      "end_line": 222,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.byClass()",
      "begin_line": 224,
      "end_line": 229,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.byTag()",
      "begin_line": 231,
      "end_line": 239,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.byAttribute()",
      "begin_line": 241,
      "end_line": 271,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.allElements()",
      "begin_line": 273,
      "end_line": 275,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.indexLessThan()",
      "begin_line": 278,
      "end_line": 280,
      "comment": " pseudo selectors :lt, :gt, :eq"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.indexGreaterThan()",
      "begin_line": 282,
      "end_line": 284,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.indexEquals()",
      "begin_line": 286,
      "end_line": 288,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.consumeIndex()",
      "begin_line": 290,
      "end_line": 294,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.has()",
      "begin_line": 297,
      "end_line": 303,
      "comment": " pseudo selector :has(el)"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.contains(boolean)",
      "begin_line": 306,
      "end_line": 312,
      "comment": " pseudo selector :contains(text), containsOwn(text)"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.matches(boolean)",
      "begin_line": 315,
      "end_line": 321,
      "comment": " :matches(regex), matchesOwn(regex)"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.not()",
      "begin_line": 324,
      "end_line": 330,
      "comment": " :not(selector)"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.filterForChildren(java.util.Collection\u003corg.jsoup.nodes.Element\u003e, java.util.Collection\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 333,
      "end_line": 344,
      "comment": " direct child descendants"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.filterForDescendants(java.util.Collection\u003corg.jsoup.nodes.Element\u003e, java.util.Collection\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 348,
      "end_line": 359,
      "comment": " or the original element; so check that parent is not child"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.filterForParentsOfDescendants(java.util.Collection\u003corg.jsoup.nodes.Element\u003e, java.util.Collection\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 362,
      "end_line": 372,
      "comment": " implements :has(el). Finds elements that contain the matched elements"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.filterForAdjacentSiblings(java.util.Collection\u003corg.jsoup.nodes.Element\u003e, java.util.Collection\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 375,
      "end_line": 389,
      "comment": " adjacent siblings"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.filterForGeneralSiblings(java.util.Collection\u003corg.jsoup.nodes.Element\u003e, java.util.Collection\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 392,
      "end_line": 407,
      "comment": " preceeding siblings"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.filterForSelf(java.util.Collection\u003corg.jsoup.nodes.Element\u003e, java.util.Collection\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 410,
      "end_line": 421,
      "comment": " union of both sets, for e.class type selectors"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Selector.filterOut(java.util.Collection\u003corg.jsoup.nodes.Element\u003e, java.util.Collection\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 424,
      "end_line": 438,
      "comment": " exclude set. package open so that Elements can implement .not() selector."
    },
    {
      "type": "class_interface",
      "name": "SelectorParseException",
      "is_interface": false,
      "parent_types": [
        "java.lang.IllegalStateException"
      ],
      "begin_line": 440,
      "end_line": 444,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Selector.SelectorParseException.SelectorParseException(java.lang.String, java.lang.Object...)",
      "begin_line": 441,
      "end_line": 443,
      "comment": ""
    }
  ]
}