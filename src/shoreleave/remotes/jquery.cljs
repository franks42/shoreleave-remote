(ns shoreleave.remotes.jquery)

(defn ajax
  "This uses jQuery's ajax request to perform a remote
  (potentially cross-origin or jsonp) request"
  [url & kw-opts]
  (let [kw-map (apply hash-map kw-opts)]
    (.ajax js/jQuery (clj->js (assoc kw-map :url url)))))

