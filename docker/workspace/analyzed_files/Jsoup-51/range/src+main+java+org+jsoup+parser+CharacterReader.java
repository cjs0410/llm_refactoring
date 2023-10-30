{
  "filepath": "/tmp/Jsoup-51f/src/main/java/org/jsoup/parser/CharacterReader.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharacterReader",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 11,
      "end_line": 396,
      "comment": "\n CharacterReader consumes tokens off a string. To replace the old TokenQueue.\n "
    },
    {
      "type": "field",
      "varNames": [
        "EOF"
      ],
      "begin_line": 12,
      "end_line": 12,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxCacheLen"
      ],
      "begin_line": 13,
      "end_line": 13,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "input"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "length"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mark"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stringCache"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": " holds reused strings in this doc, to lessen garbage"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.CharacterReader.CharacterReader(java.lang.String)",
      "begin_line": 21,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.pos()",
      "begin_line": 27,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.isEmpty()",
      "begin_line": 31,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.current()",
      "begin_line": 35,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consume()",
      "begin_line": 39,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.unconsume()",
      "begin_line": 45,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.advance()",
      "begin_line": 49,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.mark()",
      "begin_line": 53,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.rewindToMark()",
      "begin_line": 57,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeAsString()",
      "begin_line": 61,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.nextIndexOf(char)",
      "begin_line": 70,
      "end_line": 77,
      "comment": "\n     * Returns the number of characters between the current position and the next instance of the input char\n     * @param c scan target\n     * @return offset between current position and next instance of target. -1 if not found.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.nextIndexOf(java.lang.CharSequence)",
      "begin_line": 85,
      "end_line": 101,
      "comment": "\n     * Returns the number of characters between the current position and the next instance of the input sequence\n     *\n     * @param seq scan target\n     * @return offset between current position and next instance of target. -1 if not found.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeTo(char)",
      "begin_line": 103,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeTo(java.lang.String)",
      "begin_line": 114,
      "end_line": 123,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeToAny(char...)",
      "begin_line": 125,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeToAnySorted(char...)",
      "begin_line": 141,
      "end_line": 153,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeData()",
      "begin_line": 155,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeTagName()",
      "begin_line": 171,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeToEnd()",
      "begin_line": 187,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeLetterSequence()",
      "begin_line": 193,
      "end_line": 204,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence()",
      "begin_line": 206,
      "end_line": 224,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeHexSequence()",
      "begin_line": 226,
      "end_line": 236,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeDigitSequence()",
      "begin_line": 238,
      "end_line": 248,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matches(char)",
      "begin_line": 250,
      "end_line": 253,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matches(java.lang.String)",
      "begin_line": 255,
      "end_line": 264,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesIgnoreCase(java.lang.String)",
      "begin_line": 266,
      "end_line": 278,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesAny(char...)",
      "begin_line": 280,
      "end_line": 290,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesAnySorted(char[])",
      "begin_line": 292,
      "end_line": 294,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesLetter()",
      "begin_line": 296,
      "end_line": 301,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesDigit()",
      "begin_line": 303,
      "end_line": 308,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchConsume(java.lang.String)",
      "begin_line": 310,
      "end_line": 317,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase(java.lang.String)",
      "begin_line": 319,
      "end_line": 326,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.containsIgnoreCase(java.lang.String)",
      "begin_line": 328,
      "end_line": 333,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.toString()",
      "begin_line": 335,
      "end_line": 338,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.cacheString(int, int)",
      "begin_line": 347,
      "end_line": 378,
      "comment": "\n     * Caches short strings, as a flywheel pattern, to reduce GC load. Just for this doc, to prevent leaks.\n     * \u003cp /\u003e\n     * Simplistic, and on hash collisions just falls back to creating a new string, vs a full HashMap with Entry list.\n     * That saves both having to create objects as hash keys, and running through the entry list, at the expense of\n     * some more duplicates.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.rangeEquals(int, int, java.lang.String)",
      "begin_line": 383,
      "end_line": 395,
      "comment": "\n     * Check if the value of the provided range equals the string.\n     "
    }
  ]
}