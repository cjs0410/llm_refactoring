{
  "filepath": "/tmp/Jsoup-21f/src/main/java/org/jsoup/select/CombiningEvaluator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CombiningEvaluator",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 14,
      "end_line": 86,
      "comment": "\n * Base combining (and, or) evaluator.\n "
    },
    {
      "type": "field",
      "varNames": [
        "evaluators"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.CombiningEvaluator.CombiningEvaluator()",
      "begin_line": 17,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.CombiningEvaluator.CombiningEvaluator(java.util.Collection\u003corg.jsoup.select.Evaluator\u003e)",
      "begin_line": 22,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "And",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.CombiningEvaluator"
      ],
      "begin_line": 27,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.CombiningEvaluator.And.And(java.util.Collection\u003corg.jsoup.select.Evaluator\u003e)",
      "begin_line": 28,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.CombiningEvaluator.And.And(org.jsoup.select.Evaluator...)",
      "begin_line": 32,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.And.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 36,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.And.toString()",
      "begin_line": 45,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Or",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.CombiningEvaluator"
      ],
      "begin_line": 51,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.CombiningEvaluator.Or.Or(java.util.Collection\u003corg.jsoup.select.Evaluator\u003e)",
      "begin_line": 56,
      "end_line": 62,
      "comment": "\n         * Create a new Or evaluator. The initial evaluators are ANDed together and used as the first clause of the OR.\n         * @param evaluators initial OR clause (these are wrapped into an AND evaluator).\n         "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.CombiningEvaluator.Or.Or()",
      "begin_line": 64,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.Or.add(org.jsoup.select.Evaluator)",
      "begin_line": 68,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.Or.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 72,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.Or.toString()",
      "begin_line": 81,
      "end_line": 84,
      "comment": ""
    }
  ]
}