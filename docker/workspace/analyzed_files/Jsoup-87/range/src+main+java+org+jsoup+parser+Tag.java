{
  "filepath": "/tmp/Jsoup-87f/src/main/java/org/jsoup/parser/Tag.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Tag",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 14,
      "end_line": 328,
      "comment": "\n * HTML Tag capabilities.\n *\n * @author Jonathan Hedley, jonathan@hedley.net\n "
    },
    {
      "type": "field",
      "varNames": [
        "tags"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": " map of known tags"
    },
    {
      "type": "field",
      "varNames": [
        "tagName"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "normalName"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": " always the lower case version of this tag, regardless of case preservation mode"
    },
    {
      "type": "field",
      "varNames": [
        "isBlock"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": " block or inline"
    },
    {
      "type": "field",
      "varNames": [
        "formatAsBlock"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": " should be formatted as a block"
    },
    {
      "type": "field",
      "varNames": [
        "canContainInline"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": " only pcdata if not"
    },
    {
      "type": "field",
      "varNames": [
        "empty"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": " can hold nothing; e.g. img"
    },
    {
      "type": "field",
      "varNames": [
        "selfClosing"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": " can self close (\u003cfoo /\u003e). used for unknown tags that self close, without forcing them as empty."
    },
    {
      "type": "field",
      "varNames": [
        "preserveWhitespace"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": " for pre, textarea, script etc"
    },
    {
      "type": "field",
      "varNames": [
        "formList"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": " a control that appears in forms: input, textarea, output etc"
    },
    {
      "type": "field",
      "varNames": [
        "formSubmit"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": " a control that can be submitted in a form: input etc"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Tag.Tag(java.lang.String)",
      "begin_line": 28,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.getName()",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Get this tag\u0027s name.\n     *\n     * @return the tag\u0027s name\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.normalName()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Get this tag\u0027s normalized (lowercased) name.\n     * @return the tag\u0027s normal name.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.valueOf(java.lang.String, org.jsoup.parser.ParseSettings)",
      "begin_line": 60,
      "end_line": 76,
      "comment": "\n     * Get a Tag by name. If not previously defined (unknown), returns a new generic tag, that can do anything.\n     * \u003cp\u003e\n     * Pre-defined tags (P, DIV etc) will be \u003d\u003d, but unknown tags are not registered and will only .equals().\n     * \u003c/p\u003e\n     * \n     * @param tagName Name of tag, e.g. \"p\". Case insensitive.\n     * @param settings used to control tag name sensitivity\n     * @return The tag, either defined or new generic.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.valueOf(java.lang.String)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Get a Tag by name. If not previously defined (unknown), returns a new generic tag, that can do anything.\n     * \u003cp\u003e\n     * Pre-defined tags (P, DIV etc) will be \u003d\u003d, but unknown tags are not registered and will only .equals().\n     * \u003c/p\u003e\n     *\n     * @param tagName Name of tag, e.g. \"p\". \u003cb\u003eCase sensitive\u003c/b\u003e.\n     * @return The tag, either defined or new generic.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isBlock()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Gets if this is a block tag.\n     *\n     * @return if block tag\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.formatAsBlock()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Gets if this tag should be formatted as a block (or as inline)\n     *\n     * @return if should be formatted as block or inline\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.canContainBlock()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Gets if this tag can contain block tags.\n     *\n     * @return if tag can contain block tags\n     * @deprecated No longer used, and no different result than {{@link #isBlock()}}\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isInline()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Gets if this tag is an inline tag.\n     *\n     * @return if this tag is an inline tag.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isData()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Gets if this tag is a data only tag.\n     *\n     * @return if this tag is a data only tag\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isEmpty()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Get if this is an empty tag\n     *\n     * @return if this is an empty tag\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isSelfClosing()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Get if this tag is self closing.\n     *\n     * @return if this tag should be output as self closing.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isKnownTag()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Get if this is a pre-defined tag, or was auto created on parsing.\n     *\n     * @return if a known tag\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isKnownTag(java.lang.String)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Check if this tagname is a known tag.\n     *\n     * @param tagName name of tag\n     * @return if known HTML tag\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.preserveWhitespace()",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Get if this tag should preserve whitespace within child text nodes.\n     *\n     * @return if preserve whitespace\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isFormListed()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * Get if this tag represents a control associated with a form. E.g. input, textarea, output\n     * @return if associated with a form\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isFormSubmittable()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Get if this tag represents an element that should be submitted with a form. E.g. input, option\n     * @return if submittable with a form\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setSelfClosing()",
      "begin_line": 199,
      "end_line": 202,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.equals(java.lang.Object)",
      "begin_line": 204,
      "end_line": 220,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.hashCode()",
      "begin_line": 222,
      "end_line": 234,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.toString()",
      "begin_line": 236,
      "end_line": 239,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockTags"
      ],
      "begin_line": 243,
      "end_line": 250,
      "comment": " prepped from http://www.w3.org/TR/REC-html40/sgml/dtd.html and other sources"
    },
    {
      "type": "field",
      "varNames": [
        "inlineTags"
      ],
      "begin_line": 251,
      "end_line": 258,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "emptyTags"
      ],
      "begin_line": 259,
      "end_line": 262,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "formatAsInlineTags"
      ],
      "begin_line": 263,
      "end_line": 266,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preserveWhitespaceTags"
      ],
      "begin_line": 267,
      "end_line": 270,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "formListedTags"
      ],
      "begin_line": 272,
      "end_line": 274,
      "comment": " todo: I think we just need submit tags, and can scrub listed"
    },
    {
      "type": "field",
      "varNames": [
        "formSubmitTags"
      ],
      "begin_line": 275,
      "end_line": 277,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.register(org.jsoup.parser.Tag)",
      "begin_line": 325,
      "end_line": 327,
      "comment": ""
    }
  ]
}