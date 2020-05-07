(defn fibbonaci
    ([x y] (lazy-seq (cons y (fibbonaci y (+ x y)))))
    ([] (fibbonaci 1 1)))

(defn is-even [i]
  (= (mod i 2) 0))

(def fibb-under-4mil
  (take 32 (fibbonaci)))

(reduce
 (fn [sum i]
   (if (is-even i)
     (+ sum i)
     sum))
 0 fibb-under-4mil)