(ns rot13.algorithm)

(def lowercase-range [(int \a) (int \z)])
(def uppercase-range [(int \A) (int \Z)])

(defn is-lowercase?
  "Checks if character is lowercase."
  [^Character c]
  (let [char (int c)]
    (if (and (< (first lowercase-range) char) (< char (last lowercase-range)))
      true
      false)))

(defn is-uppercase?
  "Checks if character is uppercase."
  [^Character c]
  (let [char (int c)]
    (if (and (< (first uppercase-range) char) (< char (last uppercase-range)))
      true
      false)))

(defn char-position
  "Position of character in the alphabet."
  [^Character c]
  (let [range (if (is-lowercase? c) lowercase-range uppercase-range)]
    (- (int c) (first range))))