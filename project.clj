(defproject rot13 "0.1.0-SNAPSHOT"
  :description "A simple ROT13 implementation."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot rot13.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
