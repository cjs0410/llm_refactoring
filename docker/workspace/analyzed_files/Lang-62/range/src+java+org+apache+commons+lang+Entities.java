{
  "filepath": "/tmp/Lang-62f/src/java/org/apache/commons/lang/Entities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Entities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 955,
      "comment": "\n * \u003cp\u003eProvides HTML and XML entity utilities.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://hotwired.lycos.com/webmonkey/reference/special_characters/\"\u003eISO Entities\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html32#latin1\"\u003eHTML 3.2 Character Entities for ISO Latin-1\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html40/sgml/entities.html\"\u003eHTML 4.0 Character entity references\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#h-5.3\"\u003eHTML 4.01 Character References\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#code-position\"\u003eHTML 4.01 Code positions\u003c/a\u003e\n *\n * @author \u003ca href\u003d\"mailto:alex@purpletech.com\"\u003eAlexander Day Chaffee\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "BASIC_ARRAY"
      ],
      "begin_line": 41,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "APOS_ARRAY"
      ],
      "begin_line": 48,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ISO8859_1_ARRAY"
      ],
      "begin_line": 53,
      "end_line": 150,
      "comment": " package scoped for testing"
    },
    {
      "type": "field",
      "varNames": [
        "HTML40_ARRAY"
      ],
      "begin_line": 154,
      "end_line": 348,
      "comment": " package scoped for testing"
    },
    {
      "type": "field",
      "varNames": [
        "XML"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": "\n     * \u003cp\u003eThe set of entities supported by standard XML.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "HTML32"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": "\n     * \u003cp\u003eThe set of entities supported by HTML 3.2.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "HTML40"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": "\n     * \u003cp\u003eThe set of entities supported by HTML 4.0.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.fillWithHtml40Entities(org.apache.commons.lang.Entities)",
      "begin_line": 387,
      "end_line": 391,
      "comment": "\n     * \u003cp\u003eFills the specified entities instance with HTML 40 entities.\u003c/p\u003e\n     * \n     * @param entities the instance to be filled.\n     "
    },
    {
      "type": "class_interface",
      "name": "EntityMap",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 393,
      "end_line": 417,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.EntityMap.add(java.lang.String, int)",
      "begin_line": 400,
      "end_line": 400,
      "comment": "\n         * \u003cp\u003eAdd an entry to this entity map.\u003c/p\u003e\n         * \n         * @param name the entity name\n         * @param value the entity value\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.EntityMap.name(int)",
      "begin_line": 408,
      "end_line": 408,
      "comment": "\n         * \u003cp\u003eReturns the name of the entity identified by the specified value.\u003c/p\u003e\n         * \n         * @param value the value to locate\n         * @return entity name associated with the specified value\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.EntityMap.value(java.lang.String)",
      "begin_line": 416,
      "end_line": 416,
      "comment": "\n         * \u003cp\u003eReturns the value of the entity identified by the specified name.\u003c/p\u003e\n         * \n         * @param name the name to locate\n         * @return entity value associated with the specified name\n         "
    },
    {
      "type": "class_interface",
      "name": "PrimitiveEntityMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.Entities.EntityMap"
      ],
      "begin_line": 419,
      "end_line": 448,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mapNameToValue"
      ],
      "begin_line": 420,
      "end_line": 420,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mapValueToName"
      ],
      "begin_line": 421,
      "end_line": 421,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.PrimitiveEntityMap.add(java.lang.String, int)",
      "begin_line": 426,
      "end_line": 429,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.PrimitiveEntityMap.name(int)",
      "begin_line": 434,
      "end_line": 436,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.PrimitiveEntityMap.value(java.lang.String)",
      "begin_line": 441,
      "end_line": 447,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "MapIntMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.Entities.EntityMap"
      ],
      "begin_line": 451,
      "end_line": 480,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mapNameToValue"
      ],
      "begin_line": 452,
      "end_line": 452,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mapValueToName"
      ],
      "begin_line": 453,
      "end_line": 453,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.MapIntMap.add(java.lang.String, int)",
      "begin_line": 458,
      "end_line": 461,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.MapIntMap.name(int)",
      "begin_line": 466,
      "end_line": 468,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.MapIntMap.value(java.lang.String)",
      "begin_line": 473,
      "end_line": 479,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "HashEntityMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.Entities.MapIntMap"
      ],
      "begin_line": 482,
      "end_line": 490,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.Entities.HashEntityMap.HashEntityMap()",
      "begin_line": 486,
      "end_line": 489,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eHashEntityMap\u003c/code\u003e.\n         "
    },
    {
      "type": "class_interface",
      "name": "TreeEntityMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.Entities.MapIntMap"
      ],
      "begin_line": 492,
      "end_line": 500,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.Entities.TreeEntityMap.TreeEntityMap()",
      "begin_line": 496,
      "end_line": 499,
      "comment": "\n       * Constructs a new instance of \u003ccode\u003eTreeEntityMap\u003c/code\u003e.\n       "
    },
    {
      "type": "class_interface",
      "name": "LookupEntityMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.Entities.PrimitiveEntityMap"
      ],
      "begin_line": 502,
      "end_line": 538,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lookupTable"
      ],
      "begin_line": 503,
      "end_line": 503,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOOKUP_TABLE_SIZE"
      ],
      "begin_line": 504,
      "end_line": 504,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.LookupEntityMap.name(int)",
      "begin_line": 509,
      "end_line": 514,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.LookupEntityMap.lookupTable()",
      "begin_line": 522,
      "end_line": 527,
      "comment": "\n         * \u003cp\u003eReturns the lookup table for this entity map. The lookup table is created if it has not been \n         * previously.\u003c/p\u003e\n         * \n         * @return the lookup table\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.LookupEntityMap.createLookupTable()",
      "begin_line": 532,
      "end_line": 537,
      "comment": "\n         * \u003cp\u003eCreates an entity lookup table of LOOKUP_TABLE_SIZE elements, initialized with entity names.\u003c/p\u003e\n         "
    },
    {
      "type": "class_interface",
      "name": "ArrayEntityMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.Entities.EntityMap"
      ],
      "begin_line": 540,
      "end_line": 616,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "growBy"
      ],
      "begin_line": 541,
      "end_line": 541,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 542,
      "end_line": 542,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 543,
      "end_line": 543,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 544,
      "end_line": 544,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.Entities.ArrayEntityMap.ArrayEntityMap()",
      "begin_line": 549,
      "end_line": 552,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eArrayEntityMap\u003c/code\u003e.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.Entities.ArrayEntityMap.ArrayEntityMap(int)",
      "begin_line": 560,
      "end_line": 564,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eArrayEntityMap\u003c/code\u003e\n         * specifying the size by which the array should grow.\n         * \n         * @param growBy array will be initialized to and will grow by this amount\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.ArrayEntityMap.add(java.lang.String, int)",
      "begin_line": 569,
      "end_line": 574,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.ArrayEntityMap.ensureCapacity(int)",
      "begin_line": 581,
      "end_line": 591,
      "comment": "\n         * Verifies the capacity of the entity array, adjusting the size if necessary.\n         * \n         * @param capacity size the array should be\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.ArrayEntityMap.name(int)",
      "begin_line": 596,
      "end_line": 603,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.ArrayEntityMap.value(java.lang.String)",
      "begin_line": 608,
      "end_line": 615,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "BinaryEntityMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.Entities.ArrayEntityMap"
      ],
      "begin_line": 618,
      "end_line": 690,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.Entities.BinaryEntityMap.BinaryEntityMap()",
      "begin_line": 623,
      "end_line": 625,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eBinaryEntityMap\u003c/code\u003e.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.Entities.BinaryEntityMap.BinaryEntityMap(int)",
      "begin_line": 633,
      "end_line": 635,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eArrayEntityMap\u003c/code\u003e\n         * specifying the size by which the underlying array should grow.\n         * \n         * @param growBy array will be initialized to and will grow by this amount\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.BinaryEntityMap.binarySearch(int)",
      "begin_line": 644,
      "end_line": 661,
      "comment": "\n         * Performs a binary search of the entity array for the specified key.\n         * This method is based on code in {@link java.util.Arrays}.\n         * \n         * @param key the key to be found\n         * @return the index of the entity array matching the specified key\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.BinaryEntityMap.add(java.lang.String, int)",
      "begin_line": 666,
      "end_line": 678,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.BinaryEntityMap.name(int)",
      "begin_line": 683,
      "end_line": 689,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 693,
      "end_line": 693,
      "comment": " package scoped for testing"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.addEntities(java.lang.String[][])",
      "begin_line": 700,
      "end_line": 704,
      "comment": "\n     * \u003cp\u003eAdds entities to this entity.\u003c/p\u003e\n     * \n     * @param entityArray array of entities to be added\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.addEntity(java.lang.String, int)",
      "begin_line": 712,
      "end_line": 714,
      "comment": "\n     * \u003cp\u003eAdd an entity to this entity.\u003c/p\u003e\n     * \n     * @param name name of the entity\n     * @param value vale of the entity\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.entityName(int)",
      "begin_line": 722,
      "end_line": 724,
      "comment": "\n     * \u003cp\u003eReturns the name of the entity identified by the specified value.\u003c/p\u003e\n     * \n     * @param value the value to locate\n     * @return entity name associated with the specified value\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.entityValue(java.lang.String)",
      "begin_line": 732,
      "end_line": 734,
      "comment": "\n     * \u003cp\u003eReturns the value of the entity identified by the specified name.\u003c/p\u003e\n     * \n     * @param name the name to locate\n     * @return entity value associated with the specified name\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.escape(java.lang.String)",
      "begin_line": 745,
      "end_line": 768,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you have called addEntity(\u0026quot;foo\u0026quot;, 0xA1),\n     * escape(\u0026quot;\\u00A1\u0026quot;) will return \u0026quot;\u0026amp;foo;\u0026quot;\u003c/p\u003e\n     *\n     * @param str The \u003ccode\u003eString\u003c/code\u003e to escape.\n     * @return A new escaped \u003ccode\u003eString\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.escape(java.io.Writer, java.lang.String)",
      "begin_line": 783,
      "end_line": 802,
      "comment": "\n     * \u003cp\u003eEscapes the characters in the \u003ccode\u003eString\u003c/code\u003e passed and writes the result\n     * to the \u003ccode\u003eWriter\u003c/code\u003e passed. \u003c/p\u003e\n     * \n     * @param writer The \u003ccode\u003eWriter\u003c/code\u003e to write the results of the escaping to.\n     *                            Assumed to be a non-null value.\n     * @param str The \u003ccode\u003eString\u003c/code\u003e to escape. Assumed to be a non-null value.\n     * @throws IOException when \u003ccode\u003eWriter\u003c/code\u003e passed throws the exception from\n     *                                       calls to the {@link Writer#write(int)} methods.\n     *                                       \n     * @see #escape(String)\n     * @see Writer\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.unescape(java.lang.String)",
      "begin_line": 813,
      "end_line": 873,
      "comment": "\n     * \u003cp\u003eUnescapes the entities in a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you have called addEntity(\u0026quot;foo\u0026quot;, 0xA1),\n     * unescape(\u0026quot;\u0026amp;foo;\u0026quot;) will return \u0026quot;\\u00A1\u0026quot;\u003c/p\u003e\n     *\n     * @param str The \u003ccode\u003eString\u003c/code\u003e to escape.\n     * @return A new escaped \u003ccode\u003eString\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.unescape(java.io.Writer, java.lang.String)",
      "begin_line": 887,
      "end_line": 953,
      "comment": "\n     * \u003cp\u003eUnescapes the escaped entities in the \u003ccode\u003eString\u003c/code\u003e passed and\n     * writes the result to the \u003ccode\u003eWriter\u003c/code\u003e passed.\u003c/p\u003e\n     * \n     * @param writer The \u003ccode\u003eWriter\u003c/code\u003e to write the results to; assumed to be non-null.\n     * @param string The \u003ccode\u003eString\u003c/code\u003e to write the results to; assumed to be non-null.\n     * @throws IOException when \u003ccode\u003eWriter\u003c/code\u003e passed throws the exception from\n     *                                       calls to the {@link Writer#write(int)} methods.\n     *                                       \n     * @see #escape(String)\n     * @see Writer\n     "
    }
  ]
}