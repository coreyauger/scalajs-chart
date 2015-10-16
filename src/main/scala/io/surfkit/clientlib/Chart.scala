package io.surfkit.clientlib

import scala.scalajs.js
import js.annotation._
import js.JSConverters._

package chart {

import org.scalajs.dom.Event
import org.scalajs.dom.CanvasRenderingContext2D

trait ChartDataSet extends js.Object {
  var label: String = js.native
  var fillColor: String = js.native
  var strokeColor: String = js.native
  var pointColor: String = js.native
  var pointStrokeColor: String = js.native
  var pointHighlightFill: String = js.native
  var pointHighlightStroke: String = js.native
  var highlightFill: String = js.native
  var highlightStroke: String = js.native
  var data: js.Array[Double] = js.native
}

object ChartDataSet {
  def apply(
             label: String = null,
             fillColor: String = null,
             strokeColor: String = null,
             pointColor: String = null,
             pointStrokeColor: String = null,
             pointHighlightFill: String = null,
             pointHighlightStroke: String = null,
             highlightFill: String = null,
             highlightStroke: String = null,
             data: Seq[Double] = Nil
             ): ChartDataSet = {
    js.Dynamic.literal(
      label = label,
      fillColor = fillColor,
      strokeColor = strokeColor,
      pointColor = pointColor,
      pointStrokeColor = pointStrokeColor,
      pointHighlightFill = pointHighlightFill,
      pointHighlightStroke = pointHighlightStroke,
      highlightFill = highlightFill,
      highlightStroke = highlightStroke,
      data = data.toJSArray
    ).asInstanceOf[ChartDataSet]
  }
}


trait LinearChartData extends js.Object {
  var labels: js.Array[String] = js.native
  var datasets: js.Array[ChartDataSet] = js.native
}

object LinearChartData {
  def apply(
             labels: Seq[String] = null,
             datasets: Seq[ChartDataSet] = null
             ): LinearChartData = {

    js.Dynamic.literal(
      labels = labels.toJSArray,
      datasets = datasets.toJSArray
    ).asInstanceOf[LinearChartData]
  }
}


trait CircularChartData extends js.Object {
  var value: Double = js.native
  var color: String = js.native
  var highlight: String = js.native
  var label: String = js.native
}

object CircularChartData {
  def apply(
           value: Double = 1,
           color: String = null,
           highlight: String = null,
           label: String = null
             ): CircularChartData = {
    js.Dynamic.literal(
      value = value,
      color = color,
      highlight = highlight,
      label = label
    ).asInstanceOf[CircularChartData]
  }
}

trait ChartSettings extends js.Object {
  var animation: Boolean = js.native
  var animationSteps: Double = js.native
  var animationEasing: String = js.native
  var showScale: Boolean = js.native
  var scaleOverride: Boolean = js.native
  var scaleLineColor: String = js.native
  var scaleLineWidth: Double = js.native
  var scaleShowLabels: Boolean = js.native
  var scaleLabel: String = js.native
  var scaleIntegersOnly: Boolean = js.native
  var scaleBeginAtZero: Boolean = js.native
  var scaleFontFamily: String = js.native
  var scaleFontSize: Double = js.native
  var scaleFontStyle: String = js.native
  var scaleFontColor: String = js.native
  var responsive: Boolean = js.native
  var maintainAspectRatio: Boolean = js.native
  var showTooltips: Boolean = js.native
  var tooltipEvents: js.Array[String] = js.native
  var tooltipFillColor: String = js.native
  var tooltipFontFamily: String = js.native
  var tooltipFontSize: Double = js.native
  var tooltipFontStyle: String = js.native
  var tooltipFontColor: String = js.native
  var tooltipTitleFontFamily: String = js.native
  var tooltipTitleFontSize: Double = js.native
  var tooltipTitleFontStyle: String = js.native
  var tooltipTitleFontColor: String = js.native
  var tooltipYPadding: Double = js.native
  var tooltipXPadding: Double = js.native
  var tooltipCaretSize: Double = js.native
  var tooltipCornerRadius: Double = js.native
  var tooltipXOffset: Double = js.native
  var tooltipTemplate: String = js.native
  var multiTooltipTemplate: String = js.native
  var onAnimationProgress: js.Function0[Any] = js.native
  var onAnimationComplete: js.Function0[Any] = js.native
}


object ChartSettings {
  def apply(
    animation: Boolean = true,
    animationSteps: Double = 60,
    animationEasing: String = "easeOutQuart",
    showScale: Boolean = true,
    scaleOverride: Boolean = false,
    scaleLineColor: String = "rgba(0,0,0,0.1)",
    scaleLineWidth: Double = 1,
    scaleShowLabels: Boolean = true,
    scaleLabel: String = "<%value%>",
    scaleIntegersOnly: Boolean = true,
    scaleBeginAtZero: Boolean = false,
    scaleFontFamily: String = "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif",
    scaleFontSize: Double = 12,
    scaleFontStyle: String = "normal",
    scaleFontColor: String = "#666",
    responsive: Boolean = true,
    maintainAspectRatio: Boolean = false,
    showTooltips: Boolean = true,
    tooltipEvents: Seq[String] = Seq("mousemove", "touchstart", "touchmove"),
    tooltipFillColor: String = "rgba(0,0,0,0.8)",
    tooltipFontFamily: String = "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif",
    tooltipFontSize: Double = 14,
    tooltipFontStyle: String = "normal",
    tooltipFontColor: String = "#fff",
    tooltipTitleFontFamily: String = "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif",
    tooltipTitleFontSize: Double = 14,
    tooltipTitleFontStyle: String = "bold",
    tooltipTitleFontColor: String = "#fff",
    tooltipYPadding: Double = 6,
    tooltipXPadding: Double = 6,
    tooltipCaretSize: Double = 8,
    tooltipCornerRadius: Double = 6,
    tooltipXOffset: Double = 10,
    tooltipTemplate: String = "<%if (label){%><%=label%>: <%}%><%= value %>",
    multiTooltipTemplate: String = "<%= value %>",
    onAnimationProgress: js.Function0[Any] = () => {},
    onAnimationComplete: js.Function0[Any] = () => {}
             ): ChartSettings = {
    js.Dynamic.literal(
        animation = animation,
        animationSteps = animationSteps,
        animationEasing = animationEasing,
        showScale = showScale,
        scaleOverride = scaleOverride,
        scaleLineColor = scaleLineColor,
        scaleLineWidth = scaleLineWidth,
        scaleShowLabels = scaleShowLabels,
        scaleLabel = scaleLabel,
        scaleIntegersOnly = scaleIntegersOnly,
        scaleBeginAtZero = scaleBeginAtZero,
        scaleFontFamily = scaleFontFamily,
        scaleFontSize = scaleFontSize,
        scaleFontStyle = scaleFontStyle,
        scaleFontColor = scaleFontColor,
        responsive = responsive,
        maintainAspectRatio = maintainAspectRatio,
        showTooltips = showTooltips,
        tooltipEvents = tooltipEvents.toJSArray,
        tooltipFillColor = tooltipFillColor,
        tooltipFontFamily = tooltipFontFamily,
        tooltipFontSize = tooltipFontSize,
        tooltipFontStyle = tooltipFontStyle,
        tooltipFontColor = tooltipFontColor,
        tooltipTitleFontFamily = tooltipTitleFontFamily,
        tooltipTitleFontSize = tooltipTitleFontSize,
        tooltipTitleFontStyle = tooltipTitleFontStyle,
        tooltipTitleFontColor = tooltipTitleFontColor,
        tooltipYPadding = tooltipYPadding,
        tooltipXPadding = tooltipXPadding,
        tooltipCaretSize = tooltipCaretSize,
        tooltipCornerRadius = tooltipCornerRadius,
        tooltipXOffset = tooltipXOffset,
        tooltipTemplate = tooltipTemplate,
        multiTooltipTemplate = multiTooltipTemplate,
        onAnimationProgress = onAnimationProgress,
        onAnimationComplete = onAnimationComplete
    ).asInstanceOf[ChartSettings]
  }
}

trait ChartOptions extends js.Object {
  var scaleShowGridLines: Boolean = js.native
  var scaleGridLineColor: String = js.native
  var scaleGridLineWidth: Double = js.native
  var legendTemplate: String = js.native
}

object ChartOptions {
  def apply(
    scaleShowGridLines: Boolean = false,
    scaleGridLineColor: String = null,
    scaleGridLineWidth: Double = 1.0,
    legendTemplate: String = null
             ): ChartOptions = {
    js.Dynamic.literal(
      scaleShowGridLines = scaleShowGridLines,
      scaleGridLineColor = scaleGridLineColor,
      scaleGridLineWidth = scaleGridLineWidth,
      legendTemplate = legendTemplate
    ).asInstanceOf[ChartOptions]
  }
}

trait PointsAtEvent extends js.Object {
  var value: Double = js.native
  var label: String = js.native
  var datasetLabel: String = js.native
  var strokeColor: String = js.native
  var fillColor: String = js.native
  var highlightFill: String = js.native
  var highlightStroke: String = js.native
  var x: Double = js.native
  var y: Double = js.native
}

trait ChartInstance extends js.Object {
  var clear: js.Function0[Unit] = js.native
  var stop: js.Function0[Unit] = js.native
  var resize: js.Function0[Unit] = js.native
  var destroy: js.Function0[Unit] = js.native
  var toBase64Image: js.Function0[String] = js.native
  var generateLegend: js.Function0[String] = js.native
}

trait LinearInstance extends ChartInstance {
  var getPointsAtEvent: js.Function1[Event, js.Array[PointsAtEvent]] = js.native
  var update: js.Function0[Unit] = js.native
  var addData: js.Function2[js.Array[Double], String, Unit] = js.native
  var removeData: js.Function0[Unit] = js.native
}

trait CircularInstance extends ChartInstance {
  var getSegmentsAtEvent: js.Function1[Event, js.Array[js.Any]] = js.native
  var update: js.Function0[Unit] = js.native
  var addData: js.Function2[CircularChartData, Double, Unit] = js.native
  var removeData: js.Function1[Double, Unit] = js.native
  var segments: js.Array[CircularChartData] = js.native
}

trait LineChartOptions extends ChartOptions {
  var scaleShowHorizontalLines: Boolean = js.native
  var scaleShowVerticalLines: Boolean = js.native
  var bezierCurve: Boolean = js.native
  var bezierCurveTension: Double = js.native
  var pointDot: Boolean = js.native
  var pointDotRadius: Double = js.native
  var pointDotStrokeWidth: Double = js.native
  var pointHitDetectionRadius: Double = js.native
  var datasetStroke: Boolean = js.native
  var datasetStrokeWidth: Double = js.native
  var datasetFill: Boolean = js.native
  var responsive: Boolean = js.native
  var maintainAspectRatio: Boolean = js.native
}

object LineChartOptions {
  def apply(
    scaleShowHorizontalLines: Boolean = true,
    scaleShowVerticalLines: Boolean = true,
    bezierCurve: Boolean = true,
    bezierCurveTension: Double = 1.0,
    pointDot: Boolean = true,
    pointDotRadius: Double = 2.0,
    pointDotStrokeWidth: Double = 1.0,
    pointHitDetectionRadius: Double = 2.0,
    datasetStroke: Boolean = true,
    datasetStrokeWidth: Double = 1.0,
    datasetFill: Boolean = true,
    responsive: Boolean = true,
    maintainAspectRatio: Boolean = false
  ): LineChartOptions = {
    js.Dynamic.literal(
      scaleShowHorizontalLines = scaleShowHorizontalLines,
      scaleShowVerticalLines = scaleShowVerticalLines,
      bezierCurve = bezierCurve,
      bezierCurveTension = bezierCurveTension,
      pointDot = pointDot,
      pointDotRadius = pointDotRadius,
      pointDotStrokeWidth = pointDotStrokeWidth,
      pointHitDetectionRadius = pointHitDetectionRadius,
      datasetStroke = datasetStroke,
      datasetStrokeWidth = datasetStrokeWidth,
      datasetFill = datasetFill,
      responsive = responsive,
      maintainAspectRatio = maintainAspectRatio
    ).asInstanceOf[LineChartOptions]
  }
}

trait BarChartOptions extends ChartOptions {
  var scaleBeginAtZero: Boolean = js.native
  var scaleShowHorizontalLines: Boolean = js.native
  var scaleShowVerticalLines: Boolean = js.native
  var barShowStroke: Boolean = js.native
  var barStrokeWidth: Double = js.native
  var barValueSpacing: Double = js.native
  var barDatasetSpacing: Double = js.native
  var responsive: Boolean = js.native
  var maintainAspectRatio: Boolean = js.native
}


object BarChartOptions {
  def apply(
    scaleBeginAtZero: Boolean = true,
    scaleShowHorizontalLines: Boolean = true,
    scaleShowVerticalLines: Boolean = true,
    barShowStroke: Boolean = true,
    barStrokeWidth: Double = 2.0,
    barValueSpacing: Double = 2.0,
    barDatasetSpacing: Double = 2.0,
    responsive: Boolean = true,
    maintainAspectRatio: Boolean = false
             ): BarChartOptions = {
    js.Dynamic.literal(
      scaleBeginAtZero = scaleBeginAtZero,
      scaleShowHorizontalLines = scaleShowHorizontalLines,
      scaleShowVerticalLines = scaleShowVerticalLines,
      barShowStroke = barShowStroke,
      barValueSpacing = barValueSpacing,
      barStrokeWidth = barStrokeWidth,
      barDatasetSpacing = barDatasetSpacing,
      responsive = responsive,
      maintainAspectRatio = maintainAspectRatio
    ).asInstanceOf[BarChartOptions]
  }
}

trait RadarChartOptions extends js.Object {
  var scaleShowLine: Boolean = js.native
  var angleShowLineOut: Boolean = js.native
  var scaleShowLabels: Boolean = js.native
  var scaleBeginAtZero: Boolean = js.native
  var angleLineColor: String = js.native
  var angleLineWidth: Double = js.native
  var pointLabelFontFamily: String = js.native
  var pointLabelFontStyle: String = js.native
  var pointLabelFontSize: Double = js.native
  var pointLabelFontColor: String = js.native
  var pointDot: Boolean = js.native
  var pointDotRadius: Double = js.native
  var pointDotStrokeWidth: Double = js.native
  var pointHitDetectionRadius: Double = js.native
  var datasetStroke: Boolean = js.native
  var datasetStrokeWidth: Double = js.native
  var datasetFill: Boolean = js.native
  var legendTemplate: String = js.native
}

object RadarChartOptions {
  def apply(
    scaleShowLine: Boolean = true,
    angleShowLineOut: Boolean = true,
    scaleShowLabels: Boolean = false,
    scaleBeginAtZero: Boolean = true,
    angleLineColor: String = "rgba(0,0,0,.1)",
    angleLineWidth: Double = 1,
    pointLabelFontFamily: String = "'Arial'",
    pointLabelFontStyle: String = "normal",
    pointLabelFontSize: Double = 10,
    pointLabelFontColor: String = "#666",
    pointDot: Boolean = true,
    pointDotRadius: Double = 3,
    pointDotStrokeWidth: Double = 1,
    pointHitDetectionRadius: Double = 20,
    datasetStroke: Boolean = true,
    datasetStrokeWidth: Double = 2,
    datasetFill: Boolean = true,
    legendTemplate: String = "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].strokeColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
             ): RadarChartOptions = {
    js.Dynamic.literal(
      scaleShowLine = scaleShowLine,
      angleShowLineOut = angleShowLineOut,
      scaleShowLabels = scaleShowLabels,
      scaleBeginAtZero = scaleBeginAtZero,
      angleLineColor = angleLineColor,
      angleLineWidth = angleLineWidth,
      pointLabelFontFamily = pointLabelFontFamily,
      pointLabelFontStyle = pointLabelFontStyle,
      pointLabelFontSize = pointLabelFontSize,
      pointLabelFontColor = pointLabelFontColor,
      pointDot = pointDot,
      pointDotRadius = pointDotRadius,
      pointDotStrokeWidth = pointDotStrokeWidth,
      pointHitDetectionRadius = pointHitDetectionRadius,
      datasetStroke = datasetStroke,
      datasetStrokeWidth = datasetStrokeWidth,
      datasetFill = datasetFill,
      legendTemplate = legendTemplate
    ).asInstanceOf[RadarChartOptions]
  }
}

trait PolarAreaChartOptions extends js.Object {
  var scaleShowLabelBackdrop: Boolean = js.native
  var scaleBackdropColor: String = js.native
  var scaleBeginAtZero: Boolean = js.native
  var scaleBackdropPaddingY: Double = js.native
  var scaleBackdropPaddingX: Double = js.native
  var scaleShowLine: Boolean = js.native
  var segmentShowStroke: Boolean = js.native
  var segmentStrokeColor: String = js.native
  var segmentStrokeWidth: Double = js.native
  var animationSteps: Double = js.native
  var animationEasing: String = js.native
  var animateRotate: Boolean = js.native
  var animateScale: Boolean = js.native
  var legendTemplate: String = js.native
}

object PolarAreaChartOptions {
  def apply (
    scaleShowLabelBackdrop: Boolean = true,
    scaleBackdropColor: String = "rgba(255,255,255,0.75)",
    scaleBeginAtZero: Boolean = true,
    scaleBackdropPaddingY: Double = 2,
    scaleBackdropPaddingX: Double = 2,
    scaleShowLine: Boolean = true,
    segmentShowStroke: Boolean = true,
    segmentStrokeColor: String = "#fff",
    segmentStrokeWidth: Double = 2,
    animationSteps: Double = 100,
    animationEasing: String = "easeOutBounce",
    animateRotate: Boolean = true,
    animateScale: Boolean = false,
    legendTemplate: String = "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<segments.length; i++){%><li><span style=\"background-color:<%=segments[i].fillColor%>\"></span><%if(segments[i].label){%><%=segments[i].label%><%}%></li><%}%></ul>"
              ):PolarAreaChartOptions = {
    js.Dynamic.literal(
      scaleShowLabelBackdrop = scaleShowLabelBackdrop,
      scaleBackdropColor = scaleBackdropColor,
      scaleBeginAtZero = scaleBeginAtZero,
      scaleBackdropPaddingY = scaleBackdropPaddingY,
      scaleBackdropPaddingX = scaleBackdropPaddingX,
      scaleShowLine = scaleShowLine,
      segmentShowStroke = segmentShowStroke,
      segmentStrokeColor = segmentStrokeColor,
      segmentStrokeWidth = segmentStrokeWidth,
      animationEasing = animationEasing,
      animateRotate = animateRotate,
      animateScale = animateScale,
      legendTemplate = legendTemplate
    ).asInstanceOf[PolarAreaChartOptions]
  }
}

trait PieChartOptions extends js.Object {
  var segmentShowStroke: Boolean = js.native
  var segmentStrokeColor: String = js.native
  var segmentStrokeWidth: Double = js.native
  var percentageInnerCutout: Double = js.native
  var animationSteps: Double = js.native
  var animationEasing: String = js.native
  var animateRotate: Boolean = js.native
  var animateScale: Boolean = js.native
  var legendTemplate: String = js.native
}

object PieChartOptions {
  def apply(
    segmentShowStroke: Boolean = true,
    segmentStrokeColor: String = "#fff",
    segmentStrokeWidth: Double = 2,
    percentageInnerCutout: Double = 0, // Default is 50 for doughnut
    animationSteps: Double = 100,
    animationEasing: String = "easeOutBounce",
    animateRotate: Boolean = true,
    animateScale: Boolean = false,
    legendTemplate: String = "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<segments.length; i++){%><li><span style=\"background-color:<%=segments[i].fillColor%>\"></span><%if(segments[i].label){%><%=segments[i].label%><%}%></li><%}%></ul>"
              ):PieChartOptions = {
    js.Dynamic.literal(
      segmentShowStroke = segmentShowStroke,
      segmentStrokeColor = segmentStrokeColor,
      segmentStrokeWidth = segmentStrokeWidth,
      percentageInnerCutout = percentageInnerCutout,
      animationSteps = animationSteps,
      animationEasing = animationEasing,
      animateRotate = animateRotate,
      animateScale = animateScale,
      legendTemplate = legendTemplate
    ).asInstanceOf[PieChartOptions]
  }
}



class Chart protected() extends js.Object {
  def this(context: CanvasRenderingContext2D) = this()

  def Line(data: LinearChartData, options: LineChartOptions = null): LinearInstance = js.native

  def Bar(data: LinearChartData, options: BarChartOptions = null): LinearInstance = js.native

  def Radar(data: LinearChartData, options: RadarChartOptions = null): LinearInstance = js.native

  def PolarArea(data: js.Array[CircularChartData], options: PolarAreaChartOptions = null): CircularInstance = js.native

  def Pie(data: js.Array[CircularChartData], options: PieChartOptions = null): CircularInstance = js.native

  def Doughnut(data: js.Array[CircularChartData], options: PieChartOptions = null): CircularInstance = js.native
}

object Chart extends js.Object {
  var defaults: js.Any = js.native
}

}
