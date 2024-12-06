(ns api-clojure-poc.user.repository
  (:require [next.jdbc :as jdbc]
            [next.jdbc.result-set :as rs]))

(def db-spec
  {:dbtype   "postgresql"
   :host     ""
   :port     5432
   :dbname   ""
   :user     "admin"
   :password ""})

(def ds (jdbc/get-datasource db-spec))

(defn all []
  (jdbc/execute! ds ["select t_title title from dotoo.tasks"] {:builder-fn rs/as-unqualified-maps})
  )

(defn add [task]
  (jdbc/execute! ds ["INSERT INTO dotoo.tasks (t_title) VALUES (?)" ( task "title")]))
