package controllers

import play.api.mvc.Controller
import play.api.mvc.Action
import models.Bar
import com.codahale.jerkson.Json

object BarController extends Controller {

  def bars = Action {
    val bars = Vector(Bar(1, "Bar 1"), Bar(2, "Bar 2"))

    val json = Json.generate(bars)

    Ok(json).as("application/json")
  }
}
