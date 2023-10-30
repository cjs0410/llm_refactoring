{
  "filepath": "/tmp/Csv-13f/src/main/java/org/apache/commons/csv/CSVFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVFormat",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 148,
      "end_line": 1290,
      "comment": "\n * Specifies the format of a CSV file and parses input.\n *\n * \u003ch2\u003eUsing predefined formats\u003c/h2\u003e\n *\n * \u003cp\u003e\n * You can use one of the predefined formats:\n * \u003c/p\u003e\n *\n * \u003cul\u003e\n * \u003cli\u003e{@link #DEFAULT}\u003c/li\u003e\n * \u003cli\u003e{@link #EXCEL}\u003c/li\u003e\n * \u003cli\u003e{@link #MYSQL}\u003c/li\u003e\n * \u003cli\u003e{@link #RFC4180}\u003c/li\u003e\n * \u003cli\u003e{@link #TDF}\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003e\n * For example:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVParser parser \u003d CSVFormat.EXCEL.parse(reader);\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * The {@link CSVParser} provides static methods to parse other input types, for example:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVParser parser \u003d CSVParser.parse(file, StandardCharsets.US_ASCII, CSVFormat.EXCEL);\n * \u003c/pre\u003e\n *\n * \u003ch2\u003eDefining formats\u003c/h2\u003e\n *\n * \u003cp\u003e\n * You can extend a format by calling the {@code with} methods. For example:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVFormat.EXCEL.withNullString(\u0026quot;N/A\u0026quot;).withIgnoreSurroundingSpaces(true);\n * \u003c/pre\u003e\n *\n * \u003ch2\u003eDefining column names\u003c/h2\u003e\n *\n * \u003cp\u003e\n * To define the column names you want to use to access records, write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVFormat.EXCEL.withHeader(\u0026quot;Col1\u0026quot;, \u0026quot;Col2\u0026quot;, \u0026quot;Col3\u0026quot;);\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * Calling {@link #withHeader(String...)} let\u0027s you use the given names to address values in a {@link CSVRecord}, and\n * assumes that your CSV source does not contain a first record that also defines column names.\n *\n * If it does, then you are overriding this metadata with your names and you should skip the first record by calling\n * {@link #withSkipHeaderRecord(boolean)} with {@code true}.\n * \u003c/p\u003e\n *\n * \u003ch2\u003eParsing\u003c/h2\u003e\n *\n * \u003cp\u003e\n * You can use a format directly to parse a reader. For example, to parse an Excel file with columns header, write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * Reader in \u003d ...;\n * CSVFormat.EXCEL.withHeader(\u0026quot;Col1\u0026quot;, \u0026quot;Col2\u0026quot;, \u0026quot;Col3\u0026quot;).parse(in);\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * For other input types, like resources, files, and URLs, use the static methods on {@link CSVParser}.\n * \u003c/p\u003e\n *\n * \u003ch2\u003eReferencing columns safely\u003c/h2\u003e\n *\n * \u003cp\u003e\n * If your source contains a header record, you can simplify your code and safely reference columns, by using\n * {@link #withHeader(String...)} with no arguments:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVFormat.EXCEL.withHeader();\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * This causes the parser to read the first record and use its values as column names.\n *\n * Then, call one of the {@link CSVRecord} get method that takes a String column name argument:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * String value \u003d record.get(\u0026quot;Col1\u0026quot;);\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * This makes your code impervious to changes in column order in the CSV file.\n * \u003c/p\u003e\n *\n * \u003ch2\u003eNotes\u003c/h2\u003e\n *\n * \u003cp\u003e\n * This class is immutable.\n * \u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVFormat.Predefined.Predefined(org.apache.commons.csv.CSVFormat)",
      "begin_line": 184,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.Predefined.getFormat()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n         * Gets the format.\n         * \n         * @return the format.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delimiter"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "quoteCharacter"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " null if quoting is disabled"
    },
    {
      "type": "field",
      "varNames": [
        "quoteMode"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "commentMarker"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " null if commenting is disabled"
    },
    {
      "type": "field",
      "varNames": [
        "escapeCharacter"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " null if escaping is disabled"
    },
    {
      "type": "field",
      "varNames": [
        "ignoreSurroundingSpaces"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": " Should leading/trailing spaces be ignored around values?"
    },
    {
      "type": "field",
      "varNames": [
        "allowMissingColumnNames"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreEmptyLines"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordSeparator"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": " for outputs"
    },
    {
      "type": "field",
      "varNames": [
        "nullString"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " the string to be used for null values"
    },
    {
      "type": "field",
      "varNames": [
        "header"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": " array of header column names"
    },
    {
      "type": "field",
      "varNames": [
        "headerComments"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": " array of header comment lines"
    },
    {
      "type": "field",
      "varNames": [
        "skipHeaderRecord"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreHeaderCase"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": " should ignore header names case"
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT"
      ],
      "begin_line": 229,
      "end_line": 230,
      "comment": "\n     * Standard comma separated format, as for {@link #RFC4180} but allowing empty lines.\n     *\n     * \u003cp\u003e\n     * Settings are:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuote(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(\"\\r\\n\")\u003c/li\u003e\n     * \u003cli\u003ewithIgnoreEmptyLines(true)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @see Predefined#Default\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RFC4180"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": "\n     * Comma separated format as defined by \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\"\u003eRFC 4180\u003c/a\u003e.\n     *\n     * \u003cp\u003e\n     * Settings are:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuote(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(\"\\r\\n\")\u003c/li\u003e\n     * \u003cli\u003ewithIgnoreEmptyLines(false)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @see Predefined#RFC4180\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXCEL"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": "\n     * Excel file format (using a comma as the value delimiter). Note that the actual value delimiter used by Excel is\n     * locale dependent, it might be necessary to customize this format to accommodate to your regional settings.\n     *\n     * \u003cp\u003e\n     * For example for parsing or generating a CSV file on a French system the following format will be used:\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * CSVFormat fmt \u003d CSVFormat.EXCEL.withDelimiter(\u0027;\u0027);\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\n     * Settings are:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e{@link #withDelimiter(char) withDelimiter(\u0027,\u0027)}\u003c/li\u003e\n     * \u003cli\u003e{@link #withQuote(char) withQuote(\u0027\"\u0027)}\u003c/li\u003e\n     * \u003cli\u003e{@link #withRecordSeparator(String) withRecordSeparator(\"\\r\\n\")}\u003c/li\u003e\n     * \u003cli\u003e{@link #withIgnoreEmptyLines(boolean) withIgnoreEmptyLines(false)}\u003c/li\u003e\n     * \u003cli\u003e{@link #withAllowMissingColumnNames(boolean) withAllowMissingColumnNames(true)}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * Note: this is currently like {@link #RFC4180} plus {@link #withAllowMissingColumnNames(boolean)\n     * withAllowMissingColumnNames(true)}.\n     * \u003c/p\u003e\n     * @see Predefined#Excel\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TDF"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": "\n     * Tab-delimited format.\n     *\n     * \u003cp\u003e\n     * Settings are:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027\\t\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuote(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(\"\\r\\n\")\u003c/li\u003e\n     * \u003cli\u003ewithIgnoreSurroundingSpaces(true)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @see Predefined#TDF\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MYSQL"
      ],
      "begin_line": 318,
      "end_line": 319,
      "comment": "\n     * Default MySQL format used by the {@code SELECT INTO OUTFILE} and {@code LOAD DATA INFILE} operations.\n     *\n     * \u003cp\u003e\n     * This is a tab-delimited format with a LF character as the line separator. Values are not quoted and special\n     * characters are escaped with {@code \u0027\\\u0027}. The default NULL string is {@code \"\\\\N\"}.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Settings are:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027\\t\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuote(null)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(\u0027\\n\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithIgnoreEmptyLines(false)\u003c/li\u003e\n     * \u003cli\u003ewithEscape(\u0027\\\\\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithNullString(\"\\\\N\")\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see Predefined#MySQL\n     * @see \u003ca href\u003d\"http://dev.mysql.com/doc/refman/5.1/en/load-data.html\"\u003e\n     *      http://dev.mysql.com/doc/refman/5.1/en/load-data.html\u003c/a\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isLineBreak(char)",
      "begin_line": 329,
      "end_line": 331,
      "comment": "\n     * Returns true if the given character is a line break character.\n     *\n     * @param c\n     *            the character to check\n     *\n     * @return true if \u003ccode\u003ec\u003c/code\u003e is a line break character\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isLineBreak(java.lang.Character)",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n     * Returns true if the given character is a line break character.\n     *\n     * @param c\n     *            the character to check, may be null\n     *\n     * @return true if \u003ccode\u003ec\u003c/code\u003e is a line break character (and not null)\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.newFormat(char)",
      "begin_line": 365,
      "end_line": 367,
      "comment": "\n     * Creates a new CSV format with the specified delimiter.\n     *\n     * \u003cp\u003e\n     * Use this method if you want to create a CSVFormat from scratch. All fields but the delimiter will be initialized\n     * with null/false.\n     * \u003c/p\u003e\n     *\n     * @param delimiter\n     *            the char used for value separation, must not be a line break character\n     * @return a new CSV format.\n     * @throws IllegalArgumentException\n     *             if the delimiter is a line break character\n     *\n     * @see #DEFAULT\n     * @see #RFC4180\n     * @see #MYSQL\n     * @see #EXCEL\n     * @see #TDF\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.valueOf(java.lang.String)",
      "begin_line": 377,
      "end_line": 379,
      "comment": "\n     * Gets one of the predefined formats from {@link CSVFormat.Predefined}.\n     * \n     * @param format\n     *            name\n     * @return one of the predefined formats\n     * @since 1.2\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormat(char, java.lang.Character, org.apache.commons.csv.QuoteMode, java.lang.Character, java.lang.Character, boolean, boolean, java.lang.String, java.lang.String, java.lang.Object[], java.lang.String[], boolean, boolean, boolean)",
      "begin_line": 415,
      "end_line": 435,
      "comment": "\n     * Creates a customized CSV format.\n     *\n     * @param delimiter\n     *            the char used for value separation, must not be a line break character\n     * @param quoteChar\n     *            the Character used as value encapsulation marker, may be {@code null} to disable\n     * @param quoteMode\n     *            the quote mode\n     * @param commentStart\n     *            the Character used for comment identification, may be {@code null} to disable\n     * @param escape\n     *            the Character used to escape special characters in values, may be {@code null} to disable\n     * @param ignoreSurroundingSpaces\n     *            {@code true} when whitespaces enclosing values should be ignored\n     * @param ignoreEmptyLines\n     *            {@code true} when the parser should skip empty lines\n     * @param recordSeparator\n     *            the line separator to use for output\n     * @param nullString\n     *            the line separator to use for output\n     * @param headerComments\n     *            the comments to be printed by the Printer before the actual CSV data\n     * @param header\n     *            the header\n     * @param skipHeaderRecord\n     *            TODO\n     * @param allowMissingColumnNames\n     *            TODO\n     * @param ignoreHeaderCase\n     *            TODO\n     * @throws IllegalArgumentException\n     *             if the delimiter is a line break character\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.toStringArray(java.lang.Object[])",
      "begin_line": 437,
      "end_line": 447,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.equals(java.lang.Object)",
      "begin_line": 449,
      "end_line": 516,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.format(java.lang.Object...)",
      "begin_line": 525,
      "end_line": 534,
      "comment": "\n     * Formats the specified values.\n     *\n     * @param values\n     *            the values to format\n     * @return the formatted values\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getCommentMarker()",
      "begin_line": 541,
      "end_line": 543,
      "comment": "\n     * Returns the character marking the start of a line comment.\n     *\n     * @return the comment start marker, may be {@code null}\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getDelimiter()",
      "begin_line": 550,
      "end_line": 552,
      "comment": "\n     * Returns the character delimiting the values (typically \u0027;\u0027, \u0027,\u0027 or \u0027\\t\u0027).\n     *\n     * @return the delimiter character\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getEscapeCharacter()",
      "begin_line": 559,
      "end_line": 561,
      "comment": "\n     * Returns the escape character.\n     *\n     * @return the escape character, may be {@code null}\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getHeader()",
      "begin_line": 568,
      "end_line": 570,
      "comment": "\n     * Returns a copy of the header array.\n     *\n     * @return a copy of the header array; {@code null} if disabled, the empty array if to be read from the file\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getHeaderComments()",
      "begin_line": 577,
      "end_line": 579,
      "comment": "\n     * Returns a copy of the header comment array.\n     *\n     * @return a copy of the header comment array; {@code null} if disabled.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getAllowMissingColumnNames()",
      "begin_line": 587,
      "end_line": 589,
      "comment": "\n     * Specifies whether missing column names are allowed when parsing the header line.\n     *\n     * @return {@code true} if missing column names are allowed when parsing the header line, {@code false} to throw an\n     *         {@link IllegalArgumentException}.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getIgnoreEmptyLines()",
      "begin_line": 597,
      "end_line": 599,
      "comment": "\n     * Specifies whether empty lines between records are ignored when parsing input.\n     *\n     * @return {@code true} if empty lines between records are ignored, {@code false} if they are turned into empty\n     *         records.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getIgnoreSurroundingSpaces()",
      "begin_line": 606,
      "end_line": 608,
      "comment": "\n     * Specifies whether spaces around values are ignored when parsing input.\n     *\n     * @return {@code true} if spaces around values are ignored, {@code false} if they are treated as part of the value.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getIgnoreHeaderCase()",
      "begin_line": 615,
      "end_line": 617,
      "comment": "\n     * Specifies whether header names will be accessed ignoring case.\n     *\n     * @return {@code true} if header names cases are ignored, {@code false} if they are case sensitive.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getNullString()",
      "begin_line": 631,
      "end_line": 633,
      "comment": "\n     * Gets the String to convert to and from {@code null}.\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003cstrong\u003eReading:\u003c/strong\u003e Converts strings equal to the given {@code nullString} to {@code null} when reading\n     * records.\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003cstrong\u003eWriting:\u003c/strong\u003e Writes {@code null} as the given {@code nullString} when writing records.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @return the String to convert to and from {@code null}. No substitution occurs if {@code null}\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getQuoteCharacter()",
      "begin_line": 640,
      "end_line": 642,
      "comment": "\n     * Returns the character used to encapsulate values containing special characters.\n     *\n     * @return the quoteChar character, may be {@code null}\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getQuoteMode()",
      "begin_line": 649,
      "end_line": 651,
      "comment": "\n     * Returns the quote policy output fields.\n     *\n     * @return the quote policy\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getRecordSeparator()",
      "begin_line": 658,
      "end_line": 660,
      "comment": "\n     * Returns the record separator delimiting output records.\n     *\n     * @return the record separator\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getSkipHeaderRecord()",
      "begin_line": 667,
      "end_line": 669,
      "comment": "\n     * Returns whether to skip the header record.\n     *\n     * @return whether to skip the header record.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.hashCode()",
      "begin_line": 671,
      "end_line": 689,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isCommentMarkerSet()",
      "begin_line": 698,
      "end_line": 700,
      "comment": "\n     * Specifies whether comments are supported by this format.\n     *\n     * Note that the comment introducer character is only recognized at the start of a line.\n     *\n     * @return {@code true} is comments are supported, {@code false} otherwise\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isEscapeCharacterSet()",
      "begin_line": 707,
      "end_line": 709,
      "comment": "\n     * Returns whether escape are being processed.\n     *\n     * @return {@code true} if escapes are processed\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isNullStringSet()",
      "begin_line": 716,
      "end_line": 718,
      "comment": "\n     * Returns whether a nullString has been defined.\n     *\n     * @return {@code true} if a nullString is defined\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isQuoteCharacterSet()",
      "begin_line": 725,
      "end_line": 727,
      "comment": "\n     * Returns whether a quoteChar has been defined.\n     *\n     * @return {@code true} if a quoteChar is defined\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.parse(java.io.Reader)",
      "begin_line": 742,
      "end_line": 744,
      "comment": "\n     * Parses the specified content.\n     *\n     * \u003cp\u003e\n     * See also the various static parse methods on {@link CSVParser}.\n     * \u003c/p\u003e\n     *\n     * @param in\n     *            the input stream\n     * @return a parser over a stream of {@link CSVRecord}s.\n     * @throws IOException\n     *             If an I/O error occurs\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.print(java.lang.Appendable)",
      "begin_line": 759,
      "end_line": 761,
      "comment": "\n     * Prints to the specified output.\n     *\n     * \u003cp\u003e\n     * See also {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param out\n     *            the output\n     * @return a printer to an output\n     * @throws IOException\n     *             thrown if the optional header cannot be printed.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.toString()",
      "begin_line": 763,
      "end_line": 806,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.validate()",
      "begin_line": 813,
      "end_line": 857,
      "comment": "\n     * Verifies the consistency of the parameters and throws an IllegalArgumentException if necessary.\n     *\n     * @throws IllegalArgumentException\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withCommentMarker(char)",
      "begin_line": 870,
      "end_line": 872,
      "comment": "\n     * Sets the comment start marker of the format to the specified character.\n     *\n     * Note that the comment start character is only recognized at the start of a line.\n     *\n     * @param commentMarker\n     *            the comment start marker\n     * @return A new CSVFormat that is equal to this one but with the specified character as the comment start marker\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withCommentMarker(java.lang.Character)",
      "begin_line": 885,
      "end_line": 892,
      "comment": "\n     * Sets the comment start marker of the format to the specified character.\n     *\n     * Note that the comment start character is only recognized at the start of a line.\n     *\n     * @param commentMarker\n     *            the comment start marker, use {@code null} to disable\n     * @return A new CSVFormat that is equal to this one but with the specified character as the comment start marker\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withDelimiter(char)",
      "begin_line": 903,
      "end_line": 910,
      "comment": "\n     * Sets the delimiter of the format to the specified character.\n     *\n     * @param delimiter\n     *            the delimiter character\n     * @return A new CSVFormat that is equal to this with the specified character as delimiter\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withEscape(char)",
      "begin_line": 921,
      "end_line": 923,
      "comment": "\n     * Sets the escape character of the format to the specified character.\n     *\n     * @param escape\n     *            the escape character\n     * @return A new CSVFormat that is equal to his but with the specified character as the escape character\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withEscape(java.lang.Character)",
      "begin_line": 934,
      "end_line": 941,
      "comment": "\n     * Sets the escape character of the format to the specified character.\n     *\n     * @param escape\n     *            the escape character, use {@code null} to disable\n     * @return A new CSVFormat that is equal to this but with the specified character as the escape character\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeader(java.lang.String...)",
      "begin_line": 965,
      "end_line": 969,
      "comment": "\n     * Sets the header of the format. The header can either be parsed automatically from the input file with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader();\n     * \u003c/pre\u003e\n     *\n     * or specified manually with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader(\u0026quot;name\u0026quot;, \u0026quot;email\u0026quot;, \u0026quot;phone\u0026quot;);\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * The header is also used by the {@link CSVPrinter}..\n     * \u003c/p\u003e\n     *\n     * @param header\n     *            the header, {@code null} if disabled, empty if parsed automatically, user specified otherwise.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified header\n     * @see #withSkipHeaderRecord(boolean)\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeader(java.sql.ResultSet)",
      "begin_line": 996,
      "end_line": 998,
      "comment": "\n     * Sets the header of the format. The header can either be parsed automatically from the input file with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader();\n     * \u003c/pre\u003e\n     *\n     * or specified manually with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader(resultSet);\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * The header is also used by the {@link CSVPrinter}..\n     * \u003c/p\u003e\n     *\n     * @param resultSet\n     *            the resultSet for the header, {@code null} if disabled, empty if parsed automatically, user specified\n     *            otherwise.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified header\n     * @throws SQLException\n     *             SQLException if a database access error occurs or this method is called on a closed result set.\n     * @since 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeader(java.sql.ResultSetMetaData)",
      "begin_line": 1025,
      "end_line": 1037,
      "comment": "\n     * Sets the header of the format. The header can either be parsed automatically from the input file with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader();\n     * \u003c/pre\u003e\n     *\n     * or specified manually with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader(metaData);\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * The header is also used by the {@link CSVPrinter}..\n     * \u003c/p\u003e\n     *\n     * @param metaData\n     *            the metaData for the header, {@code null} if disabled, empty if parsed automatically, user specified\n     *            otherwise.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified header\n     * @throws SQLException\n     *             SQLException if a database access error occurs or this method is called on a closed result set.\n     * @since 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeaderComments(java.lang.Object...)",
      "begin_line": 1054,
      "end_line": 1058,
      "comment": "\n     * Sets the header comments of the format. The comments will be printed first, before the headers. This setting is\n     * ignored by the parser.\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeaderComments(\u0026quot;Generated by Apache Commons CSV 1.1.\u0026quot;, new Date());\n     * \u003c/pre\u003e\n     *\n     * @param headerComments\n     *            the headerComments which will be printed by the Printer before the actual CSV data.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified header\n     * @see #withSkipHeaderRecord(boolean)\n     * @since 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withAllowMissingColumnNames()",
      "begin_line": 1067,
      "end_line": 1069,
      "comment": "\n     * Sets the missing column names behavior of the format to {@code true}\n     *\n     * @return A new CSVFormat that is equal to this but with the specified missing column names behavior.\n     * @see #withAllowMissingColumnNames(boolean)\n     * @since 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withAllowMissingColumnNames(boolean)",
      "begin_line": 1079,
      "end_line": 1083,
      "comment": "\n     * Sets the missing column names behavior of the format.\n     *\n     * @param allowMissingColumnNames\n     *            the missing column names behavior, {@code true} to allow missing column names in the header line,\n     *            {@code false} to cause an {@link IllegalArgumentException} to be thrown.\n     * @return A new CSVFormat that is equal to this but with the specified missing column names behavior.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreEmptyLines()",
      "begin_line": 1092,
      "end_line": 1094,
      "comment": "\n     * Sets the empty line skipping behavior of the format to {@code true}.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified empty line skipping behavior.\n     * @since {@link #withIgnoreEmptyLines(boolean)}\n     * @since 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreEmptyLines(boolean)",
      "begin_line": 1104,
      "end_line": 1108,
      "comment": "\n     * Sets the empty line skipping behavior of the format.\n     *\n     * @param ignoreEmptyLines\n     *            the empty line skipping behavior, {@code true} to ignore the empty lines between the records,\n     *            {@code false} to translate empty lines to empty records.\n     * @return A new CSVFormat that is equal to this but with the specified empty line skipping behavior.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreSurroundingSpaces()",
      "begin_line": 1117,
      "end_line": 1119,
      "comment": "\n     * Sets the trimming behavior of the format to {@code true}.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified trimming behavior.\n     * @see #withIgnoreSurroundingSpaces(boolean)\n     * @since 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreSurroundingSpaces(boolean)",
      "begin_line": 1129,
      "end_line": 1133,
      "comment": "\n     * Sets the trimming behavior of the format.\n     *\n     * @param ignoreSurroundingSpaces\n     *            the trimming behavior, {@code true} to remove the surrounding spaces, {@code false} to leave the\n     *            spaces as is.\n     * @return A new CSVFormat that is equal to this but with the specified trimming behavior.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreHeaderCase()",
      "begin_line": 1142,
      "end_line": 1144,
      "comment": "\n     * Sets the header ignore case behavior to {@code true}.\n     *\n     * @return A new CSVFormat that will ignore case header name.\n     * @see #withIgnoreHeaderCase(boolean)\n     * @since ?\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreHeaderCase(boolean)",
      "begin_line": 1154,
      "end_line": 1158,
      "comment": "\n     * Sets if header names should be accessed ignoring case.\n     *\n     * @param ignoreHeaderCase\n     *            the case mapping behavior, {@code true} to access name/values, {@code false} to leave the\n     *            mapping as is.\n     * @return A new CSVFormat that will ignore case header name if specified as {@code true}\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withNullString(java.lang.String)",
      "begin_line": 1175,
      "end_line": 1179,
      "comment": "\n     * Performs conversions to and from null for strings on input and output.\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003cstrong\u003eReading:\u003c/strong\u003e Converts strings equal to the given {@code nullString} to {@code null} when reading\n     * records.\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003cstrong\u003eWriting:\u003c/strong\u003e Writes {@code null} as the given {@code nullString} when writing records.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param nullString\n     *            the String to convert to and from {@code null}. No substitution occurs if {@code null}\n     *\n     * @return A new CSVFormat that is equal to this but with the specified null conversion string.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withQuote(char)",
      "begin_line": 1190,
      "end_line": 1192,
      "comment": "\n     * Sets the quoteChar of the format to the specified character.\n     *\n     * @param quoteChar\n     *            the quoteChar character\n     * @return A new CSVFormat that is equal to this but with the specified character as quoteChar\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withQuote(java.lang.Character)",
      "begin_line": 1203,
      "end_line": 1210,
      "comment": "\n     * Sets the quoteChar of the format to the specified character.\n     *\n     * @param quoteChar\n     *            the quoteChar character, use {@code null} to disable\n     * @return A new CSVFormat that is equal to this but with the specified character as quoteChar\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withQuoteMode(org.apache.commons.csv.QuoteMode)",
      "begin_line": 1220,
      "end_line": 1224,
      "comment": "\n     * Sets the output quote policy of the format to the specified value.\n     *\n     * @param quoteModePolicy\n     *            the quote policy to use for output.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified quote policy\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withRecordSeparator(char)",
      "begin_line": 1239,
      "end_line": 1241,
      "comment": "\n     * Sets the record separator of the format to the specified character.\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eNote:\u003c/strong\u003e This setting is only used during printing and does not affect parsing. Parsing currently\n     * only works for inputs with \u0027\\n\u0027, \u0027\\r\u0027 and \"\\r\\n\"\n     * \u003c/p\u003e\n     *\n     * @param recordSeparator\n     *            the record separator to use for output.\n     *\n     * @return A new CSVFormat that is equal to this but with the the specified output record separator\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withRecordSeparator(java.lang.String)",
      "begin_line": 1258,
      "end_line": 1262,
      "comment": "\n     * Sets the record separator of the format to the specified String.\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eNote:\u003c/strong\u003e This setting is only used during printing and does not affect parsing. Parsing currently\n     * only works for inputs with \u0027\\n\u0027, \u0027\\r\u0027 and \"\\r\\n\"\n     * \u003c/p\u003e\n     *\n     * @param recordSeparator\n     *            the record separator to use for output.\n     *\n     * @return A new CSVFormat that is equal to this but with the the specified output record separator\n     * @throws IllegalArgumentException\n     *             if recordSeparator is none of CR, LF or CRLF\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withSkipHeaderRecord()",
      "begin_line": 1272,
      "end_line": 1274,
      "comment": "\n     * Sets skipping the header record to {@code true}.\n     *\n     * @return A new CSVFormat that is equal to this but with the the specified skipHeaderRecord setting.\n     * @see #withSkipHeaderRecord(boolean)\n     * @see #withHeader(String...)\n     * @since 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withSkipHeaderRecord(boolean)",
      "begin_line": 1285,
      "end_line": 1289,
      "comment": "\n     * Sets whether to skip the header record.\n     *\n     * @param skipHeaderRecord\n     *            whether to skip the header record.\n     *\n     * @return A new CSVFormat that is equal to this but with the the specified skipHeaderRecord setting.\n     * @see #withHeader(String...)\n     "
    }
  ]
}