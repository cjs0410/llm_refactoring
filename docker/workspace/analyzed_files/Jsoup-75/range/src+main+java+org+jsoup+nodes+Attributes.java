{
  "filepath": "/tmp/Jsoup-75f/src/main/java/org/jsoup/nodes/Attributes.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Attributes",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003corg.jsoup.nodes.Attribute\u003e",
        "java.lang.Cloneable"
      ],
      "begin_line": 32,
      "end_line": 445,
      "comment": "\n * The attributes of an Element.\n * \u003cp\u003e\n * Attributes are treated as a map: there can be only one value associated with an attribute key/name.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Attribute name and value comparisons are  generally \u003cb\u003ecase sensitive\u003c/b\u003e. By default for HTML, attribute names are\n * normalized to lower-case on parsing. That means you should use lower-case strings when referring to attributes by\n * name.\n * \u003c/p\u003e\n *\n * @author Jonathan Hedley, jonathan@hedley.net\n "
    },
    {
      "type": "field",
      "varNames": [
        "dataPrefix"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "InitialCapacity"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " todo - analyze Alexa 1MM sites, determine best setting"
    },
    {
      "type": "field",
      "varNames": [
        "GrowthFactor"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " manages the key/val arrays"
    },
    {
      "type": "field",
      "varNames": [
        "Empty"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NotFound"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EmptyString"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " number of slots used (not capacity, which is keys.length"
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vals"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.checkCapacity(int)",
      "begin_line": 47,
      "end_line": 59,
      "comment": " check there\u0027s room for more"
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.copyOf(java.lang.String[], int)",
      "begin_line": 62,
      "end_line": 67,
      "comment": " simple implementation of Arrays.copy, for support of Android API 8."
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.indexOfKey(java.lang.String)",
      "begin_line": 69,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(java.lang.String)",
      "begin_line": 78,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.checkNotNull(java.lang.String)",
      "begin_line": 88,
      "end_line": 90,
      "comment": " we track boolean attributes as null in values - they\u0027re just keys. so returns empty for consumers"
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.get(java.lang.String)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     Get an attribute value by key.\n     @param key the (case-sensitive) attribute key\n     @return the attribute value if set; or empty string if not set (or a boolean attribute).\n     @see #hasKey(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.getIgnoreCase(java.lang.String)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * Get an attribute\u0027s value by case-insensitive key\n     * @param key the attribute name\n     * @return the first matching attribute value if set; or empty string if not set (ora boolean attribute).\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.add(java.lang.String, java.lang.String)",
      "begin_line": 114,
      "end_line": 119,
      "comment": " adds without checking if this key exists"
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.put(java.lang.String, java.lang.String)",
      "begin_line": 127,
      "end_line": 134,
      "comment": "\n     * Set a new attribute, or replace an existing one by key.\n     * @param key case sensitive attribute key\n     * @param value attribute value\n     * @return these attributes, for chaining\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.putIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 136,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.put(java.lang.String, boolean)",
      "begin_line": 153,
      "end_line": 159,
      "comment": "\n     * Set a new boolean attribute, remove attribute if value is false.\n     * @param key case \u003cb\u003einsensitive\u003c/b\u003e attribute key\n     * @param value attribute value\n     * @return these attributes, for chaining\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.put(org.jsoup.nodes.Attribute)",
      "begin_line": 166,
      "end_line": 171,
      "comment": "\n     Set a new attribute, or replace an existing one by key.\n     @param attribute attribute with case sensitive key\n     @return these attributes, for chaining\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.remove(int)",
      "begin_line": 174,
      "end_line": 184,
      "comment": " removes and shifts up"
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.remove(java.lang.String)",
      "begin_line": 190,
      "end_line": 194,
      "comment": "\n     Remove an attribute by key. \u003cb\u003eCase sensitive.\u003c/b\u003e\n     @param key attribute key to remove\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.removeIgnoreCase(java.lang.String)",
      "begin_line": 200,
      "end_line": 204,
      "comment": "\n     Remove an attribute by key. \u003cb\u003eCase insensitive.\u003c/b\u003e\n     @param key attribute key to remove\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.hasKey(java.lang.String)",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     Tests if these attributes contain an attribute with this key.\n     @param key case-sensitive key to check for\n     @return true if key exists, false otherwise\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.hasKeyIgnoreCase(java.lang.String)",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     Tests if these attributes contain an attribute with this key.\n     @param key key to check for\n     @return true if key exists, false otherwise\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.size()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     Get the number of attributes in this set.\n     @return size\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.addAll(org.jsoup.nodes.Attributes)",
      "begin_line": 236,
      "end_line": 246,
      "comment": "\n     Add all the attributes from the incoming set to this set.\n     @param incoming attributes to add to these attributes.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.iterator()",
      "begin_line": 248,
      "end_line": 269,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Anonymous-080b2bf3-f96c-4036-a7f7-7ab171b8dc9d.hasNext()",
      "begin_line": 252,
      "end_line": 255,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Anonymous-5c101aae-193e-4a47-b3b5-c94ab5126b0a.next()",
      "begin_line": 257,
      "end_line": 262,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Anonymous-5d3d9c02-9827-4f15-a7e3-30bcb6eca986.remove()",
      "begin_line": 264,
      "end_line": 267,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.asList()",
      "begin_line": 275,
      "end_line": 284,
      "comment": "\n     Get the attributes as a List, for iteration.\n     @return an view of the attributes as an unmodifialbe List.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.dataset()",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\n     * Retrieves a filtered view of attributes that are HTML5 custom data attributes; that is, attributes with keys\n     * starting with {@code data-}.\n     * @return map of custom data attributes.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.html()",
      "begin_line": 300,
      "end_line": 308,
      "comment": "\n     Get the HTML representation of these attributes.\n     @return HTML\n     @throws SerializationException if the HTML representation of the attributes cannot be constructed.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.html(java.lang.Appendable, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 310,
      "end_line": 325,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.toString()",
      "begin_line": 327,
      "end_line": 330,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.equals(java.lang.Object)",
      "begin_line": 337,
      "end_line": 347,
      "comment": "\n     * Checks if these attributes are equal to another set of attributes, by comparing the two sets\n     * @param o attributes to compare with\n     * @return if both sets of attributes have the same content\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.hashCode()",
      "begin_line": 353,
      "end_line": 359,
      "comment": "\n     * Calculates the hashcode of these attributes, by iterating all attributes and summing their hashcodes.\n     * @return calculated hashcode\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.clone()",
      "begin_line": 361,
      "end_line": 373,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.normalize()",
      "begin_line": 378,
      "end_line": 382,
      "comment": "\n     * Internal method. Lowercases all keys.\n     "
    },
    {
      "type": "class_interface",
      "name": "Dataset",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractMap\u003cjava.lang.String, java.lang.String\u003e"
      ],
      "begin_line": 384,
      "end_line": 440,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attributes"
      ],
      "begin_line": 385,
      "end_line": 385,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Attributes.Dataset.Dataset(org.jsoup.nodes.Attributes)",
      "begin_line": 387,
      "end_line": 389,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.entrySet()",
      "begin_line": 391,
      "end_line": 394,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.put(java.lang.String, java.lang.String)",
      "begin_line": 396,
      "end_line": 402,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "EntrySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cjava.util.Map.Entry\u003cjava.lang.String, java.lang.String\u003e\u003e"
      ],
      "begin_line": 404,
      "end_line": 419,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.EntrySet.iterator()",
      "begin_line": 406,
      "end_line": 409,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.EntrySet.size()",
      "begin_line": 411,
      "end_line": 418,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "DatasetIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cjava.util.Map.Entry\u003cjava.lang.String, java.lang.String\u003e\u003e"
      ],
      "begin_line": 421,
      "end_line": 439,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attrIter"
      ],
      "begin_line": 422,
      "end_line": 422,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attr"
      ],
      "begin_line": 423,
      "end_line": 423,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.DatasetIterator.hasNext()",
      "begin_line": 424,
      "end_line": 430,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.DatasetIterator.next()",
      "begin_line": 432,
      "end_line": 434,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.DatasetIterator.remove()",
      "begin_line": 436,
      "end_line": 438,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.dataKey(java.lang.String)",
      "begin_line": 442,
      "end_line": 444,
      "comment": ""
    }
  ]
}