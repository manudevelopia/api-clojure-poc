(ns api-clojure-poc.user.repository
  (:require [next.jdbc :as jdbc]
            [next.jdbc.result-set :as rs]))

(def db-spec
  {:dbtype   "postgresql"
   :host     (System/getenv "DATABASE_HOST")
   :port     5432
   :dbname   (System/getenv "DATABASE_NAME")
   :user     (System/getenv "DATABASE_USER")
   :password (System/getenv "DATABASE_PASSWORD")})

(def ds (jdbc/get-datasource db-spec))

(defn all []
  (jdbc/execute! ds ["select t_title title from dotoo.tasks"] {:builder-fn rs/as-unqualified-maps}))

(defn add [task]
  (jdbc/execute! ds ["insert into dotoo.tasks (t_title) values (?)" (task "title")]))
