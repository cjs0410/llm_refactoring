{
  "filepath": "/tmp/Jsoup-28f/src/main/java/org/jsoup/parser/Parser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Parser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 13,
      "end_line": 168,
      "comment": "\n * Parses HTML into a {@link org.jsoup.nodes.Document}. Generally best to use one of the  more convenient parse methods\n * in {@link org.jsoup.Jsoup}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_ERRORS"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": " by default, error tracking is disabled."
    },
    {
      "type": "field",
      "varNames": [
        "treeBuilder"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxErrors"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "errors"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Parser.Parser(org.jsoup.parser.TreeBuilder)",
      "begin_line": 24,
      "end_line": 26,
      "comment": "\n     * Create a new Parser, using the specified TreeBuilder\n     * @param treeBuilder TreeBuilder to use to parse input into Documents.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseInput(java.lang.String, java.lang.String)",
      "begin_line": 28,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.getTreeBuilder()",
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n     * Get the TreeBuilder currently in use.\n     * @return current TreeBuilder.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.setTreeBuilder(org.jsoup.parser.TreeBuilder)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * Update the TreeBuilder used when parsing content.\n     * @param treeBuilder current TreeBuilder\n     * @return this, for chaining\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.isTrackErrors()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Check if parse error tracking is enabled.\n     * @return current track error state.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.setTrackErrors(int)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Enable or disable parse error tracking for the next parse.\n     * @param maxErrors the maximum number of errors to track. Set to 0 to disable.\n     * @return this, for chaining\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.getErrors()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Retrieve the parse errors, if any, from the last parse.\n     * @return list of parse errors, up to the size of the maximum errors tracked.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parse(java.lang.String, java.lang.String)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\n     * Parse HTML into a Document.\n     *\n     * @param html HTML to parse\n     * @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     *\n     * @return parsed Document\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * Parse a fragment of HTML into a list of nodes. The context element, if supplied, supplies parsing context.\n     *\n     * @param fragmentHtml the fragment of HTML to parse\n     * @param context (optional) the element that this HTML fragment is being parsed for (i.e. for inner HTML). This\n     * provides stack context (for implicit element creation).\n     * @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     *\n     * @return list of nodes parsed from the input HTML. Note that the context element, if supplied, is not modified.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseBodyFragment(java.lang.String, java.lang.String)",
      "begin_line": 116,
      "end_line": 125,
      "comment": "\n     * Parse a fragment of HTML into the {@code body} of a Document.\n     *\n     * @param bodyHtml fragment of HTML\n     * @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     *\n     * @return Document, with empty head, and HTML parsed into body\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.unescapeEntities(java.lang.String, boolean)",
      "begin_line": 133,
      "end_line": 136,
      "comment": "\n     * Utility method to unescape HTML entities from a string\n     * @param string HTML escaped string\n     * @param inAttribute if the string is to be escaped in strict mode (as attributes are)\n     * @return an unescaped string\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseBodyFragmentRelaxed(java.lang.String, java.lang.String)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * @param bodyHtml HTML to parse\n     * @param baseUri baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     *\n     * @return parsed Document\n     * @deprecated Use {@link #parseBodyFragment} or {@link #parseFragment} instead.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.htmlParser()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Create a new HTML parser. This parser treats input as HTML5, and enforces the creation of a normalised document,\n     * based on a knowledge of the semantics of the incoming tags.\n     * @return a new HTML parser.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.xmlParser()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Create a new XML parser. This parser assumes no knowledge of the incoming tags and does not treat it as HTML,\n     * rather creates a simple tree directly from the input.\n     * @return a new simple XML parser.\n     "
    }
  ]
}