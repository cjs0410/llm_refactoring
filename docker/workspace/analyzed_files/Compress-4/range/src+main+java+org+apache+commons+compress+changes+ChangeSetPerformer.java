{
  "filepath": "/tmp/Compress-4f/src/main/java/org/apache/commons/compress/changes/ChangeSetPerformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChangeSetPerformer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 179,
      "comment": "\n * Performs ChangeSet operations on a stream.\n * This class is thread safe and can be used multiple times.\n * It operates on a copy of the ChangeSet. If the ChangeSet changes,\n * a new Performer must be created.\n * \n * @ThreadSafe\n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "changes"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.ChangeSetPerformer(org.apache.commons.compress.changes.ChangeSet)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Constructs a ChangeSetPerformer with the changes from this ChangeSet\n     * @param changeSet the ChangeSet which operations are used for performing\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.perform(org.apache.commons.compress.archivers.ArchiveInputStream, org.apache.commons.compress.archivers.ArchiveOutputStream)",
      "begin_line": 67,
      "end_line": 130,
      "comment": "\n     * Performs all changes collected in this ChangeSet on the input stream and\n     * streams the result to the output stream. Perform may be called more than once.\n     * \n     * This method finishes the stream, no other entries should be added\n     * after that.\n     * \n     * @param in\n     *            the InputStream to perform the changes on\n     * @param out\n     *            the resulting OutputStream with all modifications\n     * @throws IOException\n     *             if an read/write error occurs\n     * @return the results of this operation\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.isDeletedLater(java.util.Set, org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 141,
      "end_line": 159,
      "comment": "\n     * Checks if an ArchiveEntry is deleted later in the ChangeSet. This is\n     * necessary if an file is added with this ChangeSet, but later became\n     * deleted in the same set.\n     * \n     * @param entry\n     *            the entry to check\n     * @return true, if this entry has an deletion change later, false otherwise\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.copyStream(java.io.InputStream, org.apache.commons.compress.archivers.ArchiveOutputStream, org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 173,
      "end_line": 178,
      "comment": "\n     * Copies the ArchiveEntry to the Output stream\n     * \n     * @param in\n     *            the stream to read the data from\n     * @param out\n     *            the stream to write the data to\n     * @param entry\n     *            the entry to write\n     * @throws IOException\n     *             if data cannot be read or written\n     "
    }
  ]
}