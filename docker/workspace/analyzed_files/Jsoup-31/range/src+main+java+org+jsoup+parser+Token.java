{
  "filepath": "/tmp/Jsoup-31f/src/main/java/org/jsoup/parser/Token.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Token",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 10,
      "end_line": 263,
      "comment": "\n * Parse tokens for the Tokeniser.\n "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 11,
      "end_line": 11,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.Token()",
      "begin_line": 13,
      "end_line": 14,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.tokenType()",
      "begin_line": 16,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Doctype",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 20,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "publicIdentifier"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "systemIdentifier"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "forceQuirks"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.Doctype.Doctype()",
      "begin_line": 26,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Doctype.getName()",
      "begin_line": 30,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Doctype.getPublicIdentifier()",
      "begin_line": 34,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Doctype.getSystemIdentifier()",
      "begin_line": 38,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Doctype.isForceQuirks()",
      "begin_line": 42,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Tag",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 47,
      "end_line": 123,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tagName"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pendingAttributeName"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " attribute names are generally caught in one hop, not accumulated"
    },
    {
      "type": "field",
      "varNames": [
        "pendingAttributeValue"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " but values are accumulated, from e.g. \u0026 in hrefs"
    },
    {
      "type": "field",
      "varNames": [
        "selfClosing"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attributes"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " start tags get attributes on construction. End tags get attributes on first new attribute (but only for parser convenience, not used)."
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.newAttribute()",
      "begin_line": 55,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.finaliseTag()",
      "begin_line": 72,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.name()",
      "begin_line": 80,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.name(java.lang.String)",
      "begin_line": 85,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.isSelfClosing()",
      "begin_line": 90,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.getAttributes()",
      "begin_line": 94,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendTagName(java.lang.String)",
      "begin_line": 100,
      "end_line": 102,
      "comment": " these appenders are rarely hit in not null state-- caused by null chars."
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendTagName(char)",
      "begin_line": 104,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeName(java.lang.String)",
      "begin_line": 108,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeName(char)",
      "begin_line": 112,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeValue(java.lang.String)",
      "begin_line": 116,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Tag.appendAttributeValue(char)",
      "begin_line": 120,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "StartTag",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token.Tag"
      ],
      "begin_line": 125,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.StartTag.StartTag()",
      "begin_line": 126,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.StartTag.StartTag(java.lang.String)",
      "begin_line": 132,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.StartTag.StartTag(java.lang.String, org.jsoup.nodes.Attributes)",
      "begin_line": 137,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.StartTag.toString()",
      "begin_line": 143,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "EndTag",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token.Tag"
      ],
      "begin_line": 152,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.EndTag.EndTag()",
      "begin_line": 153,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.EndTag.EndTag(java.lang.String)",
      "begin_line": 158,
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.EndTag.toString()",
      "begin_line": 163,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Comment",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 169,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bogus"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.Comment.Comment()",
      "begin_line": 173,
      "end_line": 175,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Comment.getData()",
      "begin_line": 177,
      "end_line": 179,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Comment.toString()",
      "begin_line": 181,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Character",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 187,
      "end_line": 203,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.Character.Character(java.lang.String)",
      "begin_line": 190,
      "end_line": 193,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Character.getData()",
      "begin_line": 195,
      "end_line": 197,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.Character.toString()",
      "begin_line": 199,
      "end_line": 202,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "EOF",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.Token"
      ],
      "begin_line": 205,
      "end_line": 209,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Token.EOF.EOF()",
      "begin_line": 206,
      "end_line": 208,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isDoctype()",
      "begin_line": 211,
      "end_line": 213,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asDoctype()",
      "begin_line": 215,
      "end_line": 217,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isStartTag()",
      "begin_line": 219,
      "end_line": 221,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asStartTag()",
      "begin_line": 223,
      "end_line": 225,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isEndTag()",
      "begin_line": 227,
      "end_line": 229,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asEndTag()",
      "begin_line": 231,
      "end_line": 233,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isComment()",
      "begin_line": 235,
      "end_line": 237,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asComment()",
      "begin_line": 239,
      "end_line": 241,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isCharacter()",
      "begin_line": 243,
      "end_line": 245,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.asCharacter()",
      "begin_line": 247,
      "end_line": 249,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Token.isEOF()",
      "begin_line": 251,
      "end_line": 253,
      "comment": ""
    }
  ]
}