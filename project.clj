(defproject org.clojars.franks42/shoreleave-remote "0.3.0-SNAPSHOT"
  :description "A smarter client-side with ClojureScript : Shoreleave's rpc/xhr/jsonp facilities
  Slightly modified by franks42 to accommodate recent clojurescript's clj->js support"
  :url "http://github.com/shoreleave"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "See the notice in README.mkd or details in LICENSE_epl.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojars.franks42/shoreleave-core "0.3.0-SNAPSHOT"]
                 [org.clojars.franks42/shoreleave-browser "0.3.0-SNAPSHOT"]]
  :dev-dependencies [;[cdt "1.2.6.2-SNAPSHOT"]
                     ;[lein-cdt "1.0.0"] ; use lein cdt to attach
                     ;[lein-autodoc "0.9.0"]
                     [lein-marginalia "0.7.1"]])

