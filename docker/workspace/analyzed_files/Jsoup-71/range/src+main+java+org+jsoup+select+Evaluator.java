{
  "filepath": "/tmp/Jsoup-71f/src/main/java/org/jsoup/select/Evaluator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Evaluator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 778,
      "comment": "\n * Evaluates that an element matches the selector.\n "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.Evaluator()",
      "begin_line": 25,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Test if the element meets the evaluator\u0027s requirements.\n     *\n     * @param root    Root of the matching subtree\n     * @param element tested element\n     * @return Returns \u003ctt\u003etrue\u003c/tt\u003e if the requirements are met or\n     * \u003ctt\u003efalse\u003c/tt\u003e otherwise\n     "
    },
    {
      "type": "class_interface",
      "name": "Tag",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 41,
      "end_line": 57,
      "comment": "\n     * Evaluator for tag name\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tagName"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.Tag.Tag(java.lang.String)",
      "begin_line": 44,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Tag.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 48,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Tag.toString()",
      "begin_line": 53,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "TagEndsWith",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 63,
      "end_line": 79,
      "comment": "\n     * Evaluator for tag name that ends with\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tagName"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.TagEndsWith.TagEndsWith(java.lang.String)",
      "begin_line": 66,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.TagEndsWith.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 70,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.TagEndsWith.toString()",
      "begin_line": 75,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Id",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 84,
      "end_line": 101,
      "comment": "\n     * Evaluator for element id\n     "
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.Id.Id(java.lang.String)",
      "begin_line": 87,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Id.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 91,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Id.toString()",
      "begin_line": 96,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Class",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 106,
      "end_line": 123,
      "comment": "\n     * Evaluator for element class\n     "
    },
    {
      "type": "field",
      "varNames": [
        "className"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.Class.Class(java.lang.String)",
      "begin_line": 109,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Class.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 113,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Class.toString()",
      "begin_line": 118,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Attribute",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 128,
      "end_line": 145,
      "comment": "\n     * Evaluator for attribute name matching\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.Attribute.Attribute(java.lang.String)",
      "begin_line": 131,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Attribute.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 135,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Attribute.toString()",
      "begin_line": 140,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "AttributeStarting",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 150,
      "end_line": 173,
      "comment": "\n     * Evaluator for attribute name prefix matching\n     "
    },
    {
      "type": "field",
      "varNames": [
        "keyPrefix"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeStarting.AttributeStarting(java.lang.String)",
      "begin_line": 153,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeStarting.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 158,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeStarting.toString()",
      "begin_line": 168,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValue",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.AttributeKeyPair"
      ],
      "begin_line": 178,
      "end_line": 193,
      "comment": "\n     * Evaluator for attribute name/value matching\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValue.AttributeWithValue(java.lang.String, java.lang.String)",
      "begin_line": 179,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValue.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 183,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValue.toString()",
      "begin_line": 188,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValueNot",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.AttributeKeyPair"
      ],
      "begin_line": 198,
      "end_line": 213,
      "comment": "\n     * Evaluator for attribute name !\u003d value matching\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueNot.AttributeWithValueNot(java.lang.String, java.lang.String)",
      "begin_line": 199,
      "end_line": 201,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueNot.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 203,
      "end_line": 206,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueNot.toString()",
      "begin_line": 208,
      "end_line": 211,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValueStarting",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.AttributeKeyPair"
      ],
      "begin_line": 218,
      "end_line": 233,
      "comment": "\n     * Evaluator for attribute name/value matching (value prefix)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueStarting.AttributeWithValueStarting(java.lang.String, java.lang.String)",
      "begin_line": 219,
      "end_line": 221,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueStarting.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 223,
      "end_line": 226,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueStarting.toString()",
      "begin_line": 228,
      "end_line": 231,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValueEnding",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.AttributeKeyPair"
      ],
      "begin_line": 238,
      "end_line": 253,
      "comment": "\n     * Evaluator for attribute name/value matching (value ending)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueEnding.AttributeWithValueEnding(java.lang.String, java.lang.String)",
      "begin_line": 239,
      "end_line": 241,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueEnding.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 243,
      "end_line": 246,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueEnding.toString()",
      "begin_line": 248,
      "end_line": 251,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValueContaining",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.AttributeKeyPair"
      ],
      "begin_line": 258,
      "end_line": 273,
      "comment": "\n     * Evaluator for attribute name/value matching (value containing)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueContaining.AttributeWithValueContaining(java.lang.String, java.lang.String)",
      "begin_line": 259,
      "end_line": 261,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueContaining.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 263,
      "end_line": 266,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueContaining.toString()",
      "begin_line": 268,
      "end_line": 271,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValueMatching",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 278,
      "end_line": 297,
      "comment": "\n     * Evaluator for attribute name/value matching (value regex matching)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 279,
      "end_line": 279,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 280,
      "end_line": 280,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueMatching.AttributeWithValueMatching(java.lang.String, java.util.regex.Pattern)",
      "begin_line": 282,
      "end_line": 285,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueMatching.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 287,
      "end_line": 290,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueMatching.toString()",
      "begin_line": 292,
      "end_line": 295,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "AttributeKeyPair",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 302,
      "end_line": 317,
      "comment": "\n     * Abstract evaluator for attribute name/value matching\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeKeyPair.AttributeKeyPair(java.lang.String, java.lang.String)",
      "begin_line": 306,
      "end_line": 316,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "AllElements",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 322,
      "end_line": 333,
      "comment": "\n     * Evaluator for any / all element matching\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AllElements.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 324,
      "end_line": 327,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AllElements.toString()",
      "begin_line": 329,
      "end_line": 332,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "IndexLessThan",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.IndexEvaluator"
      ],
      "begin_line": 338,
      "end_line": 353,
      "comment": "\n     * Evaluator for matching by sibling index number (e {@literal \u003c} idx)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IndexLessThan.IndexLessThan(int)",
      "begin_line": 339,
      "end_line": 341,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IndexLessThan.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 343,
      "end_line": 346,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IndexLessThan.toString()",
      "begin_line": 348,
      "end_line": 351,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "IndexGreaterThan",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.IndexEvaluator"
      ],
      "begin_line": 358,
      "end_line": 373,
      "comment": "\n     * Evaluator for matching by sibling index number (e {@literal \u003e} idx)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IndexGreaterThan.IndexGreaterThan(int)",
      "begin_line": 359,
      "end_line": 361,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IndexGreaterThan.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 363,
      "end_line": 366,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IndexGreaterThan.toString()",
      "begin_line": 368,
      "end_line": 371,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "IndexEquals",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.IndexEvaluator"
      ],
      "begin_line": 378,
      "end_line": 393,
      "comment": "\n     * Evaluator for matching by sibling index number (e \u003d idx)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IndexEquals.IndexEquals(int)",
      "begin_line": 379,
      "end_line": 381,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IndexEquals.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 383,
      "end_line": 386,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IndexEquals.toString()",
      "begin_line": 388,
      "end_line": 391,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "IsLastChild",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 398,
      "end_line": 409,
      "comment": "\n     * Evaluator for matching the last sibling (css :last-child)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsLastChild.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 399,
      "end_line": 403,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsLastChild.toString()",
      "begin_line": 405,
      "end_line": 408,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "IsFirstOfType",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.IsNthOfType"
      ],
      "begin_line": 411,
      "end_line": 419,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IsFirstOfType.IsFirstOfType()",
      "begin_line": 412,
      "end_line": 414,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsFirstOfType.toString()",
      "begin_line": 415,
      "end_line": 418,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "IsLastOfType",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.IsNthLastOfType"
      ],
      "begin_line": 421,
      "end_line": 429,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IsLastOfType.IsLastOfType()",
      "begin_line": 422,
      "end_line": 424,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsLastOfType.toString()",
      "begin_line": 425,
      "end_line": 428,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "CssNthEvaluator",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 432,
      "end_line": 465,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a",
        "b"
      ],
      "begin_line": 433,
      "end_line": 433,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.CssNthEvaluator.CssNthEvaluator(int, int)",
      "begin_line": 435,
      "end_line": 438,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.CssNthEvaluator.CssNthEvaluator(int)",
      "begin_line": 439,
      "end_line": 441,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.CssNthEvaluator.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 443,
      "end_line": 452,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.CssNthEvaluator.toString()",
      "begin_line": 454,
      "end_line": 461,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.CssNthEvaluator.getPseudoClass()",
      "begin_line": 463,
      "end_line": 463,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.CssNthEvaluator.calculatePosition(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 464,
      "end_line": 464,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "IsNthChild",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.CssNthEvaluator"
      ],
      "begin_line": 473,
      "end_line": 487,
      "comment": "\n     * css-compatible Evaluator for :eq (css :nth-child)\n     * \n     * @see IndexEquals\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IsNthChild.IsNthChild(int, int)",
      "begin_line": 475,
      "end_line": 477,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsNthChild.calculatePosition(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 479,
      "end_line": 481,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsNthChild.getPseudoClass()",
      "begin_line": 484,
      "end_line": 486,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "IsNthLastChild",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.CssNthEvaluator"
      ],
      "begin_line": 494,
      "end_line": 508,
      "comment": "\n     * css pseudo class :nth-last-child)\n     * \n     * @see IndexEquals\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IsNthLastChild.IsNthLastChild(int, int)",
      "begin_line": 495,
      "end_line": 497,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsNthLastChild.calculatePosition(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 499,
      "end_line": 502,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsNthLastChild.getPseudoClass()",
      "begin_line": 504,
      "end_line": 507,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "IsNthOfType",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.CssNthEvaluator"
      ],
      "begin_line": 514,
      "end_line": 533,
      "comment": "\n     * css pseudo class nth-of-type\n     * \n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IsNthOfType.IsNthOfType(int, int)",
      "begin_line": 515,
      "end_line": 517,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsNthOfType.calculatePosition(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 519,
      "end_line": 527,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsNthOfType.getPseudoClass()",
      "begin_line": 529,
      "end_line": 532,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "IsNthLastOfType",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.CssNthEvaluator"
      ],
      "begin_line": 535,
      "end_line": 555,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IsNthLastOfType.IsNthLastOfType(int, int)",
      "begin_line": 537,
      "end_line": 539,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsNthLastOfType.calculatePosition(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 541,
      "end_line": 549,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsNthLastOfType.getPseudoClass()",
      "begin_line": 551,
      "end_line": 554,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "IsFirstChild",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 560,
      "end_line": 571,
      "comment": "\n     * Evaluator for matching the first sibling (css :first-child)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsFirstChild.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 561,
      "end_line": 565,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsFirstChild.toString()",
      "begin_line": 567,
      "end_line": 570,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "IsRoot",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 578,
      "end_line": 588,
      "comment": "\n     * css3 pseudo-class :root\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/selectors/#root-pseudo\"\u003e:root selector\u003c/a\u003e\n     *\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsRoot.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 579,
      "end_line": 583,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsRoot.toString()",
      "begin_line": 584,
      "end_line": 587,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "IsOnlyChild",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 590,
      "end_line": 600,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsOnlyChild.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 591,
      "end_line": 595,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsOnlyChild.toString()",
      "begin_line": 596,
      "end_line": 599,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "IsOnlyOfType",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 602,
      "end_line": 619,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsOnlyOfType.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 603,
      "end_line": 614,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsOnlyOfType.toString()",
      "begin_line": 615,
      "end_line": 618,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "IsEmpty",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 621,
      "end_line": 634,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsEmpty.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 622,
      "end_line": 629,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsEmpty.toString()",
      "begin_line": 630,
      "end_line": 633,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "IndexEvaluator",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 641,
      "end_line": 647,
      "comment": "\n     * Abstract evaluator for sibling index matching\n     *\n     * @author ant\n     "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 642,
      "end_line": 642,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IndexEvaluator.IndexEvaluator(int)",
      "begin_line": 644,
      "end_line": 646,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ContainsText",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 652,
      "end_line": 668,
      "comment": "\n     * Evaluator for matching Element (and its descendants) text\n     "
    },
    {
      "type": "field",
      "varNames": [
        "searchText"
      ],
      "begin_line": 653,
      "end_line": 653,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.ContainsText.ContainsText(java.lang.String)",
      "begin_line": 655,
      "end_line": 657,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.ContainsText.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 659,
      "end_line": 662,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.ContainsText.toString()",
      "begin_line": 664,
      "end_line": 667,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ContainsData",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 673,
      "end_line": 689,
      "comment": "\n     * Evaluator for matching Element (and its descendants) data\n     "
    },
    {
      "type": "field",
      "varNames": [
        "searchText"
      ],
      "begin_line": 674,
      "end_line": 674,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.ContainsData.ContainsData(java.lang.String)",
      "begin_line": 676,
      "end_line": 678,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.ContainsData.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 680,
      "end_line": 683,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.ContainsData.toString()",
      "begin_line": 685,
      "end_line": 688,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ContainsOwnText",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 694,
      "end_line": 710,
      "comment": "\n     * Evaluator for matching Element\u0027s own text\n     "
    },
    {
      "type": "field",
      "varNames": [
        "searchText"
      ],
      "begin_line": 695,
      "end_line": 695,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.ContainsOwnText.ContainsOwnText(java.lang.String)",
      "begin_line": 697,
      "end_line": 699,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.ContainsOwnText.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 701,
      "end_line": 704,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.ContainsOwnText.toString()",
      "begin_line": 706,
      "end_line": 709,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Matches",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 715,
      "end_line": 732,
      "comment": "\n     * Evaluator for matching Element (and its descendants) text with regex\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 716,
      "end_line": 716,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.Matches.Matches(java.util.regex.Pattern)",
      "begin_line": 718,
      "end_line": 720,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Matches.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 722,
      "end_line": 726,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Matches.toString()",
      "begin_line": 728,
      "end_line": 731,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "MatchesOwn",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 737,
      "end_line": 754,
      "comment": "\n     * Evaluator for matching Element\u0027s own text with regex\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 738,
      "end_line": 738,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.MatchesOwn.MatchesOwn(java.util.regex.Pattern)",
      "begin_line": 740,
      "end_line": 742,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.MatchesOwn.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 744,
      "end_line": 748,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.MatchesOwn.toString()",
      "begin_line": 750,
      "end_line": 753,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "MatchText",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 756,
      "end_line": 777,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.MatchText.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 758,
      "end_line": 771,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.MatchText.toString()",
      "begin_line": 773,
      "end_line": 776,
      "comment": ""
    }
  ]
}