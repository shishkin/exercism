(ns rna-transcription
  (:require [clojure.string :refer [join]]))

(defn translate-nucleotide [n]
  (let
   [lookup {\G \C
            \C \G
            \T \A
            \A \U}]
    (or
     (lookup n)
     (throw (AssertionError. "Unknown nucleotide")))))

(defn to-rna [dna]
  (->> dna
       (map translate-nucleotide)
       join))
