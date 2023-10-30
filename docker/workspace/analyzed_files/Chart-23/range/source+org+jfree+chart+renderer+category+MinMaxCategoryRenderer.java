{
  "filepath": "/tmp/Chart-23f/source/org/jfree/chart/renderer/category/MinMaxCategoryRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MinMaxCategoryRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer"
      ],
      "begin_line": 101,
      "end_line": 561,
      "comment": "\r\n * Renderer for drawing min max plot. This renderer draws all the series under \r\n * the same category in the same x position using \u003ccode\u003eobjectIcon\u003c/code\u003e and \r\n * a line from the maximum value to the minimum value.\r\n * \u003cp\u003e\r\n * For use with the {@link org.jfree.chart.plot.CategoryPlot} class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "plotLines"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " A flag indicating whether or not lines are drawn between XY points. "
    },
    {
      "type": "field",
      "varNames": [
        "groupPaint"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " \r\n     * The paint of the line between the minimum value and the maximum value.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "groupStroke"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " \r\n     * The stroke of the line between the minimum value and the maximum value.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minIcon"
      ],
      "begin_line": 120,
      "end_line": 121,
      "comment": " The icon used to indicate the minimum value."
    },
    {
      "type": "field",
      "varNames": [
        "maxIcon"
      ],
      "begin_line": 124,
      "end_line": 125,
      "comment": " The icon used to indicate the maximum value."
    },
    {
      "type": "field",
      "varNames": [
        "objectIcon"
      ],
      "begin_line": 128,
      "end_line": 129,
      "comment": " The icon used to indicate the values."
    },
    {
      "type": "field",
      "varNames": [
        "lastCategory"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " The last category. "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " The minimum. "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " The maximum. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.MinMaxCategoryRenderer()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\r\n     * Default constructor.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.isDrawLines()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\r\n     * Gets whether or not lines are drawn between category points.\r\n     *\r\n     * @return boolean true if line will be drawn between sequenced categories,\r\n     *         otherwise false.\r\n     *         \r\n     * @see #setDrawLines(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setDrawLines(boolean)",
      "begin_line": 168,
      "end_line": 174,
      "comment": "\r\n     * Sets the flag that controls whether or not lines are drawn to connect\r\n     * the items within a series and sends a {@link RendererChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param draw  the new value of the flag.\r\n     * \r\n     * @see #isDrawLines()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getGroupPaint()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\r\n     * Returns the paint used to draw the line between the minimum and maximum\r\n     * value items in each category.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setGroupPaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setGroupPaint(java.awt.Paint)",
      "begin_line": 197,
      "end_line": 203,
      "comment": "\r\n     * Sets the paint used to draw the line between the minimum and maximum\r\n     * value items in each category and sends a {@link RendererChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getGroupPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getGroupStroke()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\r\n     * Returns the stroke used to draw the line between the minimum and maximum\r\n     * value items in each category.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setGroupStroke(Stroke)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setGroupStroke(java.awt.Stroke)",
      "begin_line": 224,
      "end_line": 230,
      "comment": "\r\n     * Sets the stroke of the line between the minimum value and the maximum \r\n     * value and sends a {@link RendererChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param stroke the new stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getObjectIcon()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\r\n     * Returns the icon drawn for each data item.\r\n     *\r\n     * @return The icon (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setObjectIcon(Icon)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setObjectIcon(javax.swing.Icon)",
      "begin_line": 250,
      "end_line": 256,
      "comment": "\r\n     * Sets the icon drawn for each data item.\r\n     *\r\n     * @param icon  the icon.\r\n     * \r\n     * @see #getObjectIcon()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getMaxIcon()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\r\n     * Returns the icon displayed for the maximum value data item within each\r\n     * category.\r\n     *\r\n     * @return The icon (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setMaxIcon(Icon)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setMaxIcon(javax.swing.Icon)",
      "begin_line": 279,
      "end_line": 285,
      "comment": "\r\n     * Sets the icon displayed for the maximum value data item within each\r\n     * category and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param icon  the icon (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getMaxIcon()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getMinIcon()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\r\n     * Returns the icon displayed for the minimum value data item within each\r\n     * category.\r\n     *\r\n     * @return The icon (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setMinIcon(Icon)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.setMinIcon(javax.swing.Icon)",
      "begin_line": 308,
      "end_line": 314,
      "comment": "\r\n     * Sets the icon displayed for the minimum value data item within each\r\n     * category and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param icon  the icon (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getMinIcon()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 330,
      "end_line": 423,
      "comment": "\r\n     * Draw a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area in which the data is drawn.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.equals(java.lang.Object)",
      "begin_line": 435,
      "end_line": 447,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.  The icon fields\r\n     * are NOT included in the test, so this implementation is a little weak.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon(java.awt.Shape, java.awt.Paint, java.awt.Paint)",
      "begin_line": 458,
      "end_line": 488,
      "comment": "\r\n     * Returns an icon.\r\n     *\r\n     * @param shape  the shape.\r\n     * @param fillPaint  the fill paint.\r\n     * @param outlinePaint  the outline paint.\r\n     *\r\n     * @return The icon.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.Anonymous-388287a4-c380-4e1f-99d5-22cfbc6bcdca.paintIcon(java.awt.Component, java.awt.Graphics, int, int)",
      "begin_line": 465,
      "end_line": 477,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.Anonymous-a91c1180-55ea-4ba9-b9ab-7fe11d762900.getIconWidth()",
      "begin_line": 479,
      "end_line": 481,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.Anonymous-d4254ef3-6120-47a2-b979-a99c16c8baba.getIconHeight()",
      "begin_line": 483,
      "end_line": 485,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.getIcon(java.awt.Shape, boolean, boolean)",
      "begin_line": 499,
      "end_line": 525,
      "comment": "\r\n     * Returns an icon from a shape.\r\n     *\r\n     * @param shape  the shape.\r\n     * @param fill  the fill flag.\r\n     * @param outline  the outline flag.\r\n     *\r\n     * @return The icon.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.Anonymous-bf155032-f8ff-451a-9787-4e6ac9292a1c.paintIcon(java.awt.Component, java.awt.Graphics, int, int)",
      "begin_line": 505,
      "end_line": 515,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.Anonymous-d6d0ed2e-fc5c-4cf9-8b0a-c1c2f83283af.getIconWidth()",
      "begin_line": 517,
      "end_line": 519,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.Anonymous-03d5554e-56d1-48b7-900c-fea0bcbed8d9.getIconHeight()",
      "begin_line": 521,
      "end_line": 523,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 534,
      "end_line": 538,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.MinMaxCategoryRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 548,
      "end_line": 559,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     "
    }
  ]
}