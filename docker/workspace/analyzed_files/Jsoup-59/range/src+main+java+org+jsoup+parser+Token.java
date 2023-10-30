{
  "filepath": "/tmp/Jsoup-59f/src/main/java/org/jsoup/parser/Token.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Token",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 11,
      "end_line": 376,
      "comment": "\n * Parse tokens for the Tokeniser.\n "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 12,
      "end_line": 12,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.Token()",
      "begin_line": 14,
      "end_line": 15,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.tokenType()",
      "begin_line": 17,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.reset()",
      "begin_line": 25,
      "end_line": 25,
      "comment": "\n     * Reset the data represent by this token, for reuse. Prevents the need to create transfer objects for every\n     * piece of data, which immediately get GCed.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.reset(java.lang.StringBuilder)",
      "begin_line": 27,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Doctype",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 33,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pubSysKey"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "publicIdentifier"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "systemIdentifier"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "forceQuirks"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.Doctype.Doctype()",
      "begin_line": 40,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Doctype.reset()",
      "begin_line": 44,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Doctype.getName()",
      "begin_line": 54,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Doctype.getPubSysKey()",
      "begin_line": 58,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Doctype.getPublicIdentifier()",
      "begin_line": 62,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Doctype.getSystemIdentifier()",
      "begin_line": 66,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Doctype.isForceQuirks()",
      "begin_line": 70,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Tag",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 75,
      "end_line": 214,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tagName"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "normalName"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " lc version of tag name, for case insensitive tree build"
    },
    {
      "type": "field",
      "varNames": [
        "pendingAttributeName"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " attribute names are generally caught in one hop, not accumulated"
    },
    {
      "type": "field",
      "varNames": [
        "pendingAttributeValue"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " but values are accumulated, from e.g. \u0026 in hrefs"
    },
    {
      "type": "field",
      "varNames": [
        "pendingAttributeValueS"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " try to get attr vals in one shot, vs Builder"
    },
    {
      "type": "field",
      "varNames": [
        "hasEmptyAttributeValue"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " distinguish boolean attribute from empty string value"
    },
    {
      "type": "field",
      "varNames": [
        "hasPendingAttributeValue"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "selfClosing"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attributes"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " start tags get attributes on construction. End tags get attributes on first new attribute (but only for parser convenience, not used)."
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.reset()",
      "begin_line": 86,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.newAttribute()",
      "begin_line": 100,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.finaliseTag()",
      "begin_line": 126,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.name()",
      "begin_line": 134,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.normalName()",
      "begin_line": 139,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.name(java.lang.String)",
      "begin_line": 143,
      "end_line": 147,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.isSelfClosing()",
      "begin_line": 149,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.getAttributes()",
      "begin_line": 153,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendTagName(java.lang.String)",
      "begin_line": 159,
      "end_line": 162,
      "comment": " these appenders are rarely hit in not null state-- caused by null chars."
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendTagName(char)",
      "begin_line": 164,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeName(java.lang.String)",
      "begin_line": 168,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeName(char)",
      "begin_line": 172,
      "end_line": 174,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeValue(java.lang.String)",
      "begin_line": 176,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeValue(char)",
      "begin_line": 185,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeValue(char[])",
      "begin_line": 190,
      "end_line": 193,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeValue(int[])",
      "begin_line": 195,
      "end_line": 200,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.setEmptyAttributeValue()",
      "begin_line": 202,
      "end_line": 204,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.ensureAttributeValue()",
      "begin_line": 206,
      "end_line": 213,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "StartTag",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token.Tag"
      ],
      "begin_line": 216,
      "end_line": 245,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.StartTag.StartTag()",
      "begin_line": 217,
      "end_line": 221,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.StartTag.reset()",
      "begin_line": 223,
      "end_line": 229,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.StartTag.nameAttr(java.lang.String, org.jsoup.nodes.Attributes)",
      "begin_line": 231,
      "end_line": 236,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.StartTag.toString()",
      "begin_line": 238,
      "end_line": 244,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "EndTag",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token.Tag"
      ],
      "begin_line": 247,
      "end_line": 257,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.EndTag.EndTag()",
      "begin_line": 248,
      "end_line": 251,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.EndTag.toString()",
      "begin_line": 253,
      "end_line": 256,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Comment",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 259,
      "end_line": 282,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 260,
      "end_line": 260,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bogus"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Comment.reset()",
      "begin_line": 263,
      "end_line": 268,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.Comment.Comment()",
      "begin_line": 270,
      "end_line": 272,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Comment.getData()",
      "begin_line": 274,
      "end_line": 276,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Comment.toString()",
      "begin_line": 278,
      "end_line": 281,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Character",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 284,
      "end_line": 311,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 285,
      "end_line": 285,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.Character.Character()",
      "begin_line": 287,
      "end_line": 290,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Character.reset()",
      "begin_line": 292,
      "end_line": 296,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Character.data(java.lang.String)",
      "begin_line": 298,
      "end_line": 301,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Character.getData()",
      "begin_line": 303,
      "end_line": 305,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Character.toString()",
      "begin_line": 307,
      "end_line": 310,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "EOF",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 313,
      "end_line": 322,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.EOF.EOF()",
      "begin_line": 314,
      "end_line": 316,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.EOF.reset()",
      "begin_line": 318,
      "end_line": 321,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isDoctype()",
      "begin_line": 324,
      "end_line": 326,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asDoctype()",
      "begin_line": 328,
      "end_line": 330,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isStartTag()",
      "begin_line": 332,
      "end_line": 334,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asStartTag()",
      "begin_line": 336,
      "end_line": 338,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isEndTag()",
      "begin_line": 340,
      "end_line": 342,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asEndTag()",
      "begin_line": 344,
      "end_line": 346,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isComment()",
      "begin_line": 348,
      "end_line": 350,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asComment()",
      "begin_line": 352,
      "end_line": 354,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isCharacter()",
      "begin_line": 356,
      "end_line": 358,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asCharacter()",
      "begin_line": 360,
      "end_line": 362,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isEOF()",
      "begin_line": 364,
      "end_line": 366,
      "comment": ""
    }
  ]
}