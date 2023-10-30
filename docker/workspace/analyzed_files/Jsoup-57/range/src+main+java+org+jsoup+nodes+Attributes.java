{
  "filepath": "/tmp/Jsoup-57f/src/main/java/org/jsoup/nodes/Attributes.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Attributes",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003corg.jsoup.nodes.Attribute\u003e",
        "java.lang.Cloneable"
      ],
      "begin_line": 30,
      "end_line": 342,
      "comment": "\n * The attributes of an Element.\n * \u003cp\u003e\n * Attributes are treated as a map: there can be only one value associated with an attribute key/name.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Attribute name and value comparisons are  \u003cb\u003ecase sensitive\u003c/b\u003e. By default for HTML, attribute names are\n * normalized to lower-case on parsing. That means you should use lower-case strings when referring to attributes by\n * name.\n * \u003c/p\u003e\n *\n * @author Jonathan Hedley, jonathan@hedley.net\n "
    },
    {
      "type": "field",
      "varNames": [
        "dataPrefix"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attributes"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.get(java.lang.String)",
      "begin_line": 43,
      "end_line": 51,
      "comment": "\n     Get an attribute value by key.\n     @param key the (case-sensitive) attribute key\n     @return the attribute value if set; or empty string if not set.\n     @see #hasKey(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.getIgnoreCase(java.lang.String)",
      "begin_line": 58,
      "end_line": 68,
      "comment": "\n     * Get an attribute\u0027s value by case-insensitive key\n     * @param key the attribute name\n     * @return the first matching attribute value if set; or empty string if not set.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.put(java.lang.String, java.lang.String)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     Set a new attribute, or replace an existing one by key.\n     @param key attribute key\n     @param value attribute value\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.put(java.lang.String, boolean)",
      "begin_line": 85,
      "end_line": 90,
      "comment": "\n    Set a new boolean attribute, remove attribute if value is false.\n    @param key attribute key\n    @param value attribute value\n    "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.put(org.jsoup.nodes.Attribute)",
      "begin_line": 96,
      "end_line": 101,
      "comment": "\n     Set a new attribute, or replace an existing one by key.\n     @param attribute attribute\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.remove(java.lang.String)",
      "begin_line": 107,
      "end_line": 112,
      "comment": "\n     Remove an attribute by key. \u003cb\u003eCase sensitive.\u003c/b\u003e\n     @param key attribute key to remove\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.removeIgnoreCase(java.lang.String)",
      "begin_line": 118,
      "end_line": 127,
      "comment": "\n     Remove an attribute by key. \u003cb\u003eCase insensitive.\u003c/b\u003e\n     @param key attribute key to remove\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.hasKey(java.lang.String)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     Tests if these attributes contain an attribute with this key.\n     @param key case-sensitive key to check for\n     @return true if key exists, false otherwise\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.hasKeyIgnoreCase(java.lang.String)",
      "begin_line": 143,
      "end_line": 151,
      "comment": "\n     Tests if these attributes contain an attribute with this key.\n     @param key key to check for\n     @return true if key exists, false otherwise\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.size()",
      "begin_line": 157,
      "end_line": 161,
      "comment": "\n     Get the number of attributes in this set.\n     @return size\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.addAll(org.jsoup.nodes.Attributes)",
      "begin_line": 167,
      "end_line": 173,
      "comment": "\n     Add all the attributes from the incoming set to this set.\n     @param incoming attributes to add to these attributes.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.iterator()",
      "begin_line": 175,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.asList()",
      "begin_line": 188,
      "end_line": 197,
      "comment": "\n     Get the attributes as a List, for iteration. Do not modify the keys of the attributes via this view, as changes\n     to keys will not be recognised in the containing set.\n     @return an view of the attributes as a List.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.dataset()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Retrieves a filtered view of attributes that are HTML5 custom data attributes; that is, attributes with keys\n     * starting with {@code data-}.\n     * @return map of custom data attributes.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.html()",
      "begin_line": 213,
      "end_line": 221,
      "comment": "\n     Get the HTML representation of these attributes.\n     @return HTML\n     @throws SerializationException if the HTML representation of the attributes cannot be constructed.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.html(java.lang.Appendable, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 223,
      "end_line": 232,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.toString()",
      "begin_line": 234,
      "end_line": 237,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.equals(java.lang.Object)",
      "begin_line": 244,
      "end_line": 252,
      "comment": "\n     * Checks if these attributes are equal to another set of attributes, by comparing the two sets\n     * @param o attributes to compare with\n     * @return if both sets of attributes have the same content\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.hashCode()",
      "begin_line": 258,
      "end_line": 261,
      "comment": "\n     * Calculates the hashcode of these attributes, by iterating all attributes and summing their hashcodes.\n     * @return calculated hashcode\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.clone()",
      "begin_line": 263,
      "end_line": 278,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Dataset",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractMap\u003cjava.lang.String, java.lang.String\u003e"
      ],
      "begin_line": 280,
      "end_line": 337,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Attributes.Dataset.Dataset()",
      "begin_line": 282,
      "end_line": 285,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.entrySet()",
      "begin_line": 287,
      "end_line": 290,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.put(java.lang.String, java.lang.String)",
      "begin_line": 292,
      "end_line": 299,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "EntrySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cjava.util.Map.Entry\u003cjava.lang.String, java.lang.String\u003e\u003e"
      ],
      "begin_line": 301,
      "end_line": 316,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.EntrySet.iterator()",
      "begin_line": 303,
      "end_line": 306,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.EntrySet.size()",
      "begin_line": 308,
      "end_line": 315,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "DatasetIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cjava.util.Map.Entry\u003cjava.lang.String, java.lang.String\u003e\u003e"
      ],
      "begin_line": 318,
      "end_line": 336,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attrIter"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attr"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.DatasetIterator.hasNext()",
      "begin_line": 321,
      "end_line": 327,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.DatasetIterator.next()",
      "begin_line": 329,
      "end_line": 331,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.DatasetIterator.remove()",
      "begin_line": 333,
      "end_line": 335,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.dataKey(java.lang.String)",
      "begin_line": 339,
      "end_line": 341,
      "comment": ""
    }
  ]
}