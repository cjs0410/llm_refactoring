{
  "filepath": "/tmp/Csv-14f/src/main/java/org/apache/commons/csv/CSVFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVFormat",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 156,
      "end_line": 1814,
      "comment": "\n * Specifies the format of a CSV file and parses input.\n *\n * \u003ch2\u003eUsing predefined formats\u003c/h2\u003e\n *\n * \u003cp\u003e\n * You can use one of the predefined formats:\n * \u003c/p\u003e\n *\n * \u003cul\u003e\n * \u003cli\u003e{@link #DEFAULT}\u003c/li\u003e\n * \u003cli\u003e{@link #EXCEL}\u003c/li\u003e\n * \u003cli\u003e{@link #MYSQL}\u003c/li\u003e\n * \u003cli\u003e{@link #RFC4180}\u003c/li\u003e\n * \u003cli\u003e{@link #TDF}\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003e\n * For example:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVParser parser \u003d CSVFormat.EXCEL.parse(reader);\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * The {@link CSVParser} provides static methods to parse other input types, for example:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVParser parser \u003d CSVParser.parse(file, StandardCharsets.US_ASCII, CSVFormat.EXCEL);\n * \u003c/pre\u003e\n *\n * \u003ch2\u003eDefining formats\u003c/h2\u003e\n *\n * \u003cp\u003e\n * You can extend a format by calling the {@code with} methods. For example:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVFormat.EXCEL.withNullString(\u0026quot;N/A\u0026quot;).withIgnoreSurroundingSpaces(true);\n * \u003c/pre\u003e\n *\n * \u003ch2\u003eDefining column names\u003c/h2\u003e\n *\n * \u003cp\u003e\n * To define the column names you want to use to access records, write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVFormat.EXCEL.withHeader(\u0026quot;Col1\u0026quot;, \u0026quot;Col2\u0026quot;, \u0026quot;Col3\u0026quot;);\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * Calling {@link #withHeader(String...)} let\u0027s you use the given names to address values in a {@link CSVRecord}, and\n * assumes that your CSV source does not contain a first record that also defines column names.\n *\n * If it does, then you are overriding this metadata with your names and you should skip the first record by calling\n * {@link #withSkipHeaderRecord(boolean)} with {@code true}.\n * \u003c/p\u003e\n *\n * \u003ch2\u003eParsing\u003c/h2\u003e\n *\n * \u003cp\u003e\n * You can use a format directly to parse a reader. For example, to parse an Excel file with columns header, write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * Reader in \u003d ...;\n * CSVFormat.EXCEL.withHeader(\u0026quot;Col1\u0026quot;, \u0026quot;Col2\u0026quot;, \u0026quot;Col3\u0026quot;).parse(in);\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * For other input types, like resources, files, and URLs, use the static methods on {@link CSVParser}.\n * \u003c/p\u003e\n *\n * \u003ch2\u003eReferencing columns safely\u003c/h2\u003e\n *\n * \u003cp\u003e\n * If your source contains a header record, you can simplify your code and safely reference columns, by using\n * {@link #withHeader(String...)} with no arguments:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVFormat.EXCEL.withHeader();\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * This causes the parser to read the first record and use its values as column names.\n *\n * Then, call one of the {@link CSVRecord} get method that takes a String column name argument:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * String value \u003d record.get(\u0026quot;Col1\u0026quot;);\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * This makes your code impervious to changes in column order in the CSV file.\n * \u003c/p\u003e\n *\n * \u003ch2\u003eNotes\u003c/h2\u003e\n *\n * \u003cp\u003e\n * This class is immutable.\n * \u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVFormat.Predefined.Predefined(org.apache.commons.csv.CSVFormat)",
      "begin_line": 204,
      "end_line": 206,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.Predefined.getFormat()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n         * Gets the format.\n         *\n         * @return the format.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT"
      ],
      "begin_line": 233,
      "end_line": 234,
      "comment": "\n     * Standard comma separated format, as for {@link #RFC4180} but allowing empty lines.\n     *\n     * \u003cp\u003e\n     * Settings are:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuote(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(\"\\r\\n\")\u003c/li\u003e\n     * \u003cli\u003ewithIgnoreEmptyLines(true)\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see Predefined#Default\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXCEL"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": "\n     * Excel file format (using a comma as the value delimiter). Note that the actual value delimiter used by Excel is\n     * locale dependent, it might be necessary to customize this format to accommodate to your regional settings.\n     *\n     * \u003cp\u003e\n     * For example for parsing or generating a CSV file on a French system the following format will be used:\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * CSVFormat fmt \u003d CSVFormat.EXCEL.withDelimiter(\u0027;\u0027);\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\n     * Settings are:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e{@link #withDelimiter(char) withDelimiter(\u0027,\u0027)}\u003c/li\u003e\n     * \u003cli\u003e{@link #withQuote(char) withQuote(\u0027\"\u0027)}\u003c/li\u003e\n     * \u003cli\u003e{@link #withRecordSeparator(String) withRecordSeparator(\"\\r\\n\")}\u003c/li\u003e\n     * \u003cli\u003e{@link #withIgnoreEmptyLines(boolean) withIgnoreEmptyLines(false)}\u003c/li\u003e\n     * \u003cli\u003e{@link #withAllowMissingColumnNames(boolean) withAllowMissingColumnNames(true)}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * Note: this is currently like {@link #RFC4180} plus {@link #withAllowMissingColumnNames(boolean)\n     * withAllowMissingColumnNames(true)}.\n     * \u003c/p\u003e\n     *\n     * @see Predefined#Excel\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INFORMIX_UNLOAD"
      ],
      "begin_line": 291,
      "end_line": 292,
      "comment": "\n     * Default Informix CSV UNLOAD format used by the {@code UNLOAD TO file_name} operation.\n     *\n     * \u003cp\u003e\n     * This is a comma-delimited format with a LF character as the line separator. Values are not quoted and special\n     * characters are escaped with {@code \u0027\\\u0027}. The default NULL string is {@code \"\\\\N\"}.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Settings are:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuote(\"\\\"\")\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(\u0027\\n\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithEscape(\u0027\\\\\u0027)\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see Predefined#MySQL\n     * @see \u003ca href\u003d\n     *      \"http://www.ibm.com/support/knowledgecenter/SSBJG3_2.5.0/com.ibm.gen_busug.doc/c_fgl_InOutSql_UNLOAD.htm\"\u003e\n     *      http://www.ibm.com/support/knowledgecenter/SSBJG3_2.5.0/com.ibm.gen_busug.doc/c_fgl_InOutSql_UNLOAD.htm\u003c/a\u003e\n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INFORMIX_UNLOAD_CSV"
      ],
      "begin_line": 317,
      "end_line": 318,
      "comment": "\n     * Default Informix CSV UNLOAD format used by the {@code UNLOAD TO file_name} operation (escaping is disabled.)\n     *\n     * \u003cp\u003e\n     * This is a comma-delimited format with a LF character as the line separator. Values are not quoted and special\n     * characters are escaped with {@code \u0027\\\u0027}. The default NULL string is {@code \"\\\\N\"}.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Settings are:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuote(\"\\\"\")\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(\u0027\\n\u0027)\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see Predefined#MySQL\n     * @see \u003ca href\u003d\n     *      \"http://www.ibm.com/support/knowledgecenter/SSBJG3_2.5.0/com.ibm.gen_busug.doc/c_fgl_InOutSql_UNLOAD.htm\"\u003e\n     *      http://www.ibm.com/support/knowledgecenter/SSBJG3_2.5.0/com.ibm.gen_busug.doc/c_fgl_InOutSql_UNLOAD.htm\u003c/a\u003e\n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MYSQL"
      ],
      "begin_line": 344,
      "end_line": 345,
      "comment": "\n     * Default MySQL format used by the {@code SELECT INTO OUTFILE} and {@code LOAD DATA INFILE} operations.\n     *\n     * \u003cp\u003e\n     * This is a tab-delimited format with a LF character as the line separator. Values are not quoted and special\n     * characters are escaped with {@code \u0027\\\u0027}. The default NULL string is {@code \"\\\\N\"}.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Settings are:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027\\t\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuote(null)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(\u0027\\n\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithIgnoreEmptyLines(false)\u003c/li\u003e\n     * \u003cli\u003ewithEscape(\u0027\\\\\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithNullString(\"\\\\N\")\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see Predefined#MySQL\n     * @see \u003ca href\u003d\"http://dev.mysql.com/doc/refman/5.1/en/load-data.html\"\u003e http://dev.mysql.com/doc/refman/5.1/en/load\n     *      -data.html\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RFC4180"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": "\n     * Comma separated format as defined by \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\"\u003eRFC 4180\u003c/a\u003e.\n     *\n     * \u003cp\u003e\n     * Settings are:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuote(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(\"\\r\\n\")\u003c/li\u003e\n     * \u003cli\u003ewithIgnoreEmptyLines(false)\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see Predefined#RFC4180\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TDF"
      ],
      "begin_line": 381,
      "end_line": 381,
      "comment": "\n     * Tab-delimited format.\n     *\n     * \u003cp\u003e\n     * Settings are:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027\\t\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuote(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(\"\\r\\n\")\u003c/li\u003e\n     * \u003cli\u003ewithIgnoreSurroundingSpaces(true)\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see Predefined#TDF\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isLineBreak(char)",
      "begin_line": 391,
      "end_line": 393,
      "comment": "\n     * Returns true if the given character is a line break character.\n     *\n     * @param c\n     *            the character to check\n     *\n     * @return true if \u003ccode\u003ec\u003c/code\u003e is a line break character\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isLineBreak(java.lang.Character)",
      "begin_line": 403,
      "end_line": 405,
      "comment": "\n     * Returns true if the given character is a line break character.\n     *\n     * @param c\n     *            the character to check, may be null\n     *\n     * @return true if \u003ccode\u003ec\u003c/code\u003e is a line break character (and not null)\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.newFormat(char)",
      "begin_line": 427,
      "end_line": 430,
      "comment": "\n     * Creates a new CSV format with the specified delimiter.\n     *\n     * \u003cp\u003e\n     * Use this method if you want to create a CSVFormat from scratch. All fields but the delimiter will be initialized\n     * with null/false.\n     * \u003c/p\u003e\n     *\n     * @param delimiter\n     *            the char used for value separation, must not be a line break character\n     * @return a new CSV format.\n     * @throws IllegalArgumentException\n     *             if the delimiter is a line break character\n     *\n     * @see #DEFAULT\n     * @see #RFC4180\n     * @see #MYSQL\n     * @see #EXCEL\n     * @see #TDF\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.valueOf(java.lang.String)",
      "begin_line": 440,
      "end_line": 442,
      "comment": "\n     * Gets one of the predefined formats from {@link CSVFormat.Predefined}.\n     *\n     * @param format\n     *            name\n     * @return one of the predefined formats\n     * @since 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "allowMissingColumnNames"
      ],
      "begin_line": 444,
      "end_line": 444,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "commentMarker"
      ],
      "begin_line": 446,
      "end_line": 446,
      "comment": " null if commenting is disabled"
    },
    {
      "type": "field",
      "varNames": [
        "delimiter"
      ],
      "begin_line": 448,
      "end_line": 448,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "escapeCharacter"
      ],
      "begin_line": 450,
      "end_line": 450,
      "comment": " null if escaping is disabled"
    },
    {
      "type": "field",
      "varNames": [
        "header"
      ],
      "begin_line": 452,
      "end_line": 452,
      "comment": " array of header column names"
    },
    {
      "type": "field",
      "varNames": [
        "headerComments"
      ],
      "begin_line": 454,
      "end_line": 454,
      "comment": " array of header comment lines"
    },
    {
      "type": "field",
      "varNames": [
        "ignoreEmptyLines"
      ],
      "begin_line": 456,
      "end_line": 456,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreHeaderCase"
      ],
      "begin_line": 458,
      "end_line": 458,
      "comment": " should ignore header names case"
    },
    {
      "type": "field",
      "varNames": [
        "ignoreSurroundingSpaces"
      ],
      "begin_line": 460,
      "end_line": 460,
      "comment": " Should leading/trailing spaces be ignored around values?"
    },
    {
      "type": "field",
      "varNames": [
        "nullString"
      ],
      "begin_line": 462,
      "end_line": 462,
      "comment": " the string to be used for null values"
    },
    {
      "type": "field",
      "varNames": [
        "quoteCharacter"
      ],
      "begin_line": 464,
      "end_line": 464,
      "comment": " null if quoting is disabled"
    },
    {
      "type": "field",
      "varNames": [
        "quoteMode"
      ],
      "begin_line": 466,
      "end_line": 466,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordSeparator"
      ],
      "begin_line": 468,
      "end_line": 468,
      "comment": " for outputs"
    },
    {
      "type": "field",
      "varNames": [
        "skipHeaderRecord"
      ],
      "begin_line": 470,
      "end_line": 470,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "trailingDelimiter"
      ],
      "begin_line": 472,
      "end_line": 472,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "trim"
      ],
      "begin_line": 474,
      "end_line": 474,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormat(char, java.lang.Character, org.apache.commons.csv.QuoteMode, java.lang.Character, java.lang.Character, boolean, boolean, java.lang.String, java.lang.String, java.lang.Object[], java.lang.String[], boolean, boolean, boolean, boolean, boolean)",
      "begin_line": 514,
      "end_line": 537,
      "comment": "\n     * Creates a customized CSV format.\n     *\n     * @param delimiter\n     *            the char used for value separation, must not be a line break character\n     * @param quoteChar\n     *            the Character used as value encapsulation marker, may be {@code null} to disable\n     * @param quoteMode\n     *            the quote mode\n     * @param commentStart\n     *            the Character used for comment identification, may be {@code null} to disable\n     * @param escape\n     *            the Character used to escape special characters in values, may be {@code null} to disable\n     * @param ignoreSurroundingSpaces\n     *            {@code true} when whitespaces enclosing values should be ignored\n     * @param ignoreEmptyLines\n     *            {@code true} when the parser should skip empty lines\n     * @param recordSeparator\n     *            the line separator to use for output\n     * @param nullString\n     *            the line separator to use for output\n     * @param headerComments\n     *            the comments to be printed by the Printer before the actual CSV data\n     * @param header\n     *            the header\n     * @param skipHeaderRecord\n     *            TODO\n     * @param allowMissingColumnNames\n     *            TODO\n     * @param ignoreHeaderCase\n     *            TODO\n     * @param trim\n     *            TODO\n     * @param trailingDelimiter\n     *            TODO\n     * @throws IllegalArgumentException\n     *             if the delimiter is a line break character\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.equals(java.lang.Object)",
      "begin_line": 539,
      "end_line": 606,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.format(java.lang.Object...)",
      "begin_line": 615,
      "end_line": 624,
      "comment": "\n     * Formats the specified values.\n     *\n     * @param values\n     *            the values to format\n     * @return the formatted values\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getAllowMissingColumnNames()",
      "begin_line": 632,
      "end_line": 634,
      "comment": "\n     * Specifies whether missing column names are allowed when parsing the header line.\n     *\n     * @return {@code true} if missing column names are allowed when parsing the header line, {@code false} to throw an\n     *         {@link IllegalArgumentException}.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getCommentMarker()",
      "begin_line": 641,
      "end_line": 643,
      "comment": "\n     * Returns the character marking the start of a line comment.\n     *\n     * @return the comment start marker, may be {@code null}\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getDelimiter()",
      "begin_line": 650,
      "end_line": 652,
      "comment": "\n     * Returns the character delimiting the values (typically \u0027;\u0027, \u0027,\u0027 or \u0027\\t\u0027).\n     *\n     * @return the delimiter character\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getEscapeCharacter()",
      "begin_line": 659,
      "end_line": 661,
      "comment": "\n     * Returns the escape character.\n     *\n     * @return the escape character, may be {@code null}\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getHeader()",
      "begin_line": 668,
      "end_line": 670,
      "comment": "\n     * Returns a copy of the header array.\n     *\n     * @return a copy of the header array; {@code null} if disabled, the empty array if to be read from the file\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getHeaderComments()",
      "begin_line": 677,
      "end_line": 679,
      "comment": "\n     * Returns a copy of the header comment array.\n     *\n     * @return a copy of the header comment array; {@code null} if disabled.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getIgnoreEmptyLines()",
      "begin_line": 687,
      "end_line": 689,
      "comment": "\n     * Specifies whether empty lines between records are ignored when parsing input.\n     *\n     * @return {@code true} if empty lines between records are ignored, {@code false} if they are turned into empty\n     *         records.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getIgnoreHeaderCase()",
      "begin_line": 697,
      "end_line": 699,
      "comment": "\n     * Specifies whether header names will be accessed ignoring case.\n     *\n     * @return {@code true} if header names cases are ignored, {@code false} if they are case sensitive.\n     * @since 1.3\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getIgnoreSurroundingSpaces()",
      "begin_line": 706,
      "end_line": 708,
      "comment": "\n     * Specifies whether spaces around values are ignored when parsing input.\n     *\n     * @return {@code true} if spaces around values are ignored, {@code false} if they are treated as part of the value.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getNullString()",
      "begin_line": 720,
      "end_line": 722,
      "comment": "\n     * Gets the String to convert to and from {@code null}.\n     * \u003cul\u003e\n     * \u003cli\u003e\u003cstrong\u003eReading:\u003c/strong\u003e Converts strings equal to the given {@code nullString} to {@code null} when reading\n     * records.\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eWriting:\u003c/strong\u003e Writes {@code null} as the given {@code nullString} when writing records.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @return the String to convert to and from {@code null}. No substitution occurs if {@code null}\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getQuoteCharacter()",
      "begin_line": 729,
      "end_line": 731,
      "comment": "\n     * Returns the character used to encapsulate values containing special characters.\n     *\n     * @return the quoteChar character, may be {@code null}\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getQuoteMode()",
      "begin_line": 738,
      "end_line": 740,
      "comment": "\n     * Returns the quote policy output fields.\n     *\n     * @return the quote policy\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getRecordSeparator()",
      "begin_line": 747,
      "end_line": 749,
      "comment": "\n     * Returns the record separator delimiting output records.\n     *\n     * @return the record separator\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getSkipHeaderRecord()",
      "begin_line": 756,
      "end_line": 758,
      "comment": "\n     * Returns whether to skip the header record.\n     *\n     * @return whether to skip the header record.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getTrailingDelimiter()",
      "begin_line": 766,
      "end_line": 768,
      "comment": "\n     * Returns whether to add a trailing delimiter.\n     *\n     * @return whether to add a trailing delimiter.\n     * @since 1.3\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getTrim()",
      "begin_line": 775,
      "end_line": 777,
      "comment": "\n     * Returns whether to trim leading and trailing blanks.\n     *\n     * @return whether to trim leading and trailing blanks.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.hashCode()",
      "begin_line": 779,
      "end_line": 797,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isCommentMarkerSet()",
      "begin_line": 806,
      "end_line": 808,
      "comment": "\n     * Specifies whether comments are supported by this format.\n     *\n     * Note that the comment introducer character is only recognized at the start of a line.\n     *\n     * @return {@code true} is comments are supported, {@code false} otherwise\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isEscapeCharacterSet()",
      "begin_line": 815,
      "end_line": 817,
      "comment": "\n     * Returns whether escape are being processed.\n     *\n     * @return {@code true} if escapes are processed\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isNullStringSet()",
      "begin_line": 824,
      "end_line": 826,
      "comment": "\n     * Returns whether a nullString has been defined.\n     *\n     * @return {@code true} if a nullString is defined\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isQuoteCharacterSet()",
      "begin_line": 833,
      "end_line": 835,
      "comment": "\n     * Returns whether a quoteChar has been defined.\n     *\n     * @return {@code true} if a quoteChar is defined\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.parse(java.io.Reader)",
      "begin_line": 850,
      "end_line": 852,
      "comment": "\n     * Parses the specified content.\n     *\n     * \u003cp\u003e\n     * See also the various static parse methods on {@link CSVParser}.\n     * \u003c/p\u003e\n     *\n     * @param in\n     *            the input stream\n     * @return a parser over a stream of {@link CSVRecord}s.\n     * @throws IOException\n     *             If an I/O error occurs\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.print(java.lang.Appendable)",
      "begin_line": 867,
      "end_line": 869,
      "comment": "\n     * Prints to the specified output.\n     *\n     * \u003cp\u003e\n     * See also {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param out\n     *            the output.\n     * @return a printer to an output.\n     * @throws IOException\n     *             thrown if the optional header cannot be printed.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.print(java.io.File, java.nio.charset.Charset)",
      "begin_line": 887,
      "end_line": 891,
      "comment": "\n     * Prints to the specified output.\n     *\n     * \u003cp\u003e\n     * See also {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param out\n     *            the output.\n     * @param charset\n     *            A charset.\n     * @return a printer to an output.\n     * @throws IOException\n     *             thrown if the optional header cannot be printed.\n     * @since 1.5\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.print(java.nio.file.Path, java.nio.charset.Charset)",
      "begin_line": 909,
      "end_line": 911,
      "comment": "\n     * Prints to the specified output.\n     *\n     * \u003cp\u003e\n     * See also {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param out\n     *            the output.\n     * @param charset \n     *            A charset.\n     * @return a printer to an output.\n     * @throws IOException\n     *             thrown if the optional header cannot be printed.\n     * @since 1.5\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.print(java.lang.Object, java.lang.Appendable, boolean)",
      "begin_line": 927,
      "end_line": 938,
      "comment": "\n     * Prints the {@code value} as the next value on the line to {@code out}. The value will be escaped or encapsulated\n     * as needed. Useful when one wants to avoid creating CSVPrinters.\n     *\n     * @param value\n     *            value to output.\n     * @param out\n     *            where to print the value.\n     * @param newRecord\n     *            if this a new record.\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @since 1.4\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.print(java.lang.Object, java.lang.CharSequence, int, int, java.lang.Appendable, boolean)",
      "begin_line": 940,
      "end_line": 955,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.printAndEscape(java.lang.CharSequence, int, int, java.lang.Appendable)",
      "begin_line": 960,
      "end_line": 995,
      "comment": "\n     * Note: must only be called if escaping is enabled, otherwise will generate NPE\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.printAndQuote(java.lang.Object, java.lang.CharSequence, int, int, java.lang.Appendable, boolean)",
      "begin_line": 1001,
      "end_line": 1106,
      "comment": " the original object is needed so can check for Number"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.println(java.lang.Appendable)",
      "begin_line": 1117,
      "end_line": 1124,
      "comment": "\n     * Outputs the record separator.\n     *\n     * @param out\n     *            where to write\n     * @throws IOException\n     *             If an I/O error occurs\n     * @since 1.4\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.printRecord(java.lang.Appendable, java.lang.Object...)",
      "begin_line": 1143,
      "end_line": 1148,
      "comment": "\n     * Prints the given {@code values} to {@code out} as a single record of delimiter separated values followed by the\n     * record separator.\n     *\n     * \u003cp\u003e\n     * The values will be quoted if needed. Quotes and new-line characters will be escaped. This method adds the record\n     * separator to the output after printing the record, so there is no need to call {@link #println(Appendable)}.\n     * \u003c/p\u003e\n     *\n     * @param out\n     *            where to write.\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @since 1.4\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.toString()",
      "begin_line": 1150,
      "end_line": 1193,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.toStringArray(java.lang.Object[])",
      "begin_line": 1195,
      "end_line": 1205,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.trim(java.lang.CharSequence)",
      "begin_line": 1207,
      "end_line": 1222,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.validate()",
      "begin_line": 1229,
      "end_line": 1273,
      "comment": "\n     * Verifies the consistency of the parameters and throws an IllegalArgumentException if necessary.\n     *\n     * @throws IllegalArgumentException\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withAllowMissingColumnNames()",
      "begin_line": 1282,
      "end_line": 1284,
      "comment": "\n     * Returns a new {@code CSVFormat} with the missing column names behavior of the format set to {@code true}\n     *\n     * @return A new CSVFormat that is equal to this but with the specified missing column names behavior.\n     * @see #withAllowMissingColumnNames(boolean)\n     * @since 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withAllowMissingColumnNames(boolean)",
      "begin_line": 1294,
      "end_line": 1298,
      "comment": "\n     * Returns a new {@code CSVFormat} with the missing column names behavior of the format set to the given value.\n     *\n     * @param allowMissingColumnNames\n     *            the missing column names behavior, {@code true} to allow missing column names in the header line,\n     *            {@code false} to cause an {@link IllegalArgumentException} to be thrown.\n     * @return A new CSVFormat that is equal to this but with the specified missing column names behavior.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withCommentMarker(char)",
      "begin_line": 1311,
      "end_line": 1313,
      "comment": "\n     * Returns a new {@code CSVFormat} with the comment start marker of the format set to the specified character.\n     *\n     * Note that the comment start character is only recognized at the start of a line.\n     *\n     * @param commentMarker\n     *            the comment start marker\n     * @return A new CSVFormat that is equal to this one but with the specified character as the comment start marker\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withCommentMarker(java.lang.Character)",
      "begin_line": 1326,
      "end_line": 1333,
      "comment": "\n     * Returns a new {@code CSVFormat} with the comment start marker of the format set to the specified character.\n     *\n     * Note that the comment start character is only recognized at the start of a line.\n     *\n     * @param commentMarker\n     *            the comment start marker, use {@code null} to disable\n     * @return A new CSVFormat that is equal to this one but with the specified character as the comment start marker\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withDelimiter(char)",
      "begin_line": 1344,
      "end_line": 1351,
      "comment": "\n     * Returns a new {@code CSVFormat} with the delimiter of the format set to the specified character.\n     *\n     * @param delimiter\n     *            the delimiter character\n     * @return A new CSVFormat that is equal to this with the specified character as delimiter\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withEscape(char)",
      "begin_line": 1362,
      "end_line": 1364,
      "comment": "\n     * Returns a new {@code CSVFormat} with the escape character of the format set to the specified character.\n     *\n     * @param escape\n     *            the escape character\n     * @return A new CSVFormat that is equal to his but with the specified character as the escape character\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withEscape(java.lang.Character)",
      "begin_line": 1375,
      "end_line": 1382,
      "comment": "\n     * Returns a new {@code CSVFormat} with the escape character of the format set to the specified character.\n     *\n     * @param escape\n     *            the escape character, use {@code null} to disable\n     * @return A new CSVFormat that is equal to this but with the specified character as the escape character\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withFirstRecordAsHeader()",
      "begin_line": 1400,
      "end_line": 1402,
      "comment": "\n     * Returns a new {@code CSVFormat} using the first record as header.\n     *\n     * \u003cp\u003e\n     * Calling this method is equivalent to calling:\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aFormat.withHeader().withSkipHeaderRecord();\n     * \u003c/pre\u003e\n     *\n     * @return A new CSVFormat that is equal to this but using the first record as header.\n     * @see #withSkipHeaderRecord(boolean)\n     * @see #withHeader(String...)\n     * @since 1.3\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeader(java.lang.Class\u003c? extends java.lang.Enum\u003c?\u003e\u003e)",
      "begin_line": 1430,
      "end_line": 1440,
      "comment": "\n     * Returns a new {@code CSVFormat} with the header of the format defined by the enum class.\n     *\n     * \u003cp\u003e\n     * Example:\n     * \u003c/p\u003e\n     * \u003cpre\u003e\n     * public enum Header {\n     *     Name, Email, Phone\n     * }\n     *\n     * CSVFormat format \u003d aformat.withHeader(Header.class);\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * The header is also used by the {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param headerEnum\n     *            the enum defining the header, {@code null} if disabled, empty if parsed automatically, user specified\n     *            otherwise.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified header\n     * @see #withHeader(String...)\n     * @see #withSkipHeaderRecord(boolean)\n     * @since 1.3\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeader(java.sql.ResultSet)",
      "begin_line": 1468,
      "end_line": 1470,
      "comment": "\n     * Returns a new {@code CSVFormat} with the header of the format set from the result set metadata. The header can\n     * either be parsed automatically from the input file with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader();\n     * \u003c/pre\u003e\n     *\n     * or specified manually with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader(resultSet);\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * The header is also used by the {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param resultSet\n     *            the resultSet for the header, {@code null} if disabled, empty if parsed automatically, user specified\n     *            otherwise.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified header\n     * @throws SQLException\n     *             SQLException if a database access error occurs or this method is called on a closed result set.\n     * @since 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeader(java.sql.ResultSetMetaData)",
      "begin_line": 1498,
      "end_line": 1508,
      "comment": "\n     * Returns a new {@code CSVFormat} with the header of the format set from the result set metadata. The header can\n     * either be parsed automatically from the input file with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader();\n     * \u003c/pre\u003e\n     *\n     * or specified manually with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader(metaData);\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * The header is also used by the {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param metaData\n     *            the metaData for the header, {@code null} if disabled, empty if parsed automatically, user specified\n     *            otherwise.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified header\n     * @throws SQLException\n     *             SQLException if a database access error occurs or this method is called on a closed result set.\n     * @since 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeader(java.lang.String...)",
      "begin_line": 1533,
      "end_line": 1537,
      "comment": "\n     * Returns a new {@code CSVFormat} with the header of the format set to the given values. The header can either be\n     * parsed automatically from the input file with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader();\n     * \u003c/pre\u003e\n     *\n     * or specified manually with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader(\u0026quot;name\u0026quot;, \u0026quot;email\u0026quot;, \u0026quot;phone\u0026quot;);\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * The header is also used by the {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param header\n     *            the header, {@code null} if disabled, empty if parsed automatically, user specified otherwise.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified header\n     * @see #withSkipHeaderRecord(boolean)\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeaderComments(java.lang.Object...)",
      "begin_line": 1554,
      "end_line": 1558,
      "comment": "\n     * Returns a new {@code CSVFormat} with the header comments of the format set to the given values. The comments will\n     * be printed first, before the headers. This setting is ignored by the parser.\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeaderComments(\u0026quot;Generated by Apache Commons CSV 1.1.\u0026quot;, new Date());\n     * \u003c/pre\u003e\n     *\n     * @param headerComments\n     *            the headerComments which will be printed by the Printer before the actual CSV data.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified header\n     * @see #withSkipHeaderRecord(boolean)\n     * @since 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreEmptyLines()",
      "begin_line": 1567,
      "end_line": 1569,
      "comment": "\n     * Returns a new {@code CSVFormat} with the empty line skipping behavior of the format set to {@code true}.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified empty line skipping behavior.\n     * @since {@link #withIgnoreEmptyLines(boolean)}\n     * @since 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreEmptyLines(boolean)",
      "begin_line": 1579,
      "end_line": 1583,
      "comment": "\n     * Returns a new {@code CSVFormat} with the empty line skipping behavior of the format set to the given value.\n     *\n     * @param ignoreEmptyLines\n     *            the empty line skipping behavior, {@code true} to ignore the empty lines between the records,\n     *            {@code false} to translate empty lines to empty records.\n     * @return A new CSVFormat that is equal to this but with the specified empty line skipping behavior.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreHeaderCase()",
      "begin_line": 1592,
      "end_line": 1594,
      "comment": "\n     * Returns a new {@code CSVFormat} with the header ignore case behavior set to {@code true}.\n     *\n     * @return A new CSVFormat that will ignore case header name.\n     * @see #withIgnoreHeaderCase(boolean)\n     * @since 1.3\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreHeaderCase(boolean)",
      "begin_line": 1605,
      "end_line": 1609,
      "comment": "\n     * Returns a new {@code CSVFormat} with whether header names should be accessed ignoring case.\n     *\n     * @param ignoreHeaderCase\n     *            the case mapping behavior, {@code true} to access name/values, {@code false} to leave the mapping as\n     *            is.\n     * @return A new CSVFormat that will ignore case header name if specified as {@code true}\n     * @since 1.3\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreSurroundingSpaces()",
      "begin_line": 1618,
      "end_line": 1620,
      "comment": "\n     * Returns a new {@code CSVFormat} with the trimming behavior of the format set to {@code true}.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified trimming behavior.\n     * @see #withIgnoreSurroundingSpaces(boolean)\n     * @since 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreSurroundingSpaces(boolean)",
      "begin_line": 1630,
      "end_line": 1634,
      "comment": "\n     * Returns a new {@code CSVFormat} with the trimming behavior of the format set to the given value.\n     *\n     * @param ignoreSurroundingSpaces\n     *            the trimming behavior, {@code true} to remove the surrounding spaces, {@code false} to leave the\n     *            spaces as is.\n     * @return A new CSVFormat that is equal to this but with the specified trimming behavior.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withNullString(java.lang.String)",
      "begin_line": 1649,
      "end_line": 1653,
      "comment": "\n     * Returns a new {@code CSVFormat} with conversions to and from null for strings on input and output.\n     * \u003cul\u003e\n     * \u003cli\u003e\u003cstrong\u003eReading:\u003c/strong\u003e Converts strings equal to the given {@code nullString} to {@code null} when reading\n     * records.\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eWriting:\u003c/strong\u003e Writes {@code null} as the given {@code nullString} when writing records.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param nullString\n     *            the String to convert to and from {@code null}. No substitution occurs if {@code null}\n     *\n     * @return A new CSVFormat that is equal to this but with the specified null conversion string.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withQuote(char)",
      "begin_line": 1664,
      "end_line": 1666,
      "comment": "\n     * Returns a new {@code CSVFormat} with the quoteChar of the format set to the specified character.\n     *\n     * @param quoteChar\n     *            the quoteChar character\n     * @return A new CSVFormat that is equal to this but with the specified character as quoteChar\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withQuote(java.lang.Character)",
      "begin_line": 1677,
      "end_line": 1684,
      "comment": "\n     * Returns a new {@code CSVFormat} with the quoteChar of the format set to the specified character.\n     *\n     * @param quoteChar\n     *            the quoteChar character, use {@code null} to disable\n     * @return A new CSVFormat that is equal to this but with the specified character as quoteChar\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withQuoteMode(org.apache.commons.csv.QuoteMode)",
      "begin_line": 1694,
      "end_line": 1698,
      "comment": "\n     * Returns a new {@code CSVFormat} with the output quote policy of the format set to the specified value.\n     *\n     * @param quoteModePolicy\n     *            the quote policy to use for output.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified quote policy\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withRecordSeparator(char)",
      "begin_line": 1713,
      "end_line": 1715,
      "comment": "\n     * Returns a new {@code CSVFormat} with the record separator of the format set to the specified character.\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eNote:\u003c/strong\u003e This setting is only used during printing and does not affect parsing. Parsing currently\n     * only works for inputs with \u0027\\n\u0027, \u0027\\r\u0027 and \"\\r\\n\"\n     * \u003c/p\u003e\n     *\n     * @param recordSeparator\n     *            the record separator to use for output.\n     *\n     * @return A new CSVFormat that is equal to this but with the the specified output record separator\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withRecordSeparator(java.lang.String)",
      "begin_line": 1732,
      "end_line": 1736,
      "comment": "\n     * Returns a new {@code CSVFormat} with the record separator of the format set to the specified String.\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eNote:\u003c/strong\u003e This setting is only used during printing and does not affect parsing. Parsing currently\n     * only works for inputs with \u0027\\n\u0027, \u0027\\r\u0027 and \"\\r\\n\"\n     * \u003c/p\u003e\n     *\n     * @param recordSeparator\n     *            the record separator to use for output.\n     *\n     * @return A new CSVFormat that is equal to this but with the the specified output record separator\n     * @throws IllegalArgumentException\n     *             if recordSeparator is none of CR, LF or CRLF\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withSkipHeaderRecord()",
      "begin_line": 1746,
      "end_line": 1748,
      "comment": "\n     * Returns a new {@code CSVFormat} with skipping the header record set to {@code true}.\n     *\n     * @return A new CSVFormat that is equal to this but with the the specified skipHeaderRecord setting.\n     * @see #withSkipHeaderRecord(boolean)\n     * @see #withHeader(String...)\n     * @since 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withSkipHeaderRecord(boolean)",
      "begin_line": 1759,
      "end_line": 1763,
      "comment": "\n     * Returns a new {@code CSVFormat} with whether to skip the header record.\n     *\n     * @param skipHeaderRecord\n     *            whether to skip the header record.\n     *\n     * @return A new CSVFormat that is equal to this but with the the specified skipHeaderRecord setting.\n     * @see #withHeader(String...)\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withTrailingDelimiter()",
      "begin_line": 1771,
      "end_line": 1773,
      "comment": "\n     * Returns a new {@code CSVFormat} to add a trailing delimiter.\n     *\n     * @return A new CSVFormat that is equal to this but with the trailing delimiter setting.\n     * @since 1.3\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withTrailingDelimiter(boolean)",
      "begin_line": 1784,
      "end_line": 1788,
      "comment": "\n     * Returns a new {@code CSVFormat} with whether to add a trailing delimiter.\n     *\n     * @param trailingDelimiter\n     *            whether to add a trailing delimiter.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified trailing delimiter setting.\n     * @since 1.3\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withTrim()",
      "begin_line": 1796,
      "end_line": 1798,
      "comment": "\n     * Returns a new {@code CSVFormat} to trim leading and trailing blanks.\n     *\n     * @return A new CSVFormat that is equal to this but with the trim setting on.\n     * @since 1.3\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withTrim(boolean)",
      "begin_line": 1809,
      "end_line": 1813,
      "comment": "\n     * Returns a new {@code CSVFormat} with whether to trim leading and trailing blanks.\n     *\n     * @param trim\n     *            whether to trim leading and trailing blanks.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified trim setting.\n     * @since 1.3\n     "
    }
  ]
}