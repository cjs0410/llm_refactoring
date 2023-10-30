{
  "filepath": "/tmp/Jsoup-45f/src/main/java/org/jsoup/parser/HtmlTreeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HtmlTreeBuilder",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.TreeBuilder"
      ],
      "begin_line": 14,
      "end_line": 703,
      "comment": "\n * HTML Tree Builder; creates a DOM from Tokens.\n "
    },
    {
      "type": "field",
      "varNames": [
        "TagsScriptStyle"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": " tag searches"
    },
    {
      "type": "field",
      "varNames": [
        "TagsSearchInScope"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchList"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchButton"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchTableScope"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchSelectScope"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchEndTags"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TagSearchSpecial"
      ],
      "begin_line": 23,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " the current state"
    },
    {
      "type": "field",
      "varNames": [
        "originalState"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " original / marked state"
    },
    {
      "type": "field",
      "varNames": [
        "baseUriSetFromDoc"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headElement"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " the current head element"
    },
    {
      "type": "field",
      "varNames": [
        "formElement"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " the current form element"
    },
    {
      "type": "field",
      "varNames": [
        "contextElement"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " fragment parse context -- could be null even if fragment parsing"
    },
    {
      "type": "field",
      "varNames": [
        "formattingElements"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " active (open) formatting elements"
    },
    {
      "type": "field",
      "varNames": [
        "pendingTableCharacters"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " chars in table to be shifted out"
    },
    {
      "type": "field",
      "varNames": [
        "emptyEnd"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " reused empty end tag"
    },
    {
      "type": "field",
      "varNames": [
        "framesetOk"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " if ok to go into frameset"
    },
    {
      "type": "field",
      "varNames": [
        "fosterInserts"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " if next inserts should be fostered"
    },
    {
      "type": "field",
      "varNames": [
        "fragmentParsing"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " if parsing a fragment of html"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.HtmlTreeBuilder()",
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.parse(java.lang.String, java.lang.String, org.jsoup.parser.ParseErrorList)",
      "begin_line": 49,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String, org.jsoup.parser.ParseErrorList)",
      "begin_line": 56,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.process(org.jsoup.parser.Token)",
      "begin_line": 107,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.process(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 113,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.transition(org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 118,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.state()",
      "begin_line": 122,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.markInsertionMode()",
      "begin_line": 126,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.originalState()",
      "begin_line": 130,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.framesetOk(boolean)",
      "begin_line": 134,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.framesetOk()",
      "begin_line": 138,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getDocument()",
      "begin_line": 142,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getBaseUri()",
      "begin_line": 146,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.maybeSetBaseUri(org.jsoup.nodes.Element)",
      "begin_line": 150,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isFragmentParsing()",
      "begin_line": 162,
      "end_line": 164,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.error(org.jsoup.parser.HtmlTreeBuilderState)",
      "begin_line": 166,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.StartTag)",
      "begin_line": 171,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertStartTag(java.lang.String)",
      "begin_line": 187,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.nodes.Element)",
      "begin_line": 193,
      "end_line": 196,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertEmpty(org.jsoup.parser.Token.StartTag)",
      "begin_line": 198,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertForm(org.jsoup.parser.Token.StartTag, boolean)",
      "begin_line": 214,
      "end_line": 222,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.Comment)",
      "begin_line": 224,
      "end_line": 227,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insert(org.jsoup.parser.Token.Character)",
      "begin_line": 229,
      "end_line": 238,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertNode(org.jsoup.nodes.Node)",
      "begin_line": 240,
      "end_line": 254,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.pop()",
      "begin_line": 256,
      "end_line": 259,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.push(org.jsoup.nodes.Element)",
      "begin_line": 261,
      "end_line": 263,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getStack()",
      "begin_line": 265,
      "end_line": 267,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.onStack(org.jsoup.nodes.Element)",
      "begin_line": 269,
      "end_line": 271,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isElementInQueue(java.util.ArrayList\u003corg.jsoup.nodes.Element\u003e, org.jsoup.nodes.Element)",
      "begin_line": 273,
      "end_line": 281,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getFromStack(java.lang.String)",
      "begin_line": 283,
      "end_line": 291,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeFromStack(org.jsoup.nodes.Element)",
      "begin_line": 293,
      "end_line": 302,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToClose(java.lang.String)",
      "begin_line": 304,
      "end_line": 311,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToClose(java.lang.String...)",
      "begin_line": 313,
      "end_line": 320,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.popStackToBefore(java.lang.String)",
      "begin_line": 322,
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
      "end_line": 353,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.aboveOnStack(org.jsoup.nodes.Element)",
      "begin_line": 355,
      "end_line": 364,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertOnStackAfter(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 366,
      "end_line": 370,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceOnStack(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 372,
      "end_line": 374,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceInQueue(java.util.ArrayList\u003corg.jsoup.nodes.Element\u003e, org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 376,
      "end_line": 380,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode()",
      "begin_line": 382,
      "end_line": 429,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "specificScopeTarget"
      ],
      "begin_line": 432,
      "end_line": 432,
      "comment": " todo: tidy up in specific scope methods"
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(java.lang.String, java.lang.String[], java.lang.String[])",
      "begin_line": 434,
      "end_line": 437,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(java.lang.String[], java.lang.String[], java.lang.String[])",
      "begin_line": 439,
      "end_line": 452,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String[])",
      "begin_line": 454,
      "end_line": 456,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String)",
      "begin_line": 458,
      "end_line": 460,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inScope(java.lang.String, java.lang.String[])",
      "begin_line": 462,
      "end_line": 466,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inListItemScope(java.lang.String)",
      "begin_line": 468,
      "end_line": 470,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inButtonScope(java.lang.String)",
      "begin_line": 472,
      "end_line": 474,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inTableScope(java.lang.String)",
      "begin_line": 476,
      "end_line": 478,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.inSelectScope(java.lang.String)",
      "begin_line": 480,
      "end_line": 491,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setHeadElement(org.jsoup.nodes.Element)",
      "begin_line": 493,
      "end_line": 495,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getHeadElement()",
      "begin_line": 497,
      "end_line": 499,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isFosterInserts()",
      "begin_line": 501,
      "end_line": 503,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setFosterInserts(boolean)",
      "begin_line": 505,
      "end_line": 507,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getFormElement()",
      "begin_line": 509,
      "end_line": 511,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setFormElement(org.jsoup.nodes.FormElement)",
      "begin_line": 513,
      "end_line": 515,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.newPendingTableCharacters()",
      "begin_line": 517,
      "end_line": 519,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getPendingTableCharacters()",
      "begin_line": 521,
      "end_line": 523,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.setPendingTableCharacters(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 525,
      "end_line": 527,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags(java.lang.String)",
      "begin_line": 538,
      "end_line": 542,
      "comment": "\n     11.2.5.2 Closing elements that have implied end tags\u003cp/\u003e\n     When the steps below require the UA to generate implied end tags, then, while the current node is a dd element, a\n     dt element, an li element, an option element, an optgroup element, a p element, an rp element, or an rt element,\n     the UA must pop the current node off the stack of open elements.\n\n     @param excludeTag If a step requires the UA to generate implied end tags but lists an element to exclude from the\n     process, then the UA must perform the above steps as if that element was not in the above list.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags()",
      "begin_line": 544,
      "end_line": 546,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isSpecial(org.jsoup.nodes.Element)",
      "begin_line": 548,
      "end_line": 553,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.lastFormattingElement()",
      "begin_line": 555,
      "end_line": 557,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeLastFormattingElement()",
      "begin_line": 559,
      "end_line": 565,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 568,
      "end_line": 584,
      "comment": " active formatting elements"
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 586,
      "end_line": 592,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements()",
      "begin_line": 594,
      "end_line": 630,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.clearFormattingElementsToLastMarker()",
      "begin_line": 632,
      "end_line": 638,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.removeFromActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 640,
      "end_line": 648,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.isInActiveFormattingElements(org.jsoup.nodes.Element)",
      "begin_line": 650,
      "end_line": 652,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.getActiveFormattingElement(java.lang.String)",
      "begin_line": 654,
      "end_line": 663,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.replaceActiveFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 665,
      "end_line": 667,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertMarkerToFormattingElements()",
      "begin_line": 669,
      "end_line": 671,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(org.jsoup.nodes.Node)",
      "begin_line": 673,
      "end_line": 693,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.HtmlTreeBuilder.toString()",
      "begin_line": 695,
      "end_line": 702,
      "comment": ""
    }
  ]
}