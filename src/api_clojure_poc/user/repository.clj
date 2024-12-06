(ns api-clojure-poc.user.repository
  (:require [api-clojure-poc.user.model :as model]
            [next.jdbc :as jdbc]))

(def db-spec
  {:dbtype   "postgresql"
   :host     "ep-patient-term-a23fmx3b.eu-central-1.pg.koyeb.app"
   :port     5432
   :dbname   "koyebdb"
   :user     "admin"
   :password "UZcg2mPYnky0"})

(def ds (jdbc/get-datasource db-spec))

(defn all-users []
  (jdbc/execute! ds ["select t_title title from dotoo.tasks"]))

(defn add-user [title]
  (jdbc/execute! ds ["INSERT INTO dotoo.tasks (title) VALUES (?)" title]))

(defn all []
  (list (model/->User "John Doe" "john.doe@email.com")
        (model/->User "Jane Doe" "jane.doe@email.com"))
  (all-users)
  )
