(ns lu.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [lu.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[lu started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[lu has shut down successfully]=-"))
   :middleware wrap-dev})
