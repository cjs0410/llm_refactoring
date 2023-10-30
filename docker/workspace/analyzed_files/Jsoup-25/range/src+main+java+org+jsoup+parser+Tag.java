{
  "filepath": "/tmp/Jsoup-25f/src/main/java/org/jsoup/parser/Tag.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Tag",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 13,
      "end_line": 262,
      "comment": "\n * HTML Tag capabilities.\n *\n * @author Jonathan Hedley, jonathan@hedley.net\n "
    },
    {
      "type": "field",
      "varNames": [
        "tags"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": " map of known tags"
    },
    {
      "type": "field",
      "varNames": [
        "tagName"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isBlock"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": " block or inline"
    },
    {
      "type": "field",
      "varNames": [
        "formatAsBlock"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": " should be formatted as a block"
    },
    {
      "type": "field",
      "varNames": [
        "canContainBlock"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": " Can this tag hold block level tags?"
    },
    {
      "type": "field",
      "varNames": [
        "canContainInline"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": " only pcdata if not"
    },
    {
      "type": "field",
      "varNames": [
        "empty"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": " can hold nothing; e.g. img"
    },
    {
      "type": "field",
      "varNames": [
        "selfClosing"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": " can self close (\u003cfoo /\u003e). used for unknown tags that self close, without forcing them as empty."
    },
    {
      "type": "field",
      "varNames": [
        "preserveWhitespace"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": " for pre, textarea, script etc"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Tag.Tag(java.lang.String)",
      "begin_line": 25,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.getName()",
      "begin_line": 34,
      "end_line": 36,
      "comment": "\n     * Get this tag\u0027s name.\n     *\n     * @return the tag\u0027s name\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.valueOf(java.lang.String)",
      "begin_line": 46,
      "end_line": 61,
      "comment": "\n     * Get a Tag by name. If not previously defined (unknown), returns a new generic tag, that can do anything.\n     * \u003cp/\u003e\n     * Pre-defined tags (P, DIV etc) will be \u003d\u003d, but unknown tags are not registered and will only .equals().\n     *\n     * @param tagName Name of tag, e.g. \"p\". Case insensitive.\n     * @return The tag, either defined or new generic.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isBlock()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Gets if this is a block tag.\n     *\n     * @return if block tag\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.formatAsBlock()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Gets if this tag should be formatted as a block (or as inline)\n     *\n     * @return if should be formatted as block or inline\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.canContainBlock()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Gets if this tag can contain block tags.\n     *\n     * @return if tag can contain block tags\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isInline()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Gets if this tag is an inline tag.\n     *\n     * @return if this tag is an inline tag.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isData()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Gets if this tag is a data only tag.\n     *\n     * @return if this tag is a data only tag\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isEmpty()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Get if this is an empty tag\n     *\n     * @return if this is an empty tag\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isSelfClosing()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Get if this tag is self closing.\n     *\n     * @return if this tag should be output as self closing.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isKnownTag()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Get if this is a pre-defined tag, or was auto created on parsing.\n     *\n     * @return if a known tag\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isKnownTag(java.lang.String)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Check if this tagname is a known tag.\n     *\n     * @param tagName name of tag\n     * @return if known HTML tag\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.preserveWhitespace()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Get if this tag should preserve whitespace within child text nodes.\n     *\n     * @return if preserve whitepace\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setSelfClosing()",
      "begin_line": 154,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.equals(java.lang.Object)",
      "begin_line": 159,
      "end_line": 176,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.hashCode()",
      "begin_line": 178,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.toString()",
      "begin_line": 191,
      "end_line": 193,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockTags"
      ],
      "begin_line": 197,
      "end_line": 203,
      "comment": " prepped from http://www.w3.org/TR/REC-html40/sgml/dtd.html and other sources"
    },
    {
      "type": "field",
      "varNames": [
        "inlineTags"
      ],
      "begin_line": 204,
      "end_line": 210,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "emptyTags"
      ],
      "begin_line": 211,
      "end_line": 214,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "formatAsInlineTags"
      ],
      "begin_line": 215,
      "end_line": 217,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preserveWhitespaceTags"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.register(org.jsoup.parser.Tag)",
      "begin_line": 256,
      "end_line": 261,
      "comment": ""
    }
  ]
}