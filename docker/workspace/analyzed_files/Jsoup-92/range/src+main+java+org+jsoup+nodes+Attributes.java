{
  "filepath": "/tmp/Jsoup-92f/src/main/java/org/jsoup/nodes/Attributes.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Attributes",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003corg.jsoup.nodes.Attribute\u003e",
        "java.lang.Cloneable"
      ],
      "begin_line": 34,
      "end_line": 482,
      "comment": "\n * The attributes of an Element.\n * \u003cp\u003e\n * Attributes are treated as a map: there can be only one value associated with an attribute key/name.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Attribute name and value comparisons are  generally \u003cb\u003ecase sensitive\u003c/b\u003e. By default for HTML, attribute names are\n * normalized to lower-case on parsing. That means you should use lower-case strings when referring to attributes by\n * name.\n * \u003c/p\u003e\n *\n * @author Jonathan Hedley, jonathan@hedley.net\n "
    },
    {
      "type": "field",
      "varNames": [
        "dataPrefix"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "InitialCapacity"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " todo - analyze Alexa 1MM sites, determine best setting"
    },
    {
      "type": "field",
      "varNames": [
        "GrowthFactor"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " manages the key/val arrays"
    },
    {
      "type": "field",
      "varNames": [
        "Empty"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NotFound"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EmptyString"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " number of slots used (not capacity, which is keys.length"
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vals"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.checkCapacity(int)",
      "begin_line": 49,
      "end_line": 61,
      "comment": " check there\u0027s room for more"
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.copyOf(java.lang.String[], int)",
      "begin_line": 64,
      "end_line": 69,
      "comment": " simple implementation of Arrays.copy, for support of Android API 8."
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.indexOfKey(java.lang.String)",
      "begin_line": 71,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(java.lang.String)",
      "begin_line": 80,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.checkNotNull(java.lang.String)",
      "begin_line": 90,
      "end_line": 92,
      "comment": " we track boolean attributes as null in values - they\u0027re just keys. so returns empty for consumers"
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.get(java.lang.String)",
      "begin_line": 100,
      "end_line": 103,
      "comment": "\n     Get an attribute value by key.\n     @param key the (case-sensitive) attribute key\n     @return the attribute value if set; or empty string if not set (or a boolean attribute).\n     @see #hasKey(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.getIgnoreCase(java.lang.String)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n     * Get an attribute\u0027s value by case-insensitive key\n     * @param key the attribute name\n     * @return the first matching attribute value if set; or empty string if not set (ora boolean attribute).\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.add(java.lang.String, java.lang.String)",
      "begin_line": 119,
      "end_line": 125,
      "comment": "\n     * Adds a new attribute. Will produce duplicates if the key already exists.\n     * @see Attributes#put(String, String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.put(java.lang.String, java.lang.String)",
      "begin_line": 133,
      "end_line": 140,
      "comment": "\n     * Set a new attribute, or replace an existing one by key.\n     * @param key case sensitive attribute key\n     * @param value attribute value\n     * @return these attributes, for chaining\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.putIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 142,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.put(java.lang.String, boolean)",
      "begin_line": 159,
      "end_line": 165,
      "comment": "\n     * Set a new boolean attribute, remove attribute if value is false.\n     * @param key case \u003cb\u003einsensitive\u003c/b\u003e attribute key\n     * @param value attribute value\n     * @return these attributes, for chaining\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.put(org.jsoup.nodes.Attribute)",
      "begin_line": 172,
      "end_line": 177,
      "comment": "\n     Set a new attribute, or replace an existing one by key.\n     @param attribute attribute with case sensitive key\n     @return these attributes, for chaining\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.remove(int)",
      "begin_line": 180,
      "end_line": 190,
      "comment": " removes and shifts up"
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.remove(java.lang.String)",
      "begin_line": 196,
      "end_line": 200,
      "comment": "\n     Remove an attribute by key. \u003cb\u003eCase sensitive.\u003c/b\u003e\n     @param key attribute key to remove\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.removeIgnoreCase(java.lang.String)",
      "begin_line": 206,
      "end_line": 210,
      "comment": "\n     Remove an attribute by key. \u003cb\u003eCase insensitive.\u003c/b\u003e\n     @param key attribute key to remove\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.hasKey(java.lang.String)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     Tests if these attributes contain an attribute with this key.\n     @param key case-sensitive key to check for\n     @return true if key exists, false otherwise\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.hasKeyIgnoreCase(java.lang.String)",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     Tests if these attributes contain an attribute with this key.\n     @param key key to check for\n     @return true if key exists, false otherwise\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.size()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     Get the number of attributes in this set.\n     @return size\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.isEmpty()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\n     * Test if this Attributes list is empty (size\u003d\u003d0).\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.addAll(org.jsoup.nodes.Attributes)",
      "begin_line": 249,
      "end_line": 259,
      "comment": "\n     Add all the attributes from the incoming set to this set.\n     @param incoming attributes to add to these attributes.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.iterator()",
      "begin_line": 261,
      "end_line": 282,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Anonymous-503b2e50-e29d-4922-8887-7f976e9941ce.hasNext()",
      "begin_line": 265,
      "end_line": 268,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Anonymous-34acbf82-7c18-44b3-a97e-2a4febd512ae.next()",
      "begin_line": 270,
      "end_line": 275,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Anonymous-f42c6bd4-c432-4e25-94b2-b438125073e2.remove()",
      "begin_line": 277,
      "end_line": 280,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.asList()",
      "begin_line": 288,
      "end_line": 297,
      "comment": "\n     Get the attributes as a List, for iteration.\n     @return an view of the attributes as an unmodifialbe List.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.dataset()",
      "begin_line": 304,
      "end_line": 306,
      "comment": "\n     * Retrieves a filtered view of attributes that are HTML5 custom data attributes; that is, attributes with keys\n     * starting with {@code data-}.\n     * @return map of custom data attributes.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.html()",
      "begin_line": 313,
      "end_line": 321,
      "comment": "\n     Get the HTML representation of these attributes.\n     @return HTML\n     @throws SerializationException if the HTML representation of the attributes cannot be constructed.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.html(java.lang.Appendable, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 323,
      "end_line": 338,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.toString()",
      "begin_line": 340,
      "end_line": 343,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.equals(java.lang.Object)",
      "begin_line": 350,
      "end_line": 360,
      "comment": "\n     * Checks if these attributes are equal to another set of attributes, by comparing the two sets\n     * @param o attributes to compare with\n     * @return if both sets of attributes have the same content\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.hashCode()",
      "begin_line": 366,
      "end_line": 372,
      "comment": "\n     * Calculates the hashcode of these attributes, by iterating all attributes and summing their hashcodes.\n     * @return calculated hashcode\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.clone()",
      "begin_line": 374,
      "end_line": 386,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.normalize()",
      "begin_line": 391,
      "end_line": 395,
      "comment": "\n     * Internal method. Lowercases all keys.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.deduplicate(org.jsoup.parser.ParseSettings)",
      "begin_line": 402,
      "end_line": 419,
      "comment": "\n     * Internal method. Removes duplicate attribute by name. Settings for case sensitivity of key names.\n     * @param settings case sensitivity\n     * @return number of removed dupes\n     "
    },
    {
      "type": "class_interface",
      "name": "Dataset",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractMap\u003cjava.lang.String, java.lang.String\u003e"
      ],
      "begin_line": 421,
      "end_line": 477,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attributes"
      ],
      "begin_line": 422,
      "end_line": 422,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Attributes.Dataset.Dataset(org.jsoup.nodes.Attributes)",
      "begin_line": 424,
      "end_line": 426,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.entrySet()",
      "begin_line": 428,
      "end_line": 431,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.put(java.lang.String, java.lang.String)",
      "begin_line": 433,
      "end_line": 439,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "EntrySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cjava.util.Map.Entry\u003cjava.lang.String, java.lang.String\u003e\u003e"
      ],
      "begin_line": 441,
      "end_line": 456,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.EntrySet.iterator()",
      "begin_line": 443,
      "end_line": 446,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.EntrySet.size()",
      "begin_line": 448,
      "end_line": 455,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "DatasetIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cjava.util.Map.Entry\u003cjava.lang.String, java.lang.String\u003e\u003e"
      ],
      "begin_line": 458,
      "end_line": 476,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attrIter"
      ],
      "begin_line": 459,
      "end_line": 459,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attr"
      ],
      "begin_line": 460,
      "end_line": 460,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.DatasetIterator.hasNext()",
      "begin_line": 461,
      "end_line": 467,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.DatasetIterator.next()",
      "begin_line": 469,
      "end_line": 471,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.DatasetIterator.remove()",
      "begin_line": 473,
      "end_line": 475,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.dataKey(java.lang.String)",
      "begin_line": 479,
      "end_line": 481,
      "comment": ""
    }
  ]
}