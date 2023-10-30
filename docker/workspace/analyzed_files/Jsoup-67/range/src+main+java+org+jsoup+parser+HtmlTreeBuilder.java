{
  "filepath": "/tmp/Jsoup-67f/src/main/java/org/jsoup/parser/HtmlTreeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HtmlTreeBuilder",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.TreeBuilder"
      ],
      "begin_line": 25,
      "end_line": 735,
      "comment": "\n * HTML Tree Builder; creates a DOM from Tokens.\n "
    },
    {
      "type": "field",
      "varNames": [
        "TagsSearchInScope"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": " tag searches. must be sorted, used in inSorted"
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
      "type": "constructor",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.HtmlTreeBuilder()",
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.defaultSettings()",
      "begin_line": 61,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.initialiseParse(java.io.Reader, java.lang.String, org.jsoup.parser.ParseErrorList, org.jsoup.parser.ParseSettings)",
      "begin_line": 65,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String, org.jsoup.parser.ParseErrorList, org.jsoup.parser.ParseSettings)",
      "begin_line": 84,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.process(org.jsoup.parser.Token)",
      "begin_line": 135,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.process(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 141,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.transition(org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 146,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.state()",
      "begin_line": 150,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.markInsertionMode()",
      "begin_line": 154,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.originalState()",
      "begin_line": 158,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.framesetOk(boolean)",
      "begin_line": 162,
      "end_line": 164,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.framesetOk()",
      "begin_line": 166,
      "end_line": 168,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getDocument()",
      "begin_line": 170,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getBaseUri()",
      "begin_line": 174,
      "end_line": 176,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.maybeSetBaseUri(org.jsoup.nodes.Element)",
      "begin_line": 178,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isFragmentParsing()",
      "begin_line": 190,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.error(org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 194,
      "end_line": 197,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.StartTag)",
      "begin_line": 199,
      "end_line": 213,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertStartTag(java.lang.String)",
      "begin_line": 215,
      "end_line": 219,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.nodes.Element)",
      "begin_line": 221,
      "end_line": 224,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertEmpty(org.jsoup.parser.Token.StartTag)",
      "begin_line": 226,
      "end_line": 239,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertForm(org.jsoup.parser.Token.StartTag, boolean)",
      "begin_line": 241,
      "end_line": 249,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.Comment)",
      "begin_line": 251,
      "end_line": 254,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.Character)",
      "begin_line": 256,
      "end_line": 265,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertNode(org.jsoup.nodes.Node)",
      "begin_line": 267,
      "end_line": 281,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.pop()",
      "begin_line": 283,
      "end_line": 286,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.push(org.jsoup.nodes.Element)",
      "begin_line": 288,
      "end_line": 290,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getStack()",
      "begin_line": 292,
      "end_line": 294,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.onStack(org.jsoup.nodes.Element)",
      "begin_line": 296,
      "end_line": 298,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isElementInQueue(java.util.ArrayList\u003corg.jsoup.nodes.Element\u003e, org.jsoup.nodes.Element)",
      "begin_line": 300,
      "end_line": 308,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getFromStack(java.lang.String)",
      "begin_line": 310,
      "end_line": 318,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeFromStack(org.jsoup.nodes.Element)",
      "begin_line": 320,
      "end_line": 329,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToClose(java.lang.String)",
      "begin_line": 331,
      "end_line": 338,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToClose(java.lang.String...)",
      "begin_line": 341,
      "end_line": 348,
      "comment": " elnames is sorted, comes from Constants"
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToBefore(java.lang.String)",
      "begin_line": 350,
      "end_line": 359,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableContext()",
      "begin_line": 361,
      "end_line": 363,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableBodyContext()",
      "begin_line": 365,
      "end_line": 367,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToTableRowContext()",
      "begin_line": 369,
      "end_line": 371,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(java.lang.String...)",
      "begin_line": 373,
      "end_line": 381,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.aboveOnStack(org.jsoup.nodes.Element)",
      "begin_line": 383,
      "end_line": 392,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertOnStackAfter(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 394,
      "end_line": 398,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceOnStack(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 400,
      "end_line": 402,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceInQueue(java.util.ArrayList\u003corg.jsoup.nodes.Element\u003e, org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 404,
      "end_line": 408,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode()",
      "begin_line": 410,
      "end_line": 457,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "specificScopeTarget"
      ],
      "begin_line": 460,
      "end_line": 460,
      "comment": " todo: tidy up in specific scope methods"
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(java.lang.String, java.lang.String[], java.lang.String[])",
      "begin_line": 462,
      "end_line": 465,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(java.lang.String[], java.lang.String[], java.lang.String[])",
      "begin_line": 467,
      "end_line": 484,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String[])",
      "begin_line": 486,
      "end_line": 488,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String)",
      "begin_line": 490,
      "end_line": 492,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String, java.lang.String[])",
      "begin_line": 494,
      "end_line": 498,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inListItemScope(java.lang.String)",
      "begin_line": 500,
      "end_line": 502,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inButtonScope(java.lang.String)",
      "begin_line": 504,
      "end_line": 506,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inTableScope(java.lang.String)",
      "begin_line": 508,
      "end_line": 510,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSelectScope(java.lang.String)",
      "begin_line": 512,
      "end_line": 523,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setHeadElement(org.jsoup.nodes.Element)",
      "begin_line": 525,
      "end_line": 527,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getHeadElement()",
      "begin_line": 529,
      "end_line": 531,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isFosterInserts()",
      "begin_line": 533,
      "end_line": 535,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setFosterInserts(boolean)",
      "begin_line": 537,
      "end_line": 539,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getFormElement()",
      "begin_line": 541,
      "end_line": 543,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setFormElement(org.jsoup.nodes.FormElement)",
      "begin_line": 545,
      "end_line": 547,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.newPendingTableCharacters()",
      "begin_line": 549,
      "end_line": 551,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getPendingTableCharacters()",
      "begin_line": 553,
      "end_line": 555,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setPendingTableCharacters(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 557,
      "end_line": 559,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags(java.lang.String)",
      "begin_line": 570,
      "end_line": 574,
      "comment": "\n     11.2.5.2 Closing elements that have implied end tags\u003cp/\u003e\n     When the steps below require the UA to generate implied end tags, then, while the current node is a dd element, a\n     dt element, an li element, an option element, an optgroup element, a p element, an rp element, or an rt element,\n     the UA must pop the current node off the stack of open elements.\n\n     @param excludeTag If a step requires the UA to generate implied end tags but lists an element to exclude from the\n     process, then the UA must perform the above steps as if that element was not in the above list.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags()",
      "begin_line": 576,
      "end_line": 578,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isSpecial(org.jsoup.nodes.Element)",
      "begin_line": 580,
      "end_line": 585,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.lastFormattingElement()",
      "begin_line": 587,
      "end_line": 589,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeLastFormattingElement()",
      "begin_line": 591,
      "end_line": 597,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 600,
      "end_line": 616,
      "comment": " active formatting elements"
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 618,
      "end_line": 624,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements()",
      "begin_line": 626,
      "end_line": 662,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearFormattingElementsToLastMarker()",
      "begin_line": 664,
      "end_line": 670,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeFromActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 672,
      "end_line": 680,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isInActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 682,
      "end_line": 684,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getActiveFormattingElement(java.lang.String)",
      "begin_line": 686,
      "end_line": 695,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceActiveFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 697,
      "end_line": 699,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertMarkerToFormattingElements()",
      "begin_line": 701,
      "end_line": 703,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(org.jsoup.nodes.Node)",
      "begin_line": 705,
      "end_line": 725,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.toString()",
      "begin_line": 727,
      "end_line": 734,
      "comment": ""
    }
  ]
}