{
  "filepath": "/tmp/Jsoup-33f/src/main/java/org/jsoup/parser/HtmlTreeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HtmlTreeBuilder",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.TreeBuilder"
      ],
      "begin_line": 17,
      "end_line": 705,
      "comment": "\n * HTML Tree Builder; creates a DOM from Tokens.\n "
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": " the current state"
    },
    {
      "type": "field",
      "varNames": [
        "originalState"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": " original / marked state"
    },
    {
      "type": "field",
      "varNames": [
        "baseUriSetFromDoc"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headElement"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": " the current head element"
    },
    {
      "type": "field",
      "varNames": [
        "formElement"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": " the current form element"
    },
    {
      "type": "field",
      "varNames": [
        "contextElement"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": " fragment parse context -- could be null even if fragment parsing"
    },
    {
      "type": "field",
      "varNames": [
        "formattingElements"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": " active (open) formatting elements"
    },
    {
      "type": "field",
      "varNames": [
        "pendingTableCharacters"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": " chars in table to be shifted out"
    },
    {
      "type": "field",
      "varNames": [
        "framesetOk"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " if ok to go into frameset"
    },
    {
      "type": "field",
      "varNames": [
        "fosterInserts"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " if next inserts should be fostered"
    },
    {
      "type": "field",
      "varNames": [
        "fragmentParsing"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " if parsing a fragment of html"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.HtmlTreeBuilder()",
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.parse(java.lang.String, java.lang.String, org.jsoup.parser.ParseErrorList)",
      "begin_line": 35,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String, org.jsoup.parser.ParseErrorList)",
      "begin_line": 41,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.process(org.jsoup.parser.Token)",
      "begin_line": 92,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.process(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 98,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.transition(org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 103,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.state()",
      "begin_line": 107,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.markInsertionMode()",
      "begin_line": 111,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.originalState()",
      "begin_line": 115,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.framesetOk(boolean)",
      "begin_line": 119,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.framesetOk()",
      "begin_line": 123,
      "end_line": 125,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getDocument()",
      "begin_line": 127,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getBaseUri()",
      "begin_line": 131,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.maybeSetBaseUri(org.jsoup.nodes.Element)",
      "begin_line": 135,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isFragmentParsing()",
      "begin_line": 147,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.error(org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 151,
      "end_line": 154,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.StartTag)",
      "begin_line": 156,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(java.lang.String)",
      "begin_line": 172,
      "end_line": 176,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.nodes.Element)",
      "begin_line": 178,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertEmpty(org.jsoup.parser.Token.StartTag)",
      "begin_line": 183,
      "end_line": 197,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertForm(org.jsoup.parser.Token.StartTag, boolean)",
      "begin_line": 199,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.Comment)",
      "begin_line": 209,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.Character)",
      "begin_line": 214,
      "end_line": 222,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertNode(org.jsoup.nodes.Node)",
      "begin_line": 224,
      "end_line": 238,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.pop()",
      "begin_line": 240,
      "end_line": 247,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.push(org.jsoup.nodes.Element)",
      "begin_line": 249,
      "end_line": 251,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getStack()",
      "begin_line": 253,
      "end_line": 255,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.onStack(org.jsoup.nodes.Element)",
      "begin_line": 257,
      "end_line": 259,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isElementInQueue(org.jsoup.helper.DescendableLinkedList\u003corg.jsoup.nodes.Element\u003e, org.jsoup.nodes.Element)",
      "begin_line": 261,
      "end_line": 270,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getFromStack(java.lang.String)",
      "begin_line": 272,
      "end_line": 281,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeFromStack(org.jsoup.nodes.Element)",
      "begin_line": 283,
      "end_line": 293,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToClose(java.lang.String)",
      "begin_line": 295,
      "end_line": 306,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToClose(java.lang.String...)",
      "begin_line": 308,
      "end_line": 319,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToBefore(java.lang.String)",
      "begin_line": 321,
      "end_line": 331,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableContext()",
      "begin_line": 333,
      "end_line": 335,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableBodyContext()",
      "begin_line": 337,
      "end_line": 339,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableRowContext()",
      "begin_line": 341,
      "end_line": 343,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(java.lang.String...)",
      "begin_line": 345,
      "end_line": 354,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.aboveOnStack(org.jsoup.nodes.Element)",
      "begin_line": 356,
      "end_line": 366,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertOnStackAfter(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 368,
      "end_line": 372,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceOnStack(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 374,
      "end_line": 376,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceInQueue(java.util.LinkedList\u003corg.jsoup.nodes.Element\u003e, org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 378,
      "end_line": 383,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode()",
      "begin_line": 385,
      "end_line": 433,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(java.lang.String, java.lang.String[], java.lang.String[])",
      "begin_line": 436,
      "end_line": 438,
      "comment": " todo: tidy up in specific scope methods"
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(java.lang.String[], java.lang.String[], java.lang.String[])",
      "begin_line": 440,
      "end_line": 454,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String[])",
      "begin_line": 456,
      "end_line": 458,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String)",
      "begin_line": 460,
      "end_line": 462,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String, java.lang.String[])",
      "begin_line": 464,
      "end_line": 468,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inListItemScope(java.lang.String)",
      "begin_line": 470,
      "end_line": 472,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inButtonScope(java.lang.String)",
      "begin_line": 474,
      "end_line": 476,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inTableScope(java.lang.String)",
      "begin_line": 478,
      "end_line": 480,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSelectScope(java.lang.String)",
      "begin_line": 482,
      "end_line": 494,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setHeadElement(org.jsoup.nodes.Element)",
      "begin_line": 496,
      "end_line": 498,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getHeadElement()",
      "begin_line": 500,
      "end_line": 502,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isFosterInserts()",
      "begin_line": 504,
      "end_line": 506,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setFosterInserts(boolean)",
      "begin_line": 508,
      "end_line": 510,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getFormElement()",
      "begin_line": 512,
      "end_line": 514,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setFormElement(org.jsoup.nodes.FormElement)",
      "begin_line": 516,
      "end_line": 518,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.newPendingTableCharacters()",
      "begin_line": 520,
      "end_line": 522,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getPendingTableCharacters()",
      "begin_line": 524,
      "end_line": 526,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setPendingTableCharacters(java.util.List\u003corg.jsoup.parser.Token.Character\u003e)",
      "begin_line": 528,
      "end_line": 530,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags(java.lang.String)",
      "begin_line": 541,
      "end_line": 545,
      "comment": "\n     11.2.5.2 Closing elements that have implied end tags\u003cp/\u003e\n     When the steps below require the UA to generate implied end tags, then, while the current node is a dd element, a\n     dt element, an li element, an option element, an optgroup element, a p element, an rp element, or an rt element,\n     the UA must pop the current node off the stack of open elements.\n\n     @param excludeTag If a step requires the UA to generate implied end tags but lists an element to exclude from the\n     process, then the UA must perform the above steps as if that element was not in the above list.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags()",
      "begin_line": 547,
      "end_line": 549,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isSpecial(org.jsoup.nodes.Element)",
      "begin_line": 551,
      "end_line": 563,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 566,
      "end_line": 583,
      "comment": " active formatting elements"
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 585,
      "end_line": 591,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements()",
      "begin_line": 593,
      "end_line": 629,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearFormattingElementsToLastMarker()",
      "begin_line": 631,
      "end_line": 638,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeFromActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 640,
      "end_line": 649,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isInActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 651,
      "end_line": 653,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getActiveFormattingElement(java.lang.String)",
      "begin_line": 655,
      "end_line": 665,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceActiveFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 667,
      "end_line": 669,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertMarkerToFormattingElements()",
      "begin_line": 671,
      "end_line": 673,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(org.jsoup.nodes.Node)",
      "begin_line": 675,
      "end_line": 695,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.toString()",
      "begin_line": 697,
      "end_line": 704,
      "comment": ""
    }
  ]
}