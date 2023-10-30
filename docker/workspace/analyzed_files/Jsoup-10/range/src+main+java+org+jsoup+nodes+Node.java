{
  "filepath": "/tmp/Jsoup-10f/src/main/java/org/jsoup/nodes/Node.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Node",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 18,
      "end_line": 455,
      "comment": "\n The base, abstract Node model. Elements, Documents, Comments etc are all Node instances.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "parentNode"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "childNodes"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attributes"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseUri"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "siblingIndex"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.Node(java.lang.String, org.jsoup.nodes.Attributes)",
      "begin_line": 30,
      "end_line": 37,
      "comment": "\n     Create a new Node.\n     @param baseUri base URI\n     @param attributes attributes (not null, but may be empty)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.Node(java.lang.String)",
      "begin_line": 39,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.Node()",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Default constructor. Doesn\u0027t setup base uri, children, or attributes; use with caution.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.nodeName()",
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     Get the node name of this node. Use for debugging purposes and not logic switching (for that, use instanceof).\n     @return node name\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.attr(java.lang.String)",
      "begin_line": 69,
      "end_line": 77,
      "comment": "\n     * Get an attribute\u0027s value by its key.\n     * \u003cp/\u003e\n     * To get an absolute URL from an attribute that may be a relative URL, prefix the key with \u003ccode\u003e\u003cb\u003eabs\u003c/b\u003e\u003c/code\u003e,\n     * which is a shortcut to the {@link #absUrl} method.\n     * E.g.: \u003cblockquote\u003e\u003ccode\u003eString url \u003d a.attr(\"abs:href\");\u003c/code\u003e\u003c/blockquote\u003e\n     * @param attributeKey The attribute key.\n     * @return The attribute, or empty string if not present (to avoid nulls).\n     * @see #attributes()\n     * @see #hasAttr(String)\n     * @see #absUrl(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.attributes()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Get all of the element\u0027s attributes.\n     * @return attributes (which implements iterable, in same order as presented in original HTML).\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.attr(java.lang.String, java.lang.String)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Set an attribute (key\u003dvalue). If the attribute already exists, it is replaced.\n     * @param attributeKey The attribute key.\n     * @param attributeValue The attribute value.\n     * @return this (for chaining)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.hasAttr(java.lang.String)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * Test if this element has an attribute.\n     * @param attributeKey The attribute key to check.\n     * @return true if the attribute exists, false if not.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.removeAttr(java.lang.String)",
      "begin_line": 113,
      "end_line": 117,
      "comment": "\n     * Remove an attribute from this element.\n     * @param attributeKey The attribute to remove.\n     * @return this (for chaining)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.baseUri()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     Get the base URI of this node.\n     @return base URI\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.setBaseUri(java.lang.String)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n     Update the base URI of this node.\n     @param baseUri base URI to set\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.absUrl(java.lang.String)",
      "begin_line": 156,
      "end_line": 181,
      "comment": "\n     * Get an absolute URL from a URL attribute that may be relative (i.e. an \u003ccode\u003e\u0026lt;a href\u003e\u003c/code\u003e or\n     * \u003ccode\u003e\u0026lt;img src\u003e\u003c/code\u003e).\n     * \u003cp/\u003e\n     * E.g.: \u003ccode\u003eString absUrl \u003d linkEl.absUrl(\"href\");\u003c/code\u003e\n     * \u003cp/\u003e\n     * If the attribute value is already absolute (i.e. it starts with a protocol, like\n     * \u003ccode\u003ehttp://\u003c/code\u003e or \u003ccode\u003ehttps://\u003c/code\u003e etc), and it successfully parses as a URL, the attribute is\n     * returned directly. Otherwise, it is treated as a URL relative to the element\u0027s {@link #baseUri}, and made\n     * absolute using that.\n     * \u003cp/\u003e\n     * As an alternate, you can use the {@link #attr} method with the \u003ccode\u003eabs:\u003c/code\u003e prefix, e.g.:\n     * \u003ccode\u003eString absUrl \u003d linkEl.attr(\"abs:href\");\u003c/code\u003e\n     *\n     * @param attributeKey The attribute key\n     * @return An absolute URL if one could be made, or an empty string (not null) if the attribute was missing or\n     * could not be made successfully into a URL.\n     * @see #attr\n     * @see java.net.URL#URL(java.net.URL, String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNode(int)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     Get a child node by index\n     @param index index of child node\n     @return the child node at this index.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNodes()",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     Get this node\u0027s children. Presented as an unmodifiable list: new children can not be added, but the child nodes\n     themselves can be manipulated.\n     @return list of children. If no children, returns an empty list.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.childNodesAsArray()",
      "begin_line": 201,
      "end_line": 203,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.parent()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     Gets this node\u0027s parent node.\n     @return parent node; or null if no parent.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.ownerDocument()",
      "begin_line": 217,
      "end_line": 224,
      "comment": "\n     * Gets the Document associated with this Node. \n     * @return the Document associated with this Node, or null if there is no such Document.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.remove()",
      "begin_line": 229,
      "end_line": 232,
      "comment": "\n     * Remove (delete) this node from the DOM tree. If this node has children, they are also removed.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.replaceWith(org.jsoup.nodes.Node)",
      "begin_line": 238,
      "end_line": 242,
      "comment": "\n     * Replace this node in the DOM with the supplied node.\n     * @param in the node that will will replace the existing node.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.setParentNode(org.jsoup.nodes.Node)",
      "begin_line": 244,
      "end_line": 248,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.replaceChild(org.jsoup.nodes.Node, org.jsoup.nodes.Node)",
      "begin_line": 250,
      "end_line": 261,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.removeChild(org.jsoup.nodes.Node)",
      "begin_line": 263,
      "end_line": 269,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.addChildren(org.jsoup.nodes.Node...)",
      "begin_line": 271,
      "end_line": 278,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.addChildren(int, org.jsoup.nodes.Node...)",
      "begin_line": 280,
      "end_line": 288,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.reparentChild(org.jsoup.nodes.Node)",
      "begin_line": 290,
      "end_line": 294,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.reindexChildren()",
      "begin_line": 296,
      "end_line": 300,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.siblingNodes()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\n     Retrieves this node\u0027s sibling nodes. Effectively, {@link #childNodes()  node.parent.childNodes()}.\n     @return node siblings, including this node\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.nextSibling()",
      "begin_line": 314,
      "end_line": 325,
      "comment": "\n     Get this node\u0027s next sibling.\n     @return next sibling, or null if this is the last sibling\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.previousSibling()",
      "begin_line": 331,
      "end_line": 339,
      "comment": "\n     Get this node\u0027s previous sibling.\n     @return the previous sibling, or null if this is the first sibling\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.siblingIndex()",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\n     * Get the list index of this node in its node sibling list. I.e. if this is the first node\n     * sibling, returns 0.\n     * @return position in node sibling list\n     * @see org.jsoup.nodes.Element#elementSiblingIndex()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.setSiblingIndex(int)",
      "begin_line": 351,
      "end_line": 353,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtml()",
      "begin_line": 359,
      "end_line": 363,
      "comment": "\n     Get the outer HTML of this node.\n     @return HTML\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtml(java.lang.StringBuilder)",
      "begin_line": 365,
      "end_line": 367,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.getOutputSettings()",
      "begin_line": 370,
      "end_line": 372,
      "comment": " if this node has no document (or parent), retrieve the default output settings"
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtmlHead(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 378,
      "end_line": 378,
      "comment": "\n     Get the outer HTML of this node.\n     @param accum accumulator to place HTML into\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.outerHtmlTail(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 380,
      "end_line": 380,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.toString()",
      "begin_line": 382,
      "end_line": 384,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.indent(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 386,
      "end_line": 388,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.equals(java.lang.Object)",
      "begin_line": 390,
      "end_line": 395,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.hashCode()",
      "begin_line": 397,
      "end_line": 403,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.clone()",
      "begin_line": 413,
      "end_line": 416,
      "comment": "\n     * Create a stand-alone, deep copy of this node, and all of its children. The cloned node will have no siblings or\n     * parent node. As a stand-alone object, any changes made to the clone or any of its children will not impact the\n     * original node.\n     * \u003cp\u003e\n     * The cloned node may be adopted into another Document or node structure using {@link Element#appendChild(Node)}.\n     * @return stand-alone cloned node\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.doClone(org.jsoup.nodes.Node)",
      "begin_line": 418,
      "end_line": 435,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "OuterHtmlVisitor",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.NodeVisitor"
      ],
      "begin_line": 437,
      "end_line": 454,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "accum"
      ],
      "begin_line": 438,
      "end_line": 438,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 439,
      "end_line": 439,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Node.OuterHtmlVisitor.OuterHtmlVisitor(java.lang.StringBuilder, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 441,
      "end_line": 444,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.OuterHtmlVisitor.head(org.jsoup.nodes.Node, int)",
      "begin_line": 446,
      "end_line": 448,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Node.OuterHtmlVisitor.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 450,
      "end_line": 453,
      "comment": ""
    }
  ]
}