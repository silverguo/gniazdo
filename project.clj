(defproject org.clojars.silverguo/gniazdo-fork "1.1.3"
  :description "Fork of webSocket client for Clojure from stylefruits/gniazdo"
  :url "https://github.com/silverguo/gniazdo"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.eclipse.jetty.websocket/websocket-client "9.4.19.v20190610"]]
  :repl-options {:init-ns gniazdo.core}
  :jvm-opts ["-Dorg.eclipse.jetty.websocket.client.LEVEL=WARN"]
  :profiles {:dev
             {:dependencies [[http-kit "2.3.0"]]}})
