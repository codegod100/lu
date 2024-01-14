(ns lu.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[lu started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[lu has shut down successfully]=-"))
   :middleware identity})
