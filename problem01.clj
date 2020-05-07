(defn multiple-of-n [n i]
  (= (mod i n) 0))

(reduce
 (fn [sum, i]
   (if (or (multiple-of-n 5 i) (multiple-of-n 3 i))
     (+ sum i)
     sum))
 (take 1000 (range)))