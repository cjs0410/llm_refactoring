{
  "filepath": "/tmp/Jsoup-58f/src/main/java/org/jsoup/safety/Cleaner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Cleaner",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 176,
      "comment": "\n The whitelist based HTML cleaner. Use to ensure that end-user provided HTML contains only the elements and attributes\n that you are expecting; no junk, and no cross-site scripting attacks!\n \u003cp\u003e\n The HTML cleaner parses the input as HTML and then runs it through a white-list, so the output HTML can only contain\n HTML that is allowed by the whitelist.\n \u003c/p\u003e\n \u003cp\u003e\n It is assumed that the input HTML is a body fragment; the clean methods only pull from the source\u0027s body, and the\n canned white-lists only allow body contained tags.\n \u003c/p\u003e\n \u003cp\u003e\n Rather than interacting directly with a Cleaner object, generally see the {@code clean} methods in {@link org.jsoup.Jsoup}.\n \u003c/p\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "whitelist"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Cleaner.Cleaner(org.jsoup.safety.Whitelist)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     Create a new cleaner, that sanitizes documents using the supplied whitelist.\n     @param whitelist white-list to clean with\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.clean(org.jsoup.nodes.Document)",
      "begin_line": 53,
      "end_line": 61,
      "comment": "\n     Creates a new, clean document, from the original dirty document, containing only elements allowed by the whitelist.\n     The original document is not modified. Only elements from the dirt document\u0027s \u003ccode\u003ebody\u003c/code\u003e are used.\n     @param dirtyDocument Untrusted base document to clean.\n     @return cleaned document.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.isValid(org.jsoup.nodes.Document)",
      "begin_line": 74,
      "end_line": 81,
      "comment": "\n     Determines if the input document \u003cb\u003ebody\u003c/b\u003eis valid, against the whitelist. It is considered valid if all the tags and attributes\n     in the input HTML are allowed by the whitelist, and that there is no content in the \u003ccode\u003ehead\u003c/code\u003e.\n     \u003cp\u003e\n     This method can be used as a validator for user input. An invalid document will still be cleaned successfully\n     using the {@link #clean(Document)} document. If using as a validator, it is recommended to still clean the document\n     to ensure enforced attributes are set correctly, and that the output is tidied.\n     \u003c/p\u003e\n     @param dirtyDocument document to test\n     @return true if no tags or attributes need to be removed; false if they do\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.isValidBodyHtml(java.lang.String)",
      "begin_line": 83,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "CleaningVisitor",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.NodeVisitor"
      ],
      "begin_line": 96,
      "end_line": 138,
      "comment": "\n     Iterates the input and copies trusted nodes (tags, attributes, text) into the destination.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "numDiscarded"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "destination"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " current element to append nodes to"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Cleaner.CleaningVisitor.CleaningVisitor(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 101,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.CleaningVisitor.head(org.jsoup.nodes.Node, int)",
      "begin_line": 106,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.CleaningVisitor.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 133,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.copySafeNodes(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 140,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.createSafeElement(org.jsoup.nodes.Element)",
      "begin_line": 147,
      "end_line": 164,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ElementMeta",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 166,
      "end_line": 174,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "el"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numAttribsDiscarded"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Cleaner.ElementMeta.ElementMeta(org.jsoup.nodes.Element, int)",
      "begin_line": 170,
      "end_line": 173,
      "comment": ""
    }
  ]
}