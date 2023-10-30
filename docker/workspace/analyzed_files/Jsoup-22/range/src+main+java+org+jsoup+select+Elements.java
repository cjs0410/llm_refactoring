{
  "filepath": "/tmp/Jsoup-22f/src/main/java/org/jsoup/select/Elements.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Elements",
      "is_interface": false,
      "parent_types": [
        "java.util.List\u003corg.jsoup.nodes.Element\u003e",
        "java.lang.Cloneable"
      ],
      "begin_line": 15,
      "end_line": 536,
      "comment": "\n A list of {@link Element Elements}, with methods that act on every element in the list.\n \u003cp/\u003e\n To get an Elements object, use the {@link Element#select(String)} method.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "contents"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Elements.Elements()",
      "begin_line": 18,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Elements.Elements(int)",
      "begin_line": 22,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Elements.Elements(java.util.Collection\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 26,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Elements.Elements(java.util.List\u003corg.jsoup.nodes.Element\u003e)",
      "begin_line": 30,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Elements.Elements(org.jsoup.nodes.Element...)",
      "begin_line": 34,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.clone()",
      "begin_line": 38,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.attr(java.lang.String)",
      "begin_line": 57,
      "end_line": 63,
      "comment": "\n     Get an attribute value from the first matched element that has the attribute.\n     @param attributeKey The attribute key.\n     @return The attribute value from the first matched element that has the attribute.. If no elements were matched (isEmpty() \u003d\u003d true),\n     or if the no elements have the attribute, returns empty string.\n     @see #hasAttr(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.hasAttr(java.lang.String)",
      "begin_line": 70,
      "end_line": 76,
      "comment": "\n     Checks if any of the matched elements have this attribute set.\n     @param attributeKey attribute key\n     @return true if any of the elements have the attribute; false if none do.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.attr(java.lang.String, java.lang.String)",
      "begin_line": 84,
      "end_line": 89,
      "comment": "\n     * Set an attribute on all matched elements.\n     * @param attributeKey attribute key\n     * @param attributeValue attribute value\n     * @return this\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.removeAttr(java.lang.String)",
      "begin_line": 96,
      "end_line": 101,
      "comment": "\n     * Remove an attribute from every matched element.\n     * @param attributeKey The attribute to remove.\n     * @return this (for chaining)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.addClass(java.lang.String)",
      "begin_line": 108,
      "end_line": 113,
      "comment": "\n     Add the class name to every matched element\u0027s {@code class} attribute.\n     @param className class name to add\n     @return this\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.removeClass(java.lang.String)",
      "begin_line": 120,
      "end_line": 125,
      "comment": "\n     Remove the class name from every matched element\u0027s {@code class} attribute, if present.\n     @param className class name to remove\n     @return this\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.toggleClass(java.lang.String)",
      "begin_line": 132,
      "end_line": 137,
      "comment": "\n     Toggle the class name on every matched element\u0027s {@code class} attribute.\n     @param className class name to add if missing, or remove if present, from every element.\n     @return this\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.hasClass(java.lang.String)",
      "begin_line": 144,
      "end_line": 150,
      "comment": "\n     Determine if any of the matched elements have this class name set in their {@code class} attribute.\n     @param className class name to check for\n     @return true if any do, false if none do\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.val()",
      "begin_line": 157,
      "end_line": 162,
      "comment": "\n     * Get the form element\u0027s value of the first matched element.\n     * @return The form element\u0027s value, or empty if not set.\n     * @see Element#val()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.val(java.lang.String)",
      "begin_line": 169,
      "end_line": 173,
      "comment": "\n     * Set the form element\u0027s value in each of the matched elements.\n     * @param value The value to set into each matched element\n     * @return this (for chaining)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.text()",
      "begin_line": 183,
      "end_line": 191,
      "comment": "\n     * Get the combined text of all the matched elements.\n     * \u003cp\u003e\n     * Note that it is possible to get repeats if the matched elements contain both parent elements and their own\n     * children, as the Element.text() method returns the combined text of a parent and all its children.\n     * @return string of all text: unescaped and no HTML.\n     * @see Element#text()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.hasText()",
      "begin_line": 193,
      "end_line": 199,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.html()",
      "begin_line": 207,
      "end_line": 215,
      "comment": "\n     * Get the combined inner HTML of all matched elements.\n     * @return string of all element\u0027s inner HTML.\n     * @see #text()\n     * @see #outerHtml()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.outerHtml()",
      "begin_line": 223,
      "end_line": 231,
      "comment": "\n     * Get the combined outer HTML of all matched elements.\n     * @return string of all element\u0027s outer HTML.\n     * @see #text()\n     * @see #html()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.toString()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * Get the combined outer HTML of all matched elements. Alias of {@link #outerHtml()}.\n     * @return string of all element\u0027s outer HTML.\n     * @see #text()\n     * @see #html()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.tagName(java.lang.String)",
      "begin_line": 250,
      "end_line": 255,
      "comment": "\n     * Update the tag name of each matched element. For example, to change each {@code \u003ci\u003e} to a {@code \u003cem\u003e}, do\n     * {@code doc.select(\"i\").tagName(\"em\");}\n     * @param tagName the new tag name\n     * @return this, for chaining\n     * @see Element#tagName(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.html(java.lang.String)",
      "begin_line": 263,
      "end_line": 268,
      "comment": "\n     * Set the inner HTML of each matched element.\n     * @param html HTML to parse and set into each matched element.\n     * @return this, for chaining\n     * @see Element#html(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.prepend(java.lang.String)",
      "begin_line": 276,
      "end_line": 281,
      "comment": "\n     * Add the supplied HTML to the start of each matched element\u0027s inner HTML.\n     * @param html HTML to add inside each element, before the existing HTML\n     * @return this, for chaining\n     * @see Element#prepend(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.append(java.lang.String)",
      "begin_line": 289,
      "end_line": 294,
      "comment": "\n     * Add the supplied HTML to the end of each matched element\u0027s inner HTML.\n     * @param html HTML to add inside each element, after the existing HTML\n     * @return this, for chaining\n     * @see Element#append(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.before(java.lang.String)",
      "begin_line": 302,
      "end_line": 307,
      "comment": "\n     * Insert the supplied HTML before each matched element\u0027s outer HTML.\n     * @param html HTML to insert before each element\n     * @return this, for chaining\n     * @see Element#before(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.after(java.lang.String)",
      "begin_line": 315,
      "end_line": 320,
      "comment": "\n     * Insert the supplied HTML after each matched element\u0027s outer HTML.\n     * @param html HTML to insert after each element\n     * @return this, for chaining\n     * @see Element#after(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.wrap(java.lang.String)",
      "begin_line": 331,
      "end_line": 337,
      "comment": "\n     Wrap the supplied HTML around each matched elements. For example, with HTML\n     {@code \u003cp\u003e\u003cb\u003eThis\u003c/b\u003e is \u003cb\u003eJsoup\u003c/b\u003e\u003c/p\u003e},\n     \u003ccode\u003edoc.select(\"b\").wrap(\"\u0026lt;i\u0026gt;\u0026lt;/i\u0026gt;\");\u003c/code\u003e\n     becomes {@code \u003cp\u003e\u003ci\u003e\u003cb\u003eThis\u003c/b\u003e\u003c/i\u003e is \u003ci\u003e\u003cb\u003ejsoup\u003c/b\u003e\u003c/i\u003e\u003c/p\u003e}\n     @param html HTML to wrap around each element, e.g. {@code \u003cdiv class\u003d\"head\"\u003e\u003c/div\u003e}. Can be arbitrarily deep.\n     @return this (for chaining)\n     @see Element#wrap\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.unwrap()",
      "begin_line": 352,
      "end_line": 357,
      "comment": "\n     * Removes the matched elements from the DOM, and moves their children up into their parents. This has the effect of\n     * dropping the elements but keeping their children.\n     * \u003cp/\u003e\n     * This is useful for e.g removing unwanted formatting elements but keeping their contents.\n     * \u003cp/\u003e\n     * E.g. with HTML: {@code \u003cdiv\u003e\u003cfont\u003eOne\u003c/font\u003e \u003cfont\u003e\u003ca href\u003d\"/\"\u003eTwo\u003c/a\u003e\u003c/font\u003e\u003c/div\u003e}\u003cbr/\u003e\n     * {@code doc.select(\"font\").unwrap();}\u003cbr/\u003e\n     * HTML \u003d {@code \u003cdiv\u003eOne \u003ca href\u003d\"/\"\u003eTwo\u003c/a\u003e\u003c/div\u003e}\n     *\n     * @return this (for chaining)\n     * @see Node#unwrap\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.empty()",
      "begin_line": 370,
      "end_line": 375,
      "comment": "\n     * Empty (remove all child nodes from) each matched element. This is similar to setting the inner HTML of each\n     * element to nothing.\n     * \u003cp\u003e\n     * E.g. HTML: {@code \u003cdiv\u003e\u003cp\u003eHello \u003cb\u003ethere\u003c/b\u003e\u003c/p\u003e \u003cp\u003enow\u003c/p\u003e\u003c/div\u003e}\u003cbr\u003e\n     * \u003ccode\u003edoc.select(\"p\").empty();\u003c/code\u003e\u003cbr\u003e\n     * HTML \u003d {@code \u003cdiv\u003e\u003cp\u003e\u003c/p\u003e \u003cp\u003e\u003c/p\u003e\u003c/div\u003e}\n     * @return this, for chaining\n     * @see Element#empty()\n     * @see #remove()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.remove()",
      "begin_line": 389,
      "end_line": 394,
      "comment": "\n     * Remove each matched element from the DOM. This is similar to setting the outer HTML of each element to nothing.\n     * \u003cp\u003e\n     * E.g. HTML: {@code \u003cdiv\u003e\u003cp\u003eHello\u003c/p\u003e \u003cp\u003ethere\u003c/p\u003e \u003cimg /\u003e\u003c/div\u003e}\u003cbr\u003e\n     * \u003ccode\u003edoc.select(\"p\").remove();\u003c/code\u003e\u003cbr\u003e\n     * HTML \u003d {@code \u003cdiv\u003e \u003cimg /\u003e\u003c/div\u003e}\n     * \u003cp\u003e\n     * Note that this method should not be used to clean user-submitted HTML; rather, use {@link org.jsoup.safety.Cleaner} to clean HTML.\n     * @return this, for chaining\n     * @see Element#empty()\n     * @see #empty()\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.select(java.lang.String)",
      "begin_line": 403,
      "end_line": 405,
      "comment": "\n     * Find matching elements within this element list.\n     * @param query A {@link Selector} query\n     * @return the filtered list of elements, or an empty list if none match.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.not(java.lang.String)",
      "begin_line": 417,
      "end_line": 420,
      "comment": "\n     * Remove elements from this list that do not match the {@link Selector} query.\n     * \u003cp\u003e\n     * E.g. HTML: {@code \u003cdiv class\u003dlogo\u003eOne\u003c/div\u003e \u003cdiv\u003eTwo\u003c/div\u003e}\u003cbr\u003e\n     * \u003ccode\u003eElements divs \u003d doc.select(\"div\").not(\"#logo\");\u003c/code\u003e\u003cbr\u003e\n     * Result: {@code divs: [\u003cdiv\u003eTwo\u003c/div\u003e]}\n     * \u003cp\u003e\n     * @param query the selector query whose results should be removed from these elements\n     * @return a new elements list that contains only the filtered results\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.eq(int)",
      "begin_line": 429,
      "end_line": 431,
      "comment": "\n     * Get the \u003ci\u003enth\u003c/i\u003e matched element as an Elements object.\n     * \u003cp\u003e\n     * See also {@link #get(int)} to retrieve an Element.\n     * @param index the (zero-based) index of the element in the list to retain\n     * @return Elements containing only the specified element, or, if that element did not exist, an empty list.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.is(java.lang.String)",
      "begin_line": 438,
      "end_line": 441,
      "comment": "\n     * Test if any of the matched elements match the supplied query.\n     * @param query A selector\n     * @return true if at least one element in the list matches the query.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.parents()",
      "begin_line": 447,
      "end_line": 453,
      "comment": "\n     * Get all of the parents and ancestor elements of the matched elements.\n     * @return all of the parents and ancestor elements of the matched elements\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.first()",
      "begin_line": 460,
      "end_line": 462,
      "comment": "\n     Get the first matched element.\n     @return The first matched element, or \u003ccode\u003enull\u003c/code\u003e if contents is empty;\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.last()",
      "begin_line": 468,
      "end_line": 470,
      "comment": "\n     Get the last matched element.\n     @return The last matched element, or \u003ccode\u003enull\u003c/code\u003e if contents is empty.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.traverse(org.jsoup.select.NodeVisitor)",
      "begin_line": 477,
      "end_line": 484,
      "comment": "\n     * Perform a depth-first traversal on each of the selected elements.\n     * @param nodeVisitor the visitor callbacks to perform on each node\n     * @return this, for chaining\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.size()",
      "begin_line": 487,
      "end_line": 487,
      "comment": " implements List\u003cElement\u003e delegates:"
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.isEmpty()",
      "begin_line": 489,
      "end_line": 489,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.contains(java.lang.Object)",
      "begin_line": 491,
      "end_line": 491,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.iterator()",
      "begin_line": 493,
      "end_line": 493,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.toArray()",
      "begin_line": 495,
      "end_line": 495,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.toArray(T[])",
      "begin_line": 497,
      "end_line": 497,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.add(org.jsoup.nodes.Element)",
      "begin_line": 499,
      "end_line": 499,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.remove(java.lang.Object)",
      "begin_line": 501,
      "end_line": 501,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 503,
      "end_line": 503,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.addAll(java.util.Collection\u003c? extends org.jsoup.nodes.Element\u003e)",
      "begin_line": 505,
      "end_line": 505,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.addAll(int, java.util.Collection\u003c? extends org.jsoup.nodes.Element\u003e)",
      "begin_line": 507,
      "end_line": 507,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 509,
      "end_line": 509,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 511,
      "end_line": 511,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.clear()",
      "begin_line": 513,
      "end_line": 513,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.equals(java.lang.Object)",
      "begin_line": 515,
      "end_line": 515,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.hashCode()",
      "begin_line": 517,
      "end_line": 517,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.get(int)",
      "begin_line": 519,
      "end_line": 519,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.set(int, org.jsoup.nodes.Element)",
      "begin_line": 521,
      "end_line": 521,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.add(int, org.jsoup.nodes.Element)",
      "begin_line": 523,
      "end_line": 523,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.remove(int)",
      "begin_line": 525,
      "end_line": 525,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.indexOf(java.lang.Object)",
      "begin_line": 527,
      "end_line": 527,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.lastIndexOf(java.lang.Object)",
      "begin_line": 529,
      "end_line": 529,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.listIterator()",
      "begin_line": 531,
      "end_line": 531,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.listIterator(int)",
      "begin_line": 533,
      "end_line": 533,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Elements.subList(int, int)",
      "begin_line": 535,
      "end_line": 535,
      "comment": ""
    }
  ]
}