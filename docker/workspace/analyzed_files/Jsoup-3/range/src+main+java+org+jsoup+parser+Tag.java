{
  "filepath": "/tmp/Jsoup-3f/src/main/java/org/jsoup/parser/Tag.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Tag",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 12,
      "end_line": 393,
      "comment": "\n HTML Tag specifications. This is a very simplistic model without the full expressiveness as the DTD,\n but it should capture most of what we need to know to intelligently parse a doc.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "tags"
      ],
      "begin_line": 13,
      "end_line": 13,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultAncestor"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tagName"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isBlock"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": " block or inline"
    },
    {
      "type": "field",
      "varNames": [
        "canContainBlock"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": " Can this tag hold block level tags?"
    },
    {
      "type": "field",
      "varNames": [
        "canContainInline"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": " only pcdata if not"
    },
    {
      "type": "field",
      "varNames": [
        "optionalClosing"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": " If tag is open, and another seen, close previous tag"
    },
    {
      "type": "field",
      "varNames": [
        "empty"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": " can hold nothing; e.g. img"
    },
    {
      "type": "field",
      "varNames": [
        "preserveWhitespace"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": " for pre, textarea, script etc"
    },
    {
      "type": "field",
      "varNames": [
        "ancestors"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": " elements must be a descendant of one of these ancestors"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " if not null, elements must be a direct child of parent"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Tag.Tag(java.lang.String)",
      "begin_line": 30,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.getName()",
      "begin_line": 34,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.valueOf(java.lang.String)",
      "begin_line": 45,
      "end_line": 61,
      "comment": "\n     Get a Tag by name. If not previously defined (unknown), returns a new generic tag, that can do anything.\n     \u003cp\u003e\n     Pre-defined tags (P, DIV etc) will be \u003d\u003d, but unknown tags are not registered and will only .equals().\n     @param tagName Name of tag, e.g. \"p\". Case insensitive.\n     @return The tag, either defined or new generic.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.canContain(org.jsoup.parser.Tag)",
      "begin_line": 68,
      "end_line": 104,
      "comment": "\n     Test if this tag, the prospective parent, can accept the proposed child.\n     @param child potential child tag.\n     @return true if this can contain child.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isBlock()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     Gets if this is a block tag.\n     @return if block tag\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.canContainBlock()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     Gets if this tag can contain block tags.\n     @return if tag can contain block tags\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isInline()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     Gets if this tag is an inline tag.\n     @return if this tag is an inline tag.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isData()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     Gets if this tag is a data only tag.\n     @return if this tag is a data only tag\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isEmpty()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     Get if this is an empty tag\n     @return if this is an emtpy tag\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.preserveWhitespace()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     Get if this tag should preserve whitespace within child text nodes.\n     @return if preserve whitepace\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.getImplicitParent()",
      "begin_line": 154,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.requiresSpecificParent()",
      "begin_line": 158,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isValidParent(org.jsoup.parser.Tag)",
      "begin_line": 162,
      "end_line": 164,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.isValidAncestor(org.jsoup.parser.Tag)",
      "begin_line": 166,
      "end_line": 175,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.equals(java.lang.Object)",
      "begin_line": 177,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.hashCode()",
      "begin_line": 194,
      "end_line": 203,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.toString()",
      "begin_line": 205,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.createBlock(java.lang.String)",
      "begin_line": 327,
      "end_line": 329,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.createInline(java.lang.String)",
      "begin_line": 331,
      "end_line": 336,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.register(org.jsoup.parser.Tag)",
      "begin_line": 338,
      "end_line": 344,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setContainInlineOnly()",
      "begin_line": 346,
      "end_line": 350,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setContainDataOnly()",
      "begin_line": 352,
      "end_line": 357,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setEmpty()",
      "begin_line": 359,
      "end_line": 364,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setOptionalClosing()",
      "begin_line": 366,
      "end_line": 369,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setPreserveWhitespace()",
      "begin_line": 371,
      "end_line": 374,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setAncestor(java.lang.String...)",
      "begin_line": 376,
      "end_line": 386,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tag.setParent(java.lang.String)",
      "begin_line": 388,
      "end_line": 392,
      "comment": ""
    }
  ]
}