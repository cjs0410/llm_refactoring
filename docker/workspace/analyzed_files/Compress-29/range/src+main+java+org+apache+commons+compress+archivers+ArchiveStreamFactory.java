{
  "filepath": "/tmp/Compress-29f/src/main/java/org/apache/commons/compress/archivers/ArchiveStreamFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveStreamFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 76,
      "end_line": 415,
      "comment": "\n * Factory to create Archive[In|Out]putStreams from names or the first bytes of\n * the InputStream. In order to add other implementations, you should extend\n * ArchiveStreamFactory and override the appropriate methods (and call their\n * implementation from super of course).\n * \n * Compressing a ZIP-File:\n * \n * \u003cpre\u003e\n * final OutputStream out \u003d new FileOutputStream(output); \n * ArchiveOutputStream os \u003d new ArchiveStreamFactory().createArchiveOutputStream(ArchiveStreamFactory.ZIP, out);\n * \n * os.putArchiveEntry(new ZipArchiveEntry(\"testdata/test1.xml\"));\n * IOUtils.copy(new FileInputStream(file1), os);\n * os.closeArchiveEntry();\n *\n * os.putArchiveEntry(new ZipArchiveEntry(\"testdata/test2.xml\"));\n * IOUtils.copy(new FileInputStream(file2), os);\n * os.closeArchiveEntry();\n * os.close();\n * \u003c/pre\u003e\n * \n * Decompressing a ZIP-File:\n * \n * \u003cpre\u003e\n * final InputStream is \u003d new FileInputStream(input); \n * ArchiveInputStream in \u003d new ArchiveStreamFactory().createArchiveInputStream(ArchiveStreamFactory.ZIP, is);\n * ZipArchiveEntry entry \u003d (ZipArchiveEntry)in.getNextEntry();\n * OutputStream out \u003d new FileOutputStream(new File(dir, entry.getName()));\n * IOUtils.copy(in, out);\n * out.close();\n * in.close();\n * \u003c/pre\u003e\n * @Immutable provided that the deprecated method setEntryEncoding is not used.\n "
    },
    {
      "type": "field",
      "varNames": [
        "AR"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * Constant (value {@value}) used to identify the AR archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ARJ"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Constant (value {@value}) used to identify the ARJ archive format.\n     * Not supported as an output stream type.\n     * @since 1.6\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CPIO"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * Constant (value {@value}) used to identify the CPIO archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DUMP"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * Constant (value {@value}) used to identify the Unix DUMP archive format.\n     * Not supported as an output stream type.\n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAR"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n     * Constant (value {@value}) used to identify the JAR archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TAR"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * Constant used to identify the TAR archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Constant (value {@value}) used to identify the ZIP archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SEVEN_Z"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": "\n     * Constant (value {@value}) used to identify the 7z archive format.\n     * @since 1.8\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n     * Entry encoding, null for the platform default.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entryEncoding"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * Entry encoding, null for the default.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.ArchiveStreamFactory()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Create an instance using the platform default encoding.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.ArchiveStreamFactory(java.lang.String)",
      "begin_line": 145,
      "end_line": 150,
      "comment": "\n     * Create an instance using the specified encoding.\n     *\n     * @param encoding the encoding to be used.\n     *\n     * @since 1.10\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.getEntryEncoding()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * Returns the encoding to use for arj, jar, zip, dump, cpio and tar\n     * files, or null for the archiver default.\n     *\n     * @return entry encoding, or null for the archiver default\n     * @since 1.5\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.setEntryEncoding(java.lang.String)",
      "begin_line": 172,
      "end_line": 179,
      "comment": "\n     * Sets the encoding to use for arj, jar, zip, dump, cpio and tar files. Use null for the archiver default.\n     * \n     * @param entryEncoding the entry encoding, null uses the archiver default.\n     * @since 1.5\n     * @deprecated 1.10 use {@link #ArchiveStreamFactory(String)} to specify the encoding\n     * @throws IllegalStateException if the constructor {@link #ArchiveStreamFactory(String)} \n     * was used to specify the factory encoding.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(java.lang.String, java.io.InputStream)",
      "begin_line": 193,
      "end_line": 255,
      "comment": "\n     * Create an archive input stream from an archiver name and an input stream.\n     * \n     * @param archiverName the archive name,\n     * i.e. {@value #AR}, {@value #ARJ}, {@value #ZIP}, {@value #TAR}, {@value #JAR}, {@value #CPIO}, {@value #DUMP} or {@value #SEVEN_Z}\n     * @param in the input stream\n     * @return the archive input stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws StreamingNotSupportedException if the format cannot be\n     * read from a stream\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveOutputStream(java.lang.String, java.io.OutputStream)",
      "begin_line": 269,
      "end_line": 314,
      "comment": "\n     * Create an archive output stream from an archiver name and an output stream.\n     * \n     * @param archiverName the archive name,\n     * i.e. {@value #AR}, {@value #ZIP}, {@value #TAR}, {@value #JAR} or {@value #CPIO} \n     * @param out the output stream\n     * @return the archive output stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws StreamingNotSupportedException if the format cannot be\n     * written to a stream\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(java.io.InputStream)",
      "begin_line": 328,
      "end_line": 413,
      "comment": "\n     * Create an archive input stream from an input stream, autodetecting\n     * the archive type from the first few bytes of the stream. The InputStream\n     * must support marks, like BufferedInputStream.\n     * \n     * @param in the input stream\n     * @return the archive input stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws StreamingNotSupportedException if the format cannot be\n     * read from a stream\n     * @throws IllegalArgumentException if the stream is null or does not support mark\n     "
    }
  ]
}