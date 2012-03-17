$ ->
  $("body").append $("<ul>").attr "id", "bars"
  $.get "/bars", (data) ->
    $.each data, (index, item) ->
      $("#bars").append $("<li>").text "Bar: " + item.name
  $.getJSON()