{
  "filepath": "/tmp/Jsoup-28f/src/main/java/org/jsoup/parser/Tokeniser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Tokeniser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 12,
      "end_line": 244,
      "comment": "\n * Readers the input stream into tokens.\n "
    },
    {
      "type": "field",
      "varNames": [
        "replacementChar"
      ],
      "begin_line": 13,
      "end_line": 13,
      "comment": " replaces null character"
    },
    {
      "type": "field",
      "varNames": [
        "reader"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": " html input"
    },
    {
      "type": "field",
      "varNames": [
        "errors"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": " errors found while tokenising"
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": " current tokenisation state"
    },
    {
      "type": "field",
      "varNames": [
        "emitPending"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": " the token we are about to emit on next read"
    },
    {
      "type": "field",
      "varNames": [
        "isEmitPending"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charBuffer"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": " buffers characters to output as one token"
    },
    {
      "type": "field",
      "varNames": [
        "dataBuffer"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": " buffers data looking for \u003c/script\u003e"
    },
    {
      "type": "field",
      "varNames": [
        "tagPending"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": " tag we are building up"
    },
    {
      "type": "field",
      "varNames": [
        "doctypePending"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": " doctype building up"
    },
    {
      "type": "field",
      "varNames": [
        "commentPending"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": " comment building up"
    },
    {
      "type": "field",
      "varNames": [
        "lastStartTag"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": " the last start tag emitted, to test appropriate end tag"
    },
    {
      "type": "field",
      "varNames": [
        "selfClosingFlagAcknowledged"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Tokeniser.Tokeniser(org.jsoup.parser.CharacterReader, org.jsoup.parser.ParseErrorList)",
      "begin_line": 30,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.read()",
      "begin_line": 35,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emit(org.jsoup.parser.Token)",
      "begin_line": 55,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emit(java.lang.String)",
      "begin_line": 73,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emit(char)",
      "begin_line": 79,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.getState()",
      "begin_line": 83,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.transition(org.jsoup.parser.TokeniserState)",
      "begin_line": 87,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.advanceTransition(org.jsoup.parser.TokeniserState)",
      "begin_line": 91,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.acknowledgeSelfClosingFlag()",
      "begin_line": 96,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.consumeCharacterReference(java.lang.Character, boolean)",
      "begin_line": 100,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.createTagPending(boolean)",
      "begin_line": 157,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emitTagPending()",
      "begin_line": 162,
      "end_line": 165,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.createCommentPending()",
      "begin_line": 167,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emitCommentPending()",
      "begin_line": 171,
      "end_line": 173,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.createDoctypePending()",
      "begin_line": 175,
      "end_line": 177,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emitDoctypePending()",
      "begin_line": 179,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.createTempBuffer()",
      "begin_line": 183,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.isAppropriateEndTagToken()",
      "begin_line": 187,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.appropriateEndTagName()",
      "begin_line": 193,
      "end_line": 195,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.error(org.jsoup.parser.TokeniserState)",
      "begin_line": 197,
      "end_line": 200,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.eofError(org.jsoup.parser.TokeniserState)",
      "begin_line": 202,
      "end_line": 205,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.characterReferenceError(java.lang.String)",
      "begin_line": 207,
      "end_line": 210,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.error(java.lang.String)",
      "begin_line": 212,
      "end_line": 215,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.currentNodeInHtmlNS()",
      "begin_line": 217,
      "end_line": 222,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.unescapeEntities(boolean)",
      "begin_line": 229,
      "end_line": 243,
      "comment": "\n     * Utility method to consume reader and unescape entities found within.\n     * @param inAttribute\n     * @return unescaped string from reader\n     "
    }
  ]
}