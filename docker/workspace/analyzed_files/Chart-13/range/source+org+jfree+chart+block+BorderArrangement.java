{
  "filepath": "/tmp/Chart-13f/source/org/jfree/chart/block/BorderArrangement.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BorderArrangement",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.block.Arrangement",
        "java.io.Serializable"
      ],
      "begin_line": 63,
      "end_line": 534,
      "comment": "\r\n * An arrangement manager that lays out blocks in a similar way to\r\n * Swing\u0027s BorderLayout class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "centerBlock"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The block (if any) at the center of the layout. "
    },
    {
      "type": "field",
      "varNames": [
        "topBlock"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The block (if any) at the top of the layout. "
    },
    {
      "type": "field",
      "varNames": [
        "bottomBlock"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The block (if any) at the bottom of the layout. "
    },
    {
      "type": "field",
      "varNames": [
        "leftBlock"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The block (if any) at the left of the layout. "
    },
    {
      "type": "field",
      "varNames": [
        "rightBlock"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The block (if any) at the right of the layout. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.BorderArrangement.BorderArrangement()",
      "begin_line": 86,
      "end_line": 87,
      "comment": "\r\n     * Creates a new instance.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.add(org.jfree.chart.block.Block, java.lang.Object)",
      "begin_line": 96,
      "end_line": 116,
      "comment": "\r\n     * Adds a block to the arrangement manager at the specified edge.\r\n     *\r\n     * @param block  the block (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param key  the edge (an instance of {@link RectangleEdge}) or\r\n     *             \u003ccode\u003enull\u003c/code\u003e for the center block.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.arrange(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 128,
      "end_line": 172,
      "comment": "\r\n     * Arranges the items in the specified container, subject to the given\r\n     * constraint.\r\n     *\r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint.\r\n     *\r\n     * @return The block size.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.arrangeNN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D)",
      "begin_line": 182,
      "end_line": 241,
      "comment": "\r\n     * Performs an arrangement without constraints.\r\n     *\r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return The container size after the arrangement.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.arrangeFR(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 252,
      "end_line": 263,
      "comment": "\r\n     * Performs an arrangement with a fixed width and a range for the height.\r\n     *\r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint.\r\n     *\r\n     * @return The container size after the arrangement.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.arrangeFN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, double)",
      "begin_line": 275,
      "end_line": 324,
      "comment": "\r\n     * Arranges the container width a fixed width and no constraint on the\r\n     * height.\r\n     *\r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * @param width  the fixed width.\r\n     *\r\n     * @return The container size after arranging the contents.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.arrangeRR(org.jfree.chart.block.BlockContainer, org.jfree.data.Range, org.jfree.data.Range, java.awt.Graphics2D)",
      "begin_line": 337,
      "end_line": 411,
      "comment": "\r\n     * Performs an arrangement with range constraints on both the vertical\r\n     * and horizontal sides.\r\n     *\r\n     * @param container  the container.\r\n     * @param widthRange  the allowable range for the container width.\r\n     * @param heightRange  the allowable range for the container height.\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return The container size.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.arrangeFF(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 422,
      "end_line": 489,
      "comment": "\r\n     * Arranges the items within a container.\r\n     *\r\n     * @param container  the container.\r\n     * @param constraint  the constraint.\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return The container size after the arrangement.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.clear()",
      "begin_line": 494,
      "end_line": 500,
      "comment": "\r\n     * Clears the layout.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.equals(java.lang.Object)",
      "begin_line": 509,
      "end_line": 533,
      "comment": "\r\n     * Tests this arrangement for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     "
    }
  ]
}