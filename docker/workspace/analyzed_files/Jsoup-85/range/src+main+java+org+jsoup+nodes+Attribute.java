{
  "filepath": "/tmp/Jsoup-85f/src/main/java/org/jsoup/nodes/Attribute.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Attribute",
      "is_interface": false,
      "parent_types": [
        "java.util.Map.Entry\u003cjava.lang.String, java.lang.String\u003e",
        "java.lang.Cloneable"
      ],
      "begin_line": 14,
      "end_line": 208,
      "comment": "\n A single key + value attribute. (Only used for presentation.)\n "
    },
    {
      "type": "field",
      "varNames": [
        "booleanAttributes"
      ],
      "begin_line": 15,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "val"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": " used to update the holding Attributes when the key / value is changed via this interface"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Attribute.Attribute(java.lang.String, java.lang.String)",
      "begin_line": 32,
      "end_line": 34,
      "comment": "\n     * Create a new attribute from unencoded (raw) key and value.\n     * @param key attribute key; case is preserved.\n     * @param value attribute value\n     * @see #createFromEncoded\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Attribute.Attribute(java.lang.String, java.lang.String, org.jsoup.nodes.Attributes)",
      "begin_line": 42,
      "end_line": 49,
      "comment": "\n     * Create a new attribute from unencoded (raw) key and value.\n     * @param key attribute key; case is preserved.\n     * @param val attribute value\n     * @param parent the containing Attributes (this Attribute is not automatically added to said Attributes)\n     * @see #createFromEncoded"
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.getKey()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     Get the attribute key.\n     @return the attribute key\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.setKey(java.lang.String)",
      "begin_line": 63,
      "end_line": 73,
      "comment": "\n     Set the attribute key; case is preserved.\n     @param key the new key; must not be null\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.getValue()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     Get the attribute value.\n     @return the attribute value\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.setValue(java.lang.String)",
      "begin_line": 87,
      "end_line": 96,
      "comment": "\n     Set the attribute value.\n     @param val the new attribute value; must not be null\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.html()",
      "begin_line": 102,
      "end_line": 111,
      "comment": "\n     Get the HTML representation of this attribute; e.g. {@code href\u003d\"index.html\"}.\n     @return HTML\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.html(java.lang.String, java.lang.String, java.lang.Appendable, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 113,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.html(java.lang.Appendable, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 122,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.toString()",
      "begin_line": 130,
      "end_line": 133,
      "comment": "\n     Get the string representation of this attribute, implemented as {@link #html()}.\n     @return string\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.createFromEncoded(java.lang.String, java.lang.String)",
      "begin_line": 141,
      "end_line": 144,
      "comment": "\n     * Create a new Attribute from an unencoded key and a HTML attribute encoded value.\n     * @param unencodedKey assumes the key is not encoded, as can be only run of simple \\w chars.\n     * @param encodedValue HTML attribute encoded value\n     * @return attribute\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.isDataAttribute()",
      "begin_line": 146,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.isDataAttribute(java.lang.String)",
      "begin_line": 150,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.shouldCollapseAttribute(org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Collapsible if it\u0027s a boolean attribute and value is empty or same as name\n     * \n     * @param out output settings\n     * @return  Returns whether collapsible or not\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.shouldCollapseAttribute(java.lang.String, java.lang.String, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 164,
      "end_line": 168,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.isBooleanAttribute()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * @deprecated\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.isBooleanAttribute(java.lang.String)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Checks if this attribute name is defined as a boolean attribute in HTML5\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.equals(java.lang.Object)",
      "begin_line": 184,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.hashCode()",
      "begin_line": 193,
      "end_line": 198,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.clone()",
      "begin_line": 200,
      "end_line": 207,
      "comment": ""
    }
  ]
}