{
  "filepath": "/tmp/Jsoup-23f/src/main/java/org/jsoup/parser/CharacterReader.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharacterReader",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 8,
      "end_line": 230,
      "comment": "\n CharacterReader cosumes tokens off a string. To replace the old TokenQueue.\n "
    },
    {
      "type": "field",
      "varNames": [
        "EOF"
      ],
      "begin_line": 9,
      "end_line": 9,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "input"
      ],
      "begin_line": 11,
      "end_line": 11,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "length"
      ],
      "begin_line": 12,
      "end_line": 12,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 13,
      "end_line": 13,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mark"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.CharacterReader.CharacterReader(java.lang.String)",
      "begin_line": 16,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.pos()",
      "begin_line": 24,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.isEmpty()",
      "begin_line": 28,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.current()",
      "begin_line": 32,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consume()",
      "begin_line": 36,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.unconsume()",
      "begin_line": 42,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.advance()",
      "begin_line": 46,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.mark()",
      "begin_line": 50,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.rewindToMark()",
      "begin_line": 54,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeAsString()",
      "begin_line": 58,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeTo(char)",
      "begin_line": 62,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeTo(java.lang.String)",
      "begin_line": 73,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeToAny(char...)",
      "begin_line": 84,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeToEnd()",
      "begin_line": 99,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeLetterSequence()",
      "begin_line": 105,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence()",
      "begin_line": 118,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeHexSequence()",
      "begin_line": 138,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeDigitSequence()",
      "begin_line": 150,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matches(char)",
      "begin_line": 162,
      "end_line": 165,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matches(java.lang.String)",
      "begin_line": 167,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesIgnoreCase(java.lang.String)",
      "begin_line": 171,
      "end_line": 173,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesAny(char...)",
      "begin_line": 175,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesLetter()",
      "begin_line": 187,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesDigit()",
      "begin_line": 194,
      "end_line": 199,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchConsume(java.lang.String)",
      "begin_line": 201,
      "end_line": 208,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase(java.lang.String)",
      "begin_line": 210,
      "end_line": 217,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.containsIgnoreCase(java.lang.String)",
      "begin_line": 219,
      "end_line": 224,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.toString()",
      "begin_line": 226,
      "end_line": 229,
      "comment": ""
    }
  ]
}