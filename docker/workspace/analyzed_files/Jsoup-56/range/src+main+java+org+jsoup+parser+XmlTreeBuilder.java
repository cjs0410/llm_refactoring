{
  "filepath": "/tmp/Jsoup-56f/src/main/java/org/jsoup/parser/XmlTreeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XmlTreeBuilder",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.TreeBuilder"
      ],
      "begin_line": 16,
      "end_line": 137,
      "comment": "\n * Use the {@code XmlTreeBuilder} when you want to parse XML without any of the HTML DOM rules being applied to the\n * document.\n * \u003cp\u003eUsage example: {@code Document xmlDoc \u003d Jsoup.parse(html, baseUrl, Parser.xmlParser());}\u003c/p\u003e\n *\n * @author Jonathan Hedley\n "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.defaultSettings()",
      "begin_line": 17,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.parse(java.lang.String, java.lang.String)",
      "begin_line": 21,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.initialiseParse(java.lang.String, java.lang.String, org.jsoup.parser.ParseErrorList, org.jsoup.parser.ParseSettings)",
      "begin_line": 25,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.process(org.jsoup.parser.Token)",
      "begin_line": 32,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insertNode(org.jsoup.nodes.Node)",
      "begin_line": 59,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.StartTag)",
      "begin_line": 63,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.Comment)",
      "begin_line": 78,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.Character)",
      "begin_line": 94,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.Doctype)",
      "begin_line": 99,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.popStackToClose(org.jsoup.parser.Token.EndTag)",
      "begin_line": 110,
      "end_line": 130,
      "comment": "\n     * If the stack contains an element with this tag\u0027s name, pop up the stack to remove the first occurrence. If not\n     * found, skips.\n     *\n     * @param endTag\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.parseFragment(java.lang.String, java.lang.String, org.jsoup.parser.ParseErrorList, org.jsoup.parser.ParseSettings)",
      "begin_line": 132,
      "end_line": 136,
      "comment": ""
    }
  ]
}