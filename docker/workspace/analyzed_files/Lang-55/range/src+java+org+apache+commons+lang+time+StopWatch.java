{
  "filepath": "/tmp/Lang-55f/src/java/org/apache/commons/lang/time/StopWatch.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StopWatch",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 265,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eStopWatch\u003c/code\u003e provides a convenient API for timings.\u003c/p\u003e\n * \n * \u003cp\u003eTo start the watch, call {@link #start()}. At this point you can:\u003c/p\u003e\n * \u003cul\u003e\n *  \u003cli\u003e{@link #split()} the watch to get the time whilst the watch continues in the\n *   background. {@link #unsplit()} will remove the effect of the split. At this point,\n *   these three options are available again.\u003c/li\u003e\n *  \u003cli\u003e{@link #suspend()} the watch to pause it. {@link #resume()} allows the watch\n *   to continue. Any time between the suspend and resume will not be counted in\n *   the total. At this point, these three options are available again.\u003c/li\u003e\n *  \u003cli\u003e{@link #stop()} the watch to complete the timing session.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eIt is intended that the output methods {@link #toString()} and {@link #getTime()}\n * should only be called after stop, split or suspend, however a suitable result will\n * be returned at other points.\u003c/p\u003e\n *\n * \u003cp\u003eNOTE: As from v2.1, the methods protect against inappropriate calls.\n * Thus you cannot now call stop before start, resume before suspend or\n * unsplit before split.\u003c/p\u003e\n *\n * \u003cp\u003e1. split(), suspend(), or stop() cannot be invoked twice\u003cbr /\u003e\n * 2. unsplit() may only be called if the watch has been split()\u003cbr /\u003e\n * 3. resume() may only be called if the watch has been suspend()\u003cbr /\u003e\n * 4. start() cannot be called twice without calling reset()\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "STATE_UNSTARTED"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " running states"
    },
    {
      "type": "field",
      "varNames": [
        "STATE_RUNNING"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STATE_STOPPED"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STATE_SUSPENDED"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STATE_UNSPLIT"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " split state"
    },
    {
      "type": "field",
      "varNames": [
        "STATE_SPLIT"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "runningState"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     *  The current running state of the StopWatch. \n     "
    },
    {
      "type": "field",
      "varNames": [
        "splitState"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Whether the stopwatch has a split time recorded. \n     "
    },
    {
      "type": "field",
      "varNames": [
        "startTime"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * The start time.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "stopTime"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * The stop time.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.StopWatch.StopWatch()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * \u003cp\u003eConstructor.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.start()",
      "begin_line": 95,
      "end_line": 105,
      "comment": "\n     * \u003cp\u003eStart the stopwatch.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method starts a new timing session, clearing any previous values.\u003c/p\u003e\n     *\n     * @throws IllegalStateException if the StopWatch is already running.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.stop()",
      "begin_line": 114,
      "end_line": 122,
      "comment": "\n     * \u003cp\u003eStop the stopwatch.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method ends a new timing session, allowing the time to be retrieved.\u003c/p\u003e\n     *\n     * @throws IllegalStateException if the StopWatch is not running.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.reset()",
      "begin_line": 129,
      "end_line": 134,
      "comment": "\n     * \u003cp\u003eResets the stopwatch. Stops it if need be. \u003c/p\u003e\n     * \n     * \u003cp\u003eThis method clears the internal values to allow the object to be reused.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.split()",
      "begin_line": 145,
      "end_line": 151,
      "comment": "\n     * \u003cp\u003eSplit the time.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method sets the stop time of the watch to allow a time to be extracted.\n     * The start time is unaffected, enabling {@link #unsplit()} to continue the \n     * timing from the original start point.\u003c/p\u003e\n     *\n     * @throws IllegalStateException if the StopWatch is not running.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.unsplit()",
      "begin_line": 161,
      "end_line": 167,
      "comment": "\n     * \u003cp\u003eRemove a split.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method clears the stop time. The start time is unaffected, enabling \n     * timing from the original start point to continue.\u003c/p\u003e\n     *\n     * @throws IllegalStateException if the StopWatch has not been split.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.suspend()",
      "begin_line": 177,
      "end_line": 183,
      "comment": "\n     * \u003cp\u003eSuspend the stopwatch for later resumption.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method suspends the watch until it is resumed. The watch will not include\n     * time between the suspend and resume calls in the total time.\u003c/p\u003e\n     *\n     * @throws IllegalStateException if the StopWatch is not currently running.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.resume()",
      "begin_line": 193,
      "end_line": 200,
      "comment": "\n     * \u003cp\u003eResume the stopwatch after a suspend.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method resumes the watch after it was suspended. The watch will not include\n     * time between the suspend and resume calls in the total time.\u003c/p\u003e\n     *\n     * @throws IllegalStateException if the StopWatch has not been suspended. \n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.getTime()",
      "begin_line": 210,
      "end_line": 221,
      "comment": "\n     * \u003cp\u003eGet the time on the stopwatch.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis is either the time between the start and the moment this method \n     * is called, or the amount of time between start and stop.\u003c/p\u003e\n     * \n     * @return the time in milliseconds\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.getSplitTime()",
      "begin_line": 233,
      "end_line": 238,
      "comment": "\n     * \u003cp\u003eGet the split time on the stopwatch.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis is the time between start and latest split. \u003c/p\u003e\n     * \n     * @return the split time in milliseconds\n     *\n     * @throws IllegalStateException if the StopWatch has not yet been split.\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.toString()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * \u003cp\u003eGets a summary of the time that the stopwatch recorded as a string.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe format used is ISO8601-like,\n     * \u003ci\u003ehours\u003c/i\u003e:\u003ci\u003eminutes\u003c/i\u003e:\u003ci\u003eseconds\u003c/i\u003e.\u003ci\u003emilliseconds\u003c/i\u003e.\u003c/p\u003e\n     * \n     * @return the time as a String\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.toSplitString()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * \u003cp\u003eGets a summary of the split time that the stopwatch recorded as a string.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe format used is ISO8601-like,\n     * \u003ci\u003ehours\u003c/i\u003e:\u003ci\u003eminutes\u003c/i\u003e:\u003ci\u003eseconds\u003c/i\u003e.\u003ci\u003emilliseconds\u003c/i\u003e.\u003c/p\u003e\n     * \n     * @return the split time as a String\n     * @since 2.1\n     "
    }
  ]
}