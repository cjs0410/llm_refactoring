{
  "filepath": "/tmp/Jsoup-53f/src/main/java/org/jsoup/parser/TokenQueue.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TokenQueue",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 11,
      "end_line": 400,
      "comment": "\n * A character queue with parsing helpers.\n *\n * @author Jonathan Hedley\n "
    },
    {
      "type": "field",
      "varNames": [
        "queue"
      ],
      "begin_line": 12,
      "end_line": 12,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 13,
      "end_line": 13,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ESC"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": " escape char for chomp balanced."
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.TokenQueue.TokenQueue(java.lang.String)",
      "begin_line": 21,
      "end_line": 24,
      "comment": "\n     Create a new TokenQueue.\n     @param data string of data to back queue.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.isEmpty()",
      "begin_line": 30,
      "end_line": 32,
      "comment": "\n     * Is the queue empty?\n     * @return true if no data left in queue.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.remainingLength()",
      "begin_line": 34,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.peek()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Retrieves but does not remove the first character from the queue.\n     * @return First character, or 0 if empty.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.addFirst(java.lang.Character)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     Add a character to the start of the queue (will be the next character retrieved).\n     @param c character to add\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.addFirst(java.lang.String)",
      "begin_line": 58,
      "end_line": 62,
      "comment": "\n     Add a string to the start of the queue.\n     @param seq string to add.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matches(java.lang.String)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Tests if the next characters on the queue match the sequence. Case insensitive.\n     * @param seq String to check queue for.\n     * @return true if the next characters match.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matchesCS(java.lang.String)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Case sensitive match test.\n     * @param seq string to case sensitively check for\n     * @return true if matched, false if not\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matchesAny(java.lang.String...)",
      "begin_line": 88,
      "end_line": 94,
      "comment": "\n     Tests if the next characters match any of the sequences. Case insensitive.\n     @param seq list of strings to case insensitively check for\n     @return true of any matched, false if none did\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matchesAny(char...)",
      "begin_line": 96,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matchesStartTag()",
      "begin_line": 107,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matchChomp(java.lang.String)",
      "begin_line": 118,
      "end_line": 125,
      "comment": "\n     * Tests if the queue matches the sequence (as with match), and if they do, removes the matched string from the\n     * queue.\n     * @param seq String to search for, and if found, remove from queue.\n     * @return true if found and removed, false if not found.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matchesWhitespace()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     Tests if queue starts with a whitespace character.\n     @return if starts with whitespace\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.matchesWord()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     Test if the queue matches a word character (letter or digit).\n     @return if matches a word character\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.advance()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Drops the next character off the queue.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consume()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Consume one character off queue.\n     * @return first character on queue.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consume(java.lang.String)",
      "begin_line": 165,
      "end_line": 173,
      "comment": "\n     * Consumes the supplied sequence of the queue. If the queue does not start with the supplied sequence, will\n     * throw an illegal state exception -- but you should be running match() against that condition.\n     \u003cp\u003e\n     Case insensitive.\n     * @param seq sequence to remove from head of queue.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeTo(java.lang.String)",
      "begin_line": 180,
      "end_line": 189,
      "comment": "\n     * Pulls a string off the queue, up to but exclusive of the match sequence, or to the queue running out.\n     * @param seq String to end on (and not include in return, but leave on queue). \u003cb\u003eCase sensitive.\u003c/b\u003e\n     * @return The matched data consumed from queue.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeToIgnoreCase(java.lang.String)",
      "begin_line": 191,
      "end_line": 213,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeToAny(java.lang.String...)",
      "begin_line": 222,
      "end_line": 229,
      "comment": " is is a case sensitive time..."
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.chompTo(java.lang.String)",
      "begin_line": 239,
      "end_line": 243,
      "comment": "\n     * Pulls a string off the queue (like consumeTo), and then pulls off the matched string (but does not return it).\n     * \u003cp\u003e\n     * If the queue runs out of characters before finding the seq, will return as much as it can (and queue will go\n     * isEmpty() \u003d\u003d true).\n     * @param seq String to match up to, and not include in return, and to pull off queue. \u003cb\u003eCase sensitive.\u003c/b\u003e\n     * @return Data matched from queue.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.chompToIgnoreCase(java.lang.String)",
      "begin_line": 245,
      "end_line": 249,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.chompBalanced(char, char)",
      "begin_line": 260,
      "end_line": 289,
      "comment": "\n     * Pulls a balanced string off the queue. E.g. if queue is \"(one (two) three) four\", (,) will return \"one (two) three\",\n     * and leave \" four\" on the queue. Unbalanced openers and closers can quoted (with \u0027 or \") or escaped (with \\). Those escapes will be left\n     * in the returned string, which is suitable for regexes (where we need to preserve the escape), but unsuitable for\n     * contains text strings; use unescape for that.\n     * @param open opener\n     * @param close closer\n     * @return data matched from the queue\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.unescape(java.lang.String)",
      "begin_line": 296,
      "end_line": 309,
      "comment": "\n     * Unescaped a \\ escaped string.\n     * @param in backslash escaped string\n     * @return unescaped string\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeWhitespace()",
      "begin_line": 315,
      "end_line": 322,
      "comment": "\n     * Pulls the next run of whitespace characters of the queue.\n     * @return Whether consuming whitespace or not\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeWord()",
      "begin_line": 328,
      "end_line": 333,
      "comment": "\n     * Retrieves the next run of word type (letter or digit) off the queue.\n     * @return String of word characters from queue, or empty string if none.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeTagName()",
      "begin_line": 340,
      "end_line": 346,
      "comment": "\n     * Consume an tag name off the queue (word or :, _, -)\n     * \n     * @return tag name\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeElementSelector()",
      "begin_line": 353,
      "end_line": 359,
      "comment": "\n     * Consume a CSS element selector (tag name, but | instead of : for namespaces, to not conflict with :pseudo selects).\n     * \n     * @return tag name\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeCssIdentifier()",
      "begin_line": 366,
      "end_line": 372,
      "comment": "\n     Consume a CSS identifier (ID or class) off the queue (letter, digit, -, _)\n     http://www.w3.org/TR/CSS2/syndata.html#value-def-identifier\n     @return identifier\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.consumeAttributeKey()",
      "begin_line": 378,
      "end_line": 384,
      "comment": "\n     Consume an attribute key off the queue (letter, digit, -, _, :\")\n     @return attribute key\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.remainder()",
      "begin_line": 390,
      "end_line": 394,
      "comment": "\n     Consume and return whatever is left on the queue.\n     @return remained of queue.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TokenQueue.toString()",
      "begin_line": 396,
      "end_line": 399,
      "comment": ""
    }
  ]
}