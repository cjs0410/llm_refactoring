{
  "filepath": "/tmp/Compress-33f/src/main/java/org/apache/commons/compress/compressors/deflate/DeflateCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DeflateCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 32,
      "end_line": 118,
      "comment": "\n * Deflate decompressor.\n * @since 1.9\n "
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_1"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_2a"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_2b"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_2c"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAGIC_2d"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.DeflateCompressorInputStream(java.io.InputStream)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Creates a new input stream that decompresses Deflate-compressed data\n     * from the specified input stream.\n     *\n     * @param       inputStream where to read the compressed data\n     *\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.DeflateCompressorInputStream(java.io.InputStream, org.apache.commons.compress.compressors.deflate.DeflateParameters)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Creates a new input stream that decompresses Deflate-compressed data\n     * from the specified input stream.\n     *\n     * @param       inputStream where to read the compressed data\n     * @param       parameters parameters\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.read()",
      "begin_line": 65,
      "end_line": 70,
      "comment": " {@inheritDoc} "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.read(byte[], int, int)",
      "begin_line": 73,
      "end_line": 78,
      "comment": " {@inheritDoc} "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.skip(long)",
      "begin_line": 81,
      "end_line": 84,
      "comment": " {@inheritDoc} "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.available()",
      "begin_line": 87,
      "end_line": 90,
      "comment": " {@inheritDoc} "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.close()",
      "begin_line": 93,
      "end_line": 96,
      "comment": " {@inheritDoc} "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byte[], int)",
      "begin_line": 111,
      "end_line": 117,
      "comment": "\n     * Checks if the signature matches what is expected for a zlib / deflated file\n     *  with the zlib header.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is zlib / deflate compressed with a header\n     * stream, false otherwise\n     * \n     * @since 1.9\n     "
    }
  ]
}