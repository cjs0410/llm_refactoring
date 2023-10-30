{
  "filepath": "/tmp/Jsoup-30f/src/main/java/org/jsoup/safety/Cleaner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Cleaner",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 23,
      "end_line": 148,
      "comment": "\n The whitelist based HTML cleaner. Use to ensure that end-user provided HTML contains only the elements and attributes\n that you are expecting; no junk, and no cross-site scripting attacks!\n \u003cp/\u003e\n The HTML cleaner parses the input as HTML and then runs it through a white-list, so the output HTML can only contain\n HTML that is allowed by the whitelist.\n \u003cp/\u003e\n It is assumed that the input HTML is a body fragment; the clean methods only pull from the source\u0027s body, and the\n canned white-lists only allow body contained tags.\n \u003cp/\u003e\n Rather than interacting directly with a Cleaner object, generally see the {@code clean} methods in {@link org.jsoup.Jsoup}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "whitelist"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Cleaner.Cleaner(org.jsoup.safety.Whitelist)",
      "begin_line": 30,
      "end_line": 33,
      "comment": "\n     Create a new cleaner, that sanitizes documents using the supplied whitelist.\n     @param whitelist white-list to clean with\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.clean(org.jsoup.nodes.Document)",
      "begin_line": 41,
      "end_line": 49,
      "comment": "\n     Creates a new, clean document, from the original dirty document, containing only elements allowed by the whitelist.\n     The original document is not modified. Only elements from the dirt document\u0027s \u003ccode\u003ebody\u003c/code\u003e are used.\n     @param dirtyDocument Untrusted base document to clean.\n     @return cleaned document.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.isValid(org.jsoup.nodes.Document)",
      "begin_line": 61,
      "end_line": 67,
      "comment": "\n     Determines if the input document is valid, against the whitelist. It is considered valid if all the tags and attributes\n     in the input HTML are allowed by the whitelist.\n     \u003cp/\u003e\n     This method can be used as a validator for user input forms. An invalid document will still be cleaned successfully\n     using the {@link #clean(Document)} document. If using as a validator, it is recommended to still clean the document\n     to ensure enforced attributes are set correctly, and that the output is tidied.\n     @param dirtyDocument document to test\n     @return true if no tags or attributes need to be removed; false if they do\n     "
    },
    {
      "type": "class_interface",
      "name": "CleaningVisitor",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.NodeVisitor"
      ],
      "begin_line": 72,
      "end_line": 110,
      "comment": "\n     Iterates the input and copies trusted nodes (tags, attributes, text) into the destination.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "numDiscarded"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "destination"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " current element to append nodes to"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Cleaner.CleaningVisitor.CleaningVisitor(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 77,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.CleaningVisitor.head(org.jsoup.nodes.Node, int)",
      "begin_line": 82,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.CleaningVisitor.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 105,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.copySafeNodes(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 112,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.createSafeElement(org.jsoup.nodes.Element)",
      "begin_line": 119,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ElementMeta",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 138,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "el"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numAttribsDiscarded"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Cleaner.ElementMeta.ElementMeta(org.jsoup.nodes.Element, int)",
      "begin_line": 142,
      "end_line": 145,
      "comment": ""
    }
  ]
}