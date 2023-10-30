{
  "filepath": "/tmp/Jsoup-3f/src/main/java/org/jsoup/parser/Parser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Parser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 12,
      "end_line": 309,
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
      "type": "field",
      "varNames": [
        "relaxed"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Parser.Parser(java.lang.String, java.lang.String, boolean)",
      "begin_line": 28,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parse(java.lang.String, java.lang.String)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     Parse HTML into a Document.\n     @param html HTML to parse\n     @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     @return parsed Document\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseBodyFragment(java.lang.String, java.lang.String)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     Parse a fragment of HTML into the {@code body} of a Document.\n     @param bodyHtml fragment of HTML\n     @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     @return Document, with empty head, and HTML parsed into body\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseBodyFragmentRelaxed(java.lang.String, java.lang.String)",
      "begin_line": 74,
      "end_line": 78,
      "comment": "\n     Parse a fragment of HTML into the {@code body} of a Document, with relaxed parsing enabled. Relaxed, in this\n     context, means that implicit tags are not automatically created when missing.\n     @param bodyHtml fragment of HTML\n     @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     @return Document, with empty head, and HTML parsed into body\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parse()",
      "begin_line": 80,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseComment()",
      "begin_line": 99,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseXmlDecl()",
      "begin_line": 109,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseEndTag()",
      "begin_line": 119,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseStartTag()",
      "begin_line": 130,
      "end_line": 180,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseAttribute()",
      "begin_line": 182,
      "end_line": 210,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseTextNode()",
      "begin_line": 212,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseCdata()",
      "begin_line": 218,
      "end_line": 223,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.addChildToParent(org.jsoup.nodes.Element, boolean)",
      "begin_line": 225,
      "end_line": 253,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.stackHasValidParent(org.jsoup.parser.Tag)",
      "begin_line": 255,
      "end_line": 271,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.popStackToSuitableContainer(org.jsoup.parser.Tag)",
      "begin_line": 273,
      "end_line": 281,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.popStackToClose(org.jsoup.parser.Tag)",
      "begin_line": 283,
      "end_line": 304,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.last()",
      "begin_line": 306,
      "end_line": 308,
      "comment": ""
    }
  ]
}