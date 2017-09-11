/**
 * Shiyu Wang
 * shiyu@ccs.neu.edu
 * 
 */
/*Signature:

  Public static methods:

    emptySet  :                                 ->  FSetString
    insert    : FSetString x String             ->  FSetString
    add       : FSetString x String             ->  FSetString
    size      : FSetString                      ->  int
    isEmpty   : FSetString                      ->  boolean
    contains  : FSetString x String             ->  boolean
    isSubset  : FSetString x FSetString         ->  boolean
    absent    : FSetString x String             ->  FSetString
    union     : FSetString x FSetString         ->  FSetString
    intersect : FSetString x FSetString         ->  FSetString

  Public dynamic methods (for which the receiver is an FSetString):
    toString  :                                 ->  String
    equals    :  Object                         ->  boolean
    hashCode  :                                 ->  int
 */
/**
 * the abstract class FSetString
 * @author Shiyu
 * @version 2013-9-13
 */
public abstract class FSetString {
    /**
     * a static method returns a emptyset
     * @author Shiyu
     * @version 2013-9-13
     * @return -- a new emptyset
     */
    public static FSetString emptySet() {
        return new EmptySet();
    }
    /**
     * a static method returns a insert 
     * @author Shiyu
     * @version 2013-9-13
     * @param s0 -- the rest of the insert 
     * @param k0 -- first string in the insert
     * @return -- a new insert
     */
    public static FSetString insert(FSetString s0, String k0) {
        return new Insert(s0, k0);
    }
    /**
     * a static method add a string to the FSetString
     * @author Shiyu
     * @version 2013-9-13
     * @param s0 -- the FSetString which will be added
     * @param k -- the String which will add
     * @return -- the insert added the string
     */
    public static FSetString add(FSetString s0, String k) {
        return s0.add(k);
    }
    /**
     * a static method calculate the size of FSetString
     * @author Shiyu
     * @version 2013-9-13
     * @param s0 -- the FSetString which need to be calculated
     * @return -- the size of FSetString
     */
    public static int size(FSetString s0) {
        return s0.size();
    }
    /**
     * a static method judges if the FSetString is a emptySet
     * @author Shiyu
     * @version 2013-9-13
     * @param s0 -- the FSetString which need to be judged
     * @return -- a boolean, true for emptySet and false for insert
     */
    public static boolean isEmpty(FSetString s0) {
        return s0.isEmpty();
    }
    /**
     * a static method checks the FSetString has the input String
     * @author Shiyu
     * @version 2013-9-13
     * @param s0 --the FsetString which need to be checked
     * @param k -- the String which will be check whether in the FSetString
     * @return -- a boolean, true for the FSetString has the input string,
     *  false for other.
     */
    public static boolean contains(FSetString s0, String k) {
        return s0.contains(k);
    }
    /**
     * a static method checks whether one FSetString is a subet of another 
     * @author Shiyu
     * @version 2013-9-13
     * @param s0 - the "subset" will be checked
     * @param s2 - another set which will be check whether bigger than subset
     * @return -- a boolean, 
     * true for the "subset" s0 is the subset of FSetString s2
     * false for other.
     */
    public static boolean isSubset(FSetString s0, FSetString s2) {
        return s0.isSubset(s2);
    }
    /**
     * a static method removes the input string in the FSetString
     * @author Shiyu
     * @version 2013-8-13
     * @param s0 -- the FSetString which need to remove strings
     * @param k -- the input String which will move
     * @return -- the FSetString without the input string 
     */
    public static FSetString absent(FSetString s0, String k) {
        return s0.absent(k);
    }
    /**
     * a static method combines the two FSetString
     * @author Shiyu
     * @version 2013-9-13
     * @param s0 -- one FSetString need to be combined
     * @param s2 -- another FSetString need to be combined 
     * @return -- the combined FSetString
     */
    public static FSetString union(FSetString s0, FSetString s2) {
        return s0.union(s2);
    }
    /**
     * a static method returns the intersection of the two FSetString
     * @author Shiyu
     * @version 2013-9-13
     * @param s0 -- one FSetString 
     * @param s2 -- another FsetString
     * @return -- return the intersection FSetString of two input FSetStrings
     */
    public static FSetString intersect(FSetString s0, FSetString s2) {
        return s0.intersect(s2);
    }
    
    
    /**
     * adds a string to the FSetString
     * @author Shiyu
     * @version 2013-9-13
     * @param k - the string will be added
     * @return a FSetString with added String
     */
    public abstract FSetString add(String k);
    /**
     * calculate the size of FSetString
     * @author Shiyu
     * @version 2013-9-13
     * @return -- the size of FSetString
     */
    public abstract int size();
    /**
     * judging whether the FSetString is empty
     * @author Shiyu
     * @version 2013-9-13
     * @return -- a boolean, true for the FSetString is emptySet,
     *  false for other.
     */
    public abstract boolean isEmpty();
    /**
     * checking the FSetString has the input String
     * @author Shiyu
     * @version 2013-9-13
     * @param k -- the String which will be check whether in the FSetString
     * @return -- a boolean, true for the FSetString has the input string,
     *  false for other.
     */
    public abstract boolean contains(String k);
    /**
     * check whether one FSetString is a subet of another 
     * @author Shiyu
     * @version 2013-9-13
     * @param s2 - set which will be check whether bigger than subset
     * @return -- a boolean, 
     * true for the "subset" is the subset of FSetString s2
     * false for other.
     */
    public abstract boolean isSubset(FSetString s2);
    /**
     * removes the input string in the FSetString
     * @author Shiyu
     * @version 2013-8-13
     * @param k -- the input String which will move
     * @return -- the FSetString without the input string 
     */
    public abstract FSetString absent(String k);
    /**
     * combines the given FSetString to the FSetString
     * @author Shiyu
     * @version 2013-9-13
     * @param s2 -- FSetString need to combine
     * @return -- the combined FSetString
     */
    public abstract FSetString union(FSetString s2);
    /**
     * returns the intersection of the FSetString and given FSetString
     * @author Shiyu
     * @version 2013-9-13
     * @param s2 -- given FsetString
     * @return -- return the intersection FSetString of two FSetStrings
     */
    public abstract FSetString intersect(FSetString s2);
    
    /**
     * transfer the FSetString to the
     *  "{...(" + FSetString.size(s) + " elements)...}"
     *  @author Shiyu
     *  @version 2013-9-13
     *  @return -- transfered string
     */
    public String toString() {
        return "{...(" + this.size() + " elements)...}";
    }

    /**
     * check if FSetString is same as input object
     * 
     * @author Shiyu
     * @version 2013-9-13
     * @return -- the boolean whether FSetString is the Object
     * @param s2
     *            -- given object
     */
    public boolean equals(Object s2) {
        if (s2 == null) {
            return false;
        }
        if (s2 instanceof FSetString) {          
            return FSetString.isSubset(this, (FSetString) s2)
                    && FSetString.isSubset((FSetString) s2, this);
        } 
        else {
            return false;
        }
    }
    
    /**
     * give the hashcode of emptySet
     * @author Shiyu
     * @version
     * @return -- the hashcode of emptySet
     */
    public int hashCode() {
        return 0;
    }
}

/**
 * the class emptySet extends the abstract class FSetString
 * @author Shiyu
 * @version 2013-9-13
 */
class EmptySet extends FSetString {

    /**
     * adds a string to the emptySet
     * @author Shiyu
     * @version 2013-9-13
     * @param k - the string will be added
     * @return a insert with added String
     */
    public FSetString add(String k) {
        return FSetString.insert(this, k);
    }
    /**
     * return the size of emptySet which is obvious zero
     * @author Shiyu
     * @version 2013-9-13
     * @return -- the size of emptySet, 0
     */
    public int size() {
        return 0;
    }
    /**
     * judging whether the emptySet is empty which is obvious true
     * @author Shiyu
     * @version 2013-9-13
     * @return -- a boolean, true for the emptySet.
     */
    public boolean isEmpty() {
        return true;
    }
    /**
     * checking the emptySet has the input String
     * @author Shiyu
     * @version 2013-9-13
     * @param k -- the String which will be check whether in the emptySet
     * @return -- a boolean, true for the emptySet has the input string,
     *  false for other.
     */
    public boolean contains(String k) {
        return false;
    }
    /**
     * check whether one empset is a subet of input FSetString 
     * @author Shiyu
     * @version 2013-9-13
     * @param s2 - set which will be check whether bigger than subset
     * @return -- a boolean, 
     * true for the "subset" is the subset of FSetString s2
     * false for other.
     */
    public boolean isSubset(FSetString s2) {
        return true;
    }
    /**
     * removes the input string in the emptySet
     * @author Shiyu
     * @version 2013-8-13
     * @param k -- the input String which will move
     * @return -- the emptySet itself 
     */
    public FSetString absent(String k) {
        return FSetString.emptySet();
    }
    /**
     * combines the given FSetString to the emptySet
     * @author Shiyu
     * @version 2013-9-13
     * @param s2 -- FSetString need to combine
     * @return -- the given FSetString
     */
    public FSetString union(FSetString s2) {
        return s2;
    }
    /**
     * returns the intersection of the emptySet and given FSetString
     * @author Shiyu
     * @version 2013-9-13
     * @param s2 -- given FsetString
     * @return -- return the emptySet.
     */
    public FSetString intersect(FSetString s2) {
        return FSetString.emptySet();
    }

}
/**
 * the class insert extends the abstract class FSetString
 * @author Shiyu
 * @version 2013-9-13
 */
class Insert extends FSetString {
    /** the rest FSetString */
    FSetString s0;
    /** the first string */
    String k0;
    
    /** the contractor */
    /**
     * 
     * @param s0 -- the rest FSetString
     * @param k0 -- the first string
     */
    Insert(FSetString s0, String k0) {
        this.s0 = s0;
        this.k0 = k0;
    }
    /**
     * adds a string to the insert
     * @author Shiyu
     * @version 2013-9-13
     * @param k - the string will be added
     * @return a insert with added String
     */
    public FSetString add(String k) {
        if (FSetString.contains(this, k)) {
            return this;
        }
        else { return FSetString.insert(this, k); }
    }
    /**
     * calculate the size of insert
     * @author Shiyu
     * @version 2013-9-13
     * @return -- the size of insert
     */
    public int size() {
        if (FSetString.contains(s0, k0)) {
            return  FSetString.size(s0);
        }
        else { return 1 + FSetString.size(s0); }
    }
    /**
     * judging whether the insert is empty which is obvious false
     * @author Shiyu
     * @version 2013-9-13
     * @return -- a boolean, false for the insert.
     */
    public boolean isEmpty() {
        return false;
    }
    /**
     * checking the insert has the input String
     * @author Shiyu
     * @version 2013-9-13
     * @param k -- the String which will be check whether in the insert
     * @return -- a boolean, true for the insert has the input string,
     *  false for other.
     */
    public boolean contains(String k) {
        if (k.equals(k0)) {
            return true;
        }
        else { return FSetString.contains(s0, k); }
    }
    /**
     * check whether one insert is a subet of input FSetString 
     * @author Shiyu
     * @version 2013-9-13
     * @param s2 - set which will be check whether bigger than subset
     * @return -- a boolean, 
     * true for the "subset" is the subset of FSetString s2
     * false for other.
     */
    public boolean isSubset(FSetString s2) {
        if (FSetString.contains(s2, k0)) {
            return FSetString.isSubset(s0, s2);
        }
        else { return false; }
    }
    /**
     * removes the input string in the insert
     * @author Shiyu
     * @version 2013-8-13
     * @param k -- the input String which will move
     * @return -- the insert without the input string 
     */
    public FSetString absent(String k) {
        if (k.equals(k0)) {
            return  FSetString.absent(s0, k);
        }
        else { return FSetString.insert(FSetString.absent(s0, k), k0); }
    }
    /**
     * combines the given FSetString to the insert
     * @author Shiyu
     * @version 2013-9-13
     * @param s2 -- FSetString need to combine
     * @return -- the combined insert
     */
    public  FSetString union(FSetString s2) {
        if (FSetString.contains(s2, k0)) {
            return FSetString.union(s0, s2);
        }
        else { return FSetString.insert(FSetString.union(s0, s2), k0); }
    }
    /**
     * returns the intersection of the insert and given FSetString
     * @author Shiyu
     * @version 2013-9-13
     * @param s2 -- given FsetString
     * @return -- return the intersection.
     */
    public FSetString intersect(FSetString s2) {
        if (FSetString.contains(s2, k0)) {
            return FSetString.insert(FSetString.intersect(s0, s2), k0);
        }
        else { return FSetString.intersect(s0, s2); }
    }

}