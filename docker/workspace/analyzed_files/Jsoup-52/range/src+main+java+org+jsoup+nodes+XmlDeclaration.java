{
  "filepath": "/tmp/Jsoup-52f/src/main/java/org/jsoup/nodes/XmlDeclaration.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XmlDeclaration",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Node"
      ],
      "begin_line": 11,
      "end_line": 66,
      "comment": "\n An XML Declaration.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 12,
      "end_line": 12,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isProcessingInstruction"
      ],
      "begin_line": 13,
      "end_line": 13,
      "comment": " \u003c! if true, \u003c? if false, declaration (and last data char should be ?)"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.XmlDeclaration.XmlDeclaration(java.lang.String, java.lang.String, boolean)",
      "begin_line": 21,
      "end_line": 26,
      "comment": "\n     Create a new XML declaration\n     @param name of declaration\n     @param baseUri base uri\n     @param isProcessingInstruction is processing instruction\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.nodeName()",
      "begin_line": 28,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.name()",
      "begin_line": 37,
      "end_line": 39,
      "comment": "\n     * Get the name of this declaration.\n     * @return name of this declaration.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.getWholeDeclaration()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     Get the unencoded XML declaration.\n     @return XML declaration\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 49,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.outerHtmlTail(java.lang.Appendable, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.toString()",
      "begin_line": 62,
      "end_line": 65,
      "comment": ""
    }
  ]
}