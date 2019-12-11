(ns app.core
  (:require [clojure.spec.alpha :as s]
            [clojure.spec.test.alpha :as st]))

(defn foo [])

(s/fdef foo
  :args (s/cat)
  :ret nil?)
