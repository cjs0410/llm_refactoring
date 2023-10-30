{
  "filepath": "/tmp/Jsoup-52f/src/main/java/org/jsoup/parser/XmlTreeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XmlTreeBuilder",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.TreeBuilder"
      ],
      "begin_line": 16,
      "end_line": 129,
      "comment": "\n * Use the {@code XmlTreeBuilder} when you want to parse XML without any of the HTML DOM rules being applied to the\n * document.\n * \u003cp\u003eUsage example: {@code Document xmlDoc \u003d Jsoup.parse(html, baseUrl, Parser.xmlParser());}\u003c/p\u003e\n *\n * @author Jonathan Hedley\n "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.initialiseParse(java.lang.String, java.lang.String, org.jsoup.parser.ParseErrorList)",
      "begin_line": 17,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.process(org.jsoup.parser.Token)",
      "begin_line": 24,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insertNode(org.jsoup.nodes.Node)",
      "begin_line": 51,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.StartTag)",
      "begin_line": 55,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.Comment)",
      "begin_line": 70,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.Character)",
      "begin_line": 86,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.Doctype)",
      "begin_line": 91,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.popStackToClose(org.jsoup.parser.Token.EndTag)",
      "begin_line": 102,
      "end_line": 122,
      "comment": "\n     * If the stack contains an element with this tag\u0027s name, pop up the stack to remove the first occurrence. If not\n     * found, skips.\n     *\n     * @param endTag\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.parseFragment(java.lang.String, java.lang.String, org.jsoup.parser.ParseErrorList)",
      "begin_line": 124,
      "end_line": 128,
      "comment": ""
    }
  ]
}