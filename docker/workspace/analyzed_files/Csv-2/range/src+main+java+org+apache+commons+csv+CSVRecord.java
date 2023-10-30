{
  "filepath": "/tmp/Csv-2f/src/main/java/org/apache/commons/csv/CSVRecord.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVRecord",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "java.lang.Iterable\u003cjava.lang.String\u003e"
      ],
      "begin_line": 30,
      "end_line": 174,
      "comment": "\n * A CSV record parsed from a CSV file.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_STRING_ARRAY"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The values of the record "
    },
    {
      "type": "field",
      "varNames": [
        "mapping"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The column name to index mapping. "
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The accumulated comments (if any) "
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
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVRecord.CSVRecord(java.lang.String[], java.util.Map\u003cjava.lang.String, java.lang.Integer\u003e, java.lang.String, long)",
      "begin_line": 48,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.get(int)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Returns a value by index.\n     *\n     * @param i\n     *            a column index (0-based)\n     * @return the String at the given index\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.get(java.lang.String)",
      "begin_line": 79,
      "end_line": 93,
      "comment": "\n     * Returns a value by name.\n     *\n     * @param name\n     *            the name of the column to be retrieved.\n     * @return the column value, or {@code null} if the column name is not found\n     * @throws IllegalStateException\n     *             if no header mapping was provided\n     * @throws IllegalArgumentException\n     *             if the record is inconsistent\n     * @see #isConsistent()\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.isConsistent()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Returns true if this record is consistent, false if not. Currently, the only check is matching the record size to\n     * the header size. Some programs can export files that fails this test but still produce parsable files.\n     *\n     * @return true of this record is valid, false if not\n     * @see CSVParserTest#org.apache.commons.csv.CSVParserTest.testMappedButNotSetAsOutlook2007ContactExport()\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.isMapped(java.lang.String)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Checks whether a given column is mapped.\n     *\n     * @param name\n     *            the name of the column to be retrieved.\n     * @return whether a given columns is mapped.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.isSet(java.lang.String)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Checks whether a given columns is mapped and has a value.\n     *\n     * @param name\n     *            the name of the column to be retrieved.\n     * @return whether a given columns is mapped.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.iterator()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Returns an iterator over the values of this record.\n     *\n     * @return an iterator over the values of this record.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.values()",
      "begin_line": 137,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.getComment()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * Returns the comment for this record, if any.\n     *\n     * @return the comment for this record, or null if no comment for this\n     *         record is available.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.getRecordNumber()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Returns the number of this record in the parsed CSV file.\n     *\n     * @return the number of this record.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.size()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Returns the number of values in this record.\n     *\n     * @return the number of values.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.toString()",
      "begin_line": 169,
      "end_line": 172,
      "comment": ""
    }
  ]
}