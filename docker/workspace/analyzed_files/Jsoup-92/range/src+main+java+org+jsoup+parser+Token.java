{
  "filepath": "/tmp/Jsoup-92f/src/main/java/org/jsoup/parser/Token.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Token",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 11,
      "end_line": 394,
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
      "end_line": 215,
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
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.name()",
      "begin_line": 134,
      "end_line": 137,
      "comment": " Preserves case "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.normalName()",
      "begin_line": 140,
      "end_line": 142,
      "comment": " Lower case "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.name(java.lang.String)",
      "begin_line": 144,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.isSelfClosing()",
      "begin_line": 150,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.getAttributes()",
      "begin_line": 154,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendTagName(java.lang.String)",
      "begin_line": 160,
      "end_line": 163,
      "comment": " these appenders are rarely hit in not null state-- caused by null chars."
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendTagName(char)",
      "begin_line": 165,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeName(java.lang.String)",
      "begin_line": 169,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeName(char)",
      "begin_line": 173,
      "end_line": 175,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeValue(java.lang.String)",
      "begin_line": 177,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeValue(char)",
      "begin_line": 186,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeValue(char[])",
      "begin_line": 191,
      "end_line": 194,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeValue(int[])",
      "begin_line": 196,
      "end_line": 201,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.setEmptyAttributeValue()",
      "begin_line": 203,
      "end_line": 205,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.ensureAttributeValue()",
      "begin_line": 207,
      "end_line": 214,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "StartTag",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token.Tag"
      ],
      "begin_line": 217,
      "end_line": 246,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.StartTag.StartTag()",
      "begin_line": 218,
      "end_line": 222,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.StartTag.reset()",
      "begin_line": 224,
      "end_line": 230,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.StartTag.nameAttr(java.lang.String, org.jsoup.nodes.Attributes)",
      "begin_line": 232,
      "end_line": 237,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.StartTag.toString()",
      "begin_line": 239,
      "end_line": 245,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "EndTag",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token.Tag"
      ],
      "begin_line": 248,
      "end_line": 258,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.EndTag.EndTag()",
      "begin_line": 249,
      "end_line": 252,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.EndTag.toString()",
      "begin_line": 254,
      "end_line": 257,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Comment",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 260,
      "end_line": 283,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bogus"
      ],
      "begin_line": 262,
      "end_line": 262,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Comment.reset()",
      "begin_line": 264,
      "end_line": 269,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.Comment.Comment()",
      "begin_line": 271,
      "end_line": 273,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Comment.getData()",
      "begin_line": 275,
      "end_line": 277,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Comment.toString()",
      "begin_line": 279,
      "end_line": 282,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Character",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 285,
      "end_line": 312,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.Character.Character()",
      "begin_line": 288,
      "end_line": 291,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Character.reset()",
      "begin_line": 293,
      "end_line": 297,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Character.data(java.lang.String)",
      "begin_line": 299,
      "end_line": 302,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Character.getData()",
      "begin_line": 304,
      "end_line": 306,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Character.toString()",
      "begin_line": 308,
      "end_line": 311,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "CData",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token.Character"
      ],
      "begin_line": 314,
      "end_line": 325,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.CData.CData(java.lang.String)",
      "begin_line": 315,
      "end_line": 318,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.CData.toString()",
      "begin_line": 320,
      "end_line": 323,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "EOF",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 327,
      "end_line": 336,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.EOF.EOF()",
      "begin_line": 328,
      "end_line": 330,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.EOF.reset()",
      "begin_line": 332,
      "end_line": 335,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isDoctype()",
      "begin_line": 338,
      "end_line": 340,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asDoctype()",
      "begin_line": 342,
      "end_line": 344,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isStartTag()",
      "begin_line": 346,
      "end_line": 348,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asStartTag()",
      "begin_line": 350,
      "end_line": 352,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isEndTag()",
      "begin_line": 354,
      "end_line": 356,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asEndTag()",
      "begin_line": 358,
      "end_line": 360,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isComment()",
      "begin_line": 362,
      "end_line": 364,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asComment()",
      "begin_line": 366,
      "end_line": 368,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isCharacter()",
      "begin_line": 370,
      "end_line": 372,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isCData()",
      "begin_line": 374,
      "end_line": 376,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asCharacter()",
      "begin_line": 378,
      "end_line": 380,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isEOF()",
      "begin_line": 382,
      "end_line": 384,
      "comment": ""
    }
  ]
}