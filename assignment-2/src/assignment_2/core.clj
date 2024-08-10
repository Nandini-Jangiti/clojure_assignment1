(ns assignment-2.core
  (:gen-class))

(defn sum-list [list1 set1]
  (let [list1 (map #(if (nil? %) 0 %) list1)
        set1 (map #(if (nil? %) 0 %) set1)
        max-len (max (count list1) (count set1))

        list2 (concat list1 (repeat (- max-len (count list1)) 0))
        set2 (concat set1 (repeat (- max-len (count set1)) 0))]
    (map + list2 set2)))

(def list1 [100 200 nil 400 nil 1 nil])
(def set1 [100 200 300 nil 400 nil 500 600])

(println "result:" (sum-list list1 set1))