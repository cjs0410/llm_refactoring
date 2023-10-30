{
  "filepath": "/tmp/Jsoup-20f/src/main/java/org/jsoup/helper/DataUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DataUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 17,
      "end_line": 135,
      "comment": "\n * Internal static utilities for handling data.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "charsetPattern"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultCharset"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": " used if not found in header or meta charset"
    },
    {
      "type": "field",
      "varNames": [
        "bufferSize"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": " ~130K."
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.DataUtil.DataUtil()",
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.load(java.io.File, java.lang.String, java.lang.String)",
      "begin_line": 32,
      "end_line": 42,
      "comment": "\n     * Loads a file to a Document.\n     * @param in file to load\n     * @param charsetName character set of input\n     * @param baseUri base URI of document, to resolve relative links against\n     * @return Document\n     * @throws IOException on IO error\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.load(java.io.InputStream, java.lang.String, java.lang.String)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Parses a Document from an input steam.\n     * @param in input stream to parse. You will need to close it.\n     * @param charsetName character set of input\n     * @param baseUri base URI of document, to resolve relative links against\n     * @return Document\n     * @throws IOException on IO error\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.load(java.io.InputStream, java.lang.String, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Parses a Document from an input steam, using the provided Parser.\n     * @param in input stream to parse. You will need to close it.\n     * @param charsetName character set of input\n     * @param baseUri base URI of document, to resolve relative links against\n     * @param parser alternate {@link Parser#xmlParser() parser} to use.\n     * @return Document\n     * @throws IOException on IO error\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.parseByteData(java.nio.ByteBuffer, java.lang.String, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 73,
      "end_line": 105,
      "comment": " switching the chartset midstream when a meta http-equiv tag defines the charset."
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.readToByteBuffer(java.io.InputStream)",
      "begin_line": 107,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.getCharsetFromContentType(java.lang.String)",
      "begin_line": 125,
      "end_line": 132,
      "comment": "\n     * Parse out a charset from a content type header.\n     * @param contentType e.g. \"text/html; charset\u003dEUC-JP\"\n     * @return \"EUC-JP\", or null if not found. Charset is trimmed and uppercased.\n     "
    }
  ]
}