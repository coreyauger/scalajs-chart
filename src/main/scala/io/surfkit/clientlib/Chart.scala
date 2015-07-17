package io.surfkit.clientlib

import scala.scalajs.js
import js.annotation._
import js.JSConverters._

package components {

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

trait ChartSettings extends js.Object {
  var animation: Boolean = js.native
  var animationSteps: Double = js.native
  var animationEasing: String = js.native
  var showScale: Boolean = js.native
  var scaleOverride: Boolean = js.native
  var scaleSteps: Double = js.native
  var scaleStepWidth: Double = js.native
  var scaleStartValue: Double = js.native
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
  var bezierCurve: Boolean = js.native
  var bezierCurveTension: Double = js.native
  var pointDot: Boolean = js.native
  var pointDotRadius: Double = js.native
  var pointDotStrokeWidth: Double = js.native
  var pointHitDetectionRadius: Double = js.native
  var datasetStroke: Boolean = js.native
  var datasetStrokeWidth: Double = js.native
  var datasetFill: Boolean = js.native
}

object LineChartOptions {
  def apply(
    bezierCurve: Boolean = true,
    bezierCurveTension: Double = 1.0,
    pointDot: Boolean = true,
    pointDotRadius: Double = 2.0,
    pointDotStrokeWidth: Double = 1.0,
    pointHitDetectionRadius: Double = 2.0,
    datasetStroke: Boolean = true,
    datasetStrokeWidth: Double = 1.0,
    datasetFill: Boolean = true
             ): LineChartOptions = {
    js.Dynamic.literal(
      bezierCurve = bezierCurve,
      bezierCurveTension = bezierCurveTension,
      pointDot = pointDot,
      pointDotRadius = pointDotRadius,
      pointDotStrokeWidth = pointDotStrokeWidth,
      pointHitDetectionRadius = pointHitDetectionRadius,
      datasetStroke = datasetStroke,
      datasetStrokeWidth = datasetStrokeWidth,
      datasetFill = datasetFill
    ).asInstanceOf[LineChartOptions]
  }
}

trait BarChartOptions extends ChartOptions {
  var scaleBeginAtZero: Boolean = js.native
  var barShowStroke: Boolean = js.native
  var barStrokeWidth: Double = js.native
  var barValueSpacing: Double = js.native
  var barDatasetSpacing: Double = js.native
}


object BarChartOptions {
  def apply(
    scaleBeginAtZero: Boolean = true,
    barShowStroke: Boolean = true,
    barStrokeWidth: Double = 1.0,
    barValueSpacing: Double = 2.0,
    barDatasetSpacing: Double = 2.0
             ): BarChartOptions = {
    js.Dynamic.literal(
      scaleBeginAtZero = scaleBeginAtZero,
      barShowStroke = barShowStroke,
      barStrokeWidth = barStrokeWidth,
      barDatasetSpacing = barDatasetSpacing
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

class Chart protected() extends js.Object {
  def this(context: CanvasRenderingContext2D) = this()

  def Line(data: LinearChartData, options: LineChartOptions = null): LinearInstance = js.native

  def Bar(data: LinearChartData, options: BarChartOptions): LinearInstance = js.native

  def Radar(data: LinearChartData, options: RadarChartOptions = null): LinearInstance = js.native

  def PolarAreaChart(data: Seq[CircularChartData], options: PolarAreaChartOptions = null): CircularInstance = PolarArea(data.toJSArray, options)
  private def PolarArea(data: js.Array[CircularChartData], options: PolarAreaChartOptions = null): CircularInstance = js.native


  def Pie(data: js.Array[CircularChartData], options: PieChartOptions = null): CircularInstance = js.native

  def Doughnut(data: js.Array[CircularChartData], options: PieChartOptions = null): CircularInstance = js.native

  def setSettings(settings:ChartSettings) = {
    Chart.defaults = settings
  }
}

object Chart extends js.Object {
  var defaults: js.Any = js.native
}

}
