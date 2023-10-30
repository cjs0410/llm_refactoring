{
  "filepath": "/tmp/Jsoup-2f/src/main/java/org/jsoup/parser/Parser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Parser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 12,
      "end_line": 291,
      "comment": "\n Parses HTML into a {@link Document}. Generally best to use one of the  more convenient parse methods in {@link org.jsoup.Jsoup}.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "SQ"
      ],
      "begin_line": 13,
      "end_line": 13,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DQ"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "htmlTag"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headTag"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bodyTag"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "titleTag"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "textareaTag"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stack"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tq"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "doc"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseUri"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Parser.Parser(java.lang.String, java.lang.String, boolean)",
      "begin_line": 27,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parse(java.lang.String, java.lang.String)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     Parse HTML into a Document.\n     @param html HTML to parse\n     @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     @return parsed Document\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseBodyFragment(java.lang.String, java.lang.String)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     Parse a fragment of HTML into the {@code body} of a Document.\n     @param bodyHtml fragment of HTML\n     @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     @return Document, with empty head, and HTML parsed into body\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parse()",
      "begin_line": 66,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseComment()",
      "begin_line": 85,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseXmlDecl()",
      "begin_line": 95,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseEndTag()",
      "begin_line": 105,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseStartTag()",
      "begin_line": 116,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseAttribute()",
      "begin_line": 168,
      "end_line": 196,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseTextNode()",
      "begin_line": 198,
      "end_line": 202,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseCdata()",
      "begin_line": 204,
      "end_line": 209,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.addChildToParent(org.jsoup.nodes.Element, boolean)",
      "begin_line": 211,
      "end_line": 239,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.stackHasValidParent(org.jsoup.parser.Tag)",
      "begin_line": 241,
      "end_line": 253,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.popStackToSuitableContainer(org.jsoup.parser.Tag)",
      "begin_line": 255,
      "end_line": 263,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.popStackToClose(org.jsoup.parser.Tag)",
      "begin_line": 265,
      "end_line": 286,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.last()",
      "begin_line": 288,
      "end_line": 290,
      "comment": ""
    }
  ]
}