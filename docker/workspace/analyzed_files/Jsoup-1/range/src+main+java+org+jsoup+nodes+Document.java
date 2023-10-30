{
  "filepath": "/tmp/Jsoup-1f/src/main/java/org/jsoup/nodes/Document.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Document",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Element"
      ],
      "begin_line": 13,
      "end_line": 150,
      "comment": "\n A HTML Document.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Document.Document(java.lang.String)",
      "begin_line": 21,
      "end_line": 23,
      "comment": "\n     Create a new, empty Document.\n     @param baseUri base URI of document\n     @see org.jsoup.Jsoup#parse\n     @see #createShell\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.createShell(java.lang.String)",
      "begin_line": 30,
      "end_line": 39,
      "comment": "\n     Create a valid, empty shell of a document, suitable for adding more elements to.\n     @param baseUri baseUri of document\n     @return document with html, head, and body elements.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.head()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     Accessor to the document\u0027s {@code head} element.\n     @return {@code head}\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.body()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     Accessor to the document\u0027s {@code body} element.\n     @return {@code body}\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.title()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     Get the string contents of the document\u0027s {@code title} element.\n     @return Trimed title, or empty string if none set.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.title(java.lang.String)",
      "begin_line": 71,
      "end_line": 79,
      "comment": "\n     Set the document\u0027s {@code title} element. Updates the existing element, or adds {@code title} to {@code head} if\n     not present\n     @param title string to set as title\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.createElement(java.lang.String)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     Create a new Element, with this document\u0027s base uri. Does not make the new element a child of this document.\n     @param tagName element tag name (e.g. {@code a})\n     @return new element\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.normalise()",
      "begin_line": 95,
      "end_line": 110,
      "comment": "\n     Normalise the document. This happens after the parse phase so generally does not need to be called.\n     Moves any text content that is not in the body element into the body.\n     @return this document after normalisation\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.normalise(org.jsoup.nodes.Element)",
      "begin_line": 113,
      "end_line": 128,
      "comment": " does not recurse."
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.outerHtml()",
      "begin_line": 130,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.text(java.lang.String)",
      "begin_line": 140,
      "end_line": 144,
      "comment": "\n     Set the text of the {@code body} of this document. Any existing nodes within the body will be cleared.\n     @param text unencoded text\n     @return this document\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.nodeName()",
      "begin_line": 146,
      "end_line": 149,
      "comment": ""
    }
  ]
}