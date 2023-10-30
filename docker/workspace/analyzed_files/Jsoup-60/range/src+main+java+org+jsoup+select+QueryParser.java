{
  "filepath": "/tmp/Jsoup-60f/src/main/java/org/jsoup/select/QueryParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QueryParser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 15,
      "end_line": 376,
      "comment": "\n * Parses a CSS selector into an Evaluator tree.\n "
    },
    {
      "type": "field",
      "varNames": [
        "combinators"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AttributeEvals"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tq"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "query"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "evals"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.QueryParser.QueryParser(java.lang.String)",
      "begin_line": 27,
      "end_line": 30,
      "comment": "\n     * Create a new QueryParser.\n     * @param query CSS query\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.parse(java.lang.String)",
      "begin_line": 37,
      "end_line": 44,
      "comment": "\n     * Parse a CSS query into an Evaluator.\n     * @param query CSS query\n     * @return Evaluator\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.parse()",
      "begin_line": 50,
      "end_line": 77,
      "comment": "\n     * Parse the query\n     * @return Evaluator\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.combinator(char)",
      "begin_line": 79,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.consumeSubQuery()",
      "begin_line": 131,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.findElements()",
      "begin_line": 146,
      "end_line": 204,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byId()",
      "begin_line": 206,
      "end_line": 210,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byClass()",
      "begin_line": 212,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byTag()",
      "begin_line": 218,
      "end_line": 233,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byAttribute()",
      "begin_line": 235,
      "end_line": 267,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.allElements()",
      "begin_line": 269,
      "end_line": 271,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.indexLessThan()",
      "begin_line": 274,
      "end_line": 276,
      "comment": " pseudo selectors :lt, :gt, :eq"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.indexGreaterThan()",
      "begin_line": 278,
      "end_line": 280,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.indexEquals()",
      "begin_line": 282,
      "end_line": 284,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NTH_AB"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": "pseudo selectors :first-child, :last-child, :nth-child, ..."
    },
    {
      "type": "field",
      "varNames": [
        "NTH_B"
      ],
      "begin_line": 288,
      "end_line": 288,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.cssNthChild(boolean, boolean)",
      "begin_line": 290,
      "end_line": 321,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.consumeIndex()",
      "begin_line": 323,
      "end_line": 327,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.has()",
      "begin_line": 330,
      "end_line": 335,
      "comment": " pseudo selector :has(el)"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.contains(boolean)",
      "begin_line": 338,
      "end_line": 346,
      "comment": " pseudo selector :contains(text), containsOwn(text)"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.containsData()",
      "begin_line": 349,
      "end_line": 354,
      "comment": " pseudo selector :containsData(data)"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.matches(boolean)",
      "begin_line": 357,
      "end_line": 366,
      "comment": " :matches(regex), matchesOwn(regex)"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.not()",
      "begin_line": 369,
      "end_line": 375,
      "comment": " :not(selector)"
    }
  ]
}