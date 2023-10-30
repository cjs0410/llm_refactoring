{
  "filepath": "/tmp/Compress-33f/src/main/java/org/apache/commons/compress/compressors/CompressorStreamFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompressorStreamFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 69,
      "end_line": 377,
      "comment": "\n * \u003cp\u003eFactory to create Compressor[In|Out]putStreams from names. To add other\n * implementations you should extend CompressorStreamFactory and override the\n * appropriate methods (and call their implementation from super of course).\u003c/p\u003e\n * \n * Example (Compressing a file):\n * \n * \u003cpre\u003e\n * final OutputStream out \u003d new FileOutputStream(output); \n * CompressorOutputStream cos \u003d \n *      new CompressorStreamFactory().createCompressorOutputStream(CompressorStreamFactory.BZIP2, out);\n * IOUtils.copy(new FileInputStream(input), cos);\n * cos.close();\n * \u003c/pre\u003e\n * \n * Example (Decompressing a file):\n * \u003cpre\u003e\n * final InputStream is \u003d new FileInputStream(input); \n * CompressorInputStream in \u003d \n *      new CompressorStreamFactory().createCompressorInputStream(CompressorStreamFactory.BZIP2, is);\n * IOUtils.copy(in, new FileOutputStream(output));\n * in.close();\n * \u003c/pre\u003e\n * @Immutable provided that the deprecated method setDecompressConcatenated is not used.\n * @ThreadSafe even if the deprecated method setDecompressConcatenated is used\n "
    },
    {
      "type": "field",
      "varNames": [
        "BZIP2"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Constant (value {@value}) used to identify the BZIP2 compression algorithm.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GZIP"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * Constant (value {@value}) used to identify the GZIP compression algorithm.\n     * Not supported as an output stream type.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PACK200"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * Constant (value {@value}) used to identify the PACK200 compression algorithm.\n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "XZ"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * Constant (value {@value}) used to identify the XZ compression method.\n     * @since 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LZMA"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * Constant (value {@value}) used to identify the LZMA compression method.\n     * Not supported as an output stream type.\n     * @since 1.6\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SNAPPY_FRAMED"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * Constant (value {@value}) used to identify the \"framed\" Snappy compression method.\n     * Not supported as an output stream type.\n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SNAPPY_RAW"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Constant (value {@value}) used to identify the \"raw\" Snappy compression method.\n     * Not supported as an output stream type.\n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "Z"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * Constant (value {@value}) used to identify the traditional Unix compress method.\n     * Not supported as an output stream type.\n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFLATE"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * Constant (value {@value}) used to identify the Deflate compress method.\n     * @since 1.9\n     "
    },
    {
      "type": "field",
      "varNames": [
        "decompressUntilEOF"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * If true, decompress until the end of the input.\n     * If false, stop after the first stream and leave the \n     * input position to point to the next byte after the stream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "decompressConcatenated"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.CompressorStreamFactory()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Create an instance with the decompress Concatenated option set to false.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.CompressorStreamFactory(boolean)",
      "begin_line": 163,
      "end_line": 167,
      "comment": "\n     * Create an instance with the provided decompress Concatenated option.\n     * @param       decompressUntilEOF\n     *                          if true, decompress until the end of the\n     *                          input; if false, stop after the first\n     *                          stream and leave the input position to point\n     *                          to the next byte after the stream.\n     *           This setting applies to the gzip, bzip2 and xz formats only.\n     * @since 1.10\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.setDecompressConcatenated(boolean)",
      "begin_line": 185,
      "end_line": 191,
      "comment": "\n     * Whether to decompress the full input or only the first stream\n     * in formats supporting multiple concatenated input streams.\n     *\n     * \u003cp\u003eThis setting applies to the gzip, bzip2 and xz formats only.\u003c/p\u003e\n     *\n     * @param       decompressConcatenated\n     *                          if true, decompress until the end of the\n     *                          input; if false, stop after the first\n     *                          stream and leave the input position to point\n     *                          to the next byte after the stream\n     * @since 1.5\n     * @deprecated 1.10 use the {@link #CompressorStreamFactory(boolean)} constructor instead\n     * @throws IllegalStateException if the constructor {@link #CompressorStreamFactory(boolean)} \n     * was used to create the factory\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.io.InputStream)",
      "begin_line": 204,
      "end_line": 259,
      "comment": "\n     * Create an compressor input stream from an input stream, autodetecting\n     * the compressor type from the first few bytes of the stream. The InputStream\n     * must support marks, like BufferedInputStream.\n     * \n     * @param in the input stream\n     * @return the compressor input stream\n     * @throws CompressorException if the compressor name is not known\n     * @throws IllegalArgumentException if the stream is null or does not support mark\n     * @since 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.lang.String, java.io.InputStream)",
      "begin_line": 273,
      "end_line": 323,
      "comment": "\n     * Create a compressor input stream from a compressor name and an input stream.\n     * \n     * @param name of the compressor,\n     * i.e. {@value #GZIP}, {@value #BZIP2}, {@value #XZ}, {@value #LZMA},\n     * {@value #PACK200}, {@value #SNAPPY_RAW}, {@value #SNAPPY_FRAMED}, \n     * {@value #Z} or {@value #DEFLATE} \n     * @param in the input stream\n     * @return compressor input stream\n     * @throws CompressorException if the compressor name is not known\n     * @throws IllegalArgumentException if the name or input stream is null\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorOutputStream(java.lang.String, java.io.OutputStream)",
      "begin_line": 336,
      "end_line": 371,
      "comment": "\n     * Create an compressor output stream from an compressor name and an output stream.\n     * \n     * @param name the compressor name,\n     * i.e. {@value #GZIP}, {@value #BZIP2}, {@value #XZ},\n     * {@value #PACK200} or {@value #DEFLATE} \n     * @param out the output stream\n     * @return the compressor output stream\n     * @throws CompressorException if the archiver name is not known\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getDecompressConcatenated()",
      "begin_line": 374,
      "end_line": 376,
      "comment": " For Unit tests"
    }
  ]
}