{
  "filepath": "/tmp/Jsoup-63f/src/main/java/org/jsoup/parser/Tokeniser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Tokeniser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 11,
      "end_line": 279,
      "comment": "\n * Readers the input stream into tokens.\n "
    },
    {
      "type": "field",
      "varNames": [
        "replacementChar"
      ],
      "begin_line": 12,
      "end_line": 12,
      "comment": " replaces null character"
    },
    {
      "type": "field",
      "varNames": [
        "notCharRefCharsSorted"
      ],
      "begin_line": 13,
      "end_line": 13,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reader"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": " html input"
    },
    {
      "type": "field",
      "varNames": [
        "errors"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": " errors found while tokenising"
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": " current tokenisation state"
    },
    {
      "type": "field",
      "varNames": [
        "emitPending"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": " the token we are about to emit on next read"
    },
    {
      "type": "field",
      "varNames": [
        "isEmitPending"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charsString"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": " characters pending an emit. Will fall to charsBuilder if more than one"
    },
    {
      "type": "field",
      "varNames": [
        "charsBuilder"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": " buffers characters to output as one token, if more than one emit per read"
    },
    {
      "type": "field",
      "varNames": [
        "dataBuffer"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": " buffers data looking for \u003c/script\u003e"
    },
    {
      "type": "field",
      "varNames": [
        "tagPending"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " tag we are building up"
    },
    {
      "type": "field",
      "varNames": [
        "startPending"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "endPending"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charPending"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "doctypePending"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " doctype building up"
    },
    {
      "type": "field",
      "varNames": [
        "commentPending"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " comment building up"
    },
    {
      "type": "field",
      "varNames": [
        "lastStartTag"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " the last start tag emitted, to test appropriate end tag"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Tokeniser.Tokeniser(org.jsoup.parser.CharacterReader, org.jsoup.parser.ParseErrorList)",
      "begin_line": 37,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.read()",
      "begin_line": 42,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emit(org.jsoup.parser.Token)",
      "begin_line": 62,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emit(java.lang.String)",
      "begin_line": 78,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emit(char[])",
      "begin_line": 92,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emit(int[])",
      "begin_line": 96,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emit(char)",
      "begin_line": 100,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.getState()",
      "begin_line": 104,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.transition(org.jsoup.parser.TokeniserState)",
      "begin_line": 108,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.advanceTransition(org.jsoup.parser.TokeniserState)",
      "begin_line": 112,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codepointHolder"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " holder to not have to keep creating arrays"
    },
    {
      "type": "field",
      "varNames": [
        "multipointHolder"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.consumeCharacterReference(java.lang.Character, boolean)",
      "begin_line": 119,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.createTagPending(boolean)",
      "begin_line": 188,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emitTagPending()",
      "begin_line": 193,
      "end_line": 196,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.createCommentPending()",
      "begin_line": 198,
      "end_line": 200,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emitCommentPending()",
      "begin_line": 202,
      "end_line": 204,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.createDoctypePending()",
      "begin_line": 206,
      "end_line": 208,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emitDoctypePending()",
      "begin_line": 210,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.createTempBuffer()",
      "begin_line": 214,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.isAppropriateEndTagToken()",
      "begin_line": 218,
      "end_line": 220,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.appropriateEndTagName()",
      "begin_line": 222,
      "end_line": 226,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.error(org.jsoup.parser.TokeniserState)",
      "begin_line": 228,
      "end_line": 231,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.eofError(org.jsoup.parser.TokeniserState)",
      "begin_line": 233,
      "end_line": 236,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.characterReferenceError(java.lang.String)",
      "begin_line": 238,
      "end_line": 241,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.error(java.lang.String)",
      "begin_line": 243,
      "end_line": 246,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.currentNodeInHtmlNS()",
      "begin_line": 248,
      "end_line": 253,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.unescapeEntities(boolean)",
      "begin_line": 260,
      "end_line": 278,
      "comment": "\n     * Utility method to consume reader and unescape entities found within.\n     * @param inAttribute\n     * @return unescaped string from reader\n     "
    }
  ]
}