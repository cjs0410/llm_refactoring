{
  "filepath": "/tmp/Jsoup-92f/src/main/java/org/jsoup/parser/XmlTreeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XmlTreeBuilder",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.TreeBuilder"
      ],
      "begin_line": 24,
      "end_line": 153,
      "comment": "\n * Use the {@code XmlTreeBuilder} when you want to parse XML without any of the HTML DOM rules being applied to the\n * document.\n * \u003cp\u003eUsage example: {@code Document xmlDoc \u003d Jsoup.parse(html, baseUrl, Parser.xmlParser());}\u003c/p\u003e\n *\n * @author Jonathan Hedley\n "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.defaultSettings()",
      "begin_line": 25,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.initialiseParse(java.io.Reader, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 29,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.parse(java.io.Reader, java.lang.String)",
      "begin_line": 36,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.parse(java.lang.String, java.lang.String)",
      "begin_line": 40,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.process(org.jsoup.parser.Token)",
      "begin_line": 44,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insertNode(org.jsoup.nodes.Node)",
      "begin_line": 71,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.StartTag)",
      "begin_line": 75,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.Comment)",
      "begin_line": 91,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.Character)",
      "begin_line": 104,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.Doctype)",
      "begin_line": 109,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.popStackToClose(org.jsoup.parser.Token.EndTag)",
      "begin_line": 121,
      "end_line": 141,
      "comment": "\n     * If the stack contains an element with this tag\u0027s name, pop up the stack to remove the first occurrence. If not\n     * found, skips.\n     *\n     * @param endTag tag to close\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.parseFragment(java.lang.String, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 144,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 150,
      "end_line": 152,
      "comment": ""
    }
  ]
}