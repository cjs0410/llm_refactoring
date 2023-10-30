{
  "filepath": "/tmp/Jsoup-14f/src/main/java/org/jsoup/parser/Tokeniser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Tokeniser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 12,
      "end_line": 235,
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
        "trackErrors"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "errors"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": " errors found while tokenising"
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": " current tokenisation state"
    },
    {
      "type": "field",
      "varNames": [
        "emitPending"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": " the token we are about to emit on next read"
    },
    {
      "type": "field",
      "varNames": [
        "isEmitPending"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charBuffer"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": " buffers characters to output as one token"
    },
    {
      "type": "field",
      "varNames": [
        "dataBuffer"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": " buffers data looking for \u003c/script\u003e"
    },
    {
      "type": "field",
      "varNames": [
        "tagPending"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": " tag we are building up"
    },
    {
      "type": "field",
      "varNames": [
        "doctypePending"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": " doctype building up"
    },
    {
      "type": "field",
      "varNames": [
        "commentPending"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": " comment building up"
    },
    {
      "type": "field",
      "varNames": [
        "lastStartTag"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " the last start tag emitted, to test appropriate end tag"
    },
    {
      "type": "field",
      "varNames": [
        "selfClosingFlagAcknowledged"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Tokeniser.Tokeniser(org.jsoup.parser.CharacterReader)",
      "begin_line": 31,
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
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.createTagPending(boolean)",
      "begin_line": 163,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emitTagPending()",
      "begin_line": 168,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.createCommentPending()",
      "begin_line": 173,
      "end_line": 175,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emitCommentPending()",
      "begin_line": 177,
      "end_line": 179,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.createDoctypePending()",
      "begin_line": 181,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.emitDoctypePending()",
      "begin_line": 185,
      "end_line": 187,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.createTempBuffer()",
      "begin_line": 189,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.isAppropriateEndTagToken()",
      "begin_line": 193,
      "end_line": 195,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.appropriateEndTagName()",
      "begin_line": 197,
      "end_line": 199,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.isTrackErrors()",
      "begin_line": 201,
      "end_line": 203,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.setTrackErrors(boolean)",
      "begin_line": 205,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.error(org.jsoup.parser.TokeniserState)",
      "begin_line": 209,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.eofError(org.jsoup.parser.TokeniserState)",
      "begin_line": 214,
      "end_line": 217,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.characterReferenceError()",
      "begin_line": 219,
      "end_line": 222,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.error(java.lang.String)",
      "begin_line": 224,
      "end_line": 227,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Tokeniser.currentNodeInHtmlNS()",
      "begin_line": 229,
      "end_line": 234,
      "comment": ""
    }
  ]
}