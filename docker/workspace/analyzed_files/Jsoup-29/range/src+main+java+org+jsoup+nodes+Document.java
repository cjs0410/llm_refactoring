{
  "filepath": "/tmp/Jsoup-29f/src/main/java/org/jsoup/nodes/Document.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Document",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Element"
      ],
      "begin_line": 17,
      "end_line": 362,
      "comment": "\n A HTML Document.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "outputSettings"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "quirksMode"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Document.Document(java.lang.String)",
      "begin_line": 27,
      "end_line": 29,
      "comment": "\n     Create a new, empty Document.\n     @param baseUri base URI of document\n     @see org.jsoup.Jsoup#parse\n     @see #createShell\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.createShell(java.lang.String)",
      "begin_line": 36,
      "end_line": 45,
      "comment": "\n     Create a valid, empty shell of a document, suitable for adding more elements to.\n     @param baseUri baseUri of document\n     @return document with html, head, and body elements.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.head()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     Accessor to the document\u0027s {@code head} element.\n     @return {@code head}\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.body()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     Accessor to the document\u0027s {@code body} element.\n     @return {@code body}\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.title()",
      "begin_line": 67,
      "end_line": 71,
      "comment": "\n     Get the string contents of the document\u0027s {@code title} element.\n     @return Trimmed title, or empty string if none set.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.title(java.lang.String)",
      "begin_line": 78,
      "end_line": 86,
      "comment": "\n     Set the document\u0027s {@code title} element. Updates the existing element, or adds {@code title} to {@code head} if\n     not present\n     @param title string to set as title\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.createElement(java.lang.String)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     Create a new Element, with this document\u0027s base uri. Does not make the new element a child of this document.\n     @param tagName element tag name (e.g. {@code a})\n     @return new element\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.normalise()",
      "begin_line": 102,
      "end_line": 121,
      "comment": "\n     Normalise the document. This happens after the parse phase so generally does not need to be called.\n     Moves any text content that is not in the body element into the body.\n     @return this document after normalisation\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.normaliseTextNodes(org.jsoup.nodes.Element)",
      "begin_line": 124,
      "end_line": 140,
      "comment": " does not recurse."
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.normaliseStructure(java.lang.String, org.jsoup.nodes.Element)",
      "begin_line": 143,
      "end_line": 162,
      "comment": " merge multiple \u003chead\u003e or \u003cbody\u003e contents into one, delete the remainder, and ensure they are owned by \u003chtml\u003e"
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.findFirstElementByTagName(java.lang.String, org.jsoup.nodes.Node)",
      "begin_line": 165,
      "end_line": 176,
      "comment": " fast method to get first by tag name, used for html, head, body finders"
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.outerHtml()",
      "begin_line": 178,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.text(java.lang.String)",
      "begin_line": 188,
      "end_line": 192,
      "comment": "\n     Set the text of the {@code body} of this document. Any existing nodes within the body will be cleared.\n     @param text unencoded text\n     @return this document\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.nodeName()",
      "begin_line": 194,
      "end_line": 197,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.clone()",
      "begin_line": 199,
      "end_line": 204,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "OutputSettings",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 209,
      "end_line": 329,
      "comment": "\n     * A Document\u0027s output settings control the form of the text() and html() methods.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "escapeMode"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charsetEncoder"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prettyPrint"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "indentAmount"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Document.OutputSettings.OutputSettings()",
      "begin_line": 216,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.escapeMode()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n         * Get the document\u0027s current HTML escape mode: \u003ccode\u003ebase\u003c/code\u003e, which provides a limited set of named HTML\n         * entities and escapes other characters as numbered entities for maximum compatibility; or \u003ccode\u003eextended\u003c/code\u003e,\n         * which uses the complete set of HTML named entities.\n         * \u003cp\u003e\n         * The default escape mode is \u003ccode\u003ebase\u003c/code\u003e.\n         * @return the document\u0027s current escape mode\n         "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.escapeMode(org.jsoup.nodes.Entities.EscapeMode)",
      "begin_line": 235,
      "end_line": 238,
      "comment": "\n         * Set the document\u0027s escape mode\n         * @param escapeMode the new escape mode to use\n         * @return the document\u0027s output settings, for chaining\n         "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.charset()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n         * Get the document\u0027s current output charset, which is used to control which characters are escaped when\n         * generating HTML (via the \u003ccode\u003ehtml()\u003c/code\u003e methods), and which are kept intact.\n         * \u003cp\u003e\n         * Where possible (when parsing from a URL or File), the document\u0027s output charset is automatically set to the\n         * input charset. Otherwise, it defaults to UTF-8.\n         * @return the document\u0027s current charset.\n         "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.charset(java.nio.charset.Charset)",
      "begin_line": 257,
      "end_line": 262,
      "comment": "\n         * Update the document\u0027s output charset.\n         * @param charset the new charset to use.\n         * @return the document\u0027s output settings, for chaining\n         "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.charset(java.lang.String)",
      "begin_line": 269,
      "end_line": 272,
      "comment": "\n         * Update the document\u0027s output charset.\n         * @param charset the new charset (by name) to use.\n         * @return the document\u0027s output settings, for chaining\n         "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.encoder()",
      "begin_line": 274,
      "end_line": 276,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.prettyPrint()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\n         * Get if pretty printing is enabled. Default is true. If disabled, the HTML output methods will not re-format\n         * the output, and the output will generally look like the input.\n         * @return if pretty printing is enabled.\n         "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.prettyPrint(boolean)",
      "begin_line": 292,
      "end_line": 295,
      "comment": "\n         * Enable or disable pretty printing.\n         * @param pretty new pretty print setting\n         * @return this, for chaining\n         "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.indentAmount()",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\n         * Get the current tag indent amount, used when pretty printing.\n         * @return the current indent amount\n         "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.indentAmount(int)",
      "begin_line": 310,
      "end_line": 314,
      "comment": "\n         * Set the indent amount for pretty printing\n         * @param indentAmount number of spaces to use for indenting each level. Must be \u003e\u003d 0.\n         * @return this, for chaining\n         "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.OutputSettings.clone()",
      "begin_line": 316,
      "end_line": 328,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.outputSettings()",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\n     * Get the document\u0027s current output settings.\n     * @return the document\u0027s current output settings.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.outputSettings(org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 344,
      "end_line": 348,
      "comment": "\n     * Set the document\u0027s output settings.\n     * @param outputSettings new output settings.\n     * @return this document, for chaining.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.quirksMode()",
      "begin_line": 354,
      "end_line": 356,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Document.quirksMode(org.jsoup.nodes.Document.QuirksMode)",
      "begin_line": 358,
      "end_line": 361,
      "comment": ""
    }
  ]
}