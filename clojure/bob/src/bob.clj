(ns bob
  (:require [clojure.string :refer [upper-case blank?]]))

(defn response-for [phrase]
  (cond
    (blank? phrase) "Fine. Be that way!"
    (re-matches #"[\s\d,]+" phrase) "Whatever."
    (re-find #"[A-Z\s]+\?$" phrase) "Whoa, chill out!"
    (re-find #"\?$" phrase) "Sure."
    (= phrase (upper-case phrase)) "Whoa, chill out!"
    :else "Whatever."))
