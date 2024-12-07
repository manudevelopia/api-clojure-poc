(ns api-clojure-poc.task.service
  (:require [api-clojure-poc.task.repository :as repository]))

(defn all []
  (repository/all))

(defn add [task]
  (repository/add task))
