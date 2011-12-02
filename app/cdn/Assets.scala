package cdn

import play.api.Configuration
import play.api.Play
import play.api.Play._
import play.api.mvc.Call

object Assets {

    def at(call: Call) = {
        Play.configuration.getString("contentURL") match {
            case Some(contentURL) => contentURL + call.url
            case None => call.url
        }
    }

}
