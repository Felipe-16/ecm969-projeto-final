(defproject projeto-musica "1.0.0"
  :description "API para cadastro e listagem de músicas"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[compojure "1.6.1"]
                 [cheshire "5.10.0"]
                 [org.clojure/clojure "1.10.3"]
                 [ring/ring-core "1.8.1"]
                 [ring/ring-jetty-adapter "1.9.1"]
                 [org.eclipse.jetty/jetty-server "9.4.43.v20210629"]
                 [org.eclipse.jetty/jetty-servlet "9.4.43.v20210629"]
                 [org.eclipse.jetty/jetty-servlets "9.4.43.v20210629"]
                 [org.clojure/java.jdbc "0.7.9"]
                 [mysql/mysql-connector-java "8.0.26"]] 
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler projeto-musica.api/app}
  :main projeto-musica.api)
  :target-path "target/%s"

