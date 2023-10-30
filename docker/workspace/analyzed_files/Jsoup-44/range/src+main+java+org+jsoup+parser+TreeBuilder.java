{
  "filepath": "/tmp/Jsoup-44f/src/main/java/org/jsoup/parser/TreeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TreeBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 13,
      "end_line": 88,
      "comment": "\n * @author Jonathan Hedley\n "
    },
    {
      "type": "field",
      "varNames": [
        "reader"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tokeniser"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "doc"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": " current doc we are building into"
    },
    {
      "type": "field",
      "varNames": [
        "stack"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": " the stack of open elements"
    },
    {
      "type": "field",
      "varNames": [
        "baseUri"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": " current base uri, for creating new elements"
    },
    {
      "type": "field",
      "varNames": [
        "currentToken"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": " currentToken is used only for error tracking."
    },
    {
      "type": "field",
      "varNames": [
        "errors"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": " null when not tracking errors"
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": " start tag to process"
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.initialiseParse(java.lang.String, java.lang.String, org.jsoup.parser.ParseErrorList)",
      "begin_line": 25,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.parse(java.lang.String, java.lang.String)",
      "begin_line": 37,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.parse(java.lang.String, java.lang.String, org.jsoup.parser.ParseErrorList)",
      "begin_line": 41,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.runParser()",
      "begin_line": 47,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.process(org.jsoup.parser.Token)",
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.processStartTag(java.lang.String)",
      "begin_line": 60,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.processStartTag(java.lang.String, org.jsoup.nodes.Attributes)",
      "begin_line": 67,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.processEndTag(java.lang.String)",
      "begin_line": 76,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.currentElement()",
      "begin_line": 84,
      "end_line": 87,
      "comment": ""
    }
  ]
}