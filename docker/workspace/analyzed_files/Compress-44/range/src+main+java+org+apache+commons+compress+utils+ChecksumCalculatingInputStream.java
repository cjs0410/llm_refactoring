{
  "filepath": "/tmp/Compress-44f/src/main/java/org/apache/commons/compress/utils/ChecksumCalculatingInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChecksumCalculatingInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 29,
      "end_line": 105,
      "comment": "\n * A stream that calculates the checksum of the data read.\n * @NotThreadSafe\n * @since 1.14\n "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "checksum"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.ChecksumCalculatingInputStream.ChecksumCalculatingInputStream(java.util.zip.Checksum, java.io.InputStream)",
      "begin_line": 33,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read()",
      "begin_line": 53,
      "end_line": 60,
      "comment": "\n     * Reads a single byte from the stream\n     * @throws IOException if the underlying stream throws or the\n     * stream is exhausted and the Checksum doesn\u0027t match the expected\n     * value\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read(byte[])",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Reads a byte array from the stream\n     * @throws IOException if the underlying stream throws or the\n     * stream is exhausted and the Checksum doesn\u0027t match the expected\n     * value\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read(byte[], int, int)",
      "begin_line": 79,
      "end_line": 86,
      "comment": "\n     * Reads from the stream into a byte array.\n     * @throws IOException if the underlying stream throws or the\n     * stream is exhausted and the Checksum doesn\u0027t match the expected\n     * value\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ChecksumCalculatingInputStream.skip(long)",
      "begin_line": 88,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Returns the calculated checksum.\n     * @return the calculated checksum.\n     "
    }
  ]
}