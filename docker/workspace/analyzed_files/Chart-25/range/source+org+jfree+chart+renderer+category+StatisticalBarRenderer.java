{
  "filepath": "/tmp/Chart-25f/source/org/jfree/chart/renderer/category/StatisticalBarRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatisticalBarRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.BarRenderer",
        "org.jfree.chart.renderer.category.CategoryItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 93,
      "end_line": 567,
      "comment": "\r\n * A renderer that handles the drawing a bar plot where\r\n * each bar has a mean value and a standard deviation line.\r\n "
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
        "errorIndicatorPaint"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " The paint used to show the error indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "errorIndicatorStroke"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\r\n     * The stroke used to draw the error indicator. \r\n     * \r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.StatisticalBarRenderer()",
      "begin_line": 114,
      "end_line": 118,
      "comment": "\r\n     * Default constructor.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.getErrorIndicatorPaint()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\r\n     * Returns the paint used for the error indicators.\r\n     * \r\n     * @return The paint used for the error indicators (possibly \r\n     *         \u003ccode\u003enull\u003c/code\u003e).\r\n     *         \r\n     * @see #setErrorIndicatorPaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.setErrorIndicatorPaint(java.awt.Paint)",
      "begin_line": 140,
      "end_line": 143,
      "comment": "\r\n     * Sets the paint used for the error indicators (if \u003ccode\u003enull\u003c/code\u003e, \r\n     * the item outline paint is used instead)\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getErrorIndicatorPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.getErrorIndicatorStroke()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\r\n     * Returns the stroke used for the error indicators.\r\n     * \r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *         \r\n     * @see #setErrorIndicatorStroke(Stroke)\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.setErrorIndicatorStroke(java.awt.Stroke)",
      "begin_line": 168,
      "end_line": 171,
      "comment": "\r\n     * Sets the stroke used for the error indicators (if \u003ccode\u003enull\u003c/code\u003e, \r\n     * the item outline stroke is used instead)\r\n     * \r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getErrorIndicatorStroke()\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 188,
      "end_line": 215,
      "comment": "\r\n     * Draws the bar with its standard deviation line range for a single \r\n     * (series, category) data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param data  the data.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.statistics.StatisticalCategoryDataset, int, int)",
      "begin_line": 230,
      "end_line": 364,
      "comment": "\r\n     * Draws an item for a plot with a horizontal orientation.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the data.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.statistics.StatisticalCategoryDataset, int, int)",
      "begin_line": 379,
      "end_line": 512,
      "comment": "\r\n     * Draws an item for a plot with a vertical orientation.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the data.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.equals(java.lang.Object)",
      "begin_line": 521,
      "end_line": 537,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 546,
      "end_line": 550,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StatisticalBarRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 560,
      "end_line": 565,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     "
    }
  ]
}