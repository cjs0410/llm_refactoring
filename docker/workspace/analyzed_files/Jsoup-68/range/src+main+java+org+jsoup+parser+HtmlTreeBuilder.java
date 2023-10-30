{
  "filepath": "/tmp/Jsoup-68f/src/main/java/org/jsoup/parser/HtmlTreeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HtmlTreeBuilder",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.TreeBuilder"
      ],
      "begin_line": 24,
      "end_line": 734,
      "comment": "\n * HTML Tree Builder; creates a DOM from Tokens.\n "
    },
    {
      "type": "field",
      "varNames": [
        "TagsSearchInScope"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": " tag searches. must be sorted, used in inSorted. MUST update HtmlTreeBuilderTest if more arrays are added."
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchList"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchButton"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchTableScope"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchSelectScope"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchEndTags"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchSpecial"
      ],
      "begin_line": 32,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MaxScopeSearchDepth"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " prevents the parser bogging down in exceptionally broken pages"
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " the current state"
    },
    {
      "type": "field",
      "varNames": [
        "originalState"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " original / marked state"
    },
    {
      "type": "field",
      "varNames": [
        "baseUriSetFromDoc"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headElement"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " the current head element"
    },
    {
      "type": "field",
      "varNames": [
        "formElement"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " the current form element"
    },
    {
      "type": "field",
      "varNames": [
        "contextElement"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " fragment parse context -- could be null even if fragment parsing"
    },
    {
      "type": "field",
      "varNames": [
        "formattingElements"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " active (open) formatting elements"
    },
    {
      "type": "field",
      "varNames": [
        "pendingTableCharacters"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " chars in table to be shifted out"
    },
    {
      "type": "field",
      "varNames": [
        "emptyEnd"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " reused empty end tag"
    },
    {
      "type": "field",
      "varNames": [
        "framesetOk"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " if ok to go into frameset"
    },
    {
      "type": "field",
      "varNames": [
        "fosterInserts"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " if next inserts should be fostered"
    },
    {
      "type": "field",
      "varNames": [
        "fragmentParsing"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " if parsing a fragment of html"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.HtmlTreeBuilder()",
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.defaultSettings()",
      "begin_line": 60,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.initialiseParse(java.io.Reader, java.lang.String, org.jsoup.parser.ParseErrorList, org.jsoup.parser.ParseSettings)",
      "begin_line": 64,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String, org.jsoup.parser.ParseErrorList, org.jsoup.parser.ParseSettings)",
      "begin_line": 83,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.process(org.jsoup.parser.Token)",
      "begin_line": 134,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.process(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 140,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.transition(org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 145,
      "end_line": 147,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.state()",
      "begin_line": 149,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.markInsertionMode()",
      "begin_line": 153,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.originalState()",
      "begin_line": 157,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.framesetOk(boolean)",
      "begin_line": 161,
      "end_line": 163,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.framesetOk()",
      "begin_line": 165,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getDocument()",
      "begin_line": 169,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getBaseUri()",
      "begin_line": 173,
      "end_line": 175,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.maybeSetBaseUri(org.jsoup.nodes.Element)",
      "begin_line": 177,
      "end_line": 187,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isFragmentParsing()",
      "begin_line": 189,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.error(org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 193,
      "end_line": 196,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.StartTag)",
      "begin_line": 198,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertStartTag(java.lang.String)",
      "begin_line": 214,
      "end_line": 218,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.nodes.Element)",
      "begin_line": 220,
      "end_line": 223,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertEmpty(org.jsoup.parser.Token.StartTag)",
      "begin_line": 225,
      "end_line": 238,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertForm(org.jsoup.parser.Token.StartTag, boolean)",
      "begin_line": 240,
      "end_line": 248,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.Comment)",
      "begin_line": 250,
      "end_line": 253,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.Character)",
      "begin_line": 255,
      "end_line": 264,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertNode(org.jsoup.nodes.Node)",
      "begin_line": 266,
      "end_line": 280,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.pop()",
      "begin_line": 282,
      "end_line": 285,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.push(org.jsoup.nodes.Element)",
      "begin_line": 287,
      "end_line": 289,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getStack()",
      "begin_line": 291,
      "end_line": 293,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.onStack(org.jsoup.nodes.Element)",
      "begin_line": 295,
      "end_line": 297,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isElementInQueue(java.util.ArrayList\u003corg.jsoup.nodes.Element\u003e, org.jsoup.nodes.Element)",
      "begin_line": 299,
      "end_line": 307,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getFromStack(java.lang.String)",
      "begin_line": 309,
      "end_line": 317,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeFromStack(org.jsoup.nodes.Element)",
      "begin_line": 319,
      "end_line": 328,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToClose(java.lang.String)",
      "begin_line": 330,
      "end_line": 337,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToClose(java.lang.String...)",
      "begin_line": 340,
      "end_line": 347,
      "comment": " elnames is sorted, comes from Constants"
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToBefore(java.lang.String)",
      "begin_line": 349,
      "end_line": 358,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableContext()",
      "begin_line": 360,
      "end_line": 362,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableBodyContext()",
      "begin_line": 364,
      "end_line": 366,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableRowContext()",
      "begin_line": 368,
      "end_line": 370,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(java.lang.String...)",
      "begin_line": 372,
      "end_line": 380,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.aboveOnStack(org.jsoup.nodes.Element)",
      "begin_line": 382,
      "end_line": 391,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertOnStackAfter(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 393,
      "end_line": 397,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceOnStack(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 399,
      "end_line": 401,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceInQueue(java.util.ArrayList\u003corg.jsoup.nodes.Element\u003e, org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 403,
      "end_line": 407,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode()",
      "begin_line": 409,
      "end_line": 456,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "specificScopeTarget"
      ],
      "begin_line": 459,
      "end_line": 459,
      "comment": " todo: tidy up in specific scope methods"
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(java.lang.String, java.lang.String[], java.lang.String[])",
      "begin_line": 461,
      "end_line": 464,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(java.lang.String[], java.lang.String[], java.lang.String[])",
      "begin_line": 466,
      "end_line": 483,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String[])",
      "begin_line": 485,
      "end_line": 487,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String)",
      "begin_line": 489,
      "end_line": 491,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String, java.lang.String[])",
      "begin_line": 493,
      "end_line": 497,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inListItemScope(java.lang.String)",
      "begin_line": 499,
      "end_line": 501,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inButtonScope(java.lang.String)",
      "begin_line": 503,
      "end_line": 505,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inTableScope(java.lang.String)",
      "begin_line": 507,
      "end_line": 509,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSelectScope(java.lang.String)",
      "begin_line": 511,
      "end_line": 522,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setHeadElement(org.jsoup.nodes.Element)",
      "begin_line": 524,
      "end_line": 526,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getHeadElement()",
      "begin_line": 528,
      "end_line": 530,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isFosterInserts()",
      "begin_line": 532,
      "end_line": 534,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setFosterInserts(boolean)",
      "begin_line": 536,
      "end_line": 538,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getFormElement()",
      "begin_line": 540,
      "end_line": 542,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setFormElement(org.jsoup.nodes.FormElement)",
      "begin_line": 544,
      "end_line": 546,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.newPendingTableCharacters()",
      "begin_line": 548,
      "end_line": 550,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getPendingTableCharacters()",
      "begin_line": 552,
      "end_line": 554,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setPendingTableCharacters(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 556,
      "end_line": 558,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags(java.lang.String)",
      "begin_line": 569,
      "end_line": 573,
      "comment": "\n     11.2.5.2 Closing elements that have implied end tags\u003cp/\u003e\n     When the steps below require the UA to generate implied end tags, then, while the current node is a dd element, a\n     dt element, an li element, an option element, an optgroup element, a p element, an rp element, or an rt element,\n     the UA must pop the current node off the stack of open elements.\n\n     @param excludeTag If a step requires the UA to generate implied end tags but lists an element to exclude from the\n     process, then the UA must perform the above steps as if that element was not in the above list.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags()",
      "begin_line": 575,
      "end_line": 577,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isSpecial(org.jsoup.nodes.Element)",
      "begin_line": 579,
      "end_line": 584,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.lastFormattingElement()",
      "begin_line": 586,
      "end_line": 588,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeLastFormattingElement()",
      "begin_line": 590,
      "end_line": 596,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 599,
      "end_line": 615,
      "comment": " active formatting elements"
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 617,
      "end_line": 623,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements()",
      "begin_line": 625,
      "end_line": 661,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearFormattingElementsToLastMarker()",
      "begin_line": 663,
      "end_line": 669,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeFromActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 671,
      "end_line": 679,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isInActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 681,
      "end_line": 683,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getActiveFormattingElement(java.lang.String)",
      "begin_line": 685,
      "end_line": 694,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceActiveFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 696,
      "end_line": 698,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertMarkerToFormattingElements()",
      "begin_line": 700,
      "end_line": 702,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(org.jsoup.nodes.Node)",
      "begin_line": 704,
      "end_line": 724,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.toString()",
      "begin_line": 726,
      "end_line": 733,
      "comment": ""
    }
  ]
}