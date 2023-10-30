{
  "filepath": "/tmp/Chart-12f/source/org/jfree/chart/plot/MultiplePiePlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiplePiePlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Plot",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 96,
      "end_line": 619,
      "comment": "\r\n * A plot that displays multiple pie plots using data from a\r\n * {@link CategoryDataset}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "pieChart"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " The chart object that draws the individual pie charts. "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " The dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "dataExtractOrder"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " The data extract order (by row or by column). "
    },
    {
      "type": "field",
      "varNames": [
        "limit"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " The pie section limit percentage. "
    },
    {
      "type": "field",
      "varNames": [
        "aggregatedItemsKey"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\r\n     * The key for the aggregated items.\r\n     * @since 1.0.2\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "aggregatedItemsPaint"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\r\n     * The paint for the aggregated items.\r\n     * @since 1.0.2\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sectionPaints"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\r\n     * The colors to use for each section.\r\n     * @since 1.0.2\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.MultiplePiePlot()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\r\n     * Creates a new plot with no data.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.MultiplePiePlot(org.jfree.data.category.CategoryDataset)",
      "begin_line": 143,
      "end_line": 158,
      "comment": "\r\n     * Creates a new plot.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getDataset()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\r\n     * Returns the dataset used by the plot.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setDataset(org.jfree.data.category.CategoryDataset)",
      "begin_line": 175,
      "end_line": 191,
      "comment": "\r\n     * Sets the dataset used by the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getPieChart()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\r\n     * Returns the pie chart that is used to draw the individual pie plots.\r\n     *\r\n     * @return The pie chart (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPieChart(JFreeChart)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setPieChart(org.jfree.chart.JFreeChart)",
      "begin_line": 212,
      "end_line": 222,
      "comment": "\r\n     * Sets the chart that is used to draw the individual pie plots.  The\r\n     * chart\u0027s plot must be an instance of {@link PiePlot}.\r\n     *\r\n     * @param pieChart  the pie chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPieChart()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getDataExtractOrder()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\r\n     * Returns the data extract order (by row or by column).\r\n     *\r\n     * @return The data extract order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setDataExtractOrder(org.jfree.chart.util.TableOrder)",
      "begin_line": 239,
      "end_line": 245,
      "comment": "\r\n     * Sets the data extract order (by row or by column) and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param order  the order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getLimit()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\r\n     * Returns the limit (as a percentage) below which small pie sections are\r\n     * aggregated.\r\n     *\r\n     * @return The limit percentage.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setLimit(double)",
      "begin_line": 263,
      "end_line": 266,
      "comment": "\r\n     * Sets the limit below which pie sections are aggregated.\r\n     * Set this to 0.0 if you don\u0027t want any aggregation to occur.\r\n     *\r\n     * @param limit  the limit percent.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getAggregatedItemsKey()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\r\n     * Returns the key for aggregated items in the pie plots, if there are any.\r\n     * The default value is \"Other\".\r\n     *\r\n     * @return The aggregated items key.\r\n     *\r\n     * @since 1.0.2\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setAggregatedItemsKey(java.lang.Comparable)",
      "begin_line": 288,
      "end_line": 294,
      "comment": "\r\n     * Sets the key for aggregated items in the pie plots.  You must ensure\r\n     * that this doesn\u0027t clash with any keys in the dataset.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.2\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getAggregatedItemsPaint()",
      "begin_line": 304,
      "end_line": 306,
      "comment": "\r\n     * Returns the paint used to draw the pie section representing the\r\n     * aggregated items.  The default value is \u003ccode\u003eColor.lightGray\u003c/code\u003e.\r\n     *\r\n     * @return The paint.\r\n     *\r\n     * @since 1.0.2\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setAggregatedItemsPaint(java.awt.Paint)",
      "begin_line": 316,
      "end_line": 322,
      "comment": "\r\n     * Sets the paint used to draw the pie section representing the aggregated\r\n     * items and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.2\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getPlotType()",
      "begin_line": 329,
      "end_line": 332,
      "comment": "\r\n     * Returns a short string describing the type of plot.\r\n     *\r\n     * @return The plot type.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 344,
      "end_line": 457,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects info about the drawing.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.prefetchSectionPaints()",
      "begin_line": 465,
      "end_line": 502,
      "comment": "\r\n     * For each key in the dataset, check the \u003ccode\u003esectionPaints\u003c/code\u003e\r\n     * cache to see if a paint is associated with that key and, if not,\r\n     * fetch one from the drawing supplier.  These colors are cached so that\r\n     * the legend and all the subplots use consistent colors.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getLegendItems()",
      "begin_line": 509,
      "end_line": 550,
      "comment": "\r\n     * Returns a collection of legend items for the pie chart.\r\n     *\r\n     * @return The legend items.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.equals(java.lang.Object)",
      "begin_line": 561,
      "end_line": 589,
      "comment": "\r\n     * Tests this plot for equality with an arbitrary object.  Note that the\r\n     * plot\u0027s dataset is not considered in the equality test.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this plot is equal to \u003ccode\u003eobj\u003c/code\u003e, and\r\n     *     \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 598,
      "end_line": 601,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 611,
      "end_line": 616,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     "
    }
  ]
}