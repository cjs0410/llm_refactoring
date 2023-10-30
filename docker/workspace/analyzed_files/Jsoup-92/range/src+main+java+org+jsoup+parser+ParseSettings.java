{
  "filepath": "/tmp/Jsoup-92f/src/main/java/org/jsoup/parser/ParseSettings.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParseSettings",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 10,
      "end_line": 78,
      "comment": "\n * Controls parser settings, to optionally preserve tag and/or attribute name case.\n "
    },
    {
      "type": "field",
      "varNames": [
        "htmlDefault"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": "\n     * HTML default settings: both tag and attribute names are lower-cased during parsing.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "preserveCase"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": "\n     * Preserve both tag and attribute case.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "preserveTagCase"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preserveAttributeCase"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.ParseSettings.preserveTagCase()",
      "begin_line": 31,
      "end_line": 33,
      "comment": "\n     * Returns true if preserving tag name case.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.ParseSettings.preserveAttributeCase()",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Returns true if preserving attribute case.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.ParseSettings.ParseSettings(boolean, boolean)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Define parse settings.\n     * @param tag preserve tag case?\n     * @param attribute preserve attribute name case?\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.ParseSettings.normalizeTag(java.lang.String)",
      "begin_line": 55,
      "end_line": 60,
      "comment": "\n     * Normalizes a tag name according to the case preservation setting.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.ParseSettings.normalizeAttribute(java.lang.String)",
      "begin_line": 65,
      "end_line": 70,
      "comment": "\n     * Normalizes an attribute according to the case preservation setting.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.ParseSettings.normalizeAttributes(org.jsoup.nodes.Attributes)",
      "begin_line": 72,
      "end_line": 77,
      "comment": ""
    }
  ]
}