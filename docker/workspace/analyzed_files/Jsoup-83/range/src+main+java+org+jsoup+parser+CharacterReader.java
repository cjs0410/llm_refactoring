{
  "filepath": "/tmp/Jsoup-83f/src/main/java/org/jsoup/parser/CharacterReader.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharacterReader",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 15,
      "end_line": 484,
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
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.pos()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Gets the current cursor position in the content.\n     * @return current position\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.isEmpty()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n     * Tests if all the content has been read.\n     * @return true if nothing left to read.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.isEmptyNoBufferUp()",
      "begin_line": 84,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.current()",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\n     * Get the char at the current position.\n     * @return char\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consume()",
      "begin_line": 97,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.unconsume()",
      "begin_line": 104,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.advance()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Moves the current position by one.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.mark()",
      "begin_line": 115,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.rewindToMark()",
      "begin_line": 119,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.nextIndexOf(char)",
      "begin_line": 128,
      "end_line": 136,
      "comment": "\n     * Returns the number of characters between the current position and the next instance of the input char\n     * @param c scan target\n     * @return offset between current position and next instance of target. -1 if not found.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.nextIndexOf(java.lang.CharSequence)",
      "begin_line": 144,
      "end_line": 161,
      "comment": "\n     * Returns the number of characters between the current position and the next instance of the input sequence\n     *\n     * @param seq scan target\n     * @return offset between current position and next instance of target. -1 if not found.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeTo(char)",
      "begin_line": 168,
      "end_line": 177,
      "comment": "\n     * Reads characters up to the specific char.\n     * @param c the delimiter\n     * @return the chars read\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeTo(java.lang.String)",
      "begin_line": 179,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeToAny(char...)",
      "begin_line": 195,
      "end_line": 210,
      "comment": "\n     * Read characters until the first of any delimiters is found.\n     * @param chars delimiters to scan for\n     * @return characters read up to the matched delimiter.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeToAnySorted(char...)",
      "begin_line": 212,
      "end_line": 225,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeData()",
      "begin_line": 227,
      "end_line": 242,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeTagName()",
      "begin_line": 244,
      "end_line": 260,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeToEnd()",
      "begin_line": 262,
      "end_line": 267,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeLetterSequence()",
      "begin_line": 269,
      "end_line": 281,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence()",
      "begin_line": 283,
      "end_line": 302,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeHexSequence()",
      "begin_line": 304,
      "end_line": 315,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.consumeDigitSequence()",
      "begin_line": 317,
      "end_line": 328,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matches(char)",
      "begin_line": 330,
      "end_line": 333,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matches(java.lang.String)",
      "begin_line": 335,
      "end_line": 345,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesIgnoreCase(java.lang.String)",
      "begin_line": 347,
      "end_line": 360,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesAny(char...)",
      "begin_line": 362,
      "end_line": 373,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesAnySorted(char[])",
      "begin_line": 375,
      "end_line": 378,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesLetter()",
      "begin_line": 380,
      "end_line": 385,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchesDigit()",
      "begin_line": 387,
      "end_line": 392,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchConsume(java.lang.String)",
      "begin_line": 394,
      "end_line": 402,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.matchConsumeIgnoreCase(java.lang.String)",
      "begin_line": 404,
      "end_line": 411,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.containsIgnoreCase(java.lang.String)",
      "begin_line": 413,
      "end_line": 418,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.toString()",
      "begin_line": 420,
      "end_line": 423,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.cacheString(char[], java.lang.String[], int, int)",
      "begin_line": 432,
      "end_line": 462,
      "comment": "\n     * Caches short strings, as a flywheel pattern, to reduce GC load. Just for this doc, to prevent leaks.\n     * \u003cp /\u003e\n     * Simplistic, and on hash collisions just falls back to creating a new string, vs a full HashMap with Entry list.\n     * That saves both having to create objects as hash keys, and running through the entry list, at the expense of\n     * some more duplicates.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.rangeEquals(char[], int, int, java.lang.String)",
      "begin_line": 467,
      "end_line": 478,
      "comment": "\n     * Check if the value of the provided range equals the string.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.CharacterReader.rangeEquals(int, int, java.lang.String)",
      "begin_line": 481,
      "end_line": 483,
      "comment": " just used for testing"
    }
  ]
}