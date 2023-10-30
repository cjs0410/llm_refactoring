{
  "filepath": "/tmp/Csv-13f/src/main/java/org/apache/commons/csv/CSVPrinter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVPrinter",
      "is_interface": false,
      "parent_types": [
        "java.io.Flushable",
        "java.io.Closeable"
      ],
      "begin_line": 36,
      "end_line": 522,
      "comment": "\n * Prints values in a CSV format.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The place that the values get written. "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "newRecord"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " True if we just began a new record. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVPrinter.CSVPrinter(java.lang.Appendable, org.apache.commons.csv.CSVFormat)",
      "begin_line": 61,
      "end_line": 79,
      "comment": "\n     * Creates a printer that will print values to the given stream following the CSVFormat.\n     * \u003cp\u003e\n     * Currently, only a pure encapsulation format or a pure escaping format is supported. Hybrid formats (encapsulation\n     * and escaping with a different character) are not supported.\n     * \u003c/p\u003e\n     *\n     * @param out\n     *            stream to which to print. Must not be null.\n     * @param format\n     *            the CSV format. Must not be null.\n     * @throws IOException\n     *             thrown if the optional header cannot be printed.\n     * @throws IllegalArgumentException\n     *             thrown if the parameters of the format are inconsistent or if either out or format are null.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.close()",
      "begin_line": 85,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.flush()",
      "begin_line": 98,
      "end_line": 103,
      "comment": "\n     * Flushes the underlying stream.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.getOut()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Gets the target Appendable.\n     *\n     * @return the target Appendable.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.Object)",
      "begin_line": 122,
      "end_line": 132,
      "comment": "\n     * Prints the string as the next value on the line. The value will be escaped or encapsulated as needed.\n     *\n     * @param value\n     *            value to be output.\n     * @throws IOException\n     *             If an I/O error occurs\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.Object, java.lang.CharSequence, int, int)",
      "begin_line": 134,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printAndEscape(java.lang.CharSequence, int, int)",
      "begin_line": 155,
      "end_line": 189,
      "comment": "\n     * Note: must only be called if escaping is enabled, otherwise will generate NPE\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printAndQuote(java.lang.Object, java.lang.CharSequence, int, int)",
      "begin_line": 195,
      "end_line": 300,
      "comment": " the original object is needed so can check for Number"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printComment(java.lang.String)",
      "begin_line": 317,
      "end_line": 345,
      "comment": "\n     * Prints a comment on a new line among the delimiter separated values.\n     *\n     * \u003cp\u003e\n     * Comments will always begin on a new line and occupy a least one full line. The character specified to start\n     * comments and a space will be inserted at the beginning of each new line in the comment.\n     * \u003c/p\u003e\n     *\n     * If comments are disabled in the current CSV format this method does nothing.\n     *\n     * @param comment\n     *            the comment to output\n     * @throws IOException\n     *             If an I/O error occurs\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.println()",
      "begin_line": 353,
      "end_line": 359,
      "comment": "\n     * Outputs the record separator.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecord(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 374,
      "end_line": 379,
      "comment": "\n     * Prints the given values a single record of delimiter separated values followed by the record separator.\n     *\n     * \u003cp\u003e\n     * The values will be quoted if needed. Quotes and newLine characters will be escaped. This method adds the record\n     * separator to the output after printing the record, so there is no need to call {@link #println()}.\n     * \u003c/p\u003e\n     *\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecord(java.lang.Object...)",
      "begin_line": 394,
      "end_line": 399,
      "comment": "\n     * Prints the given values a single record of delimiter separated values followed by the record separator.\n     *\n     * \u003cp\u003e\n     * The values will be quoted if needed. Quotes and newLine characters will be escaped. This method adds the record\n     * separator to the output after printing the record, so there is no need to call {@link #println()}.\n     * \u003c/p\u003e\n     *\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 440,
      "end_line": 450,
      "comment": "\n     * Prints all the objects in the given collection handling nested collections/arrays as records.\n     *\n     * \u003cp\u003e\n     * If the given collection only contains simple objects, this method will print a single record like\n     * {@link #printRecord(Iterable)}. If the given collections contains nested collections/arrays those nested elements\n     * will each be printed as records using {@link #printRecord(Object...)}.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Given the following data structure:\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * \u003ccode\u003e\n     * List\u0026lt;String[]\u0026gt; data \u003d ...\n     * data.add(new String[]{ \"A\", \"B\", \"C\" });\n     * data.add(new String[]{ \"1\", \"2\", \"3\" });\n     * data.add(new String[]{ \"A1\", \"B2\", \"C3\" });\n     * \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\n     * Calling this method will print:\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * \u003ccode\u003e\n     * A, B, C\n     * 1, 2, 3\n     * A1, B2, C3\n     * \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @param values\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.lang.Object...)",
      "begin_line": 491,
      "end_line": 501,
      "comment": "\n     * Prints all the objects in the given array handling nested collections/arrays as records.\n     *\n     * \u003cp\u003e\n     * If the given array only contains simple objects, this method will print a single record like\n     * {@link #printRecord(Object...)}. If the given collections contains nested collections/arrays those nested\n     * elements will each be printed as records using {@link #printRecord(Object...)}.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Given the following data structure:\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * \u003ccode\u003e\n     * String[][] data \u003d new String[3][]\n     * data[0] \u003d String[]{ \"A\", \"B\", \"C\" };\n     * data[1] \u003d new String[]{ \"1\", \"2\", \"3\" };\n     * data[2] \u003d new String[]{ \"A1\", \"B2\", \"C3\" };\n     * \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\n     * Calling this method will print:\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * \u003ccode\u003e\n     * A, B, C\n     * 1, 2, 3\n     * A1, B2, C3\n     * \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @param values\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.sql.ResultSet)",
      "begin_line": 513,
      "end_line": 521,
      "comment": "\n     * Prints all the objects in the given JDBC result set.\n     *\n     * @param resultSet\n     *            result set the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     * @throws SQLException\n     *             if a database access error occurs\n     "
    }
  ]
}