{
  "filepath": "/tmp/Jsoup-72f/src/main/java/org/jsoup/parser/CharacterReader.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharacterReader",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 15,
      "end_line": 475,
      "comment": "\n CharacterReader consumes tokens off a string. Used internally by jsoup. API subject to changes.\n "
    },
    {
      "type": "field",
      "varNames": [
        "EOF"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxStringCacheLen"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxBufferLen"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": " visible for testing"
    },
    {
      "type": "field",
      "varNames": [
        "readAheadLimit"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charBuf"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reader"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bufLength"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bufSplitPoint"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bufPos"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readerPos"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bufMark"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stringCache"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " holds reused strings in this doc, to lessen garbage"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.CharacterReader.CharacterReader(java.io.Reader, int)",
      "begin_line": 30,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.CharacterReader.CharacterReader(java.io.Reader)",
      "begin_line": 38,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.CharacterReader.CharacterReader(java.lang.String)",
      "begin_line": 42,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.bufferUp()",
      "begin_line": 46,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.pos()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Gets the current cursor position in the content.\n     * @return current position\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.isEmpty()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Tests if all the content has been read.\n     * @return true if nothing left to read.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.current()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Get the char at the current position.\n     * @return char\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consume()",
      "begin_line": 89,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.unconsume()",
      "begin_line": 96,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.advance()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Moves the current position by one.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.mark()",
      "begin_line": 107,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.rewindToMark()",
      "begin_line": 111,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.nextIndexOf(char)",
      "begin_line": 120,
      "end_line": 128,
      "comment": "\n     * Returns the number of characters between the current position and the next instance of the input char\n     * @param c scan target\n     * @return offset between current position and next instance of target. -1 if not found.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.nextIndexOf(java.lang.CharSequence)",
      "begin_line": 136,
      "end_line": 153,
      "comment": "\n     * Returns the number of characters between the current position and the next instance of the input sequence\n     *\n     * @param seq scan target\n     * @return offset between current position and next instance of target. -1 if not found.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeTo(char)",
      "begin_line": 160,
      "end_line": 169,
      "comment": "\n     * Reads characters up to the specific char.\n     * @param c the delimiter\n     * @return the chars read\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeTo(java.lang.String)",
      "begin_line": 171,
      "end_line": 180,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeToAny(char...)",
      "begin_line": 187,
      "end_line": 202,
      "comment": "\n     * Read characters until the first of any delimiters is found.\n     * @param chars delimiters to scan for\n     * @return characters read up to the matched delimiter.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeToAnySorted(char...)",
      "begin_line": 204,
      "end_line": 217,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeData()",
      "begin_line": 219,
      "end_line": 234,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeTagName()",
      "begin_line": 236,
      "end_line": 251,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeToEnd()",
      "begin_line": 253,
      "end_line": 258,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeLetterSequence()",
      "begin_line": 260,
      "end_line": 272,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence()",
      "begin_line": 274,
      "end_line": 293,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeHexSequence()",
      "begin_line": 295,
      "end_line": 306,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeDigitSequence()",
      "begin_line": 308,
      "end_line": 319,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matches(char)",
      "begin_line": 321,
      "end_line": 324,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matches(java.lang.String)",
      "begin_line": 326,
      "end_line": 336,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesIgnoreCase(java.lang.String)",
      "begin_line": 338,
      "end_line": 351,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesAny(char...)",
      "begin_line": 353,
      "end_line": 364,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesAnySorted(char[])",
      "begin_line": 366,
      "end_line": 369,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesLetter()",
      "begin_line": 371,
      "end_line": 376,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesDigit()",
      "begin_line": 378,
      "end_line": 383,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchConsume(java.lang.String)",
      "begin_line": 385,
      "end_line": 393,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase(java.lang.String)",
      "begin_line": 395,
      "end_line": 402,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.containsIgnoreCase(java.lang.String)",
      "begin_line": 404,
      "end_line": 409,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.toString()",
      "begin_line": 411,
      "end_line": 414,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.cacheString(char[], java.lang.String[], int, int)",
      "begin_line": 423,
      "end_line": 453,
      "comment": "\n     * Caches short strings, as a flywheel pattern, to reduce GC load. Just for this doc, to prevent leaks.\n     * \u003cp /\u003e\n     * Simplistic, and on hash collisions just falls back to creating a new string, vs a full HashMap with Entry list.\n     * That saves both having to create objects as hash keys, and running through the entry list, at the expense of\n     * some more duplicates.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.rangeEquals(char[], int, int, java.lang.String)",
      "begin_line": 458,
      "end_line": 469,
      "comment": "\n     * Check if the value of the provided range equals the string.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.rangeEquals(int, int, java.lang.String)",
      "begin_line": 472,
      "end_line": 474,
      "comment": " just used for testing"
    }
  ]
}