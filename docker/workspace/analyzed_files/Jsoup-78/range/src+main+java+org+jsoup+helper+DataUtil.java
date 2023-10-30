{
  "filepath": "/tmp/Jsoup-78f/src/main/java/org/jsoup/helper/DataUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DataUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 271,
      "comment": "\n * Internal static utilities for handling data.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "charsetPattern"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultCharset"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " used if not found in header or meta charset"
    },
    {
      "type": "field",
      "varNames": [
        "firstReadBufferSize"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bufferSize"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mimeBoundaryChars"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "boundaryLength"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.DataUtil.DataUtil()",
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.load(java.io.File, java.lang.String, java.lang.String)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Loads a file to a Document.\n     * @param in file to load\n     * @param charsetName character set of input\n     * @param baseUri base URI of document, to resolve relative links against\n     * @return Document\n     * @throws IOException on IO error\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.load(java.io.InputStream, java.lang.String, java.lang.String)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Parses a Document from an input steam.\n     * @param in input stream to parse. You will need to close it.\n     * @param charsetName character set of input\n     * @param baseUri base URI of document, to resolve relative links against\n     * @return Document\n     * @throws IOException on IO error\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.load(java.io.InputStream, java.lang.String, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Parses a Document from an input steam, using the provided Parser.\n     * @param in input stream to parse. You will need to close it.\n     * @param charsetName character set of input\n     * @param baseUri base URI of document, to resolve relative links against\n     * @param parser alternate {@link Parser#xmlParser() parser} to use.\n     * @return Document\n     * @throws IOException on IO error\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.crossStreams(java.io.InputStream, java.io.OutputStream)",
      "begin_line": 86,
      "end_line": 92,
      "comment": "\n     * Writes the input stream to the output stream. Doesn\u0027t close them.\n     * @param in input stream to read from\n     * @param out output stream to write to\n     * @throws IOException on IO error\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.parseInputStream(java.io.InputStream, java.lang.String, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 94,
      "end_line": 162,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.readToByteBuffer(java.io.InputStream, int)",
      "begin_line": 172,
      "end_line": 176,
      "comment": "\n     * Read the input stream into a byte buffer. To deal with slow input streams, you may interrupt the thread this\n     * method is executing on. The data read until being interrupted will be available.\n     * @param inStream the input stream to read from\n     * @param maxSize the maximum size in bytes to read from the stream. Set to 0 to be unlimited.\n     * @return the filled byte buffer\n     * @throws IOException if an exception occurs whilst reading from the input stream.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.readToByteBuffer(java.io.InputStream)",
      "begin_line": 178,
      "end_line": 180,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.readFileToByteBuffer(java.io.File)",
      "begin_line": 182,
      "end_line": 193,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.emptyByteBuffer()",
      "begin_line": 195,
      "end_line": 197,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.getCharsetFromContentType(java.lang.String)",
      "begin_line": 205,
      "end_line": 214,
      "comment": "\n     * Parse out a charset from a content type header. If the charset is not supported, returns null (so the default\n     * will kick in.)\n     * @param contentType e.g. \"text/html; charset\u003dEUC-JP\"\n     * @return \"EUC-JP\", or null if not found. Charset is trimmed and uppercased.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.validateCharset(java.lang.String)",
      "begin_line": 216,
      "end_line": 227,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.mimeBoundary()",
      "begin_line": 232,
      "end_line": 239,
      "comment": "\n     * Creates a random string, suitable for use as a mime boundary\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.detectCharsetFromBom(java.nio.ByteBuffer)",
      "begin_line": 241,
      "end_line": 260,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "BomCharset",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 262,
      "end_line": 270,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.DataUtil.BomCharset.BomCharset(java.lang.String, int)",
      "begin_line": 266,
      "end_line": 269,
      "comment": ""
    }
  ]
}