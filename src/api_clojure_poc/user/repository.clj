(ns api-clojure-poc.user.repository
  (:require [api-clojure-poc.user.model :as model]
            [next.jdbc :as jdbc]
            [next.jdbc.result-set :as rs]))

(def db-spec
  {:dbtype   "postgresql"
   :host     ""
   :port     5432
   :dbname   ""
   :user     "admin"
   :password ""})

(def ds (jdbc/get-datasource db-spec))

(defn all-users []
  (jdbc/execute! ds ["select t_title title from dotoo.tasks"] {:builder-fn rs/as-unqualified-maps}))

(defn add-user [title]
  (jdbc/execute! ds ["INSERT INTO dotoo.tasks (title) VALUES (?)" title]))

(defn all []
  (list (model/->User "John Doe" "john.doe@email.com")
        (model/->User "Jane Doe" "jane.doe@email.com"))
  (all-users)
  )
