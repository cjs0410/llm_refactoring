{
  "filepath": "/tmp/Jsoup-49f/src/main/java/org/jsoup/nodes/Node.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Node",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 20,
      "end_line": 679,
      "comment": "\n The base, abstract Node model. Elements, Documents, Comments etc are all Node instances.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_NODES"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parentNode"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "childNodes"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attributes"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseUri"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "siblingIndex"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.Node(java.lang.String, org.jsoup.nodes.Attributes)",
      "begin_line": 33,
      "end_line": 40,
      "comment": "\n     Create a new Node.\n     @param baseUri base URI\n     @param attributes attributes (not null, but may be empty)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.Node(java.lang.String)",
      "begin_line": 42,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.Node()",
      "begin_line": 49,
      "end_line": 52,
      "comment": "\n     * Default constructor. Doesn\u0027t setup base uri, children, or attributes; use with caution.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.nodeName()",
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     Get the node name of this node. Use for debugging purposes and not logic switching (for that, use instanceof).\n     @return node name\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.attr(java.lang.String)",
      "begin_line": 75,
      "end_line": 83,
      "comment": "\n     * Get an attribute\u0027s value by its key.\n     * \u003cp\u003e\n     * To get an absolute URL from an attribute that may be a relative URL, prefix the key with \u003ccode\u003e\u003cb\u003eabs\u003c/b\u003e\u003c/code\u003e,\n     * which is a shortcut to the {@link #absUrl} method.\n     * \u003c/p\u003e\n     * E.g.:\n     * \u003cblockquote\u003e\u003ccode\u003eString url \u003d a.attr(\"abs:href\");\u003c/code\u003e\u003c/blockquote\u003e\n     * \n     * @param attributeKey The attribute key.\n     * @return The attribute, or empty string if not present (to avoid nulls).\n     * @see #attributes()\n     * @see #hasAttr(String)\n     * @see #absUrl(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.attributes()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Get all of the element\u0027s attributes.\n     * @return attributes (which implements iterable, in same order as presented in original HTML).\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.attr(java.lang.String, java.lang.String)",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * Set an attribute (key\u003dvalue). If the attribute already exists, it is replaced.\n     * @param attributeKey The attribute key.\n     * @param attributeValue The attribute value.\n     * @return this (for chaining)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.hasAttr(java.lang.String)",
      "begin_line": 109,
      "end_line": 118,
      "comment": "\n     * Test if this element has an attribute.\n     * @param attributeKey The attribute key to check.\n     * @return true if the attribute exists, false if not.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.removeAttr(java.lang.String)",
      "begin_line": 125,
      "end_line": 129,
      "comment": "\n     * Remove an attribute from this element.\n     * @param attributeKey The attribute to remove.\n     * @return this (for chaining)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.baseUri()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     Get the base URI of this node.\n     @return base URI\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.setBaseUri(java.lang.String)",
      "begin_line": 143,
      "end_line": 154,
      "comment": "\n     Update the base URI of this node and all of its descendants.\n     @param baseUri base URI to set\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.Anonymous-749ae629-c725-4c00-8e60-2160f6549c1b.head(org.jsoup.nodes.Node, int)",
      "begin_line": 147,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.Anonymous-0bff3a2b-f87e-4ff9-9591-c457efdfc960.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 151,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.absUrl(java.lang.String)",
      "begin_line": 179,
      "end_line": 187,
      "comment": "\n     * Get an absolute URL from a URL attribute that may be relative (i.e. an \u003ccode\u003e\u0026lt;a href\u0026gt;\u003c/code\u003e or\n     * \u003ccode\u003e\u0026lt;img src\u0026gt;\u003c/code\u003e).\n     * \u003cp\u003e\n     * E.g.: \u003ccode\u003eString absUrl \u003d linkEl.absUrl(\"href\");\u003c/code\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * If the attribute value is already absolute (i.e. it starts with a protocol, like\n     * \u003ccode\u003ehttp://\u003c/code\u003e or \u003ccode\u003ehttps://\u003c/code\u003e etc), and it successfully parses as a URL, the attribute is\n     * returned directly. Otherwise, it is treated as a URL relative to the element\u0027s {@link #baseUri}, and made\n     * absolute using that.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * As an alternate, you can use the {@link #attr} method with the \u003ccode\u003eabs:\u003c/code\u003e prefix, e.g.:\n     * \u003ccode\u003eString absUrl \u003d linkEl.attr(\"abs:href\");\u003c/code\u003e\n     * \u003c/p\u003e\n     * \n     * @param attributeKey The attribute key\n     * @return An absolute URL if one could be made, or an empty string (not null) if the attribute was missing or\n     * could not be made successfully into a URL.\n     * @see #attr\n     * @see java.net.URL#URL(java.net.URL, String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNode(int)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     Get a child node by its 0-based index.\n     @param index index of child node\n     @return the child node at this index. Throws a {@code IndexOutOfBoundsException} if the index is out of bounds.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNodes()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     Get this node\u0027s children. Presented as an unmodifiable list: new children can not be added, but the child nodes\n     themselves can be manipulated.\n     @return list of children. If no children, returns an empty list.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNodesCopy()",
      "begin_line": 212,
      "end_line": 218,
      "comment": "\n     * Returns a deep copy of this node\u0027s children. Changes made to these nodes will not be reflected in the original\n     * nodes\n     * @return a deep copy of this node\u0027s children\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNodeSize()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * Get the number of child nodes that this node holds.\n     * @return the number of child nodes that this node holds.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNodesAsArray()",
      "begin_line": 228,
      "end_line": 230,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.parent()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     Gets this node\u0027s parent node.\n     @return parent node; or null if no parent.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.parentNode()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     Gets this node\u0027s parent node. Node overridable by extending classes, so useful if you really just need the Node type.\n     @return parent node; or null if no parent.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.ownerDocument()",
      "begin_line": 252,
      "end_line": 259,
      "comment": "\n     * Gets the Document associated with this Node. \n     * @return the Document associated with this Node, or null if there is no such Document.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.remove()",
      "begin_line": 264,
      "end_line": 267,
      "comment": "\n     * Remove (delete) this node from the DOM tree. If this node has children, they are also removed.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.before(java.lang.String)",
      "begin_line": 275,
      "end_line": 278,
      "comment": "\n     * Insert the specified HTML into the DOM before this node (i.e. as a preceding sibling).\n     * @param html HTML to add before this node\n     * @return this node, for chaining\n     * @see #after(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.before(org.jsoup.nodes.Node)",
      "begin_line": 286,
      "end_line": 292,
      "comment": "\n     * Insert the specified node into the DOM before this node (i.e. as a preceding sibling).\n     * @param node to add before this node\n     * @return this node, for chaining\n     * @see #after(Node)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.after(java.lang.String)",
      "begin_line": 300,
      "end_line": 303,
      "comment": "\n     * Insert the specified HTML into the DOM after this node (i.e. as a following sibling).\n     * @param html HTML to add after this node\n     * @return this node, for chaining\n     * @see #before(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.after(org.jsoup.nodes.Node)",
      "begin_line": 311,
      "end_line": 317,
      "comment": "\n     * Insert the specified node into the DOM after this node (i.e. as a following sibling).\n     * @param node to add after this node\n     * @return this node, for chaining\n     * @see #before(Node)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.addSiblingHtml(int, java.lang.String)",
      "begin_line": 319,
      "end_line": 326,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.wrap(java.lang.String)",
      "begin_line": 333,
      "end_line": 356,
      "comment": "\n     Wrap the supplied HTML around this node.\n     @param html HTML to wrap around this element, e.g. {@code \u003cdiv class\u003d\"head\"\u003e\u003c/div\u003e}. Can be arbitrarily deep.\n     @return this node, for chaining.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.unwrap()",
      "begin_line": 373,
      "end_line": 381,
      "comment": "\n     * Removes this node from the DOM, and moves its children up into the node\u0027s parent. This has the effect of dropping\n     * the node but keeping its children.\n     * \u003cp\u003e\n     * For example, with the input html:\n     * \u003c/p\u003e\n     * \u003cp\u003e{@code \u003cdiv\u003eOne \u003cspan\u003eTwo \u003cb\u003eThree\u003c/b\u003e\u003c/span\u003e\u003c/div\u003e}\u003c/p\u003e\n     * Calling {@code element.unwrap()} on the {@code span} element will result in the html:\n     * \u003cp\u003e{@code \u003cdiv\u003eOne Two \u003cb\u003eThree\u003c/b\u003e\u003c/div\u003e}\u003c/p\u003e\n     * and the {@code \"Two \"} {@link TextNode} being returned.\n     * \n     * @return the first child of this node, after the node has been unwrapped. Null if the node had no children.\n     * @see #remove()\n     * @see #wrap(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.getDeepChild(org.jsoup.nodes.Element)",
      "begin_line": 383,
      "end_line": 389,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.replaceWith(org.jsoup.nodes.Node)",
      "begin_line": 395,
      "end_line": 399,
      "comment": "\n     * Replace this node in the DOM with the supplied node.\n     * @param in the node that will will replace the existing node.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.setParentNode(org.jsoup.nodes.Node)",
      "begin_line": 401,
      "end_line": 405,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.replaceChild(org.jsoup.nodes.Node, org.jsoup.nodes.Node)",
      "begin_line": 407,
      "end_line": 418,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.removeChild(org.jsoup.nodes.Node)",
      "begin_line": 420,
      "end_line": 426,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.addChildren(org.jsoup.nodes.Node...)",
      "begin_line": 428,
      "end_line": 436,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.addChildren(int, org.jsoup.nodes.Node...)",
      "begin_line": 438,
      "end_line": 447,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.ensureChildNodes()",
      "begin_line": 449,
      "end_line": 453,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.reparentChild(org.jsoup.nodes.Node)",
      "begin_line": 455,
      "end_line": 459,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.reindexChildren(int)",
      "begin_line": 461,
      "end_line": 465,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.siblingNodes()",
      "begin_line": 472,
      "end_line": 482,
      "comment": "\n     Retrieves this node\u0027s sibling nodes. Similar to {@link #childNodes()  node.parent.childNodes()}, but does not\n     include this node (a node is not a sibling of itself).\n     @return node siblings. If the node has no parent, returns an empty list.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.nextSibling()",
      "begin_line": 488,
      "end_line": 498,
      "comment": "\n     Get this node\u0027s next sibling.\n     @return next sibling, or null if this is the last sibling\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.previousSibling()",
      "begin_line": 504,
      "end_line": 512,
      "comment": "\n     Get this node\u0027s previous sibling.\n     @return the previous sibling, or null if this is the first sibling\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.siblingIndex()",
      "begin_line": 520,
      "end_line": 522,
      "comment": "\n     * Get the list index of this node in its node sibling list. I.e. if this is the first node\n     * sibling, returns 0.\n     * @return position in node sibling list\n     * @see org.jsoup.nodes.Element#elementSiblingIndex()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.setSiblingIndex(int)",
      "begin_line": 524,
      "end_line": 526,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.traverse(org.jsoup.select.NodeVisitor)",
      "begin_line": 533,
      "end_line": 538,
      "comment": "\n     * Perform a depth-first traversal through this node and its descendants.\n     * @param nodeVisitor the visitor callbacks to perform on each node\n     * @return this node, for chaining\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtml()",
      "begin_line": 544,
      "end_line": 548,
      "comment": "\n     Get the outer HTML of this node.\n     @return HTML\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtml(java.lang.StringBuilder)",
      "begin_line": 550,
      "end_line": 552,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.getOutputSettings()",
      "begin_line": 555,
      "end_line": 557,
      "comment": " if this node has no document (or parent), retrieve the default output settings"
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtmlHead(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 563,
      "end_line": 563,
      "comment": "\n     Get the outer HTML of this node.\n     @param accum accumulator to place HTML into\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtmlTail(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 565,
      "end_line": 565,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.toString()",
      "begin_line": 567,
      "end_line": 570,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.indent(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 572,
      "end_line": 574,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.equals(java.lang.Object)",
      "begin_line": 582,
      "end_line": 591,
      "comment": "\n     * Check if this node is equal to another node. A node is considered equal if its attributes and content equal the\n     * other node; particularly its position in the tree does not influence its equality.\n     * @param o other object to compare to\n     * @return true if the content of this node is the same as the other\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.hashCode()",
      "begin_line": 600,
      "end_line": 605,
      "comment": "\n     * Calculates a hash code for this node, which includes iterating all its attributes, and recursing into any child\n     * nodes. This means that a node\u0027s hashcode is based on it and its child content, and not its parent or place in the\n     * tree. So two nodes with the same content, regardless of their position in the tree, will have the same hashcode.\n     * @return the calculated hashcode\n     * @see Node#equals(Object)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.clone()",
      "begin_line": 615,
      "end_line": 634,
      "comment": "\n     * Create a stand-alone, deep copy of this node, and all of its children. The cloned node will have no siblings or\n     * parent node. As a stand-alone object, any changes made to the clone or any of its children will not impact the\n     * original node.\n     * \u003cp\u003e\n     * The cloned node may be adopted into another Document or node structure using {@link Element#appendChild(Node)}.\n     * @return stand-alone cloned node\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.doClone(org.jsoup.nodes.Node)",
      "begin_line": 640,
      "end_line": 659,
      "comment": "\n     * Return a clone of the node using the given parent (which can be null).\n     * Not a deep copy of children.\n     "
    },
    {
      "type": "class_interface",
      "name": "OuterHtmlVisitor",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.NodeVisitor"
      ],
      "begin_line": 661,
      "end_line": 678,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "accum"
      ],
      "begin_line": 662,
      "end_line": 662,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 663,
      "end_line": 663,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.OuterHtmlVisitor.OuterHtmlVisitor(java.lang.StringBuilder, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 665,
      "end_line": 668,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.OuterHtmlVisitor.head(org.jsoup.nodes.Node, int)",
      "begin_line": 670,
      "end_line": 672,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.OuterHtmlVisitor.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 674,
      "end_line": 677,
      "comment": ""
    }
  ]
}