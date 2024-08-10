(ns example-1.core
  (:gen-class))

;;matrix init
(def matrix [[1 1250 3500]
             [2 1400 3600]
             [3 1100 3400]
             [4 1200 3800]])

;;function add the sum of each row as the last element
(defn row-sum [matrix]
  (map (fn [row]
         ;; using conj to add the sum of row 
         (conj row (apply + row)))
       matrix))

;;sum 
(def matrix-sum (row-sum matrix))

;;print
(println "matrix sum:")
(doseq [row matrix-sum ]
  (println row))

;; funcn to get sum of row
(defn sum-of-row[matrix i]
  (if(and(>= i 0)(< i (count matrix)))
   (last (matrix i))
    ;;return 
    -1))

;; funcn to get sum of column
(defn sum-of-column[matrix ci]
  (if(and (>= ci 0)(not-empty matrix))

   (->> matrix 
        (map #(get % ci 0))
  (apply +))
-1))

(println "sum of row:"(sum-of-row matrix-sum 0))
(println "sum of column:" (sum-of-column matrix-sum 1))
    
