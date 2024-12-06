(ns api-clojure-poc.user.service
  (:require [api-clojure-poc.user.repository :as repository]))

(defn all []
  (repository/all)
  )

(defn add [task]
  (repository/add task)
  )
