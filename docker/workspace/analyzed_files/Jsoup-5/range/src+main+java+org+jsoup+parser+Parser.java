{
  "filepath": "/tmp/Jsoup-5f/src/main/java/org/jsoup/parser/Parser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Parser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 13,
      "end_line": 317,
      "comment": "\n Parses HTML into a {@link Document}. Generally best to use one of the  more convenient parse methods in {@link org.jsoup.Jsoup}.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "SQ"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DQ"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "htmlTag"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headTag"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bodyTag"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "titleTag"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "textareaTag"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stack"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tq"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "doc"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseUri"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "relaxed"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Parser.Parser(java.lang.String, java.lang.String, boolean)",
      "begin_line": 29,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parse(java.lang.String, java.lang.String)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     Parse HTML into a Document.\n     @param html HTML to parse\n     @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     @return parsed Document\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseBodyFragment(java.lang.String, java.lang.String)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     Parse a fragment of HTML into the {@code body} of a Document.\n     @param bodyHtml fragment of HTML\n     @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     @return Document, with empty head, and HTML parsed into body\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseBodyFragmentRelaxed(java.lang.String, java.lang.String)",
      "begin_line": 75,
      "end_line": 79,
      "comment": "\n     Parse a fragment of HTML into the {@code body} of a Document, with relaxed parsing enabled. Relaxed, in this\n     context, means that implicit tags are not automatically created when missing.\n     @param bodyHtml fragment of HTML\n     @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     @return Document, with empty head, and HTML parsed into body\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parse()",
      "begin_line": 81,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseComment()",
      "begin_line": 100,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseXmlDecl()",
      "begin_line": 110,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseEndTag()",
      "begin_line": 120,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseStartTag()",
      "begin_line": 131,
      "end_line": 179,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseAttribute()",
      "begin_line": 181,
      "end_line": 211,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseTextNode()",
      "begin_line": 213,
      "end_line": 224,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseCdata()",
      "begin_line": 226,
      "end_line": 231,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.addChildToParent(org.jsoup.nodes.Element, boolean)",
      "begin_line": 233,
      "end_line": 261,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.stackHasValidParent(org.jsoup.parser.Tag)",
      "begin_line": 263,
      "end_line": 279,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.popStackToSuitableContainer(org.jsoup.parser.Tag)",
      "begin_line": 281,
      "end_line": 289,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.popStackToClose(org.jsoup.parser.Tag)",
      "begin_line": 291,
      "end_line": 312,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.last()",
      "begin_line": 314,
      "end_line": 316,
      "comment": ""
    }
  ]
}