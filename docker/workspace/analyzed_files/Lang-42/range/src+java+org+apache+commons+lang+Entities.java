{
  "filepath": "/tmp/Lang-42f/src/java/org/apache/commons/lang/Entities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Entities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 995,
      "comment": "\n * \u003cp\u003e\n * Provides HTML and XML entity utilities.\n * \u003c/p\u003e\n * \n * @see \u003ca href\u003d\"http://hotwired.lycos.com/webmonkey/reference/special_characters/\"\u003eISO Entities\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html32#latin1\"\u003eHTML 3.2 Character Entities for ISO Latin-1\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html40/sgml/entities.html\"\u003eHTML 4.0 Character entity references\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#h-5.3\"\u003eHTML 4.01 Character References\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#code-position\"\u003eHTML 4.01 Code positions\u003c/a\u003e\n * \n * @author \u003ca href\u003d\"mailto:alex@purpletech.com\"\u003eAlexander Day Chaffee\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "BASIC_ARRAY"
      ],
      "begin_line": 45,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "APOS_ARRAY"
      ],
      "begin_line": 51,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ISO8859_1_ARRAY"
      ],
      "begin_line": 55,
      "end_line": 151,
      "comment": " package scoped for testing"
    },
    {
      "type": "field",
      "varNames": [
        "HTML40_ARRAY"
      ],
      "begin_line": 155,
      "end_line": 350,
      "comment": " package scoped for testing"
    },
    {
      "type": "field",
      "varNames": [
        "XML"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": "\n     * \u003cp\u003e\n     * The set of entities supported by standard XML.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "HTML32"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": "\n     * \u003cp\u003e\n     * The set of entities supported by HTML 3.2.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "HTML40"
      ],
      "begin_line": 371,
      "end_line": 371,
      "comment": "\n     * \u003cp\u003e\n     * The set of entities supported by HTML 4.0.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.fillWithHtml40Entities(org.apache.commons.lang.Entities)",
      "begin_line": 398,
      "end_line": 402,
      "comment": "\n     * \u003cp\u003e\n     * Fills the specified entities instance with HTML 40 entities.\n     * \u003c/p\u003e\n     * \n     * @param entities\n     *            the instance to be filled.\n     "
    },
    {
      "type": "class_interface",
      "name": "EntityMap",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 404,
      "end_line": 438,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.EntityMap.add(java.lang.String, int)",
      "begin_line": 415,
      "end_line": 415,
      "comment": "\n         * \u003cp\u003e\n         * Add an entry to this entity map.\n         * \u003c/p\u003e\n         * \n         * @param name\n         *            the entity name\n         * @param value\n         *            the entity value\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.EntityMap.name(int)",
      "begin_line": 426,
      "end_line": 426,
      "comment": "\n         * \u003cp\u003e\n         * Returns the name of the entity identified by the specified value.\n         * \u003c/p\u003e\n         * \n         * @param value\n         *            the value to locate\n         * @return entity name associated with the specified value\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.EntityMap.value(java.lang.String)",
      "begin_line": 437,
      "end_line": 437,
      "comment": "\n         * \u003cp\u003e\n         * Returns the value of the entity identified by the specified name.\n         * \u003c/p\u003e\n         * \n         * @param name\n         *            the name to locate\n         * @return entity value associated with the specified name\n         "
    },
    {
      "type": "class_interface",
      "name": "PrimitiveEntityMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.Entities.EntityMap"
      ],
      "begin_line": 440,
      "end_line": 470,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mapNameToValue"
      ],
      "begin_line": 441,
      "end_line": 441,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mapValueToName"
      ],
      "begin_line": 443,
      "end_line": 443,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.PrimitiveEntityMap.add(java.lang.String, int)",
      "begin_line": 448,
      "end_line": 451,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.PrimitiveEntityMap.name(int)",
      "begin_line": 456,
      "end_line": 458,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.PrimitiveEntityMap.value(java.lang.String)",
      "begin_line": 463,
      "end_line": 469,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "MapIntMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.Entities.EntityMap"
      ],
      "begin_line": 472,
      "end_line": 502,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mapNameToValue"
      ],
      "begin_line": 473,
      "end_line": 473,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mapValueToName"
      ],
      "begin_line": 475,
      "end_line": 475,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.MapIntMap.add(java.lang.String, int)",
      "begin_line": 480,
      "end_line": 483,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.MapIntMap.name(int)",
      "begin_line": 488,
      "end_line": 490,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.MapIntMap.value(java.lang.String)",
      "begin_line": 495,
      "end_line": 501,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "HashEntityMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.Entities.MapIntMap"
      ],
      "begin_line": 504,
      "end_line": 512,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.Entities.HashEntityMap.HashEntityMap()",
      "begin_line": 508,
      "end_line": 511,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eHashEntityMap\u003c/code\u003e.\n         "
    },
    {
      "type": "class_interface",
      "name": "TreeEntityMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.Entities.MapIntMap"
      ],
      "begin_line": 514,
      "end_line": 522,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.Entities.TreeEntityMap.TreeEntityMap()",
      "begin_line": 518,
      "end_line": 521,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eTreeEntityMap\u003c/code\u003e.\n         "
    },
    {
      "type": "class_interface",
      "name": "LookupEntityMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.Entities.PrimitiveEntityMap"
      ],
      "begin_line": 524,
      "end_line": 564,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lookupTable"
      ],
      "begin_line": 525,
      "end_line": 525,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOOKUP_TABLE_SIZE"
      ],
      "begin_line": 527,
      "end_line": 527,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.LookupEntityMap.name(int)",
      "begin_line": 532,
      "end_line": 537,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.LookupEntityMap.lookupTable()",
      "begin_line": 546,
      "end_line": 551,
      "comment": "\n         * \u003cp\u003e\n         * Returns the lookup table for this entity map. The lookup table is created if it has not been previously.\n         * \u003c/p\u003e\n         * \n         * @return the lookup table\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.LookupEntityMap.createLookupTable()",
      "begin_line": 558,
      "end_line": 563,
      "comment": "\n         * \u003cp\u003e\n         * Creates an entity lookup table of LOOKUP_TABLE_SIZE elements, initialized with entity names.\n         * \u003c/p\u003e\n         "
    },
    {
      "type": "class_interface",
      "name": "ArrayEntityMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.Entities.EntityMap"
      ],
      "begin_line": 566,
      "end_line": 647,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "growBy"
      ],
      "begin_line": 567,
      "end_line": 567,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 569,
      "end_line": 569,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 571,
      "end_line": 571,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 573,
      "end_line": 573,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.Entities.ArrayEntityMap.ArrayEntityMap()",
      "begin_line": 578,
      "end_line": 581,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eArrayEntityMap\u003c/code\u003e.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.Entities.ArrayEntityMap.ArrayEntityMap(int)",
      "begin_line": 590,
      "end_line": 594,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eArrayEntityMap\u003c/code\u003e specifying the size by which the array should\n         * grow.\n         * \n         * @param growBy\n         *            array will be initialized to and will grow by this amount\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.ArrayEntityMap.add(java.lang.String, int)",
      "begin_line": 599,
      "end_line": 604,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.ArrayEntityMap.ensureCapacity(int)",
      "begin_line": 612,
      "end_line": 622,
      "comment": "\n         * Verifies the capacity of the entity array, adjusting the size if necessary.\n         * \n         * @param capacity\n         *            size the array should be\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.ArrayEntityMap.name(int)",
      "begin_line": 627,
      "end_line": 634,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.ArrayEntityMap.value(java.lang.String)",
      "begin_line": 639,
      "end_line": 646,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "BinaryEntityMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.Entities.ArrayEntityMap"
      ],
      "begin_line": 649,
      "end_line": 723,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.Entities.BinaryEntityMap.BinaryEntityMap()",
      "begin_line": 654,
      "end_line": 656,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eBinaryEntityMap\u003c/code\u003e.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.Entities.BinaryEntityMap.BinaryEntityMap(int)",
      "begin_line": 665,
      "end_line": 667,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eArrayEntityMap\u003c/code\u003e specifying the size by which the underlying array\n         * should grow.\n         * \n         * @param growBy\n         *            array will be initialized to and will grow by this amount\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.BinaryEntityMap.binarySearch(int)",
      "begin_line": 677,
      "end_line": 694,
      "comment": "\n         * Performs a binary search of the entity array for the specified key. This method is based on code in\n         * {@link java.util.Arrays}.\n         * \n         * @param key\n         *            the key to be found\n         * @return the index of the entity array matching the specified key\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.BinaryEntityMap.add(java.lang.String, int)",
      "begin_line": 699,
      "end_line": 711,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.BinaryEntityMap.name(int)",
      "begin_line": 716,
      "end_line": 722,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 726,
      "end_line": 726,
      "comment": " package scoped for testing"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.addEntities(java.lang.String[][])",
      "begin_line": 736,
      "end_line": 740,
      "comment": "\n     * \u003cp\u003e\n     * Adds entities to this entity.\n     * \u003c/p\u003e\n     * \n     * @param entityArray\n     *            array of entities to be added\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.addEntity(java.lang.String, int)",
      "begin_line": 752,
      "end_line": 754,
      "comment": "\n     * \u003cp\u003e\n     * Add an entity to this entity.\n     * \u003c/p\u003e\n     * \n     * @param name\n     *            name of the entity\n     * @param value\n     *            vale of the entity\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.entityName(int)",
      "begin_line": 765,
      "end_line": 767,
      "comment": "\n     * \u003cp\u003e\n     * Returns the name of the entity identified by the specified value.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the value to locate\n     * @return entity name associated with the specified value\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.entityValue(java.lang.String)",
      "begin_line": 778,
      "end_line": 780,
      "comment": "\n     * \u003cp\u003e\n     * Returns the value of the entity identified by the specified name.\n     * \u003c/p\u003e\n     * \n     * @param name\n     *            the name to locate\n     * @return entity value associated with the specified name\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.escape(java.lang.String)",
      "begin_line": 796,
      "end_line": 806,
      "comment": "\n     * \u003cp\u003e\n     * Escapes the characters in a \u003ccode\u003eString\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * For example, if you have called addEntity(\u0026quot;foo\u0026quot;, 0xA1), escape(\u0026quot;\\u00A1\u0026quot;) will return\n     * \u0026quot;\u0026amp;foo;\u0026quot;\n     * \u003c/p\u003e\n     * \n     * @param str\n     *            The \u003ccode\u003eString\u003c/code\u003e to escape.\n     * @return A new escaped \u003ccode\u003eString\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.escape(java.io.Writer, java.lang.String)",
      "begin_line": 825,
      "end_line": 849,
      "comment": "\n     * \u003cp\u003e\n     * Escapes the characters in the \u003ccode\u003eString\u003c/code\u003e passed and writes the result to the \u003ccode\u003eWriter\u003c/code\u003e\n     * passed.\n     * \u003c/p\u003e\n     * \n     * @param writer\n     *            The \u003ccode\u003eWriter\u003c/code\u003e to write the results of the escaping to. Assumed to be a non-null value.\n     * @param str\n     *            The \u003ccode\u003eString\u003c/code\u003e to escape. Assumed to be a non-null value.\n     * @throws IOException\n     *             when \u003ccode\u003eWriter\u003c/code\u003e passed throws the exception from calls to the {@link Writer#write(int)}\n     *             methods.\n     * \n     * @see #escape(String)\n     * @see Writer\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.unescape(java.lang.String)",
      "begin_line": 865,
      "end_line": 880,
      "comment": "\n     * \u003cp\u003e\n     * Unescapes the entities in a \u003ccode\u003eString\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * For example, if you have called addEntity(\u0026quot;foo\u0026quot;, 0xA1), unescape(\u0026quot;\u0026amp;foo;\u0026quot;) will return\n     * \u0026quot;\\u00A1\u0026quot;\n     * \u003c/p\u003e\n     * \n     * @param str\n     *            The \u003ccode\u003eString\u003c/code\u003e to escape.\n     * @return A new escaped \u003ccode\u003eString\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.createStringWriter(java.lang.String)",
      "begin_line": 888,
      "end_line": 890,
      "comment": "\n     * Make the StringWriter 10% larger than the source String to avoid growing the writer\n     *\n     * @param str The source string\n     * @return A newly created StringWriter\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.unescape(java.io.Writer, java.lang.String)",
      "begin_line": 909,
      "end_line": 917,
      "comment": "\n     * \u003cp\u003e\n     * Unescapes the escaped entities in the \u003ccode\u003eString\u003c/code\u003e passed and writes the result to the\n     * \u003ccode\u003eWriter\u003c/code\u003e passed.\n     * \u003c/p\u003e\n     * \n     * @param writer\n     *            The \u003ccode\u003eWriter\u003c/code\u003e to write the results to; assumed to be non-null.\n     * @param str\n     *            The source \u003ccode\u003eString\u003c/code\u003e to unescape; assumed to be non-null.\n     * @throws IOException\n     *             when \u003ccode\u003eWriter\u003c/code\u003e passed throws the exception from calls to the {@link Writer#write(int)}\n     *             methods.\n     * \n     * @see #escape(String)\n     * @see Writer\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.doUnescape(java.io.Writer, java.lang.String, int)",
      "begin_line": 932,
      "end_line": 993,
      "comment": "\n     * Underlying unescape method that allows the optimisation of not starting from the 0 index again.\n     *\n     * @param writer\n     *            The \u003ccode\u003eWriter\u003c/code\u003e to write the results to; assumed to be non-null.\n     * @param str\n     *            The source \u003ccode\u003eString\u003c/code\u003e to unescape; assumed to be non-null.\n     * @param firstAmp\n     *            The \u003ccode\u003eint\u003c/code\u003e index of the first ampersand in the source String.\n     * @throws IOException\n     *             when \u003ccode\u003eWriter\u003c/code\u003e passed throws the exception from calls to the {@link Writer#write(int)}\n     *             methods.\n     "
    }
  ]
}