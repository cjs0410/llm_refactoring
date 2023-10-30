{
  "filepath": "/tmp/Jsoup-21f/src/main/java/org/jsoup/select/QueryParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QueryParser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 14,
      "end_line": 277,
      "comment": "\n * Parses a CSS selector into an Evaluator tree.\n "
    },
    {
      "type": "field",
      "varNames": [
        "combinators"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tq"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "query"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "evals"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.QueryParser.QueryParser(java.lang.String)",
      "begin_line": 25,
      "end_line": 28,
      "comment": "\n     * Create a new QueryParser.\n     * @param query CSS query\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.parse(java.lang.String)",
      "begin_line": 35,
      "end_line": 38,
      "comment": "\n     * Parse a CSS query into an Evaluator.\n     * @param query CSS query\n     * @return Evaluator\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.parse()",
      "begin_line": 44,
      "end_line": 71,
      "comment": "\n     * Parse the query\n     * @return Evaluator\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.combinator(char)",
      "begin_line": 73,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.consumeSubQuery()",
      "begin_line": 109,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.findElements()",
      "begin_line": 124,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byId()",
      "begin_line": 158,
      "end_line": 162,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byClass()",
      "begin_line": 164,
      "end_line": 168,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byTag()",
      "begin_line": 170,
      "end_line": 179,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byAttribute()",
      "begin_line": 181,
      "end_line": 213,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.allElements()",
      "begin_line": 215,
      "end_line": 217,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.indexLessThan()",
      "begin_line": 220,
      "end_line": 222,
      "comment": " pseudo selectors :lt, :gt, :eq"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.indexGreaterThan()",
      "begin_line": 224,
      "end_line": 226,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.indexEquals()",
      "begin_line": 228,
      "end_line": 230,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.consumeIndex()",
      "begin_line": 232,
      "end_line": 236,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.has()",
      "begin_line": 239,
      "end_line": 244,
      "comment": " pseudo selector :has(el)"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.contains(boolean)",
      "begin_line": 247,
      "end_line": 255,
      "comment": " pseudo selector :contains(text), containsOwn(text)"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.matches(boolean)",
      "begin_line": 258,
      "end_line": 267,
      "comment": " :matches(regex), matchesOwn(regex)"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.not()",
      "begin_line": 270,
      "end_line": 276,
      "comment": " :not(selector)"
    }
  ]
}