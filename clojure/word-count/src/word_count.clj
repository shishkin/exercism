(ns word-count
  (:require [clojure.string :refer [split lower-case blank?]]))

(defn word-count [text]
  (let [remove-blanks #(remove blank? %1)
        words (-> text
                  lower-case
                  (split #"[\s,:!&@$%^]")
                  remove-blanks)]
    (frequencies words)))
