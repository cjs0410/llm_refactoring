{
  "filepath": "/tmp/Jsoup-22f/src/main/java/org/jsoup/nodes/Node.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Node",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 19,
      "end_line": 615,
      "comment": "\n The base, abstract Node model. Elements, Documents, Comments etc are all Node instances.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "parentNode"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "childNodes"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attributes"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseUri"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "siblingIndex"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.Node(java.lang.String, org.jsoup.nodes.Attributes)",
      "begin_line": 31,
      "end_line": 38,
      "comment": "\n     Create a new Node.\n     @param baseUri base URI\n     @param attributes attributes (not null, but may be empty)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.Node(java.lang.String)",
      "begin_line": 40,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.Node()",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Default constructor. Doesn\u0027t setup base uri, children, or attributes; use with caution.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.nodeName()",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     Get the node name of this node. Use for debugging purposes and not logic switching (for that, use instanceof).\n     @return node name\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.attr(java.lang.String)",
      "begin_line": 70,
      "end_line": 78,
      "comment": "\n     * Get an attribute\u0027s value by its key.\n     * \u003cp/\u003e\n     * To get an absolute URL from an attribute that may be a relative URL, prefix the key with \u003ccode\u003e\u003cb\u003eabs\u003c/b\u003e\u003c/code\u003e,\n     * which is a shortcut to the {@link #absUrl} method.\n     * E.g.: \u003cblockquote\u003e\u003ccode\u003eString url \u003d a.attr(\"abs:href\");\u003c/code\u003e\u003c/blockquote\u003e\n     * @param attributeKey The attribute key.\n     * @return The attribute, or empty string if not present (to avoid nulls).\n     * @see #attributes()\n     * @see #hasAttr(String)\n     * @see #absUrl(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.attributes()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Get all of the element\u0027s attributes.\n     * @return attributes (which implements iterable, in same order as presented in original HTML).\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.attr(java.lang.String, java.lang.String)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "\n     * Set an attribute (key\u003dvalue). If the attribute already exists, it is replaced.\n     * @param attributeKey The attribute key.\n     * @param attributeValue The attribute value.\n     * @return this (for chaining)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.hasAttr(java.lang.String)",
      "begin_line": 104,
      "end_line": 113,
      "comment": "\n     * Test if this element has an attribute.\n     * @param attributeKey The attribute key to check.\n     * @return true if the attribute exists, false if not.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.removeAttr(java.lang.String)",
      "begin_line": 120,
      "end_line": 124,
      "comment": "\n     * Remove an attribute from this element.\n     * @param attributeKey The attribute to remove.\n     * @return this (for chaining)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.baseUri()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     Get the base URI of this node.\n     @return base URI\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.setBaseUri(java.lang.String)",
      "begin_line": 138,
      "end_line": 149,
      "comment": "\n     Update the base URI of this node and all of its descendants.\n     @param baseUri base URI to set\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.Anonymous-8d1af43f-7a25-4e24-91a6-9d3299b87291.head(org.jsoup.nodes.Node, int)",
      "begin_line": 142,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.Anonymous-01e77230-e6ec-4f78-a46d-211d3f3e6c53.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 146,
      "end_line": 147,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.absUrl(java.lang.String)",
      "begin_line": 171,
      "end_line": 196,
      "comment": "\n     * Get an absolute URL from a URL attribute that may be relative (i.e. an \u003ccode\u003e\u0026lt;a href\u003e\u003c/code\u003e or\n     * \u003ccode\u003e\u0026lt;img src\u003e\u003c/code\u003e).\n     * \u003cp/\u003e\n     * E.g.: \u003ccode\u003eString absUrl \u003d linkEl.absUrl(\"href\");\u003c/code\u003e\n     * \u003cp/\u003e\n     * If the attribute value is already absolute (i.e. it starts with a protocol, like\n     * \u003ccode\u003ehttp://\u003c/code\u003e or \u003ccode\u003ehttps://\u003c/code\u003e etc), and it successfully parses as a URL, the attribute is\n     * returned directly. Otherwise, it is treated as a URL relative to the element\u0027s {@link #baseUri}, and made\n     * absolute using that.\n     * \u003cp/\u003e\n     * As an alternate, you can use the {@link #attr} method with the \u003ccode\u003eabs:\u003c/code\u003e prefix, e.g.:\n     * \u003ccode\u003eString absUrl \u003d linkEl.attr(\"abs:href\");\u003c/code\u003e\n     *\n     * @param attributeKey The attribute key\n     * @return An absolute URL if one could be made, or an empty string (not null) if the attribute was missing or\n     * could not be made successfully into a URL.\n     * @see #attr\n     * @see java.net.URL#URL(java.net.URL, String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNode(int)",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     Get a child node by index\n     @param index index of child node\n     @return the child node at this index.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNodes()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     Get this node\u0027s children. Presented as an unmodifiable list: new children can not be added, but the child nodes\n     themselves can be manipulated.\n     @return list of children. If no children, returns an empty list.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNodesAsArray()",
      "begin_line": 216,
      "end_line": 218,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.parent()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     Gets this node\u0027s parent node.\n     @return parent node; or null if no parent.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.ownerDocument()",
      "begin_line": 232,
      "end_line": 239,
      "comment": "\n     * Gets the Document associated with this Node. \n     * @return the Document associated with this Node, or null if there is no such Document.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.remove()",
      "begin_line": 244,
      "end_line": 247,
      "comment": "\n     * Remove (delete) this node from the DOM tree. If this node has children, they are also removed.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.before(java.lang.String)",
      "begin_line": 255,
      "end_line": 258,
      "comment": "\n     * Insert the specified HTML into the DOM before this node (i.e. as a preceeding sibling).\n     * @param html HTML to add before this node\n     * @return this node, for chaining\n     * @see #after(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.before(org.jsoup.nodes.Node)",
      "begin_line": 266,
      "end_line": 272,
      "comment": "\n     * Insert the specified node into the DOM before this node (i.e. as a preceeding sibling).\n     * @param node to add before this node\n     * @return this node, for chaining\n     * @see #after(Node)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.after(java.lang.String)",
      "begin_line": 280,
      "end_line": 283,
      "comment": "\n     * Insert the specified HTML into the DOM after this node (i.e. as a following sibling).\n     * @param html HTML to add after this node\n     * @return this node, for chaining\n     * @see #before(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.after(org.jsoup.nodes.Node)",
      "begin_line": 291,
      "end_line": 297,
      "comment": "\n     * Insert the specified node into the DOM after this node (i.e. as a following sibling).\n     * @param node to add after this node\n     * @return this node, for chaining\n     * @see #before(Node)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.addSiblingHtml(int, java.lang.String)",
      "begin_line": 299,
      "end_line": 306,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.wrap(java.lang.String)",
      "begin_line": 313,
      "end_line": 336,
      "comment": "\n     Wrap the supplied HTML around this node.\n     @param html HTML to wrap around this element, e.g. {@code \u003cdiv class\u003d\"head\"\u003e\u003c/div\u003e}. Can be arbitrarily deep.\n     @return this node, for chaining.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.unwrap()",
      "begin_line": 351,
      "end_line": 360,
      "comment": "\n     * Removes this node from the DOM, and moves its children up into the node\u0027s parent. This has the effect of dropping\n     * the node but keeping its children.\n     * \u003cp/\u003e\n     * For example, with the input html:\u003cbr/\u003e\n     * {@code \u003cdiv\u003eOne \u003cspan\u003eTwo \u003cb\u003eThree\u003c/b\u003e\u003c/span\u003e\u003c/div\u003e}\u003cbr/\u003e\n     * Calling {@code element.unwrap()} on the {@code span} element will result in the html:\u003cbr/\u003e\n     * {@code \u003cdiv\u003eOne Two \u003cb\u003eThree\u003c/b\u003e\u003c/div\u003e}\u003cbr/\u003e\n     * and the {@code \"Two \"} {@link TextNode} being returned.\n     * @return the first child of this node, after the node has been unwrapped. Null if the node had no children.\n     * @see #remove()\n     * @see #wrap(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.getDeepChild(org.jsoup.nodes.Element)",
      "begin_line": 362,
      "end_line": 368,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.replaceWith(org.jsoup.nodes.Node)",
      "begin_line": 374,
      "end_line": 378,
      "comment": "\n     * Replace this node in the DOM with the supplied node.\n     * @param in the node that will will replace the existing node.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.setParentNode(org.jsoup.nodes.Node)",
      "begin_line": 380,
      "end_line": 384,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.replaceChild(org.jsoup.nodes.Node, org.jsoup.nodes.Node)",
      "begin_line": 386,
      "end_line": 397,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.removeChild(org.jsoup.nodes.Node)",
      "begin_line": 399,
      "end_line": 405,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.addChildren(org.jsoup.nodes.Node...)",
      "begin_line": 407,
      "end_line": 414,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.addChildren(int, org.jsoup.nodes.Node...)",
      "begin_line": 416,
      "end_line": 424,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.reparentChild(org.jsoup.nodes.Node)",
      "begin_line": 426,
      "end_line": 430,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.reindexChildren()",
      "begin_line": 432,
      "end_line": 436,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.siblingNodes()",
      "begin_line": 443,
      "end_line": 453,
      "comment": "\n     Retrieves this node\u0027s sibling nodes. Similar to {@link #childNodes()  node.parent.childNodes()}, but does not\n     include this node (a node is not a sibling of itself).\n     @return node siblings. If the node has no parent, returns an empty list.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.nextSibling()",
      "begin_line": 459,
      "end_line": 470,
      "comment": "\n     Get this node\u0027s next sibling.\n     @return next sibling, or null if this is the last sibling\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.previousSibling()",
      "begin_line": 476,
      "end_line": 487,
      "comment": "\n     Get this node\u0027s previous sibling.\n     @return the previous sibling, or null if this is the first sibling\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.siblingIndex()",
      "begin_line": 495,
      "end_line": 497,
      "comment": "\n     * Get the list index of this node in its node sibling list. I.e. if this is the first node\n     * sibling, returns 0.\n     * @return position in node sibling list\n     * @see org.jsoup.nodes.Element#elementSiblingIndex()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.setSiblingIndex(int)",
      "begin_line": 499,
      "end_line": 501,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.traverse(org.jsoup.select.NodeVisitor)",
      "begin_line": 508,
      "end_line": 513,
      "comment": "\n     * Perform a depth-first traversal through this node and its descendants.\n     * @param nodeVisitor the visitor callbacks to perform on each node\n     * @return this node, for chaining\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtml()",
      "begin_line": 519,
      "end_line": 523,
      "comment": "\n     Get the outer HTML of this node.\n     @return HTML\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtml(java.lang.StringBuilder)",
      "begin_line": 525,
      "end_line": 527,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.getOutputSettings()",
      "begin_line": 530,
      "end_line": 532,
      "comment": " if this node has no document (or parent), retrieve the default output settings"
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtmlHead(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 538,
      "end_line": 538,
      "comment": "\n     Get the outer HTML of this node.\n     @param accum accumulator to place HTML into\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtmlTail(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 540,
      "end_line": 540,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.toString()",
      "begin_line": 542,
      "end_line": 544,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.indent(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 546,
      "end_line": 548,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.equals(java.lang.Object)",
      "begin_line": 550,
      "end_line": 555,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.hashCode()",
      "begin_line": 557,
      "end_line": 563,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.clone()",
      "begin_line": 573,
      "end_line": 576,
      "comment": "\n     * Create a stand-alone, deep copy of this node, and all of its children. The cloned node will have no siblings or\n     * parent node. As a stand-alone object, any changes made to the clone or any of its children will not impact the\n     * original node.\n     * \u003cp\u003e\n     * The cloned node may be adopted into another Document or node structure using {@link Element#appendChild(Node)}.\n     * @return stand-alone cloned node\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.doClone(org.jsoup.nodes.Node)",
      "begin_line": 578,
      "end_line": 595,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "OuterHtmlVisitor",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.NodeVisitor"
      ],
      "begin_line": 597,
      "end_line": 614,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "accum"
      ],
      "begin_line": 598,
      "end_line": 598,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 599,
      "end_line": 599,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.OuterHtmlVisitor.OuterHtmlVisitor(java.lang.StringBuilder, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 601,
      "end_line": 604,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.OuterHtmlVisitor.head(org.jsoup.nodes.Node, int)",
      "begin_line": 606,
      "end_line": 608,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.OuterHtmlVisitor.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 610,
      "end_line": 613,
      "comment": ""
    }
  ]
}