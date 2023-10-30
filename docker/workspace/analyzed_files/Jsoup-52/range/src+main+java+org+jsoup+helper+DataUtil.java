{
  "filepath": "/tmp/Jsoup-52f/src/main/java/org/jsoup/helper/DataUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DataUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 254,
      "comment": "\n * Internal static utilities for handling data.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "charsetPattern"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultCharset"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " used if not found in header or meta charset"
    },
    {
      "type": "field",
      "varNames": [
        "bufferSize"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " ~130K."
    },
    {
      "type": "field",
      "varNames": [
        "UNICODE_BOM"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mimeBoundaryChars"
      ],
      "begin_line": 31,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "boundaryLength"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.DataUtil.DataUtil()",
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.load(java.io.File, java.lang.String, java.lang.String)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Loads a file to a Document.\n     * @param in file to load\n     * @param charsetName character set of input\n     * @param baseUri base URI of document, to resolve relative links against\n     * @return Document\n     * @throws IOException on IO error\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.load(java.io.InputStream, java.lang.String, java.lang.String)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Parses a Document from an input steam.\n     * @param in input stream to parse. You will need to close it.\n     * @param charsetName character set of input\n     * @param baseUri base URI of document, to resolve relative links against\n     * @return Document\n     * @throws IOException on IO error\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.load(java.io.InputStream, java.lang.String, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Parses a Document from an input steam, using the provided Parser.\n     * @param in input stream to parse. You will need to close it.\n     * @param charsetName character set of input\n     * @param baseUri base URI of document, to resolve relative links against\n     * @param parser alternate {@link Parser#xmlParser() parser} to use.\n     * @return Document\n     * @throws IOException on IO error\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.crossStreams(java.io.InputStream, java.io.OutputStream)",
      "begin_line": 83,
      "end_line": 89,
      "comment": "\n     * Writes the input stream to the output stream. Doesn\u0027t close them.\n     * @param in input stream to read from\n     * @param out output stream to write to\n     * @throws IOException on IO error\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.parseByteData(java.nio.ByteBuffer, java.lang.String, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 94,
      "end_line": 140,
      "comment": " todo - this is getting gnarly. needs a rewrite."
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.readToByteBuffer(java.io.InputStream, int)",
      "begin_line": 149,
      "end_line": 170,
      "comment": "\n     * Read the input stream into a byte buffer.\n     * @param inStream the input stream to read from\n     * @param maxSize the maximum size in bytes to read from the stream. Set to 0 to be unlimited.\n     * @return the filled byte buffer\n     * @throws IOException if an exception occurs whilst reading from the input stream.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.readToByteBuffer(java.io.InputStream)",
      "begin_line": 172,
      "end_line": 174,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.readFileToByteBuffer(java.io.File)",
      "begin_line": 176,
      "end_line": 187,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.emptyByteBuffer()",
      "begin_line": 189,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.getCharsetFromContentType(java.lang.String)",
      "begin_line": 199,
      "end_line": 208,
      "comment": "\n     * Parse out a charset from a content type header. If the charset is not supported, returns null (so the default\n     * will kick in.)\n     * @param contentType e.g. \"text/html; charset\u003dEUC-JP\"\n     * @return \"EUC-JP\", or null if not found. Charset is trimmed and uppercased.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.validateCharset(java.lang.String)",
      "begin_line": 210,
      "end_line": 221,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.mimeBoundary()",
      "begin_line": 226,
      "end_line": 233,
      "comment": "\n     * Creates a random string, suitable for use as a mime boundary\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.detectCharsetFromBom(java.nio.ByteBuffer, java.lang.String)",
      "begin_line": 235,
      "end_line": 253,
      "comment": ""
    }
  ]
}