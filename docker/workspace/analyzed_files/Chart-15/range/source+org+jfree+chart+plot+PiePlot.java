{
  "filepath": "/tmp/Chart-15f/source/org/jfree/chart/plot/PiePlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PiePlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Plot",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 231,
      "end_line": 3040,
      "comment": "\r\n * A plot that displays data in the form of a pie chart, using data from any \r\n * class that implements the {@link PieDataset} interface.\r\n * \u003cP\u003e\r\n * Special notes:\r\n * \u003col\u003e\r\n * \u003cli\u003ethe default starting point is 12 o\u0027clock and the pie sections proceed\r\n * in a clockwise direction, but these settings can be changed;\u003c/li\u003e\r\n * \u003cli\u003enegative values in the dataset are ignored;\u003c/li\u003e\r\n * \u003cli\u003ethere are utility methods for creating a {@link PieDataset} from a\r\n * {@link org.jfree.data.category.CategoryDataset};\u003c/li\u003e\r\n * \u003c/ol\u003e\r\n *\r\n * @see Plot\r\n * @see PieDataset\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 234,
      "end_line": 234,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INTERIOR_GAP"
      ],
      "begin_line": 237,
      "end_line": 237,
      "comment": " The default interior gap. "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_INTERIOR_GAP"
      ],
      "begin_line": 240,
      "end_line": 240,
      "comment": " The maximum interior gap (currently 40%). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_START_ANGLE"
      ],
      "begin_line": 243,
      "end_line": 243,
      "comment": " The default starting angle for the pie chart. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_FONT"
      ],
      "begin_line": 246,
      "end_line": 247,
      "comment": " The default section label font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_PAINT"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": " The default section label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_BACKGROUND_PAINT"
      ],
      "begin_line": 253,
      "end_line": 254,
      "comment": " The default section label background paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_OUTLINE_PAINT"
      ],
      "begin_line": 257,
      "end_line": 257,
      "comment": " The default section label outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_OUTLINE_STROKE"
      ],
      "begin_line": 260,
      "end_line": 261,
      "comment": " The default section label outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_SHADOW_PAINT"
      ],
      "begin_line": 264,
      "end_line": 265,
      "comment": " The default section label shadow paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MINIMUM_ARC_ANGLE_TO_DRAW"
      ],
      "begin_line": 268,
      "end_line": 268,
      "comment": " The default minimum arc angle to draw. "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 271,
      "end_line": 271,
      "comment": " The dataset for the pie chart. "
    },
    {
      "type": "field",
      "varNames": [
        "pieIndex"
      ],
      "begin_line": 274,
      "end_line": 274,
      "comment": " The pie index (used by the {@link MultiplePiePlot} class). "
    },
    {
      "type": "field",
      "varNames": [
        "interiorGap"
      ],
      "begin_line": 280,
      "end_line": 280,
      "comment": " \r\n     * The amount of space left around the outside of the pie plot, expressed \r\n     * as a percentage of the plot area width and height. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "circular"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": " Flag determining whether to draw an ellipse or a perfect circle. "
    },
    {
      "type": "field",
      "varNames": [
        "startAngle"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": " The starting angle. "
    },
    {
      "type": "field",
      "varNames": [
        "direction"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": " The direction for the pie segments. "
    },
    {
      "type": "field",
      "varNames": [
        "sectionPaintMap"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": " The section paint map. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSectionPaint"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": " The base section paint (fallback). "
    },
    {
      "type": "field",
      "varNames": [
        "sectionOutlinesVisible"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": " \r\n     * A flag that controls whether or not an outline is drawn for each\r\n     * section in the plot.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sectionOutlinePaintMap"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": " The section outline paint map. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSectionOutlinePaint"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": " The base section outline paint (fallback). "
    },
    {
      "type": "field",
      "varNames": [
        "sectionOutlineStrokeMap"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": " The section outline stroke map. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSectionOutlineStroke"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": " The base section outline stroke (fallback). "
    },
    {
      "type": "field",
      "varNames": [
        "shadowPaint"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": " The shadow paint. "
    },
    {
      "type": "field",
      "varNames": [
        "shadowXOffset"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": " The x-offset for the shadow effect. "
    },
    {
      "type": "field",
      "varNames": [
        "shadowYOffset"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": " The y-offset for the shadow effect. "
    },
    {
      "type": "field",
      "varNames": [
        "explodePercentages"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": " The percentage amount to explode each pie section. "
    },
    {
      "type": "field",
      "varNames": [
        "labelGenerator"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " The section label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "labelFont"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": " The font used to display the section labels. "
    },
    {
      "type": "field",
      "varNames": [
        "labelPaint"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": " The color used to draw the section labels. "
    },
    {
      "type": "field",
      "varNames": [
        "labelBackgroundPaint"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": " \r\n     * The color used to draw the background of the section labels.  If this\r\n     * is \u003ccode\u003enull\u003c/code\u003e, the background is not filled.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelOutlinePaint"
      ],
      "begin_line": 346,
      "end_line": 346,
      "comment": " \r\n     * The paint used to draw the outline of the section labels \r\n     * (\u003ccode\u003enull\u003c/code\u003e permitted). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelOutlineStroke"
      ],
      "begin_line": 352,
      "end_line": 352,
      "comment": " \r\n     * The stroke used to draw the outline of the section labels \r\n     * (\u003ccode\u003enull\u003c/code\u003e permitted). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelShadowPaint"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": " \r\n     * The paint used to draw the shadow for the section labels \r\n     * (\u003ccode\u003enull\u003c/code\u003e permitted). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "simpleLabels"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": "\r\n     * A flag that controls whether simple or extended labels are used.\r\n     * \r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelPadding"
      ],
      "begin_line": 373,
      "end_line": 373,
      "comment": "\r\n     * The padding between the labels and the label outlines.  This is not\r\n     * allowed to be \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "simpleLabelOffset"
      ],
      "begin_line": 380,
      "end_line": 380,
      "comment": "\r\n     * The simple label offset.\r\n     * \r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximumLabelWidth"
      ],
      "begin_line": 383,
      "end_line": 383,
      "comment": " The maximum label width as a percentage of the plot width. "
    },
    {
      "type": "field",
      "varNames": [
        "labelGap"
      ],
      "begin_line": 389,
      "end_line": 389,
      "comment": " \r\n     * The gap between the labels and the link corner, as a percentage of the \r\n     * plot width. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelLinksVisible"
      ],
      "begin_line": 392,
      "end_line": 392,
      "comment": " A flag that controls whether or not the label links are drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "labelLinkMargin"
      ],
      "begin_line": 395,
      "end_line": 395,
      "comment": " The link margin. "
    },
    {
      "type": "field",
      "varNames": [
        "labelLinkPaint"
      ],
      "begin_line": 398,
      "end_line": 398,
      "comment": " The paint used for the label linking lines. "
    },
    {
      "type": "field",
      "varNames": [
        "labelLinkStroke"
      ],
      "begin_line": 401,
      "end_line": 401,
      "comment": " The stroke used for the label linking lines. "
    },
    {
      "type": "field",
      "varNames": [
        "labelDistributor"
      ],
      "begin_line": 408,
      "end_line": 408,
      "comment": " \r\n     * The pie section label distributor.\r\n     * \r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipGenerator"
      ],
      "begin_line": 411,
      "end_line": 411,
      "comment": " The tooltip generator. "
    },
    {
      "type": "field",
      "varNames": [
        "urlGenerator"
      ],
      "begin_line": 414,
      "end_line": 414,
      "comment": " The URL generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendLabelGenerator"
      ],
      "begin_line": 417,
      "end_line": 417,
      "comment": " The legend label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendLabelToolTipGenerator"
      ],
      "begin_line": 420,
      "end_line": 420,
      "comment": " A tool tip generator for the legend. "
    },
    {
      "type": "field",
      "varNames": [
        "legendLabelURLGenerator"
      ],
      "begin_line": 427,
      "end_line": 427,
      "comment": " \r\n     * A URL generator for the legend items (optional).  \r\n     *\r\n     * @since 1.0.4. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ignoreNullValues"
      ],
      "begin_line": 432,
      "end_line": 432,
      "comment": " \r\n     * A flag that controls whether \u003ccode\u003enull\u003c/code\u003e values are ignored.  \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ignoreZeroValues"
      ],
      "begin_line": 437,
      "end_line": 437,
      "comment": "\r\n     * A flag that controls whether zero values are ignored.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemShape"
      ],
      "begin_line": 440,
      "end_line": 440,
      "comment": " The legend item shape. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumArcAngleToDraw"
      ],
      "begin_line": 453,
      "end_line": 453,
      "comment": "\r\n     * The smallest arc angle that will get drawn (this is to avoid a bug in \r\n     * various Java implementations that causes the JVM to crash).  See this \r\n     * link for details:\r\n     *\r\n     * http://www.jfree.org/phpBB2/viewtopic.php?t\u003d2707\r\n     *\r\n     * ...and this bug report in the Java Bug Parade:\r\n     *\r\n     * http://developer.java.sun.com/developer/bugParade/bugs/4836495.html\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 456,
      "end_line": 457,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEBUG_DRAW_INTERIOR"
      ],
      "begin_line": 464,
      "end_line": 464,
      "comment": " \r\n     * This debug flag controls whether or not an outline is drawn showing the \r\n     * interior of the plot region.  This is drawn as a lightGray rectangle \r\n     * showing the padding provided by the \u0027interiorGap\u0027 setting.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEBUG_DRAW_LINK_AREA"
      ],
      "begin_line": 471,
      "end_line": 471,
      "comment": " \r\n     * This debug flag controls whether or not an outline is drawn showing the \r\n     * link area (in blue) and link ellipse (in yellow).  This controls where \r\n     * the label links have \u0027elbow\u0027 points.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEBUG_DRAW_PIE_AREA"
      ],
      "begin_line": 477,
      "end_line": 477,
      "comment": "\r\n     * This debug flag controls whether or not an outline is drawn showing\r\n     * the pie area (in green).\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PiePlot.PiePlot()",
      "begin_line": 482,
      "end_line": 484,
      "comment": "\r\n     * Creates a new plot.  The dataset is initially set to \u003ccode\u003enull\u003c/code\u003e.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PiePlot.PiePlot(org.jfree.data.general.PieDataset)",
      "begin_line": 491,
      "end_line": 541,
      "comment": "\r\n     * Creates a plot that will draw a pie chart for the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getDataset()",
      "begin_line": 550,
      "end_line": 552,
      "comment": "\r\n     * Returns the dataset.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDataset(PieDataset)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setDataset(org.jfree.data.general.PieDataset)",
      "begin_line": 561,
      "end_line": 579,
      "comment": "\r\n     * Sets the dataset and sends a {@link DatasetChangeEvent} to \u0027this\u0027.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDataset()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getPieIndex()",
      "begin_line": 589,
      "end_line": 591,
      "comment": "\r\n     * Returns the pie index (this is used by the {@link MultiplePiePlot} class\r\n     * to track subplots).\r\n     * \r\n     * @return The pie index.\r\n     * \r\n     * @see #setPieIndex(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setPieIndex(int)",
      "begin_line": 601,
      "end_line": 603,
      "comment": "\r\n     * Sets the pie index (this is used by the {@link MultiplePiePlot} class to \r\n     * track subplots).\r\n     * \r\n     * @param index  the index.\r\n     * \r\n     * @see #getPieIndex()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getStartAngle()",
      "begin_line": 613,
      "end_line": 615,
      "comment": "\r\n     * Returns the start angle for the first pie section.  This is measured in \r\n     * degrees starting from 3 o\u0027clock and measuring anti-clockwise.\r\n     *\r\n     * @return The start angle.\r\n     * \r\n     * @see #setStartAngle(double)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setStartAngle(double)",
      "begin_line": 627,
      "end_line": 630,
      "comment": "\r\n     * Sets the starting angle and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.  The initial default value is 90 degrees, which \r\n     * corresponds to 12 o\u0027clock.  A value of zero corresponds to 3 o\u0027clock...\r\n     * this is the encoding used by Java\u0027s Arc2D class.\r\n     *\r\n     * @param angle  the angle (in degrees).\r\n     * \r\n     * @see #getStartAngle()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getDirection()",
      "begin_line": 640,
      "end_line": 642,
      "comment": "\r\n     * Returns the direction in which the pie sections are drawn (clockwise or \r\n     * anti-clockwise).\r\n     *\r\n     * @return The direction (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDirection(Rotation)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setDirection(org.jfree.chart.util.Rotation)",
      "begin_line": 652,
      "end_line": 659,
      "comment": "\r\n     * Sets the direction in which the pie sections are drawn and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param direction  the direction (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDirection()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getInteriorGap()",
      "begin_line": 669,
      "end_line": 671,
      "comment": "\r\n     * Returns the interior gap, measured as a percentage of the available \r\n     * drawing space.\r\n     *\r\n     * @return The gap (as a percentage of the available drawing space).\r\n     * \r\n     * @see #setInteriorGap(double)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setInteriorGap(double)",
      "begin_line": 683,
      "end_line": 695,
      "comment": "\r\n     * Sets the interior gap and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.  This controls the space between the edges of the \r\n     * pie plot and the plot area itself (the region where the section labels \r\n     * appear).\r\n     *\r\n     * @param percent  the gap (as a percentage of the available drawing space).\r\n     * \r\n     * @see #getInteriorGap()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.isCircular()",
      "begin_line": 705,
      "end_line": 707,
      "comment": "\r\n     * Returns a flag indicating whether the pie chart is circular, or\r\n     * stretched into an elliptical shape.\r\n     *\r\n     * @return A flag indicating whether the pie chart is circular.\r\n     * \r\n     * @see #setCircular(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setCircular(boolean)",
      "begin_line": 717,
      "end_line": 719,
      "comment": "\r\n     * A flag indicating whether the pie chart is circular, or stretched into\r\n     * an elliptical shape.\r\n     *\r\n     * @param flag  the new value.\r\n     * \r\n     * @see #isCircular()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setCircular(boolean, boolean)",
      "begin_line": 730,
      "end_line": 735,
      "comment": "\r\n     * Sets the circular attribute and, if requested, sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param circular  the new value of the flag.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #isCircular()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getIgnoreNullValues()",
      "begin_line": 745,
      "end_line": 747,
      "comment": "\r\n     * Returns the flag that controls whether \u003ccode\u003enull\u003c/code\u003e values in the \r\n     * dataset are ignored.  \r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setIgnoreNullValues(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setIgnoreNullValues(boolean)",
      "begin_line": 760,
      "end_line": 763,
      "comment": "\r\n     * Sets a flag that controls whether \u003ccode\u003enull\u003c/code\u003e values are ignored, \r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.  At \r\n     * present, this only affects whether or not the key is presented in the \r\n     * legend.\r\n     * \r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getIgnoreNullValues()\r\n     * @see #setIgnoreZeroValues(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getIgnoreZeroValues()",
      "begin_line": 773,
      "end_line": 775,
      "comment": "\r\n     * Returns the flag that controls whether zero values in the \r\n     * dataset are ignored.  \r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setIgnoreZeroValues(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setIgnoreZeroValues(boolean)",
      "begin_line": 788,
      "end_line": 791,
      "comment": "\r\n     * Sets a flag that controls whether zero values are ignored, \r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.  This \r\n     * only affects whether or not a label appears for the non-visible\r\n     * pie section.\r\n     * \r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getIgnoreZeroValues()\r\n     * @see #setIgnoreNullValues(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionPaint(java.lang.Comparable)",
      "begin_line": 807,
      "end_line": 809,
      "comment": "\r\n     * Returns the paint for the specified section.  This is equivalent to\r\n     * \u003ccode\u003elookupSectionPaint(section, false)\u003c/code\u003e.\r\n     * \r\n     * @param key  the section key.\r\n     * \r\n     * @return The paint for the specified section.\r\n     * \r\n     * @since 1.0.3\r\n     * \r\n     * @see #lookupSectionPaint(Comparable, boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionPaint(java.lang.Comparable, boolean)",
      "begin_line": 832,
      "end_line": 856,
      "comment": "\r\n     * Returns the paint for the specified section.  The lookup involves these\r\n     * steps:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003eif {@link #getSectionPaint(Comparable)} is non-\u003ccode\u003enull\u003c/code\u003e \r\n     *         return it;\u003c/li\u003e\r\n     * \u003cli\u003eif {@link #getSectionPaint(Comparable)} is \u003ccode\u003enull\u003c/code\u003e but \r\n     *         \u003ccode\u003eautoPopulate\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, attempt to fetch\r\n     *         a new paint from the drawing supplier \r\n     *         ({@link #getDrawingSupplier()});\r\n     * \u003cli\u003eif all else fails, return {@link #getBaseSectionPaint()}.\r\n     * \u003c/ul\u003e \r\n     * \r\n     * @param key  the section key.\r\n     * @param autoPopulate  a flag that controls whether the drawing supplier \r\n     *     is used to auto-populate the section paint settings.\r\n     *     \r\n     * @return The paint.\r\n     * \r\n     * @since 1.0.3\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSectionKey(int)",
      "begin_line": 872,
      "end_line": 883,
      "comment": "\r\n     * Returns a key for the specified section.  If there is no such section \r\n     * in the dataset, we generate a key.  This is to provide some backward\r\n     * compatibility for the (now deprecated) methods that get/set attributes \r\n     * based on section indices.  The preferred way of doing this now is to\r\n     * link the attributes directly to the section key (there are new methods\r\n     * for this, starting from version 1.0.3).  \r\n     * \r\n     * @param section  the section index.\r\n     * \r\n     * @return The key.\r\n     *\r\n     * @since 1.0.3\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSectionPaint(java.lang.Comparable)",
      "begin_line": 901,
      "end_line": 904,
      "comment": "\r\n     * Returns the paint associated with the specified key, or \r\n     * \u003ccode\u003enull\u003c/code\u003e if there is no paint associated with the key.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The paint associated with the specified key, or \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *     \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @see #setSectionPaint(Comparable, Paint)\r\n     * \r\n     * @since 1.0.3\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSectionPaint(java.lang.Comparable, java.awt.Paint)",
      "begin_line": 920,
      "end_line": 924,
      "comment": "\r\n     * Sets the paint associated with the specified key, and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the paint.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *     \r\n     * @see #getSectionPaint(Comparable)\r\n     * \r\n     * @since 1.0.3\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getBaseSectionPaint()",
      "begin_line": 934,
      "end_line": 936,
      "comment": "\r\n     * Returns the base section paint.  This is used when no other paint is \r\n     * defined, which is rare.  The default value is \u003ccode\u003eColor.gray\u003c/code\u003e.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseSectionPaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setBaseSectionPaint(java.awt.Paint)",
      "begin_line": 946,
      "end_line": 952,
      "comment": "\r\n     * Sets the base section paint and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseSectionPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSectionOutlinesVisible()",
      "begin_line": 965,
      "end_line": 967,
      "comment": "\r\n     * Returns the flag that controls whether or not the outline is drawn for\r\n     * each pie section.\r\n     * \r\n     * @return The flag that controls whether or not the outline is drawn for\r\n     *         each pie section.\r\n     *         \r\n     * @see #setSectionOutlinesVisible(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSectionOutlinesVisible(boolean)",
      "begin_line": 978,
      "end_line": 981,
      "comment": "\r\n     * Sets the flag that controls whether or not the outline is drawn for \r\n     * each pie section, and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     * \r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getSectionOutlinesVisible()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionOutlinePaint(java.lang.Comparable)",
      "begin_line": 995,
      "end_line": 997,
      "comment": "\r\n     * Returns the outline paint for the specified section.  This is equivalent \r\n     * to \u003ccode\u003elookupSectionPaint(section, false)\u003c/code\u003e.\r\n     * \r\n     * @param key  the section key.\r\n     * \r\n     * @return The paint for the specified section.\r\n     * \r\n     * @since 1.0.3\r\n     * \r\n     * @see #lookupSectionOutlinePaint(Comparable, boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionOutlinePaint(java.lang.Comparable, boolean)",
      "begin_line": 1020,
      "end_line": 1046,
      "comment": "\r\n     * Returns the outline paint for the specified section.  The lookup \r\n     * involves these steps:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003eif {@link #getSectionOutlinePaint(Comparable)} is \r\n     *         non-\u003ccode\u003enull\u003c/code\u003e return it;\u003c/li\u003e\r\n     * \u003cli\u003eif {@link #getSectionOutlinePaint(Comparable)} is \r\n     *         \u003ccode\u003enull\u003c/code\u003e but \u003ccode\u003eautoPopulate\u003c/code\u003e is \r\n     *         \u003ccode\u003etrue\u003c/code\u003e, attempt to fetch a new outline paint from \r\n     *         the drawing supplier ({@link #getDrawingSupplier()});\r\n     * \u003cli\u003eif all else fails, return {@link #getBaseSectionOutlinePaint()}.\r\n     * \u003c/ul\u003e \r\n     * \r\n     * @param key  the section key.\r\n     * @param autoPopulate  a flag that controls whether the drawing supplier \r\n     *     is used to auto-populate the section outline paint settings.\r\n     *     \r\n     * @return The paint.\r\n     * \r\n     * @since 1.0.3\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSectionOutlinePaint(java.lang.Comparable)",
      "begin_line": 1064,
      "end_line": 1067,
      "comment": "\r\n     * Returns the outline paint associated with the specified key, or \r\n     * \u003ccode\u003enull\u003c/code\u003e if there is no paint associated with the key.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The paint associated with the specified key, or \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *     \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @see #setSectionOutlinePaint(Comparable, Paint)\r\n     * \r\n     * @since 1.0.3\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSectionOutlinePaint(java.lang.Comparable, java.awt.Paint)",
      "begin_line": 1083,
      "end_line": 1087,
      "comment": "\r\n     * Sets the outline paint associated with the specified key, and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the paint.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *     \r\n     * @see #getSectionOutlinePaint(Comparable)\r\n     * \r\n     * @since 1.0.3\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getBaseSectionOutlinePaint()",
      "begin_line": 1097,
      "end_line": 1099,
      "comment": "\r\n     * Returns the base section paint.  This is used when no other paint is \r\n     * available.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseSectionOutlinePaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setBaseSectionOutlinePaint(java.awt.Paint)",
      "begin_line": 1108,
      "end_line": 1114,
      "comment": "\r\n     * Sets the base section paint.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseSectionOutlinePaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionOutlineStroke(java.lang.Comparable)",
      "begin_line": 1130,
      "end_line": 1132,
      "comment": "\r\n     * Returns the outline stroke for the specified section.  This is equivalent \r\n     * to \u003ccode\u003elookupSectionOutlineStroke(section, false)\u003c/code\u003e.\r\n     * \r\n     * @param key  the section key.\r\n     * \r\n     * @return The stroke for the specified section.\r\n     * \r\n     * @since 1.0.3\r\n     * \r\n     * @see #lookupSectionOutlineStroke(Comparable, boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.lookupSectionOutlineStroke(java.lang.Comparable, boolean)",
      "begin_line": 1155,
      "end_line": 1181,
      "comment": "\r\n     * Returns the outline stroke for the specified section.  The lookup \r\n     * involves these steps:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003eif {@link #getSectionOutlineStroke(Comparable)} is \r\n     *         non-\u003ccode\u003enull\u003c/code\u003e return it;\u003c/li\u003e\r\n     * \u003cli\u003eif {@link #getSectionOutlineStroke(Comparable)} is \r\n     *         \u003ccode\u003enull\u003c/code\u003e but \u003ccode\u003eautoPopulate\u003c/code\u003e is \r\n     *         \u003ccode\u003etrue\u003c/code\u003e, attempt to fetch a new outline stroke from \r\n     *         the drawing supplier ({@link #getDrawingSupplier()});\r\n     * \u003cli\u003eif all else fails, return {@link #getBaseSectionOutlineStroke()}.\r\n     * \u003c/ul\u003e \r\n     * \r\n     * @param key  the section key.\r\n     * @param autoPopulate  a flag that controls whether the drawing supplier \r\n     *     is used to auto-populate the section outline stroke settings.\r\n     *     \r\n     * @return The stroke.\r\n     * \r\n     * @since 1.0.3\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSectionOutlineStroke(java.lang.Comparable)",
      "begin_line": 1199,
      "end_line": 1202,
      "comment": "\r\n     * Returns the outline stroke associated with the specified key, or \r\n     * \u003ccode\u003enull\u003c/code\u003e if there is no stroke associated with the key.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The stroke associated with the specified key, or \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *     \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @see #setSectionOutlineStroke(Comparable, Stroke)\r\n     * \r\n     * @since 1.0.3\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSectionOutlineStroke(java.lang.Comparable, java.awt.Stroke)",
      "begin_line": 1218,
      "end_line": 1222,
      "comment": "\r\n     * Sets the outline stroke associated with the specified key, and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *     \r\n     * @see #getSectionOutlineStroke(Comparable)\r\n     * \r\n     * @since 1.0.3\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getBaseSectionOutlineStroke()",
      "begin_line": 1232,
      "end_line": 1234,
      "comment": "\r\n     * Returns the base section stroke.  This is used when no other stroke is \r\n     * available.\r\n     * \r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseSectionOutlineStroke(Stroke)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setBaseSectionOutlineStroke(java.awt.Stroke)",
      "begin_line": 1243,
      "end_line": 1249,
      "comment": "\r\n     * Sets the base section stroke.\r\n     * \r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseSectionOutlineStroke()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getShadowPaint()",
      "begin_line": 1258,
      "end_line": 1260,
      "comment": "\r\n     * Returns the shadow paint.\r\n     * \r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setShadowPaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setShadowPaint(java.awt.Paint)",
      "begin_line": 1270,
      "end_line": 1273,
      "comment": "\r\n     * Sets the shadow paint and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getShadowPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getShadowXOffset()",
      "begin_line": 1282,
      "end_line": 1284,
      "comment": "\r\n     * Returns the x-offset for the shadow effect.\r\n     * \r\n     * @return The offset (in Java2D units).\r\n     * \r\n     * @see #setShadowXOffset(double)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setShadowXOffset(double)",
      "begin_line": 1294,
      "end_line": 1297,
      "comment": "\r\n     * Sets the x-offset for the shadow effect and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param offset  the offset (in Java2D units).\r\n     * \r\n     * @see #getShadowXOffset()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getShadowYOffset()",
      "begin_line": 1306,
      "end_line": 1308,
      "comment": "\r\n     * Returns the y-offset for the shadow effect.\r\n     * \r\n     * @return The offset (in Java2D units).\r\n     * \r\n     * @see #setShadowYOffset(double)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setShadowYOffset(double)",
      "begin_line": 1318,
      "end_line": 1321,
      "comment": "\r\n     * Sets the y-offset for the shadow effect and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param offset  the offset (in Java2D units).\r\n     * \r\n     * @see #getShadowYOffset()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getExplodePercent(java.lang.Comparable)",
      "begin_line": 1339,
      "end_line": 1348,
      "comment": "\r\n     * Returns the amount that the section with the specified key should be\r\n     * exploded.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The amount that the section with the specified key should be\r\n     *     exploded.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @since 1.0.3\r\n     * \r\n     * @see #setExplodePercent(Comparable, double)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setExplodePercent(java.lang.Comparable, double)",
      "begin_line": 1361,
      "end_line": 1370,
      "comment": "\r\n     * Sets the amount that a pie section should be exploded and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param key  the section key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param percent  the explode percentage (0.30 \u003d 30 percent).\r\n     * \r\n     * @since 1.0.3\r\n     * \r\n     * @see #getExplodePercent(Comparable)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getMaximumExplodePercent()",
      "begin_line": 1377,
      "end_line": 1391,
      "comment": "\r\n     * Returns the maximum explode percent.\r\n     * \r\n     * @return The percent.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelGenerator()",
      "begin_line": 1400,
      "end_line": 1402,
      "comment": "\r\n     * Returns the section label generator. \r\n     * \r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelGenerator(PieSectionLabelGenerator)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)",
      "begin_line": 1412,
      "end_line": 1415,
      "comment": "\r\n     * Sets the section label generator and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLabelGenerator()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelGap()",
      "begin_line": 1425,
      "end_line": 1427,
      "comment": "\r\n     * Returns the gap between the edge of the pie and the labels, expressed as \r\n     * a percentage of the plot width.\r\n     * \r\n     * @return The gap (a percentage, where 0.05 \u003d five percent).\r\n     * \r\n     * @see #setLabelGap(double)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelGap(double)",
      "begin_line": 1438,
      "end_line": 1441,
      "comment": "\r\n     * Sets the gap between the edge of the pie and the labels (expressed as a \r\n     * percentage of the plot width) and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @param gap  the gap (a percentage, where 0.05 \u003d five percent).\r\n     * \r\n     * @see #getLabelGap()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getMaximumLabelWidth()",
      "begin_line": 1450,
      "end_line": 1452,
      "comment": "\r\n     * Returns the maximum label width as a percentage of the plot width.\r\n     * \r\n     * @return The width (a percentage, where 0.20 \u003d 20 percent).\r\n     * \r\n     * @see #setMaximumLabelWidth(double)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setMaximumLabelWidth(double)",
      "begin_line": 1462,
      "end_line": 1465,
      "comment": "\r\n     * Sets the maximum label width as a percentage of the plot width and sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param width  the width (a percentage, where 0.20 \u003d 20 percent).\r\n     * \r\n     * @see #getMaximumLabelWidth()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelLinksVisible()",
      "begin_line": 1475,
      "end_line": 1477,
      "comment": "\r\n     * Returns the flag that controls whether or not label linking lines are\r\n     * visible.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setLabelLinksVisible(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelLinksVisible(boolean)",
      "begin_line": 1490,
      "end_line": 1493,
      "comment": "\r\n     * Sets the flag that controls whether or not label linking lines are \r\n     * visible and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * Please take care when hiding the linking lines - depending on the data \r\n     * values, the labels can be displayed some distance away from the\r\n     * corresponding pie section.\r\n     * \r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getLabelLinksVisible()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelLinkMargin()",
      "begin_line": 1503,
      "end_line": 1505,
      "comment": "\r\n     * Returns the margin (expressed as a percentage of the width or height) \r\n     * between the edge of the pie and the link point.\r\n     * \r\n     * @return The link margin (as a percentage, where 0.05 is five percent).\r\n     * \r\n     * @see #setLabelLinkMargin(double)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelLinkMargin(double)",
      "begin_line": 1515,
      "end_line": 1518,
      "comment": "\r\n     * Sets the link margin and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param margin  the margin.\r\n     * \r\n     * @see #getLabelLinkMargin()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelLinkPaint()",
      "begin_line": 1528,
      "end_line": 1530,
      "comment": "\r\n     * Returns the paint used for the lines that connect pie sections to their \r\n     * corresponding labels.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelLinkPaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelLinkPaint(java.awt.Paint)",
      "begin_line": 1541,
      "end_line": 1547,
      "comment": "\r\n     * Sets the paint used for the lines that connect pie sections to their \r\n     * corresponding labels, and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLabelLinkPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelLinkStroke()",
      "begin_line": 1556,
      "end_line": 1558,
      "comment": "\r\n     * Returns the stroke used for the label linking lines.\r\n     * \r\n     * @return The stroke.\r\n     * \r\n     * @see #setLabelLinkStroke(Stroke)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelLinkStroke(java.awt.Stroke)",
      "begin_line": 1568,
      "end_line": 1574,
      "comment": "\r\n     * Sets the link stroke and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param stroke  the stroke.\r\n     * \r\n     * @see #getLabelLinkStroke()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelFont()",
      "begin_line": 1583,
      "end_line": 1585,
      "comment": "\r\n     * Returns the section label font.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelFont(Font)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelFont(java.awt.Font)",
      "begin_line": 1595,
      "end_line": 1601,
      "comment": "\r\n     * Sets the section label font and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLabelFont()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelPaint()",
      "begin_line": 1610,
      "end_line": 1612,
      "comment": "\r\n     * Returns the section label paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelPaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelPaint(java.awt.Paint)",
      "begin_line": 1622,
      "end_line": 1628,
      "comment": "\r\n     * Sets the section label paint and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLabelPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelBackgroundPaint()",
      "begin_line": 1637,
      "end_line": 1639,
      "comment": "\r\n     * Returns the section label background paint.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelBackgroundPaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelBackgroundPaint(java.awt.Paint)",
      "begin_line": 1649,
      "end_line": 1652,
      "comment": "\r\n     * Sets the section label background paint and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLabelBackgroundPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelOutlinePaint()",
      "begin_line": 1661,
      "end_line": 1663,
      "comment": "\r\n     * Returns the section label outline paint.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelOutlinePaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelOutlinePaint(java.awt.Paint)",
      "begin_line": 1673,
      "end_line": 1676,
      "comment": "\r\n     * Sets the section label outline paint and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLabelOutlinePaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelOutlineStroke()",
      "begin_line": 1685,
      "end_line": 1687,
      "comment": "\r\n     * Returns the section label outline stroke.\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelOutlineStroke(Stroke)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelOutlineStroke(java.awt.Stroke)",
      "begin_line": 1697,
      "end_line": 1700,
      "comment": "\r\n     * Sets the section label outline stroke and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLabelOutlineStroke()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelShadowPaint()",
      "begin_line": 1709,
      "end_line": 1711,
      "comment": "\r\n     * Returns the section label shadow paint.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelShadowPaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelShadowPaint(java.awt.Paint)",
      "begin_line": 1721,
      "end_line": 1724,
      "comment": "\r\n     * Sets the section label shadow paint and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLabelShadowPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelPadding()",
      "begin_line": 1735,
      "end_line": 1737,
      "comment": "\r\n     * Returns the label padding.\r\n     * \r\n     * @return The label padding (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.7\r\n     * \r\n     * @see #setLabelPadding(RectangleInsets)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelPadding(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 1749,
      "end_line": 1755,
      "comment": "\r\n     * Sets the padding between each label and its outline and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param padding  the padding (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.7\r\n     * \r\n     * @see #getLabelPadding()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSimpleLabels()",
      "begin_line": 1765,
      "end_line": 1767,
      "comment": "\r\n     * Returns the flag that controls whether simple or extended labels are\r\n     * displayed on the plot.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSimpleLabels(boolean)",
      "begin_line": 1778,
      "end_line": 1781,
      "comment": "\r\n     * Sets the flag that controls whether simple or extended labels are \r\n     * displayed on the plot, and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param simple  the new flag value.\r\n     * \r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getSimpleLabelOffset()",
      "begin_line": 1792,
      "end_line": 1794,
      "comment": "\r\n     * Returns the offset used for the simple labels, if they are displayed.\r\n     * \r\n     * @return The offset (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.7\r\n     * \r\n     * @see #setSimpleLabelOffset(RectangleInsets)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setSimpleLabelOffset(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 1806,
      "end_line": 1812,
      "comment": "\r\n     * Sets the offset for the simple labels and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param offset  the offset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.7\r\n     * \r\n     * @see #getSimpleLabelOffset()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLabelDistributor()",
      "begin_line": 1822,
      "end_line": 1824,
      "comment": "\r\n     * Returns the object responsible for the vertical layout of the pie \r\n     * section labels.\r\n     * \r\n     * @return The label distributor (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLabelDistributor(org.jfree.chart.plot.AbstractPieLabelDistributor)",
      "begin_line": 1834,
      "end_line": 1840,
      "comment": "\r\n     * Sets the label distributor and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param distributor  the distributor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getToolTipGenerator()",
      "begin_line": 1851,
      "end_line": 1853,
      "comment": "\r\n     * Returns the tool tip generator, an object that is responsible for \r\n     * generating the text items used for tool tips by the plot.  If the \r\n     * generator is \u003ccode\u003enull\u003c/code\u003e, no tool tips will be created.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setToolTipGenerator(PieToolTipGenerator)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setToolTipGenerator(org.jfree.chart.labels.PieToolTipGenerator)",
      "begin_line": 1864,
      "end_line": 1867,
      "comment": "\r\n     * Sets the tool tip generator and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.  Set the generator to \u003ccode\u003enull\u003c/code\u003e if you \r\n     * don\u0027t want any tool tips.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getToolTipGenerator()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getURLGenerator()",
      "begin_line": 1876,
      "end_line": 1878,
      "comment": "\r\n     * Returns the URL generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setURLGenerator(PieURLGenerator)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setURLGenerator(org.jfree.chart.urls.PieURLGenerator)",
      "begin_line": 1888,
      "end_line": 1891,
      "comment": "\r\n     * Sets the URL generator and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getURLGenerator()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getMinimumArcAngleToDraw()",
      "begin_line": 1901,
      "end_line": 1903,
      "comment": "\r\n     * Returns the minimum arc angle that will be drawn.  Pie sections for an \r\n     * angle smaller than this are not drawn, to avoid a JDK bug.\r\n     *\r\n     * @return The minimum angle.\r\n     * \r\n     * @see #setMinimumArcAngleToDraw(double)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setMinimumArcAngleToDraw(double)",
      "begin_line": 1923,
      "end_line": 1925,
      "comment": "\r\n     * Sets the minimum arc angle that will be drawn.  Pie sections for an \r\n     * angle smaller than this are not drawn, to avoid a JDK bug.  See this \r\n     * link for details:\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * \u003ca href\u003d\"http://www.jfree.org/phpBB2/viewtopic.php?t\u003d2707\"\u003e\r\n     * http://www.jfree.org/phpBB2/viewtopic.php?t\u003d2707\u003c/a\u003e\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * ...and this bug report in the Java Bug Parade:\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * \u003ca href\u003d\r\n     * \"http://developer.java.sun.com/developer/bugParade/bugs/4836495.html\"\u003e\r\n     * http://developer.java.sun.com/developer/bugParade/bugs/4836495.html\u003c/a\u003e\r\n     *\r\n     * @param angle  the minimum angle.\r\n     * \r\n     * @see #getMinimumArcAngleToDraw()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLegendItemShape()",
      "begin_line": 1934,
      "end_line": 1936,
      "comment": "\r\n     * Returns the shape used for legend items.\r\n     * \r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLegendItemShape(Shape)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLegendItemShape(java.awt.Shape)",
      "begin_line": 1946,
      "end_line": 1952,
      "comment": "\r\n     * Sets the shape used for legend items and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLegendItemShape()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLegendLabelGenerator()",
      "begin_line": 1961,
      "end_line": 1963,
      "comment": "\r\n     * Returns the legend label generator.\r\n     * \r\n     * @return The legend label generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLegendLabelGenerator(PieSectionLabelGenerator)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLegendLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)",
      "begin_line": 1973,
      "end_line": 1979,
      "comment": "\r\n     * Sets the legend label generator and sends a {@link PlotChangeEvent} to \r\n     * all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLegendLabelGenerator()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLegendLabelToolTipGenerator()",
      "begin_line": 1988,
      "end_line": 1990,
      "comment": "\r\n     * Returns the legend label tool tip generator.\r\n     * \r\n     * @return The legend label tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLegendLabelToolTipGenerator(PieSectionLabelGenerator)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLegendLabelToolTipGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)",
      "begin_line": 2000,
      "end_line": 2004,
      "comment": "\r\n     * Sets the legend label tool tip generator and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLegendLabelToolTipGenerator()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLegendLabelURLGenerator()",
      "begin_line": 2015,
      "end_line": 2017,
      "comment": "\r\n     * Returns the legend label URL generator.\r\n     * \r\n     * @return The legend label URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLegendLabelURLGenerator(PieURLGenerator)\r\n     * \r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.setLegendLabelURLGenerator(org.jfree.chart.urls.PieURLGenerator)",
      "begin_line": 2029,
      "end_line": 2032,
      "comment": "\r\n     * Sets the legend label URL generator and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLegendLabelURLGenerator()\r\n     * \r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlot, java.lang.Integer, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 2049,
      "end_line": 2061,
      "comment": "\r\n     * Initialises the drawing procedure.  This method will be called before \r\n     * the first item is rendered, giving the plot an opportunity to initialise\r\n     * any state information it wants to maintain.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plot  the plot.\r\n     * @param index  the secondary index (\u003ccode\u003enull\u003c/code\u003e for primary \r\n     *               renderer).\r\n     * @param info  collects chart rendering information for return to caller.\r\n     * \r\n     * @return A state object (maintains state information relevant to one \r\n     *         chart drawing).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 2074,
      "end_line": 2108,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects info about the drawing \r\n     *              (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawPie(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 2117,
      "end_line": 2242,
      "comment": "\r\n     * Draws the pie.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param info  chart rendering info.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawItem(java.awt.Graphics2D, int, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlotState, int)",
      "begin_line": 2253,
      "end_line": 2335,
      "comment": "\r\n     * Draws a single data item.\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param section  the section index.\r\n     * @param dataArea  the data plot area.\r\n     * @param state  state information for one chart.\r\n     * @param currentPass  the current pass index.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawSimpleLabels(java.awt.Graphics2D, java.util.List, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlotState)",
      "begin_line": 2349,
      "end_line": 2431,
      "comment": "\r\n     * Draws the pie section labels in the simple form.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param keys  the section keys.\r\n     * @param totalValue  the total value for all sections in the pie.\r\n     * @param plotArea  the plot area.\r\n     * @param pieArea  the area containing the pie.\r\n     * @param state  the plot state.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawLabels(java.awt.Graphics2D, java.util.List, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlotState)",
      "begin_line": 2443,
      "end_line": 2503,
      "comment": "\r\n     * Draws the labels for the pie sections.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param keys  the keys.\r\n     * @param totalValue  the total value.\r\n     * @param plotArea  the plot area.\r\n     * @param linkArea  the link area.\r\n     * @param state  the state.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawLeftLabels(org.jfree.data.KeyedValues, java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, float, org.jfree.chart.plot.PiePlotState)",
      "begin_line": 2517,
      "end_line": 2555,
      "comment": "\r\n     * Draws the left labels.\r\n     * \r\n     * @param leftKeys  a collection of keys and angles (to the middle of the\r\n     *         section, in degrees) for the sections on the left side of the \r\n     *         plot.\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param linkArea  the link area.\r\n     * @param maxLabelWidth  the maximum label width.\r\n     * @param state  the state.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawRightLabels(org.jfree.data.KeyedValues, java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, float, org.jfree.chart.plot.PiePlotState)",
      "begin_line": 2567,
      "end_line": 2607,
      "comment": "\r\n     * Draws the right labels.\r\n     * \r\n     * @param keys  the keys.\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param linkArea  the link area.\r\n     * @param maxLabelWidth  the maximum label width.\r\n     * @param state  the state.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getLegendItems()",
      "begin_line": 2614,
      "end_line": 2673,
      "comment": "\r\n     * Returns a collection of legend items for the pie chart.\r\n     *\r\n     * @return The legend items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getPlotType()",
      "begin_line": 2680,
      "end_line": 2682,
      "comment": "\r\n     * Returns a short string describing the type of plot.\r\n     *\r\n     * @return The plot type.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.getArcBounds(java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, double, double, double)",
      "begin_line": 2698,
      "end_line": 2719,
      "comment": "\r\n     * Returns a rectangle that can be used to create a pie section (taking\r\n     * into account the amount by which the pie section is \u0027exploded\u0027).\r\n     *\r\n     * @param unexploded  the area inside which the unexploded pie sections are\r\n     *                    drawn.\r\n     * @param exploded  the area inside which the exploded pie sections are \r\n     *                  drawn.\r\n     * @param angle  the start angle.\r\n     * @param extent  the extent of the arc.\r\n     * @param explodePercent  the amount by which the pie section is exploded.\r\n     *\r\n     * @return A rectangle that can be used to create a pie section.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawLeftLabel(java.awt.Graphics2D, org.jfree.chart.plot.PiePlotState, org.jfree.chart.plot.PieLabelRecord)",
      "begin_line": 2728,
      "end_line": 2755,
      "comment": "\r\n     * Draws a section label on the left side of the pie chart.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param state  the state.\r\n     * @param record  the label record.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.drawRightLabel(java.awt.Graphics2D, org.jfree.chart.plot.PiePlotState, org.jfree.chart.plot.PieLabelRecord)",
      "begin_line": 2764,
      "end_line": 2792,
      "comment": "\r\n     * Draws a section label on the right side of the pie chart.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param state  the state.\r\n     * @param record  the label record.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.equals(java.lang.Object)",
      "begin_line": 2802,
      "end_line": 2957,
      "comment": "\r\n     * Tests this plot for equality with an arbitrary object.  Note that the \r\n     * plot\u0027s dataset is NOT included in the test for equality.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.clone()",
      "begin_line": 2967,
      "end_line": 2990,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if some component of the plot does \r\n     *         not support cloning.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 2999,
      "end_line": 3013,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 3023,
      "end_line": 3038,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     "
    }
  ]
}