{
  "filepath": "/tmp/Jsoup-54f/src/main/java/org/jsoup/helper/W3CDom.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "W3CDom",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 176,
      "comment": "\n * Helper class to transform a {@link org.jsoup.nodes.Document} to a {@link org.w3c.dom.Document org.w3c.dom.Document},\n * for integration with toolsets that use the W3C DOM.\n * \u003cp\u003e\n * This class is currently \u003cb\u003eexperimental\u003c/b\u003e, please provide feedback on utility and any problems experienced.\n * \u003c/p\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.W3CDom.fromJsoup(org.jsoup.nodes.Document)",
      "begin_line": 38,
      "end_line": 51,
      "comment": "\n     * Convert a jsoup Document to a W3C Document.\n     * @param in jsoup doc\n     * @return w3c doc\n     "
    },
    {
      "type": "method",
      "signature": "convert(org.jsoup.nodes.Document, Document)",
      "begin_line": 60,
      "end_line": 67,
      "comment": "\n     * Converts a jsoup document into the provided W3C Document. If required, you can set options on the output document\n     * before converting.\n     * @param in jsoup doc\n     * @param out w3c doc\n     * @see org.jsoup.helper.W3CDom#fromJsoup(org.jsoup.nodes.Document)\n     "
    },
    {
      "type": "class_interface",
      "name": "W3CBuilder",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.NodeVisitor"
      ],
      "begin_line": 72,
      "end_line": 156,
      "comment": "\n     * Implements the conversion by walking the input.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "xmlnsKey"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "xmlnsPrefix"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "doc"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespaces"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " prefix \u003d\u003e urn"
    },
    {
      "type": "field",
      "varNames": [
        "dest"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "W3CBuilder(Document)",
      "begin_line": 80,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.W3CDom.W3CBuilder.head(org.jsoup.nodes.Node, int)",
      "begin_line": 84,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.W3CDom.W3CBuilder.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 116,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "copyAttributes(org.jsoup.nodes.Node, Element)",
      "begin_line": 122,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.W3CDom.W3CBuilder.updateNamespaces(org.jsoup.nodes.Element)",
      "begin_line": 134,
      "end_line": 154,
      "comment": "\n         * Finds any namespaces defined in this element. Returns any tag prefix.\n         "
    },
    {
      "type": "method",
      "signature": "asString(Document)",
      "begin_line": 163,
      "end_line": 175,
      "comment": "\n     * Serialize a W3C document to a String.\n     * @param doc Document\n     * @return Document as string\n     "
    }
  ]
}