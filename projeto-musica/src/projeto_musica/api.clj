(ns projeto-musica.api
  (:gen-class)
  (:require 
            [ring.adapter.jetty :as jetty]
            [ring.util.response]
            [clojure.java.jdbc :as jdbc] 
            [compojure.core :refer [defroutes GET POST]]
            ))

(let [db-host "localhost"
      db-port 3306
      db-name "projeto_musica"]

(def db {:classname "com.mysql.cj.jdbc.Driver"
         :subprotocol "mysql"
         :subname (str "//" db-host ":" db-port "/" db-name "?useTimezone=true&serverTimezone=UTC")
         :user "root"
         :password "Chicken16*"}))


(defn listar-musicas []
  (jdbc/query db ["SELECT * FROM music"]))


(defn cadastrar-musicas [musica]
  (jdbc/insert! db :music musica)
  (ring.util.response/response "Música cadastrada com sucesso" {:status 200}))


(defroutes app-routes
  (GET "/musicas" [] (listar-musicas))
  (POST "/musicas" {params :params} (cadastrar-musicas params)))

(def app
  (-> app-routes))

(defn start-server []
  (jetty/run-jetty (var app) {:port 3000}))

(defn -main []
  (println "A aplicação foi iniciada!")
  (start-server))





