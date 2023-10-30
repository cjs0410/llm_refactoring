{
  "filepath": "/tmp/Jsoup-28f/src/main/java/org/jsoup/nodes/Entities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Entities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 17,
      "end_line": 167,
      "comment": "\n * HTML entities, and escape routines.\n * Source: \u003ca href\u003d\"http://www.w3.org/TR/html5/named-character-references.html#named-character-references\"\u003eW3C HTML\n * named character references\u003c/a\u003e.\n "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Entities.EscapeMode.EscapeMode(java.util.Map\u003cjava.lang.Character, java.lang.String\u003e)",
      "begin_line": 28,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.EscapeMode.getMap()",
      "begin_line": 32,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "full"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "xhtmlByVal"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseByVal"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fullByVal"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unescapePattern"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "strictUnescapePattern"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Entities.Entities()",
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.isNamedEntity(java.lang.String)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Check if the input is a known named entity\n     * @param name the possible entity name (e.g. \"lt\" or \"amp\")\n     * @return true if a known named entity\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.isBaseNamedEntity(java.lang.String)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Check if the input is a known named entity in the base entity set.\n     * @param name the possible entity name (e.g. \"lt\" or \"amp\")\n     * @return true if a known named entity in the base set\n     * @see #isNamedEntity(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.getCharacterByName(java.lang.String)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Get the Character value of the named entity\n     * @param name named entity (e.g. \"lt\" or \"amp\")\n     * @return the Character value of the named entity (e.g. \u0027\u003c\u0027 or \u0027\u0026\u0027)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.escape(java.lang.String, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 75,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.escape(java.lang.String, java.nio.charset.CharsetEncoder, org.jsoup.nodes.Entities.EscapeMode)",
      "begin_line": 79,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.unescape(java.lang.String)",
      "begin_line": 96,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.unescape(java.lang.String, boolean)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Unescape the input string.\n     * @param string\n     * @param strict if \"strict\" (that is, requires trailing \u0027;\u0027 char, otherwise that\u0027s optional)\n     * @return\n     "
    },
    {
      "type": "field",
      "varNames": [
        "xhtmlArray"
      ],
      "begin_line": 111,
      "end_line": 117,
      "comment": " xhtml has restricted entities"
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.loadEntities(java.lang.String)",
      "begin_line": 132,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.toCharacterKey(java.util.Map\u003cjava.lang.String, java.lang.Character\u003e)",
      "begin_line": 151,
      "end_line": 166,
      "comment": ""
    }
  ]
}