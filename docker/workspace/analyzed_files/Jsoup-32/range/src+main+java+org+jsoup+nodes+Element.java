{
  "filepath": "/tmp/Jsoup-32f/src/main/java/org/jsoup/nodes/Element.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Element",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Node"
      ],
      "begin_line": 24,
      "end_line": 1141,
      "comment": "\n * A HTML element consists of a tag name, attributes, and child nodes (including text nodes and\n * other elements).\n * \n * From an Element, you can extract data, traverse the node graph, and manipulate the HTML.\n * \n * @author Jonathan Hedley, jonathan@hedley.net\n "
    },
    {
      "type": "field",
      "varNames": [
        "tag"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "classNames"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Element.Element(org.jsoup.parser.Tag, java.lang.String, org.jsoup.nodes.Attributes)",
      "begin_line": 37,
      "end_line": 42,
      "comment": "\n     * Create a new, standalone Element. (Standalone in that is has no parent.)\n     * \n     * @param tag tag of this element\n     * @param baseUri the base URI\n     * @param attributes initial attributes\n     * @see #appendChild(Node)\n     * @see #appendElement(String)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Element.Element(org.jsoup.parser.Tag, java.lang.String)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Create a new Element from a tag and a base URI.\n     * \n     * @param tag element tag\n     * @param baseUri the base URI of this element. It is acceptable for the base URI to be an empty\n     *            string, but not null.\n     * @see Tag#valueOf(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.nodeName()",
      "begin_line": 56,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.tagName()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Get the name of the tag for this element. E.g. {@code div}\n     * \n     * @return the tag name\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.tagName(java.lang.String)",
      "begin_line": 77,
      "end_line": 81,
      "comment": "\n     * Change the tag of this element. For example, convert a {@code \u003cspan\u003e} to a {@code \u003cdiv\u003e} with\n     * {@code el.tagName(\"div\");}.\n     *\n     * @param tagName new tag name for this element\n     * @return this element, for chaining\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.tag()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Get the Tag for this element.\n     * \n     * @return the tag object\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.isBlock()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Test if this element is a block-level element. (E.g. {@code \u003cdiv\u003e \u003d\u003d true} or an inline element\n     * {@code \u003cp\u003e \u003d\u003d false}).\n     * \n     * @return true if block, false if not (and thus inline)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.id()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n     * Get the {@code id} attribute of this element.\n     * \n     * @return The id attribute, if present, or an empty string if not.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.attr(java.lang.String, java.lang.String)",
      "begin_line": 118,
      "end_line": 121,
      "comment": "\n     * Set an attribute value on this element. If this element already has an attribute with the\n     * key, its value is updated; otherwise, a new attribute is added.\n     * \n     * @return this element\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.dataset()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Get this element\u0027s HTML5 custom data attributes. Each attribute in the element that has a key\n     * starting with \"data-\" is included the dataset.\n     * \u003cp\u003e\n     * E.g., the element {@code \u003cdiv data-package\u003d\"jsoup\" data-language\u003d\"Java\" class\u003d\"group\"\u003e...} has the dataset\n     * {@code package\u003djsoup, language\u003djava}.\n     * \u003cp\u003e\n     * This map is a filtered view of the element\u0027s attribute map. Changes to one map (add, remove, update) are reflected\n     * in the other map.\n     * \u003cp\u003e\n     * You can find elements that have data attributes using the {@code [^data-]} attribute key prefix selector.\n     * @return a map of {@code key\u003dvalue} custom data attributes.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.parent()",
      "begin_line": 140,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.parents()",
      "begin_line": 149,
      "end_line": 153,
      "comment": "\n     * Get this element\u0027s parent and ancestors, up to the document root.\n     * @return this element\u0027s stack of parents, closest first.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.accumulateParents(org.jsoup.nodes.Element, org.jsoup.select.Elements)",
      "begin_line": 155,
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.child(int)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Get a child element of this element, by its 0-based index number.\n     * \u003cp/\u003e\n     * Note that an element can have both mixed Nodes and Elements as children. This method inspects\n     * a filtered list of children that are elements, and the index is based on that filtered list.\n     * \n     * @param index the index number of the element to retrieve\n     * @return the child element, if it exists, otherwise throws an {@code IndexOutOfBoundsException}\n     * @see #childNode(int)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.children()",
      "begin_line": 185,
      "end_line": 193,
      "comment": "\n     * Get this element\u0027s child elements.\n     * \u003cp/\u003e\n     * This is effectively a filter on {@link #childNodes()} to get Element nodes.\n     * @return child elements. If this element has no children, returns an\n     * empty list.\n     * @see #childNodes()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.textNodes()",
      "begin_line": 211,
      "end_line": 218,
      "comment": "\n     * Get this element\u0027s child text nodes. The list is unmodifiable but the text nodes may be manipulated.\n     * \u003cp/\u003e\n     * This is effectively a filter on {@link #childNodes()} to get Text nodes.\n     * @return child text nodes. If this element has no text nodes, returns an\n     * empty list.\n     * \u003cp/\u003e\n     * For example, with the input HTML: {@code \u003cp\u003eOne \u003cspan\u003eTwo\u003c/span\u003e Three \u003cbr\u003e Four\u003c/p\u003e} with the {@code p} element selected:\n     * \u003cul\u003e\n     *     \u003cli\u003e{@code p.text()} \u003d {@code \"One Two Three Four\"}\u003c/li\u003e\n     *     \u003cli\u003e{@code p.ownText()} \u003d {@code \"One Three Four\"}\u003c/li\u003e\n     *     \u003cli\u003e{@code p.children()} \u003d {@code Elements[\u003cspan\u003e, \u003cbr\u003e]}\u003c/li\u003e\n     *     \u003cli\u003e{@code p.childNodes()} \u003d {@code List\u003cNode\u003e[\"One \", \u003cspan\u003e, \" Three \", \u003cbr\u003e, \" Four\"]}\u003c/li\u003e\n     *     \u003cli\u003e{@code p.textNodes()} \u003d {@code List\u003cTextNode\u003e[\"One \", \" Three \", \" Four\"]}\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.dataNodes()",
      "begin_line": 228,
      "end_line": 235,
      "comment": "\n     * Get this element\u0027s child data nodes. The list is unmodifiable but the data nodes may be manipulated.\n     * \u003cp/\u003e\n     * This is effectively a filter on {@link #childNodes()} to get Data nodes.\n     * @return child data nodes. If this element has no data nodes, returns an\n     * empty list.\n     * @see #data()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.select(java.lang.String)",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\n     * Find elements that match the {@link Selector} CSS query, with this element as the starting context. Matched elements\n     * may include this element, or any of its children.\n     * \u003cp/\u003e\n     * This method is generally more powerful to use than the DOM-type {@code getElementBy*} methods, because\n     * multiple filters can be combined, e.g.:\n     * \u003cul\u003e\n     * \u003cli\u003e{@code el.select(\"a[href]\")} - finds links ({@code a} tags with {@code href} attributes)\n     * \u003cli\u003e{@code el.select(\"a[href*\u003dexample.com]\")} - finds links pointing to example.com (loosely)\n     * \u003c/ul\u003e\n     * \u003cp/\u003e\n     * See the query syntax documentation in {@link org.jsoup.select.Selector}.\n     *\n     * @param cssQuery a {@link Selector} CSS-like query\n     * @return elements that match the query (empty if none match)\n     * @see org.jsoup.select.Selector\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.appendChild(org.jsoup.nodes.Node)",
      "begin_line": 264,
      "end_line": 269,
      "comment": "\n     * Add a node child node to this element.\n     * \n     * @param child node to add.\n     * @return this element, so that you can add more child nodes or elements.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.prependChild(org.jsoup.nodes.Node)",
      "begin_line": 277,
      "end_line": 282,
      "comment": "\n     * Add a node to the start of this element\u0027s children.\n     * \n     * @param child node to add.\n     * @return this element, so that you can add more child nodes or elements.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.insertChildren(int, java.util.Collection\u003c? extends org.jsoup.nodes.Node\u003e)",
      "begin_line": 294,
      "end_line": 304,
      "comment": "\n     * Inserts the given child nodes into this element at the specified index. Current nodes will be shifted to the\n     * right. The inserted nodes will be moved from their current parent. To prevent moving, copy the nodes first.\n     *\n     * @param index 0-based index to insert children at. Specify {@code 0} to insert at the start, {@code -1} at the\n     * end\n     * @param children child nodes to insert\n     * @return this element, for chaining.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.appendElement(java.lang.String)",
      "begin_line": 313,
      "end_line": 317,
      "comment": "\n     * Create a new element by tag name, and add it as the last child.\n     * \n     * @param tagName the name of the tag (e.g. {@code div}).\n     * @return the new element, to allow you to add content to it, e.g.:\n     *  {@code parent.appendElement(\"h1\").attr(\"id\", \"header\").text(\"Welcome\");}\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.prependElement(java.lang.String)",
      "begin_line": 326,
      "end_line": 330,
      "comment": "\n     * Create a new element by tag name, and add it as the first child.\n     * \n     * @param tagName the name of the tag (e.g. {@code div}).\n     * @return the new element, to allow you to add content to it, e.g.:\n     *  {@code parent.prependElement(\"h1\").attr(\"id\", \"header\").text(\"Welcome\");}\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.appendText(java.lang.String)",
      "begin_line": 338,
      "end_line": 342,
      "comment": "\n     * Create and append a new TextNode to this element.\n     * \n     * @param text the unencoded text to add\n     * @return this element\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.prependText(java.lang.String)",
      "begin_line": 350,
      "end_line": 354,
      "comment": "\n     * Create and prepend a new TextNode to this element.\n     * \n     * @param text the unencoded text to add\n     * @return this element\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.append(java.lang.String)",
      "begin_line": 362,
      "end_line": 368,
      "comment": "\n     * Add inner HTML to this element. The supplied HTML will be parsed, and each node appended to the end of the children.\n     * @param html HTML to add inside this element, after the existing HTML\n     * @return this element\n     * @see #html(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.prepend(java.lang.String)",
      "begin_line": 376,
      "end_line": 382,
      "comment": "\n     * Add inner HTML into this element. The supplied HTML will be parsed, and each node prepended to the start of the element\u0027s children.\n     * @param html HTML to add inside this element, before the existing HTML\n     * @return this element\n     * @see #html(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.before(java.lang.String)",
      "begin_line": 391,
      "end_line": 394,
      "comment": "\n     * Insert the specified HTML into the DOM before this element (as a preceding sibling).\n     *\n     * @param html HTML to add before this element\n     * @return this element, for chaining\n     * @see #after(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.before(org.jsoup.nodes.Node)",
      "begin_line": 402,
      "end_line": 405,
      "comment": "\n     * Insert the specified node into the DOM before this node (as a preceding sibling).\n     * @param node to add before this element\n     * @return this Element, for chaining\n     * @see #after(Node)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.after(java.lang.String)",
      "begin_line": 414,
      "end_line": 417,
      "comment": "\n     * Insert the specified HTML into the DOM after this element (as a following sibling).\n     *\n     * @param html HTML to add after this element\n     * @return this element, for chaining\n     * @see #before(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.after(org.jsoup.nodes.Node)",
      "begin_line": 425,
      "end_line": 428,
      "comment": "\n     * Insert the specified node into the DOM after this node (as a following sibling).\n     * @param node to add after this element\n     * @return this element, for chaining\n     * @see #before(Node)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.empty()",
      "begin_line": 434,
      "end_line": 437,
      "comment": "\n     * Remove all of the element\u0027s child nodes. Any attributes are left as-is.\n     * @return this element\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.wrap(java.lang.String)",
      "begin_line": 445,
      "end_line": 448,
      "comment": "\n     * Wrap the supplied HTML around this element.\n     *\n     * @param html HTML to wrap around this element, e.g. {@code \u003cdiv class\u003d\"head\"\u003e\u003c/div\u003e}. Can be arbitrarily deep.\n     * @return this element, for chaining.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.siblingElements()",
      "begin_line": 455,
      "end_line": 465,
      "comment": "\n     * Get sibling elements. If the element has no sibling elements, returns an empty list. An element is not a sibling\n     * of itself, so will not be included in the returned list.\n     * @return sibling elements\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.nextElementSibling()",
      "begin_line": 475,
      "end_line": 484,
      "comment": "\n     * Gets the next sibling element of this element. E.g., if a {@code div} contains two {@code p}s, \n     * the {@code nextElementSibling} of the first {@code p} is the second {@code p}.\n     * \u003cp/\u003e\n     * This is similar to {@link #nextSibling()}, but specifically finds only Elements\n     * @return the next element, or null if there is no next element\n     * @see #previousElementSibling()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.previousElementSibling()",
      "begin_line": 491,
      "end_line": 500,
      "comment": "\n     * Gets the previous element sibling of this element.\n     * @return the previous element, or null if there is no previous element\n     * @see #nextElementSibling()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.firstElementSibling()",
      "begin_line": 506,
      "end_line": 510,
      "comment": "\n     * Gets the first element sibling of this element.\n     * @return the first sibling that is an element (aka the parent\u0027s first element child) \n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.elementSiblingIndex()",
      "begin_line": 517,
      "end_line": 520,
      "comment": "\n     * Get the list index of this element in its element sibling list. I.e. if this is the first element\n     * sibling, returns 0.\n     * @return position in element sibling list\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.lastElementSibling()",
      "begin_line": 526,
      "end_line": 529,
      "comment": "\n     * Gets the last element sibling of this element\n     * @return the last sibling that is an element (aka the parent\u0027s last element child) \n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.indexInList(org.jsoup.nodes.Element, java.util.List\u003cE\u003e)",
      "begin_line": 531,
      "end_line": 541,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByTag(java.lang.String)",
      "begin_line": 550,
      "end_line": 555,
      "comment": "\n     * Finds elements, including and recursively under this element, with the specified tag name.\n     * @param tagName The tag name to search for (case insensitively).\n     * @return a matching unmodifiable list of elements. Will be empty if this element and none of its children match.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementById(java.lang.String)",
      "begin_line": 566,
      "end_line": 574,
      "comment": "\n     * Find an element by ID, including or under this element.\n     * \u003cp\u003e\n     * Note that this finds the first matching ID, starting with this element. If you search down from a different\n     * starting point, it is possible to find a different element by ID. For unique element by ID within a Document,\n     * use {@link Document#getElementById(String)}\n     * @param id The ID to search for.\n     * @return The first matching element by ID, starting with this element, or null if none found.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByClass(java.lang.String)",
      "begin_line": 587,
      "end_line": 591,
      "comment": "\n     * Find elements that have this class, including or under this element. Case insensitive.\n     * \u003cp\u003e\n     * Elements can have multiple classes (e.g. {@code \u003cdiv class\u003d\"header round first\"\u003e}. This method\n     * checks each class, so you can find the above with {@code el.getElementsByClass(\"header\");}.\n     * \n     * @param className the name of the class to search for.\n     * @return elements with the supplied class name, empty if none\n     * @see #hasClass(String)\n     * @see #classNames()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttribute(java.lang.String)",
      "begin_line": 599,
      "end_line": 604,
      "comment": "\n     * Find elements that have a named attribute set. Case insensitive.\n     *\n     * @param key name of the attribute, e.g. {@code href}\n     * @return elements that have this attribute, empty if none\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeStarting(java.lang.String)",
      "begin_line": 612,
      "end_line": 617,
      "comment": "\n     * Find elements that have an attribute name starting with the supplied prefix. Use {@code data-} to find elements\n     * that have HTML5 datasets.\n     * @param keyPrefix name prefix of the attribute e.g. {@code data-}\n     * @return elements that have attribute names that start with with the prefix, empty if none.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValue(java.lang.String, java.lang.String)",
      "begin_line": 626,
      "end_line": 628,
      "comment": "\n     * Find elements that have an attribute with the specific value. Case insensitive.\n     * \n     * @param key name of the attribute\n     * @param value value of the attribute\n     * @return elements that have this attribute with this value, empty if none\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueNot(java.lang.String, java.lang.String)",
      "begin_line": 637,
      "end_line": 639,
      "comment": "\n     * Find elements that either do not have this attribute, or have it with a different value. Case insensitive.\n     * \n     * @param key name of the attribute\n     * @param value value of the attribute\n     * @return elements that do not have a matching attribute\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueStarting(java.lang.String, java.lang.String)",
      "begin_line": 648,
      "end_line": 650,
      "comment": "\n     * Find elements that have attributes that start with the value prefix. Case insensitive.\n     * \n     * @param key name of the attribute\n     * @param valuePrefix start of attribute value\n     * @return elements that have attributes that start with the value prefix\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueEnding(java.lang.String, java.lang.String)",
      "begin_line": 659,
      "end_line": 661,
      "comment": "\n     * Find elements that have attributes that end with the value suffix. Case insensitive.\n     * \n     * @param key name of the attribute\n     * @param valueSuffix end of the attribute value\n     * @return elements that have attributes that end with the value suffix\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueContaining(java.lang.String, java.lang.String)",
      "begin_line": 670,
      "end_line": 672,
      "comment": "\n     * Find elements that have attributes whose value contains the match string. Case insensitive.\n     * \n     * @param key name of the attribute\n     * @param match substring of value to search for\n     * @return elements that have attributes containing this text\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueMatching(java.lang.String, java.util.regex.Pattern)",
      "begin_line": 680,
      "end_line": 683,
      "comment": "\n     * Find elements that have attributes whose values match the supplied regular expression.\n     * @param key name of the attribute\n     * @param pattern compiled regular expression to match against attribute values\n     * @return elements that have attributes matching this regular expression\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByAttributeValueMatching(java.lang.String, java.lang.String)",
      "begin_line": 691,
      "end_line": 699,
      "comment": "\n     * Find elements that have attributes whose values match the supplied regular expression.\n     * @param key name of the attribute\n     * @param regex regular expression to match against attribute values. You can use \u003ca href\u003d\"http://java.sun.com/docs/books/tutorial/essential/regex/pattern.html#embedded\"\u003eembedded flags\u003c/a\u003e (such as (?i) and (?m) to control regex options.\n     * @return elements that have attributes matching this regular expression\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByIndexLessThan(int)",
      "begin_line": 706,
      "end_line": 708,
      "comment": "\n     * Find elements whose sibling index is less than the supplied index.\n     * @param index 0-based index\n     * @return elements less than index\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByIndexGreaterThan(int)",
      "begin_line": 715,
      "end_line": 717,
      "comment": "\n     * Find elements whose sibling index is greater than the supplied index.\n     * @param index 0-based index\n     * @return elements greater than index\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsByIndexEquals(int)",
      "begin_line": 724,
      "end_line": 726,
      "comment": "\n     * Find elements whose sibling index is equal to the supplied index.\n     * @param index 0-based index\n     * @return elements equal to index\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsContainingText(java.lang.String)",
      "begin_line": 735,
      "end_line": 737,
      "comment": "\n     * Find elements that contain the specified string. The search is case insensitive. The text may appear directly\n     * in the element, or in any of its descendants.\n     * @param searchText to look for in the element\u0027s text\n     * @return elements that contain the string, case insensitive.\n     * @see Element#text()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsContainingOwnText(java.lang.String)",
      "begin_line": 746,
      "end_line": 748,
      "comment": "\n     * Find elements that directly contain the specified string. The search is case insensitive. The text must appear directly\n     * in the element, not in any of its descendants.\n     * @param searchText to look for in the element\u0027s own text\n     * @return elements that contain the string, case insensitive.\n     * @see Element#ownText()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsMatchingText(java.util.regex.Pattern)",
      "begin_line": 756,
      "end_line": 758,
      "comment": "\n     * Find elements whose text matches the supplied regular expression.\n     * @param pattern regular expression to match text against\n     * @return elements matching the supplied regular expression.\n     * @see Element#text()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsMatchingText(java.lang.String)",
      "begin_line": 766,
      "end_line": 774,
      "comment": "\n     * Find elements whose text matches the supplied regular expression.\n     * @param regex regular expression to match text against. You can use \u003ca href\u003d\"http://java.sun.com/docs/books/tutorial/essential/regex/pattern.html#embedded\"\u003eembedded flags\u003c/a\u003e (such as (?i) and (?m) to control regex options.\n     * @return elements matching the supplied regular expression.\n     * @see Element#text()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsMatchingOwnText(java.util.regex.Pattern)",
      "begin_line": 782,
      "end_line": 784,
      "comment": "\n     * Find elements whose own text matches the supplied regular expression.\n     * @param pattern regular expression to match text against\n     * @return elements matching the supplied regular expression.\n     * @see Element#ownText()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getElementsMatchingOwnText(java.lang.String)",
      "begin_line": 792,
      "end_line": 800,
      "comment": "\n     * Find elements whose text matches the supplied regular expression.\n     * @param regex regular expression to match text against. You can use \u003ca href\u003d\"http://java.sun.com/docs/books/tutorial/essential/regex/pattern.html#embedded\"\u003eembedded flags\u003c/a\u003e (such as (?i) and (?m) to control regex options.\n     * @return elements matching the supplied regular expression.\n     * @see Element#ownText()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.getAllElements()",
      "begin_line": 807,
      "end_line": 809,
      "comment": "\n     * Find all elements under this element (including self, and children of children).\n     * \n     * @return all elements\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.text()",
      "begin_line": 820,
      "end_line": 824,
      "comment": "\n     * Gets the combined text of this element and all its children.\n     * \u003cp\u003e\n     * For example, given HTML {@code \u003cp\u003eHello \u003cb\u003ethere\u003c/b\u003e now!\u003c/p\u003e}, {@code p.text()} returns {@code \"Hello there now!\"}\n     *\n     * @return unencoded text, or empty string if none.\n     * @see #ownText()\n     * @see #textNodes()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.text(java.lang.StringBuilder)",
      "begin_line": 826,
      "end_line": 840,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.ownText()",
      "begin_line": 853,
      "end_line": 857,
      "comment": "\n     * Gets the text owned by this element only; does not get the combined text of all children.\n     * \u003cp\u003e\n     * For example, given HTML {@code \u003cp\u003eHello \u003cb\u003ethere\u003c/b\u003e now!\u003c/p\u003e}, {@code p.ownText()} returns {@code \"Hello now!\"},\n     * whereas {@code p.text()} returns {@code \"Hello there now!\"}.\n     * Note that the text within the {@code b} element is not returned, as it is not a direct child of the {@code p} element.\n     *\n     * @return unencoded text, or empty string if none.\n     * @see #text()\n     * @see #textNodes()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.ownText(java.lang.StringBuilder)",
      "begin_line": 859,
      "end_line": 868,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.appendNormalisedText(java.lang.StringBuilder, org.jsoup.nodes.TextNode)",
      "begin_line": 870,
      "end_line": 879,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.appendWhitespaceIfBr(org.jsoup.nodes.Element, java.lang.StringBuilder)",
      "begin_line": 881,
      "end_line": 884,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.preserveWhitespace()",
      "begin_line": 886,
      "end_line": 888,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.text(java.lang.String)",
      "begin_line": 895,
      "end_line": 903,
      "comment": "\n     * Set the text of this element. Any existing contents (text or elements) will be cleared\n     * @param text unencoded text\n     * @return this element\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.hasText()",
      "begin_line": 909,
      "end_line": 922,
      "comment": "\n     Test if this element has any text content (that is not just whitespace).\n     @return true if element has non-blank text content.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.data()",
      "begin_line": 930,
      "end_line": 944,
      "comment": "\n     * Get the combined data of this element. Data is e.g. the inside of a {@code script} tag.\n     * @return the data, or empty string if none\n     *\n     * @see #dataNodes()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.className()",
      "begin_line": 951,
      "end_line": 953,
      "comment": "\n     * Gets the literal value of this element\u0027s \"class\" attribute, which may include multiple class names, space\n     * separated. (E.g. on \u003ccode\u003e\u0026lt;div class\u003d\"header gray\"\u003e\u003c/code\u003e returns, \"\u003ccode\u003eheader gray\u003c/code\u003e\")\n     * @return The literal class attribute, or \u003cb\u003eempty string\u003c/b\u003e if no class attribute set.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.classNames()",
      "begin_line": 961,
      "end_line": 967,
      "comment": "\n     * Get all of the element\u0027s class names. E.g. on element {@code \u003cdiv class\u003d\"header gray\"}\u003e},\n     * returns a set of two elements {@code \"header\", \"gray\"}. Note that modifications to this set are not pushed to\n     * the backing {@code class} attribute; use the {@link #classNames(java.util.Set)} method to persist them.\n     * @return set of classnames, empty if no class attribute\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.classNames(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 974,
      "end_line": 978,
      "comment": "\n     Set the element\u0027s {@code class} attribute to the supplied class names.\n     @param classNames set of classes\n     @return this element, for chaining\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.hasClass(java.lang.String)",
      "begin_line": 985,
      "end_line": 992,
      "comment": "\n     * Tests if this element has a class. Case insensitive.\n     * @param className name of class to check for\n     * @return true if it does, false if not\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.addClass(java.lang.String)",
      "begin_line": 999,
      "end_line": 1007,
      "comment": "\n     Add a class name to this element\u0027s {@code class} attribute.\n     @param className class name to add\n     @return this element\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.removeClass(java.lang.String)",
      "begin_line": 1014,
      "end_line": 1022,
      "comment": "\n     Remove a class name from this element\u0027s {@code class} attribute.\n     @param className class name to remove\n     @return this element\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.toggleClass(java.lang.String)",
      "begin_line": 1029,
      "end_line": 1040,
      "comment": "\n     Toggle a class name on this element\u0027s {@code class} attribute: if present, remove it; otherwise add it.\n     @param className class name to toggle\n     @return this element\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.val()",
      "begin_line": 1046,
      "end_line": 1051,
      "comment": "\n     * Get the value of a form element (input, textarea, etc).\n     * @return the value of the form element, or empty string if not set.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.val(java.lang.String)",
      "begin_line": 1058,
      "end_line": 1064,
      "comment": "\n     * Set the value of a form element (input, textarea, etc).\n     * @param value value to set\n     * @return this element (for chaining)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.outerHtmlHead(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 1066,
      "end_line": 1078,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.outerHtmlTail(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 1080,
      "end_line": 1086,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.html()",
      "begin_line": 1095,
      "end_line": 1099,
      "comment": "\n     * Retrieves the element\u0027s inner HTML. E.g. on a {@code \u003cdiv\u003e} with one empty {@code \u003cp\u003e}, would return\n     * {@code \u003cp\u003e\u003c/p\u003e}. (Whereas {@link #outerHtml()} would return {@code \u003cdiv\u003e\u003cp\u003e\u003c/p\u003e\u003c/div\u003e}.)\n     * \n     * @return String of HTML.\n     * @see #outerHtml()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.html(java.lang.StringBuilder)",
      "begin_line": 1101,
      "end_line": 1104,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.html(java.lang.String)",
      "begin_line": 1112,
      "end_line": 1116,
      "comment": "\n     * Set this element\u0027s inner HTML. Clears the existing HTML first.\n     * @param html HTML to parse and set into this element\n     * @return this element\n     * @see #append(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.toString()",
      "begin_line": 1118,
      "end_line": 1120,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.equals(java.lang.Object)",
      "begin_line": 1122,
      "end_line": 1125,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.hashCode()",
      "begin_line": 1127,
      "end_line": 1133,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Element.clone()",
      "begin_line": 1135,
      "end_line": 1140,
      "comment": ""
    }
  ]
}