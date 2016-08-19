(ns app.handlers
  (:require [re-frame.core :refer [register-handler]]
            [app.db :as db]))

(register-handler
  :initialize-db
  (fn  [_ _]
    db/default-db))

(register-handler
  :route
  (fn [db [_ {:keys [current-page route-params]}]]
    (merge db {:current-page current-page :route-params route-params})))
