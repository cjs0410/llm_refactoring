{
  "filepath": "/tmp/Jsoup-26f/src/main/java/org/jsoup/safety/Cleaner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Cleaner",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 21,
      "end_line": 130,
      "comment": "\n The whitelist based HTML cleaner. Use to ensure that end-user provided HTML contains only the elements and attributes\n that you are expecting; no junk, and no cross-site scripting attacks!\n \u003cp/\u003e\n The HTML cleaner parses the input as HTML and then runs it through a white-list, so the output HTML can only contain\n HTML that is allowed by the whitelist.\n \u003cp/\u003e\n It is assumed that the input HTML is a body fragment; the clean methods only pull from the source\u0027s body, and the\n canned white-lists only allow body contained tags.\n \u003cp/\u003e\n Rather than interacting directly with a Cleaner object, generally see the {@code clean} methods in {@link org.jsoup.Jsoup}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "whitelist"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Cleaner.Cleaner(org.jsoup.safety.Whitelist)",
      "begin_line": 28,
      "end_line": 31,
      "comment": "\n     Create a new cleaner, that sanitizes documents using the supplied whitelist.\n     @param whitelist white-list to clean with\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.clean(org.jsoup.nodes.Document)",
      "begin_line": 39,
      "end_line": 47,
      "comment": "\n     Creates a new, clean document, from the original dirty document, containing only elements allowed by the whitelist.\n     The original document is not modified. Only elements from the dirt document\u0027s \u003ccode\u003ebody\u003c/code\u003e are used.\n     @param dirtyDocument Untrusted base document to clean.\n     @return cleaned document.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.isValid(org.jsoup.nodes.Document)",
      "begin_line": 59,
      "end_line": 65,
      "comment": "\n     Determines if the input document is valid, against the whitelist. It is considered valid if all the tags and attributes\n     in the input HTML are allowed by the whitelist.\n     \u003cp/\u003e\n     This method can be used as a validator for user input forms. An invalid document will still be cleaned successfully\n     using the {@link #clean(Document)} document. If using as a validator, it is recommended to still clean the document\n     to ensure enforced attributes are set correctly, and that the output is tidied.\n     @param dirtyDocument document to test\n     @return true if no tags or attributes need to be removed; false if they do\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.copySafeNodes(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 73,
      "end_line": 99,
      "comment": "\n     Iterates the input and copies trusted nodes (tags, attributes, text) into the destination.\n     @param source source of HTML\n     @param dest destination element to copy into\n     @return number of discarded elements (that were considered unsafe)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.createSafeElement(org.jsoup.nodes.Element)",
      "begin_line": 101,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ElementMeta",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 120,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "el"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numAttribsDiscarded"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Cleaner.ElementMeta.ElementMeta(org.jsoup.nodes.Element, int)",
      "begin_line": 124,
      "end_line": 127,
      "comment": ""
    }
  ]
}