// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseFreelancerController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FreelancerController.search",
      """
        function(inputKeyword0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("inputKeyword", inputKeyword0)])})
        }
      """
    )
  
    // @LINE:12
    def skills: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FreelancerController.skills",
      """
        function(skillId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "skills/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("skillId", skillId0))})
        }
      """
    )
  
    // @LINE:10
    def globalStats: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FreelancerController.globalStats",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "globalStats"})
        }
      """
    )
  
    // @LINE:11
    def localStats: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FreelancerController.localStats",
      """
        function(projectID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "localStats/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("projectID", projectID0))})
        }
      """
    )
  
    // @LINE:8
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FreelancerController.profile",
      """
        function(ownerID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("ownerID", ownerID0))})
        }
      """
    )
  
    // @LINE:9
    def profileData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FreelancerController.profileData",
      """
        function(ownerID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profiledata/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("ownerID", ownerID0))})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FreelancerController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
