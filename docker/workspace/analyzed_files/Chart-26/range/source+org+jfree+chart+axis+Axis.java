{
  "filepath": "/tmp/Chart-26f/source/org/jfree/chart/axis/Axis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Axis",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 128,
      "end_line": 1374,
      "comment": "\r\n * The base class for all axes in JFreeChart.  Subclasses are divided into \r\n * those that display values ({@link ValueAxis}) and those that display \r\n * categories ({@link CategoryAxis}).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_VISIBLE"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " The default axis visibility. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_LABEL_FONT"
      ],
      "begin_line": 137,
      "end_line": 138,
      "comment": " The default axis label font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_LABEL_PAINT"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " The default axis label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_LABEL_INSETS"
      ],
      "begin_line": 144,
      "end_line": 145,
      "comment": " The default axis label insets. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_LINE_PAINT"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " The default axis line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_LINE_STROKE"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " The default axis line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_LABELS_VISIBLE"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " The default tick labels visibility. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_LABEL_FONT"
      ],
      "begin_line": 157,
      "end_line": 158,
      "comment": " The default tick label font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_LABEL_PAINT"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " The default tick label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_LABEL_INSETS"
      ],
      "begin_line": 164,
      "end_line": 165,
      "comment": " The default tick label insets. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_MARKS_VISIBLE"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": " The default tick marks visible. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_MARK_STROKE"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": " The default tick stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_MARK_PAINT"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " The default tick paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_MARK_INSIDE_LENGTH"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " The default tick mark inside length. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_MARK_OUTSIDE_LENGTH"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " The default tick mark outside length. "
    },
    {
      "type": "field",
      "varNames": [
        "visible"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": " A flag indicating whether or not the axis is visible. "
    },
    {
      "type": "field",
      "varNames": [
        "label"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": " The label for the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "labelFont"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": " The font for displaying the axis label. "
    },
    {
      "type": "field",
      "varNames": [
        "labelPaint"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " The paint for drawing the axis label. "
    },
    {
      "type": "field",
      "varNames": [
        "labelInsets"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": " The insets for the axis label. "
    },
    {
      "type": "field",
      "varNames": [
        "labelAngle"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " The label angle. "
    },
    {
      "type": "field",
      "varNames": [
        "labelToolTip"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": "\r\n     * The tool tip text for the label (\u003ccode\u003enull\u003c/code\u003e is permitted).\r\n     * \r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelURL"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": "\r\n     * The URL for the label (\u003ccode\u003enull\u003c/code\u003e is permitted).\r\n     * \r\n     * @since 1.2.0.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "axisLineVisible"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": " A flag that controls whether or not the axis line is visible. "
    },
    {
      "type": "field",
      "varNames": [
        "axisLineStroke"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": " The stroke used for the axis line. "
    },
    {
      "type": "field",
      "varNames": [
        "axisLinePaint"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": " The paint used for the axis line. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelsVisible"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": " \r\n     * A flag that indicates whether or not tick labels are visible for the \r\n     * axis. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelFont"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": " The font used to display the tick labels. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelPaint"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": " The color used to display the tick labels. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelInsets"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": " The blank space around each tick label. "
    },
    {
      "type": "field",
      "varNames": [
        "tickMarksVisible"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": " \r\n     * A flag that indicates whether or not tick marks are visible for the \r\n     * axis. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickMarkInsideLength"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": " The length of the tick mark inside the data area (zero permitted). "
    },
    {
      "type": "field",
      "varNames": [
        "tickMarkOutsideLength"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": " The length of the tick mark outside the data area (zero permitted). "
    },
    {
      "type": "field",
      "varNames": [
        "tickMarkStroke"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": " The stroke used to draw tick marks. "
    },
    {
      "type": "field",
      "varNames": [
        "tickMarkPaint"
      ],
      "begin_line": 254,
      "end_line": 254,
      "comment": " The paint used to draw tick marks. "
    },
    {
      "type": "field",
      "varNames": [
        "fixedDimension"
      ],
      "begin_line": 257,
      "end_line": 257,
      "comment": " The fixed (horizontal or vertical) dimension for the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "plot"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": " \r\n     * A reference back to the plot that the axis is assigned to (can be \r\n     * \u003ccode\u003enull\u003c/code\u003e). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "listenerList"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": " Storage for registered listeners. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.Axis.Axis(java.lang.String)",
      "begin_line": 273,
      "end_line": 303,
      "comment": "\r\n     * Constructs an axis, using default values where necessary.\r\n     *\r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.isVisible()",
      "begin_line": 313,
      "end_line": 315,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the axis is visible, and \r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #setVisible(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setVisible(boolean)",
      "begin_line": 325,
      "end_line": 330,
      "comment": "\r\n     * Sets a flag that controls whether or not the axis is visible and sends \r\n     * an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #isVisible()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabel()",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\r\n     * Returns the label for the axis.\r\n     *\r\n     * @return The label for the axis (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     * \r\n     * @see #getLabelFont()\r\n     * @see #getLabelPaint()\r\n     * @see #setLabel(String)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabel(java.lang.String)",
      "begin_line": 355,
      "end_line": 371,
      "comment": "\r\n     * Sets the label for the axis and sends an {@link AxisChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param label  the new label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLabel()\r\n     * @see #setLabelFont(Font)\r\n     * @see #setLabelPaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabelFont()",
      "begin_line": 380,
      "end_line": 382,
      "comment": "\r\n     * Returns the font for the axis label.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelFont(Font)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabelFont(java.awt.Font)",
      "begin_line": 392,
      "end_line": 400,
      "comment": "\r\n     * Sets the font for the axis label and sends an {@link AxisChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLabelFont()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabelPaint()",
      "begin_line": 409,
      "end_line": 411,
      "comment": "\r\n     * Returns the color/shade used to draw the axis label.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelPaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabelPaint(java.awt.Paint)",
      "begin_line": 421,
      "end_line": 427,
      "comment": "\r\n     * Sets the paint used to draw the axis label and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLabelPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabelInsets()",
      "begin_line": 437,
      "end_line": 439,
      "comment": "\r\n     * Returns the insets for the label (that is, the amount of blank space\r\n     * that should be left around the label).\r\n     *\r\n     * @return The label insets (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelInsets(RectangleInsets)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabelInsets(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 449,
      "end_line": 457,
      "comment": "\r\n     * Sets the insets for the axis label, and sends an {@link AxisChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param insets  the insets (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLabelInsets()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabelAngle()",
      "begin_line": 466,
      "end_line": 468,
      "comment": "\r\n     * Returns the angle of the axis label.\r\n     *\r\n     * @return The angle (in radians).\r\n     * \r\n     * @see #setLabelAngle(double)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabelAngle(double)",
      "begin_line": 478,
      "end_line": 481,
      "comment": "\r\n     * Sets the angle for the label and sends an {@link AxisChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param angle  the angle (in radians).\r\n     * \r\n     * @see #getLabelAngle()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabelToolTip()",
      "begin_line": 492,
      "end_line": 494,
      "comment": "\r\n     * Returns the tool tip text for the axis label.\r\n     * \r\n     * @return The tool tip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelToolTip(String)\r\n     * \r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabelToolTip(java.lang.String)",
      "begin_line": 506,
      "end_line": 509,
      "comment": "\r\n     * Sets the tool tip text for the axis label and sends a .\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param text  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLabelToolTip()\r\n     * \r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabelURL()",
      "begin_line": 520,
      "end_line": 522,
      "comment": "\r\n     * Returns the URL text for the axis label.\r\n     * \r\n     * @return The URL (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelURL(String)\r\n     * \r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabelURL(java.lang.String)",
      "begin_line": 534,
      "end_line": 537,
      "comment": "\r\n     * Sets the URL for the axis label and sends an {@link AxisChangeEvent} to\r\n     * all registered listeners.\r\n     * \r\n     * @param url  the URL (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLabelURL()\r\n     * \r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.isAxisLineVisible()",
      "begin_line": 548,
      "end_line": 550,
      "comment": "\r\n     * A flag that controls whether or not the axis line is drawn.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #getAxisLinePaint()\r\n     * @see #getAxisLineStroke()\r\n     * @see #setAxisLineVisible(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setAxisLineVisible(boolean)",
      "begin_line": 562,
      "end_line": 565,
      "comment": "\r\n     * Sets a flag that controls whether or not the axis line is visible and \r\n     * sends an {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param visible  the flag.\r\n     * \r\n     * @see #isAxisLineVisible()\r\n     * @see #setAxisLinePaint(Paint)\r\n     * @see #setAxisLineStroke(Stroke)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getAxisLinePaint()",
      "begin_line": 574,
      "end_line": 576,
      "comment": "\r\n     * Returns the paint used to draw the axis line.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setAxisLinePaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setAxisLinePaint(java.awt.Paint)",
      "begin_line": 586,
      "end_line": 592,
      "comment": "\r\n     * Sets the paint used to draw the axis line and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getAxisLinePaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getAxisLineStroke()",
      "begin_line": 601,
      "end_line": 603,
      "comment": "\r\n     * Returns the stroke used to draw the axis line.\r\n     * \r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setAxisLineStroke(Stroke)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setAxisLineStroke(java.awt.Stroke)",
      "begin_line": 613,
      "end_line": 619,
      "comment": "\r\n     * Sets the stroke used to draw the axis line and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getAxisLineStroke()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.isTickLabelsVisible()",
      "begin_line": 630,
      "end_line": 632,
      "comment": "\r\n     * Returns a flag indicating whether or not the tick labels are visible.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #getTickLabelFont()\r\n     * @see #getTickLabelPaint()\r\n     * @see #setTickLabelsVisible(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickLabelsVisible(boolean)",
      "begin_line": 645,
      "end_line": 652,
      "comment": "\r\n     * Sets the flag that determines whether or not the tick labels are \r\n     * visible and sends an {@link AxisChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #isTickLabelsVisible()\r\n     * @see #setTickLabelFont(Font)\r\n     * @see #setTickLabelPaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getTickLabelFont()",
      "begin_line": 661,
      "end_line": 663,
      "comment": "\r\n     * Returns the font used for the tick labels (if showing).\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setTickLabelFont(Font)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickLabelFont(java.awt.Font)",
      "begin_line": 673,
      "end_line": 684,
      "comment": "\r\n     * Sets the font for the tick labels and sends an {@link AxisChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not allowed).\r\n     * \r\n     * @see #getTickLabelFont()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getTickLabelPaint()",
      "begin_line": 693,
      "end_line": 695,
      "comment": "\r\n     * Returns the color/shade used for the tick labels.\r\n     *\r\n     * @return The paint used for the tick labels.\r\n     * \r\n     * @see #setTickLabelPaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickLabelPaint(java.awt.Paint)",
      "begin_line": 705,
      "end_line": 711,
      "comment": "\r\n     * Sets the paint used to draw tick labels (if they are showing) and \r\n     * sends an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getTickLabelPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getTickLabelInsets()",
      "begin_line": 720,
      "end_line": 722,
      "comment": "\r\n     * Returns the insets for the tick labels.\r\n     *\r\n     * @return The insets (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setTickLabelInsets(RectangleInsets)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickLabelInsets(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 732,
      "end_line": 740,
      "comment": "\r\n     * Sets the insets for the tick labels and sends an {@link AxisChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param insets  the insets (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getTickLabelInsets()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.isTickMarksVisible()",
      "begin_line": 751,
      "end_line": 753,
      "comment": "\r\n     * Returns the flag that indicates whether or not the tick marks are\r\n     * showing.\r\n     *\r\n     * @return The flag that indicates whether or not the tick marks are \r\n     *         showing.\r\n     *         \r\n     * @see #setTickMarksVisible(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickMarksVisible(boolean)",
      "begin_line": 763,
      "end_line": 768,
      "comment": "\r\n     * Sets the flag that indicates whether or not the tick marks are showing\r\n     * and sends an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #isTickMarksVisible()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getTickMarkInsideLength()",
      "begin_line": 778,
      "end_line": 780,
      "comment": "\r\n     * Returns the inside length of the tick marks.\r\n     *\r\n     * @return The length.\r\n     * \r\n     * @see #getTickMarkOutsideLength()\r\n     * @see #setTickMarkInsideLength(float)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickMarkInsideLength(float)",
      "begin_line": 790,
      "end_line": 793,
      "comment": "\r\n     * Sets the inside length of the tick marks and sends\r\n     * an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param length  the new length.\r\n     * \r\n     * @see #getTickMarkInsideLength()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getTickMarkOutsideLength()",
      "begin_line": 803,
      "end_line": 805,
      "comment": "\r\n     * Returns the outside length of the tick marks.\r\n     *\r\n     * @return The length.\r\n     * \r\n     * @see #getTickMarkInsideLength()\r\n     * @see #setTickMarkOutsideLength(float)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickMarkOutsideLength(float)",
      "begin_line": 815,
      "end_line": 818,
      "comment": "\r\n     * Sets the outside length of the tick marks and sends\r\n     * an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param length  the new length.\r\n     * \r\n     * @see #getTickMarkInsideLength()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getTickMarkStroke()",
      "begin_line": 827,
      "end_line": 829,
      "comment": "\r\n     * Returns the stroke used to draw tick marks.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setTickMarkStroke(Stroke)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickMarkStroke(java.awt.Stroke)",
      "begin_line": 839,
      "end_line": 847,
      "comment": "\r\n     * Sets the stroke used to draw tick marks and sends\r\n     * an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getTickMarkStroke()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getTickMarkPaint()",
      "begin_line": 856,
      "end_line": 858,
      "comment": "\r\n     * Returns the paint used to draw tick marks (if they are showing).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setTickMarkPaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickMarkPaint(java.awt.Paint)",
      "begin_line": 868,
      "end_line": 874,
      "comment": "\r\n     * Sets the paint used to draw tick marks and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getTickMarkPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getPlot()",
      "begin_line": 885,
      "end_line": 887,
      "comment": "\r\n     * Returns the plot that the axis is assigned to.  This method will return \r\n     * \u003ccode\u003enull\u003c/code\u003e if the axis is not currently assigned to a plot.\r\n     *\r\n     * @return The plot that the axis is assigned to (possibly \r\n     *         \u003ccode\u003enull\u003c/code\u003e).\r\n     *         \r\n     * @see #setPlot(Plot)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setPlot(org.jfree.chart.plot.Plot)",
      "begin_line": 898,
      "end_line": 901,
      "comment": "\r\n     * Sets a reference to the plot that the axis is assigned to.\r\n     * \u003cP\u003e\r\n     * This method is used internally, you shouldn\u0027t need to call it yourself.\r\n     *\r\n     * @param plot  the plot.\r\n     * \r\n     * @see #getPlot()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getFixedDimension()",
      "begin_line": 910,
      "end_line": 912,
      "comment": "\r\n     * Returns the fixed dimension for the axis.\r\n     *\r\n     * @return The fixed dimension.\r\n     * \r\n     * @see #setFixedDimension(double)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setFixedDimension(double)",
      "begin_line": 927,
      "end_line": 929,
      "comment": "\r\n     * Sets the fixed dimension for the axis.\r\n     * \u003cP\u003e\r\n     * This is used when combining more than one plot on a chart.  In this case,\r\n     * there may be several axes that need to have the same height or width so\r\n     * that they are aligned.  This method is used to fix a dimension for the\r\n     * axis (the context determines whether the dimension is horizontal or\r\n     * vertical).\r\n     *\r\n     * @param dimension  the fixed dimension.\r\n     * \r\n     * @see #getFixedDimension()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.configure()",
      "begin_line": 935,
      "end_line": 935,
      "comment": "\r\n     * Configures the axis to work with the current plot.  Override this method\r\n     * to perform any special processing (such as auto-rescaling).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.reserveSpace(java.awt.Graphics2D, org.jfree.chart.plot.Plot, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 950,
      "end_line": 953,
      "comment": "\r\n     * Estimates the space (height or width) required to draw the axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot that the axis belongs to.\r\n     * @param plotArea  the area within which the plot (including axes) should \r\n     *                  be drawn.\r\n     * @param edge  the axis location.\r\n     * @param space  space already reserved.\r\n     *\r\n     * @return The space required to draw the axis (including pre-reserved \r\n     *         space).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.draw(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 969,
      "end_line": 974,
      "comment": "\r\n     * Draws the axis on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param cursor  the cursor location (determines where to draw the axis).\r\n     * @param plotArea  the area within which the axes and plot should be drawn.\r\n     * @param dataArea  the area within which the data should be drawn.\r\n     * @param edge  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot \r\n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.refreshTicks(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 987,
      "end_line": 990,
      "comment": "\r\n     * Calculates the positions of the ticks for the axis, storing the results\r\n     * in the tick list (ready for drawing).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the axis state.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param edge  the edge on which the axis is located.\r\n     * \r\n     * @return The list of ticks.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.addChangeListener(org.jfree.chart.event.AxisChangeListener)",
      "begin_line": 999,
      "end_line": 1001,
      "comment": "\r\n     * Registers an object for notification of changes to the axis.\r\n     *\r\n     * @param listener  the object that is being registered.\r\n     * \r\n     * @see #removeChangeListener(AxisChangeListener)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.removeChangeListener(org.jfree.chart.event.AxisChangeListener)",
      "begin_line": 1010,
      "end_line": 1012,
      "comment": "\r\n     * Deregisters an object for notification of changes to the axis.\r\n     *\r\n     * @param listener  the object to deregister.\r\n     * \r\n     * @see #addChangeListener(AxisChangeListener)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.hasListener(java.util.EventListener)",
      "begin_line": 1023,
      "end_line": 1026,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified object is registered with\r\n     * the dataset as a listener.  Most applications won\u0027t need to call this \r\n     * method, it exists mainly for use by unit testing code.\r\n     * \r\n     * @param listener  the listener.\r\n     * \r\n     * @return A boolean.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.notifyListeners(org.jfree.chart.event.AxisChangeEvent)",
      "begin_line": 1034,
      "end_line": 1043,
      "comment": "\r\n     * Notifies all registered listeners that the axis has changed.\r\n     * The AxisChangeEvent provides information about the change.\r\n     *\r\n     * @param event  information about the change to the axis.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabelEnclosure(java.awt.Graphics2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1054,
      "end_line": 1077,
      "comment": "\r\n     * Returns a rectangle that encloses the axis label.  This is typically \r\n     * used for layout purposes (it gives the maximum dimensions of the label).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param edge  the edge of the plot area along which the axis is measuring.\r\n     *\r\n     * @return The enclosing rectangle.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.drawLabel(java.lang.String, java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1092,
      "end_line": 1202,
      "comment": "\r\n     * Draws the axis label.\r\n     *\r\n     * @param label  the label text.\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param edge  the location of the axis.\r\n     * @param state  the axis state (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  the plot state (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return Information about the axis.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.drawAxisLine(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1212,
      "end_line": 1236,
      "comment": "\r\n     * Draws an axis line at the current cursor position and edge.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param cursor  the cursor position.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.clone()",
      "begin_line": 1246,
      "end_line": 1252,
      "comment": "\r\n     * Returns a clone of the axis.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if some component of the axis does \r\n     *         not support cloning.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.equals(java.lang.Object)",
      "begin_line": 1261,
      "end_line": 1335,
      "comment": "\r\n     * Tests this axis for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1344,
      "end_line": 1352,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.readObject(java.io.ObjectInputStream)",
      "begin_line": 1362,
      "end_line": 1372,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     "
    }
  ]
}