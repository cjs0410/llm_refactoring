{
  "filepath": "/tmp/Jsoup-31f/src/main/java/org/jsoup/parser/XmlTreeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XmlTreeBuilder",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.TreeBuilder"
      ],
      "begin_line": 11,
      "end_line": 119,
      "comment": "\n * @author Jonathan Hedley\n "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.initialiseParse(java.lang.String, java.lang.String, org.jsoup.parser.ParseErrorList)",
      "begin_line": 12,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.process(org.jsoup.parser.Token)",
      "begin_line": 18,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insertNode(org.jsoup.nodes.Node)",
      "begin_line": 45,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.StartTag)",
      "begin_line": 49,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.Comment)",
      "begin_line": 64,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.Character)",
      "begin_line": 77,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.Doctype)",
      "begin_line": 82,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.popStackToClose(org.jsoup.parser.Token.EndTag)",
      "begin_line": 93,
      "end_line": 118,
      "comment": "\n     * If the stack contains an element with this tag\u0027s name, pop up the stack to remove the first occurrence. If not\n     * found, skips.\n     *\n     * @param endTag\n     "
    }
  ]
}