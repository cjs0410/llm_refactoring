{
  "filepath": "/tmp/Csv-6f/src/main/java/org/apache/commons/csv/CSVRecord.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVRecord",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "java.lang.Iterable\u003cjava.lang.String\u003e"
      ],
      "begin_line": 33,
      "end_line": 227,
      "comment": "\n * A CSV record parsed from a CSV file.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_STRING_ARRAY"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The accumulated comments (if any) "
    },
    {
      "type": "field",
      "varNames": [
        "mapping"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The column name to index mapping. "
    },
    {
      "type": "field",
      "varNames": [
        "recordNumber"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The record number. "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The values of the record "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVRecord.CSVRecord(java.lang.String[], java.util.Map\u003cjava.lang.String, java.lang.Integer\u003e, java.lang.String, long)",
      "begin_line": 51,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.get(java.lang.Enum\u003c?\u003e)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Returns a value by {@link Enum}.\n     *\n     * @param e\n     *            an enum\n     * @return the String at the given enum String\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.get(int)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Returns a value by index.\n     *\n     * @param i\n     *            a column index (0-based)\n     * @return the String at the given index\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.get(java.lang.String)",
      "begin_line": 94,
      "end_line": 111,
      "comment": "\n     * Returns a value by name.\n     *\n     * @param name\n     *            the name of the column to be retrieved.\n     * @return the column value, maybe null depending on {@link CSVFormat#getNullString()}.\n     * @throws IllegalStateException\n     *             if no header mapping was provided\n     * @throws IllegalArgumentException\n     *             if {@code name} is not mapped or if the record is inconsistent\n     * @see #isConsistent()\n     * @see CSVFormat#withNullString(String)\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.getComment()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Returns the comment for this record, if any.\n     *\n     * @return the comment for this record, or null if no comment for this\n     *         record is available.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.getRecordNumber()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Returns the number of this record in the parsed CSV file.\n     *\n     * @return the number of this record.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.isConsistent()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Returns true if this record is consistent, false if not. Currently, the only check is matching the record size to\n     * the header size. Some programs can export files that fails this test but still produce parsable files.\n     *\n     * @return true of this record is valid, false if not\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.isMapped(java.lang.String)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Checks whether a given column is mapped, i.e. its name has been defined to the parser.\n     *\n     * @param name\n     *            the name of the column to be retrieved.\n     * @return whether a given column is mapped.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.isSet(java.lang.String)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Checks whether a given columns is mapped and has a value.\n     *\n     * @param name\n     *            the name of the column to be retrieved.\n     * @return whether a given columns is mapped and has a value\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.iterator()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Returns an iterator over the values of this record.\n     *\n     * @return an iterator over the values of this record.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.putIn(M)",
      "begin_line": 179,
      "end_line": 187,
      "comment": "\n     * Puts all values of this record into the given Map.\n     *\n     * @param map The Map to populate.\n     * @return the given map.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.size()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * Returns the number of values in this record.\n     *\n     * @return the number of values.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.toList()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Converts the values to a List.\n     *\n     * TODO: Maybe make this public?\n     * @return a new List\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.toMap()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * Copies this record into a new Map. The new map is not connect\n     *\n     * @return A new Map. The map is empty if the record has no headers.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.toString()",
      "begin_line": 217,
      "end_line": 220,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.values()",
      "begin_line": 222,
      "end_line": 224,
      "comment": ""
    }
  ]
}