{
  "filepath": "/tmp/Cli-2f/src/java/org/apache/commons/cli/PosixParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PosixParser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.Parser"
      ],
      "begin_line": 30,
      "end_line": 310,
      "comment": "\n * The class PosixParser provides an implementation of the \n * {@link Parser#flatten(Options,String[],boolean) flatten} method.\n *\n * @author John Keyes (john at integralsource.com)\n * @see Parser\n * @version $Revision$\n "
    },
    {
      "type": "field",
      "varNames": [
        "tokens"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " holder for flattened tokens "
    },
    {
      "type": "field",
      "varNames": [
        "eatTheRest"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " specifies if bursting should continue "
    },
    {
      "type": "field",
      "varNames": [
        "currentOption"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " holder for the current option "
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " the command line Options "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.PosixParser.init()",
      "begin_line": 49,
      "end_line": 54,
      "comment": "\n     * \u003cp\u003eResets the members to their original state i.e. remove\n     * all of \u003ccode\u003etokens\u003c/code\u003e entries, set \u003ccode\u003eeatTheRest\u003c/code\u003e\n     * to false and set \u003ccode\u003ecurrentOption\u003c/code\u003e to null.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.PosixParser.flatten(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 94,
      "end_line": 163,
      "comment": "\n     * \u003cp\u003eAn implementation of {@link Parser}\u0027s abstract\n     * {@link Parser#flatten(Options,String[],boolean) flatten} method.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe following are the rules used by this flatten method.\n     * \u003col\u003e\n     *  \u003cli\u003eif \u003ccode\u003estopAtNonOption\u003c/code\u003e is \u003cb\u003etrue\u003c/b\u003e then do not\n     *  burst anymore of \u003ccode\u003earguments\u003c/code\u003e entries, just add each\n     *  successive entry without further processing.  Otherwise, ignore\n     *  \u003ccode\u003estopAtNonOption\u003c/code\u003e.\u003c/li\u003e\n     *  \u003cli\u003eif the current \u003ccode\u003earguments\u003c/code\u003e entry is \"\u003cb\u003e--\u003c/b\u003e\"\n     *  just add the entry to the list of processed tokens\u003c/li\u003e\n     *  \u003cli\u003eif the current \u003ccode\u003earguments\u003c/code\u003e entry is \"\u003cb\u003e-\u003c/b\u003e\"\n     *  just add the entry to the list of processed tokens\u003c/li\u003e\n     *  \u003cli\u003eif the current \u003ccode\u003earguments\u003c/code\u003e entry is two characters\n     *  in length and the first character is \"\u003cb\u003e-\u003c/b\u003e\" then check if this\n     *  is a valid {@link Option} id.  If it is a valid id, then add the\n     *  entry to the list of processed tokens and set the current {@link Option}\n     *  member.  If it is not a valid id and \u003ccode\u003estopAtNonOption\u003c/code\u003e\n     *  is true, then the remaining entries are copied to the list of \n     *  processed tokens.  Otherwise, the current entry is ignored.\u003c/li\u003e\n     *  \u003cli\u003eif the current \u003ccode\u003earguments\u003c/code\u003e entry is more than two\n     *  characters in length and the first character is \"\u003cb\u003e-\u003c/b\u003e\" then\n     *  we need to burst the entry to determine its constituents.  For more\n     *  information on the bursting algorithm see \n     *  {@link PosixParser#burstToken(String, boolean) burstToken}.\u003c/li\u003e\n     *  \u003cli\u003eif the current \u003ccode\u003earguments\u003c/code\u003e entry is not handled \n     *  by any of the previous rules, then the entry is added to the list\n     *  of processed tokens.\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003c/p\u003e\n     *\n     * @param options The command line {@link Options}\n     * @param arguments The command line arguments to be parsed\n     * @param stopAtNonOption Specifies whether to stop flattening\n     * when an non option is found.\n     * @return The flattened \u003ccode\u003earguments\u003c/code\u003e String array.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.PosixParser.gobble(java.util.Iterator)",
      "begin_line": 170,
      "end_line": 179,
      "comment": "\n     * \u003cp\u003eAdds the remaining tokens to the processed tokens list.\u003c/p\u003e\n     *\n     * @param iter An iterator over the remaining tokens\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.PosixParser.process(java.lang.String)",
      "begin_line": 194,
      "end_line": 214,
      "comment": "\n     * \u003cp\u003eIf there is a current option and it can have an argument\n     * value then add the token to the processed tokens list and \n     * set the current option to null.\u003c/p\u003e\n     * \u003cp\u003eIf there is a current option and it can have argument\n     * values then add the token to the processed tokens list.\u003c/p\u003e\n     * \u003cp\u003eIf there is not a current option add the special token\n     * \"\u003cb\u003e--\u003c/b\u003e\" and the current \u003ccode\u003evalue\u003c/code\u003e to the processed\n     * tokens list.  The add all the remaining \u003ccode\u003eargument\u003c/code\u003e\n     * values to the processed tokens list.\u003c/p\u003e\n     *\n     * @param value The current token\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.PosixParser.processSingleHyphen(java.lang.String)",
      "begin_line": 222,
      "end_line": 225,
      "comment": "\n     * \u003cp\u003eIf it is a hyphen then add the hyphen directly to\n     * the processed tokens list.\u003c/p\u003e\n     *\n     * @param hyphen The hyphen token\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.PosixParser.processOptionToken(java.lang.String, boolean)",
      "begin_line": 239,
      "end_line": 250,
      "comment": "\n     * \u003cp\u003eIf an {@link Option} exists for \u003ccode\u003etoken\u003c/code\u003e then\n     * set the current option and add the token to the processed \n     * list.\u003c/p\u003e\n     * \u003cp\u003eIf an {@link Option} does not exist and \u003ccode\u003estopAtNonOption\u003c/code\u003e\n     * is set then ignore the current token and add the remaining tokens\n     * to the processed tokens list directly.\u003c/p\u003e\n     *\n     * @param token The current option token\n     * @param stopAtNonOption Specifies whether flattening should halt\n     * at the first non option.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.PosixParser.burstToken(java.lang.String, boolean)",
      "begin_line": 278,
      "end_line": 309,
      "comment": "\n     * \u003cp\u003eBreaks \u003ccode\u003etoken\u003c/code\u003e into its constituent parts\n     * using the following algorithm.\n     * \u003cul\u003e\n     *  \u003cli\u003eignore the first character (\"\u003cb\u003e-\u003c/b\u003e\")\u003c/li\u003e\n     *  \u003cli\u003eforeach remaining character check if an {@link Option}\n     *  exists with that id.\u003c/li\u003e\n     *  \u003cli\u003eif an {@link Option} does exist then add that character\n     *  prepended with \"\u003cb\u003e-\u003c/b\u003e\" to the list of processed tokens.\u003c/li\u003e\n     *  \u003cli\u003eif the {@link Option} can have an argument value and there \n     *  are remaining characters in the token then add the remaining \n     *  characters as a token to the list of processed tokens.\u003c/li\u003e\n     *  \u003cli\u003eif an {@link Option} does \u003cb\u003eNOT\u003c/b\u003e exist \u003cb\u003eAND\u003c/b\u003e \n     *  \u003ccode\u003estopAtNonOption\u003c/code\u003e \u003cb\u003eIS\u003c/b\u003e set then add the special token\n     *  \"\u003cb\u003e--\u003c/b\u003e\" followed by the remaining characters and also \n     *  the remaining tokens directly to the processed tokens list.\u003c/li\u003e\n     *  \u003cli\u003eif an {@link Option} does \u003cb\u003eNOT\u003c/b\u003e exist \u003cb\u003eAND\u003c/b\u003e\n     *  \u003ccode\u003estopAtNonOption\u003c/code\u003e \u003cb\u003eIS NOT\u003c/b\u003e set then add that\n     *  character prepended with \"\u003cb\u003e-\u003c/b\u003e\".\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param token The current token to be \u003cb\u003eburst\u003c/b\u003e\n     * @param stopAtNonOption Specifies whether to stop processing\n     * at the first non-Option encountered.\n     "
    }
  ]
}