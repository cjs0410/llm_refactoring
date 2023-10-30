{
  "filepath": "/tmp/Jsoup-9f/src/main/java/org/jsoup/nodes/Entities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Entities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 14,
      "end_line": 2274,
      "comment": "\n * HTML entities, and escape routines.\n * Source: \u003ca href\u003d\"http://www.w3.org/TR/html5/named-character-references.html#named-character-references\"\u003eW3C HTML\n * named character references\u003c/a\u003e.\n "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Entities.EscapeMode.EscapeMode(java.util.Map\u003cjava.lang.Character, java.lang.String\u003e)",
      "begin_line": 25,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.EscapeMode.getMap()",
      "begin_line": 29,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "full"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "xhtmlByVal"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseByVal"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fullByVal"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unescapePattern"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.escape(java.lang.String, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 40,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.escape(java.lang.String, java.nio.charset.CharsetEncoder, org.jsoup.nodes.Entities.EscapeMode)",
      "begin_line": 44,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.unescape(java.lang.String)",
      "begin_line": 61,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "xhtmlArray"
      ],
      "begin_line": 96,
      "end_line": 102,
      "comment": " xhtml has restricted entities"
    },
    {
      "type": "field",
      "varNames": [
        "baseArray"
      ],
      "begin_line": 106,
      "end_line": 213,
      "comment": " e.g. \u0026amp"
    },
    {
      "type": "field",
      "varNames": [
        "fullArray"
      ],
      "begin_line": 217,
      "end_line": 2250,
      "comment": " are people really likely to remember \"\u0026CounterClockwiseContourIntegral;\"? good grief."
    }
  ]
}