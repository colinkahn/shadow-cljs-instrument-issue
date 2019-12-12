(ns app.core-specs
  (:require [clojure.spec.alpha :as s]
            [clojure.spec.test.alpha :as st]
            [app.core :as app]))

(s/fdef app/foo
  :args (s/cat)
  :ret nil?)
