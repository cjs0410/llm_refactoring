{
  "filepath": "/tmp/Jsoup-47f/src/main/java/org/jsoup/nodes/Entities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Entities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 16,
      "end_line": 266,
      "comment": "\n * HTML entities, and escape routines.\n * Source: \u003ca href\u003d\"http://www.w3.org/TR/html5/named-character-references.html#named-character-references\"\u003eW3C HTML\n * named character references\u003c/a\u003e.\n "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Entities.EscapeMode.EscapeMode(java.util.Map\u003cjava.lang.Character, java.lang.String\u003e)",
      "begin_line": 27,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.EscapeMode.getMap()",
      "begin_line": 31,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "full"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "xhtmlByVal"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseByVal"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fullByVal"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Entities.Entities()",
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.isNamedEntity(java.lang.String)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Check if the input is a known named entity\n     * @param name the possible entity name (e.g. \"lt\" or \"amp\")\n     * @return true if a known named entity\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.isBaseNamedEntity(java.lang.String)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Check if the input is a known named entity in the base entity set.\n     * @param name the possible entity name (e.g. \"lt\" or \"amp\")\n     * @return true if a known named entity in the base set\n     * @see #isNamedEntity(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.getCharacterByName(java.lang.String)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Get the Character value of the named entity\n     * @param name named entity (e.g. \"lt\" or \"amp\")\n     * @return the Character value of the named entity (e.g. \u0027{@literal \u003c}\u0027 or \u0027{@literal \u0026}\u0027)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.escape(java.lang.String, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 72,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.escape(java.lang.StringBuilder, java.lang.String, org.jsoup.nodes.Document.OutputSettings, boolean, boolean, boolean)",
      "begin_line": 79,
      "end_line": 155,
      "comment": " this method is ugly, and does a lot. but other breakups cause rescanning and stringbuilder generations"
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.unescape(java.lang.String)",
      "begin_line": 157,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.unescape(java.lang.String, boolean)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Unescape the input string.\n     * @param string to un-HTML-escape\n     * @param strict if \"strict\" (that is, requires trailing \u0027;\u0027 char, otherwise that\u0027s optional)\n     * @return unescaped string\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.canEncode(org.jsoup.nodes.Entities.CoreCharset, char, java.nio.charset.CharsetEncoder)",
      "begin_line": 185,
      "end_line": 195,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.CoreCharset.byName(java.lang.String)",
      "begin_line": 200,
      "end_line": 206,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "xhtmlArray"
      ],
      "begin_line": 211,
      "end_line": 216,
      "comment": " xhtml has restricted entities"
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.loadEntities(java.lang.String)",
      "begin_line": 231,
      "end_line": 248,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.toCharacterKey(java.util.Map\u003cjava.lang.String, java.lang.Character\u003e)",
      "begin_line": 250,
      "end_line": 265,
      "comment": ""
    }
  ]
}