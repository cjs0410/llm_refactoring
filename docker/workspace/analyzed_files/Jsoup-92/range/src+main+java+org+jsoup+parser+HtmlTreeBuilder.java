{
  "filepath": "/tmp/Jsoup-92f/src/main/java/org/jsoup/parser/HtmlTreeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HtmlTreeBuilder",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.TreeBuilder"
      ],
      "begin_line": 25,
      "end_line": 741,
      "comment": "\n * HTML Tree Builder; creates a DOM from Tokens.\n "
    },
    {
      "type": "field",
      "varNames": [
        "TagsSearchInScope"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": " tag searches. must be sorted, used in inSorted. MUST update HtmlTreeBuilderTest if more arrays are added."
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchList"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchButton"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchTableScope"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchSelectScope"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchEndTags"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchSpecial"
      ],
      "begin_line": 33,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MaxScopeSearchDepth"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " prevents the parser bogging down in exceptionally broken pages"
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " the current state"
    },
    {
      "type": "field",
      "varNames": [
        "originalState"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " original / marked state"
    },
    {
      "type": "field",
      "varNames": [
        "baseUriSetFromDoc"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headElement"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " the current head element"
    },
    {
      "type": "field",
      "varNames": [
        "formElement"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " the current form element"
    },
    {
      "type": "field",
      "varNames": [
        "contextElement"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " fragment parse context -- could be null even if fragment parsing"
    },
    {
      "type": "field",
      "varNames": [
        "formattingElements"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " active (open) formatting elements"
    },
    {
      "type": "field",
      "varNames": [
        "pendingTableCharacters"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " chars in table to be shifted out"
    },
    {
      "type": "field",
      "varNames": [
        "emptyEnd"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " reused empty end tag"
    },
    {
      "type": "field",
      "varNames": [
        "framesetOk"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " if ok to go into frameset"
    },
    {
      "type": "field",
      "varNames": [
        "fosterInserts"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " if next inserts should be fostered"
    },
    {
      "type": "field",
      "varNames": [
        "fragmentParsing"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " if parsing a fragment of html"
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.defaultSettings()",
      "begin_line": 59,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.initialiseParse(java.io.Reader, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 63,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 82,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.process(org.jsoup.parser.Token)",
      "begin_line": 133,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.process(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 139,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.transition(org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 144,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.state()",
      "begin_line": 148,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.markInsertionMode()",
      "begin_line": 152,
      "end_line": 154,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.originalState()",
      "begin_line": 156,
      "end_line": 158,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.framesetOk(boolean)",
      "begin_line": 160,
      "end_line": 162,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.framesetOk()",
      "begin_line": 164,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getDocument()",
      "begin_line": 168,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getBaseUri()",
      "begin_line": 172,
      "end_line": 174,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.maybeSetBaseUri(org.jsoup.nodes.Element)",
      "begin_line": 176,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isFragmentParsing()",
      "begin_line": 188,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.error(org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 192,
      "end_line": 195,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.StartTag)",
      "begin_line": 197,
      "end_line": 219,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertStartTag(java.lang.String)",
      "begin_line": 221,
      "end_line": 225,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.nodes.Element)",
      "begin_line": 227,
      "end_line": 230,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertEmpty(org.jsoup.parser.Token.StartTag)",
      "begin_line": 232,
      "end_line": 245,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertForm(org.jsoup.parser.Token.StartTag, boolean)",
      "begin_line": 247,
      "end_line": 255,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.Comment)",
      "begin_line": 257,
      "end_line": 260,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.Character)",
      "begin_line": 262,
      "end_line": 275,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertNode(org.jsoup.nodes.Node)",
      "begin_line": 277,
      "end_line": 291,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.pop()",
      "begin_line": 293,
      "end_line": 296,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.push(org.jsoup.nodes.Element)",
      "begin_line": 298,
      "end_line": 300,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getStack()",
      "begin_line": 302,
      "end_line": 304,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.onStack(org.jsoup.nodes.Element)",
      "begin_line": 306,
      "end_line": 308,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isElementInQueue(java.util.ArrayList\u003corg.jsoup.nodes.Element\u003e, org.jsoup.nodes.Element)",
      "begin_line": 310,
      "end_line": 318,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getFromStack(java.lang.String)",
      "begin_line": 320,
      "end_line": 328,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeFromStack(org.jsoup.nodes.Element)",
      "begin_line": 330,
      "end_line": 339,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToClose(java.lang.String)",
      "begin_line": 341,
      "end_line": 348,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToClose(java.lang.String...)",
      "begin_line": 351,
      "end_line": 358,
      "comment": " elnames is sorted, comes from Constants"
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToBefore(java.lang.String)",
      "begin_line": 360,
      "end_line": 369,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableContext()",
      "begin_line": 371,
      "end_line": 373,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableBodyContext()",
      "begin_line": 375,
      "end_line": 377,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableRowContext()",
      "begin_line": 379,
      "end_line": 381,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(java.lang.String...)",
      "begin_line": 383,
      "end_line": 391,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.aboveOnStack(org.jsoup.nodes.Element)",
      "begin_line": 393,
      "end_line": 402,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertOnStackAfter(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 404,
      "end_line": 408,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceOnStack(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 410,
      "end_line": 412,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceInQueue(java.util.ArrayList\u003corg.jsoup.nodes.Element\u003e, org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 414,
      "end_line": 418,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode()",
      "begin_line": 420,
      "end_line": 467,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "specificScopeTarget"
      ],
      "begin_line": 470,
      "end_line": 470,
      "comment": " todo: tidy up in specific scope methods"
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(java.lang.String, java.lang.String[], java.lang.String[])",
      "begin_line": 472,
      "end_line": 475,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(java.lang.String[], java.lang.String[], java.lang.String[])",
      "begin_line": 477,
      "end_line": 494,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String[])",
      "begin_line": 496,
      "end_line": 498,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String)",
      "begin_line": 500,
      "end_line": 502,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String, java.lang.String[])",
      "begin_line": 504,
      "end_line": 508,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inListItemScope(java.lang.String)",
      "begin_line": 510,
      "end_line": 512,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inButtonScope(java.lang.String)",
      "begin_line": 514,
      "end_line": 516,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inTableScope(java.lang.String)",
      "begin_line": 518,
      "end_line": 520,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSelectScope(java.lang.String)",
      "begin_line": 522,
      "end_line": 533,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setHeadElement(org.jsoup.nodes.Element)",
      "begin_line": 535,
      "end_line": 537,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getHeadElement()",
      "begin_line": 539,
      "end_line": 541,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isFosterInserts()",
      "begin_line": 543,
      "end_line": 545,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setFosterInserts(boolean)",
      "begin_line": 547,
      "end_line": 549,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getFormElement()",
      "begin_line": 551,
      "end_line": 553,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setFormElement(org.jsoup.nodes.FormElement)",
      "begin_line": 555,
      "end_line": 557,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.newPendingTableCharacters()",
      "begin_line": 559,
      "end_line": 561,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getPendingTableCharacters()",
      "begin_line": 563,
      "end_line": 565,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags(java.lang.String)",
      "begin_line": 576,
      "end_line": 580,
      "comment": "\n     11.2.5.2 Closing elements that have implied end tags\u003cp/\u003e\n     When the steps below require the UA to generate implied end tags, then, while the current node is a dd element, a\n     dt element, an li element, an option element, an optgroup element, a p element, an rp element, or an rt element,\n     the UA must pop the current node off the stack of open elements.\n\n     @param excludeTag If a step requires the UA to generate implied end tags but lists an element to exclude from the\n     process, then the UA must perform the above steps as if that element was not in the above list.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags()",
      "begin_line": 582,
      "end_line": 584,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isSpecial(org.jsoup.nodes.Element)",
      "begin_line": 586,
      "end_line": 591,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.lastFormattingElement()",
      "begin_line": 593,
      "end_line": 595,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeLastFormattingElement()",
      "begin_line": 597,
      "end_line": 603,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 606,
      "end_line": 622,
      "comment": " active formatting elements"
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 624,
      "end_line": 630,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements()",
      "begin_line": 632,
      "end_line": 668,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearFormattingElementsToLastMarker()",
      "begin_line": 670,
      "end_line": 676,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeFromActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 678,
      "end_line": 686,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isInActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 688,
      "end_line": 690,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getActiveFormattingElement(java.lang.String)",
      "begin_line": 692,
      "end_line": 701,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceActiveFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 703,
      "end_line": 705,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertMarkerToFormattingElements()",
      "begin_line": 707,
      "end_line": 709,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(org.jsoup.nodes.Node)",
      "begin_line": 711,
      "end_line": 731,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.toString()",
      "begin_line": 733,
      "end_line": 740,
      "comment": ""
    }
  ]
}