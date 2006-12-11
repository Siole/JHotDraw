/*
 * @(#)SVGFigureFactory.java  1.0  December 7, 2006
 *
 * Copyright (c) 2006 Werner Randelshofer
 * Staldenmattweg 2, CH-6405 Immensee, Switzerland
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Werner Randelshofer. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Werner Randelshofer.
 */

package org.jhotdraw.samples.svg;

import java.awt.Color;
import java.awt.geom.*;
import java.util.*;
import javax.swing.text.*;
import org.jhotdraw.draw.*;
import org.jhotdraw.geom.*;

/**
 * SVGFigureFactory.
 *
 * @author Werner Randelshofer
 * @version 1.0 December 7, 2006 Created.
 */
public interface SVGFigureFactory {
    public Figure createRect(
            double x, double y, double width, double height, double rx, double ry, 
            Map<AttributeKey,Object> attributes);
    
    public Figure createCircle(
            double cx, double cy, double r, 
            Map<AttributeKey,Object> attributes);
    
    public Figure createEllipse(
            double cx, double cy, double rx, double ry, 
            Map<AttributeKey,Object> attributes);

    public Figure createLine(
            double x1, double y1, double x2, double y2, 
            Map<AttributeKey,Object> attributes);

    public Figure createPolyline(
            Point2D.Double[] points, 
            Map<AttributeKey,Object> attributes);
    
    public Figure createPolygon(
            Point2D.Double[] points, 
            Map<AttributeKey,Object> attributes);

    public Figure createPath(
            BezierPath[] beziers, 
            Map<AttributeKey,Object> attributes);

    public CompositeFigure createG(Map<AttributeKey,Object> attributes);
    
    public Figure createText(
            Point2D.Double[] coordinates, double[] rotate,
            StyledDocument text,  
            Map<AttributeKey,Object> attributes);
    
    public Figure createTextArea(
            double x, double y, double width, double height,
            StyledDocument text, double[] rotate,
            Map<AttributeKey,Object> attributes);

    public Gradient createLinearGradient(
            double x1, double y1, double x2, double y2, 
            double[] stopOffsets, Color[] stopColors,
            boolean isRelativeToFigureBounds);
    
    public Gradient createRadialGradient(
            double cx, double cy, double r, 
            double[] stopOffsets, Color[] stopColors,
            boolean isRelativeToFigureBounds);
}
