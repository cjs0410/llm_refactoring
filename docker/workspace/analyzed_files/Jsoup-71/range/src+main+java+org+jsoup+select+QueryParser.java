{
  "filepath": "/tmp/Jsoup-71f/src/main/java/org/jsoup/select/QueryParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QueryParser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 17,
      "end_line": 380,
      "comment": "\n * Parses a CSS selector into an Evaluator tree.\n "
    },
    {
      "type": "field",
      "varNames": [
        "combinators"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AttributeEvals"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tq"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "query"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "evals"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.QueryParser.QueryParser(java.lang.String)",
      "begin_line": 29,
      "end_line": 32,
      "comment": "\n     * Create a new QueryParser.\n     * @param query CSS query\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.parse(java.lang.String)",
      "begin_line": 39,
      "end_line": 46,
      "comment": "\n     * Parse a CSS query into an Evaluator.\n     * @param query CSS query\n     * @return Evaluator\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.parse()",
      "begin_line": 52,
      "end_line": 79,
      "comment": "\n     * Parse the query\n     * @return Evaluator\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.combinator(char)",
      "begin_line": 81,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.consumeSubQuery()",
      "begin_line": 133,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.findElements()",
      "begin_line": 148,
      "end_line": 208,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byId()",
      "begin_line": 210,
      "end_line": 214,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byClass()",
      "begin_line": 216,
      "end_line": 220,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byTag()",
      "begin_line": 222,
      "end_line": 237,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byAttribute()",
      "begin_line": 239,
      "end_line": 271,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.allElements()",
      "begin_line": 273,
      "end_line": 275,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.indexLessThan()",
      "begin_line": 278,
      "end_line": 280,
      "comment": " pseudo selectors :lt, :gt, :eq"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.indexGreaterThan()",
      "begin_line": 282,
      "end_line": 284,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.indexEquals()",
      "begin_line": 286,
      "end_line": 288,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NTH_AB"
      ],
      "begin_line": 291,
      "end_line": 291,
      "comment": "pseudo selectors :first-child, :last-child, :nth-child, ..."
    },
    {
      "type": "field",
      "varNames": [
        "NTH_B"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.cssNthChild(boolean, boolean)",
      "begin_line": 294,
      "end_line": 325,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.consumeIndex()",
      "begin_line": 327,
      "end_line": 331,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.has()",
      "begin_line": 334,
      "end_line": 339,
      "comment": " pseudo selector :has(el)"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.contains(boolean)",
      "begin_line": 342,
      "end_line": 350,
      "comment": " pseudo selector :contains(text), containsOwn(text)"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.containsData()",
      "begin_line": 353,
      "end_line": 358,
      "comment": " pseudo selector :containsData(data)"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.matches(boolean)",
      "begin_line": 361,
      "end_line": 370,
      "comment": " :matches(regex), matchesOwn(regex)"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.not()",
      "begin_line": 373,
      "end_line": 379,
      "comment": " :not(selector)"
    }
  ]
}