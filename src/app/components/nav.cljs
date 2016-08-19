(ns app.components.nav
  (:require [app.routes :as routes]))

(defn main []
  (fn []
    [:nav.pa3.pa4-ns
     [:a.link.dim.black.b.f1.f-headline-ns.tc.db.mb3.mb4-ns {:href (routes/url-for :home)} "Celibidache"]
     [:div.tc.pb3
      [:a.link.dim.gray.f6.f5-ns.dib.mr3
       {:href (routes/url-for :home)}
       [:i.fa.fa-home.mr1] "Home"]
      [:a.link.dim.gray.f6.f5-ns.dib.mr3
       {:href (routes/url-for :about :about-id :example-param)}
       [:i.fa.fa-at.mr1]  "About"]
      [:a.link.dim.gray.f6.f5-ns.dib.mr3
       {:href "https://github.com/velveteer/celibidache" :target "_blank"}
       [:i.fa.fa-github.mr1 {:aria-hidden true}] "Source"]]]))
